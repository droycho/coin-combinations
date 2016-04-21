import org.junit.*;
import static org.junit.Assert.*;

public class CoinCombosTest {

  @Test
  public void isChangeBack_forInputValue_inputInteger() {
    CoinCombos coinCombos = new CoinCombos();
    Integer expected = 1;
    assertEquals(expected, coinCombos.changeBack(1));
  }

  @Test
  public void isChangeBack_forChangeGroups_inputInteger() {
    CoinCombos coinCombos = new CoinCombos();
    Integer expected = 2;
    assertEquals(expected, coinCombos.changeBack(20));
  }

  @Test
  public void isChangeBack_forQuarterGroup_inputInteger() {
    CoinCombos coinCombos = new CoinCombos();
    Integer expected = 3;
    assertEquals(expected, coinCombos.changeBack(86));
  }

  @Test
  public void isChangeBack_forDimesGroup_inputInteger() {
    CoinCombos coinCombos = new CoinCombos();
    Integer expected = 1;
    assertEquals(expected, coinCombos.changeBack(86));
  }

  @Test
  public void isChangeBack_forNickelsGroup_inputInteger() {
    CoinCombos coinCombos = new CoinCombos();
    Integer expected = 0;
    assertEquals(expected, coinCombos.changeBack(86));
  }

  @Test
  public void isChangeBack_forPenniesGroup_inputInteger() {
    CoinCombos coinCombos = new CoinCombos();
    Integer expected = 1;
    assertEquals(expected, coinCombos.changeBack(86));
  }
}
