public class CoinCombos {
  public static void main(String[] arg) {}

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
