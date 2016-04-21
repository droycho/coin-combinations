public class CoinCombos {
  public static void main(String[] arg) {}

    public static Integer changeBack(Integer input) {
      Integer quarters = 0;
      Integer dimes = 0;
      Integer nickels = 0;
      Integer pennies = 0;
      Integer remainder = 0;

      if (input >= 25){
        quarters = input / 25;
        remainder = input % 25;
        input = input - (quarters * 25);
        return quarters;
      } if (input >= 10 || remainder > 0){
        dimes = input / 10;
        remainder = remainder % 10;
        input = input - (dimes * 10);
        return dimes;
      } if (input >= 5 || remainder > 0) {
        nickels = input / 5;
        remainder = remainder % 5;
        input = input - (nickels * 5);
        return nickels;
      } if (input > 0) {
        pennies = input;
        return pennies;
      } else {
        return input;
      }
    }
}
