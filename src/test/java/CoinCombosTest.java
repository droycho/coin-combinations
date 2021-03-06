import org.junit.*;
import static org.junit.Assert.*;

public class CoinCombosTest {

  @Test
  public void isChangeBack_forQuarterGroup_outputString() {
    CoinCombos coinCombos = new CoinCombos();
    String expected = "3 quarters, 0 dimes, 0 nickels, 0 pennies";
    assertEquals(expected, coinCombos.changeBack(75));
  }

  @Test
  public void isChangeBack_forDimesGroup_outputString() {
    CoinCombos coinCombos = new CoinCombos();
    String expected = "0 quarters, 2 dimes, 0 nickels, 0 pennies";
    assertEquals(expected, coinCombos.changeBack(20));
  }

  @Test
  public void isChangeBack_forNickelsGroup_outputString() {
    CoinCombos coinCombos = new CoinCombos();
    String expected = "0 quarters, 0 dimes, 1 nickels, 0 pennies";
    assertEquals(expected, coinCombos.changeBack(5));
  }

  @Test
  public void isChangeBack_forPenniesGroup_outputString() {
    CoinCombos coinCombos = new CoinCombos();
    String expected = "0 quarters, 0 dimes, 0 nickels, 3 pennies";
    assertEquals(expected, coinCombos.changeBack(3));
  }

  @Test
  public void isChangeBack_forMultipleCoins_outputString() {
    CoinCombos coinCombos = new CoinCombos();
    String expected = "3 quarters, 1 dimes, 0 nickels, 1 pennies";
    assertEquals(expected, coinCombos.changeBack(86));
  }
}
