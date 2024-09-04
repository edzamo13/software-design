package principle;

/**
 * DRY (Don't Repeat Yourself)
 * <p>
 * Avoid duplication of code reuses functions and avoid write the same code in several path
 */
public class Dry {

  private static void badCode() {
    var a = 5 * 6;
    var b = 7 * 3;

    System.out.printf("result a* b %s %s%n", a, b);
  }

  private static int goodCode(int a, int b) {
     var result =a * b;
    System.out.printf("result %s * %s = %s %n", a, b, result);
    return result;
  }

  public static void main(String[] args) {
    Dry.badCode();
    Dry.goodCode(7,3);
  }
}
