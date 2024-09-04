package principle;

/**
 * YAGNI (You ain't gonna need it)
 * <p>
 * Not implementation feature or complexity that no need at the moment. Do only the that is necesary
 */
public class Yagni {

  private static int calculateTotalBadCode(int price, int taxRace, int desc) {

    if (desc == 0) {
      desc = 1;
    }
    return price * taxRace;

  }

  private static int calculateTotalGoodCode(int price, int taxRace) {
/* no need at this moment
    if (desc == 0) {
      desc = 1;
    }*/
    return price * taxRace;

  }

  public static void main(String[] args) {
    Yagni.calculateTotalBadCode(1, 5, 0);
    Yagni.calculateTotalGoodCode(1, 5);
  }

}
