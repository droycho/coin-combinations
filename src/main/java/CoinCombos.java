import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class CoinCombos {
  public static void main(String[] arg) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";
    
    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/results", (request,response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/results.vtl");

      String input = request.queryParams("input");
      Integer integerInput = Integer.parseInt(input);
      String changeBack = changeBack(integerInput);

      model.put("integerInput", integerInput);
      model.put("changeBack", changeBack);
      model.put("input", request.queryParams("input"));
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

  }

    public static String changeBack(Integer input) {
      Integer quarters = 0;
      Integer dimes = 0;
      Integer nickels = 0;
      Integer pennies = 0;
      Integer remainder = 0;

      while (input > 0) {
        if (input >= 25) {
          input -= 25;
          quarters++;
        } else if (input >= 10) {
          input -= 10;
          dimes++;
        } else if (input >= 5) {
          input -= 5;
          nickels++;
        } else if (input >= 1) {
          input -= 1;
          pennies++;
        } else {
          return "";
        }
      }
      return String.format("%d quarters, %d dimes, %d nickels, %d pennies", quarters, dimes, nickels, pennies);
    }
}
