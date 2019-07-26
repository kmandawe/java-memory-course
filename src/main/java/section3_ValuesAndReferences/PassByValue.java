package section3_ValuesAndReferences;

public class PassByValue {

  public static void main(String[] args) {
    int localValue = 5;
    calculate(localValue);
    System.out.println(localValue);
//    const String = "hello";
  }

  private static void calculate(int calcValue) {
    calcValue = calcValue * 100;
  }
}
