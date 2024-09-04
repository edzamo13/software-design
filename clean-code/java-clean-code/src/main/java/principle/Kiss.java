package principle;


/**
 * Keep it Simple, Stupid
 * <p>
 * Keep the code the more simple posible, Avoid unnecessary solutions
 */
public class Kiss {

  private static boolean isEvenBadMethod(int number) {
    if (number % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }

  private static boolean isEvenGoodMethod(int number) {
    return number % 2 == 0;
  }

  public static void main(String[] args) {
    boolean resultA = Kiss.isEvenBadMethod(8);
    boolean resultB = Kiss.isEvenGoodMethod(9);

    System.out.println("result about method a:" + resultA + " ,b: " + resultB);
  }


}
