import javax.swing.SpinnerDateModel;

//function use in java

public class function {

  public static void printSum(int a, int b) {
    int sum = a + b;
    System.out.println(sum);
  }

  public static void printjava() {
    System.out.println("hello java");
  }

  public static void printName(String name) {
    System.out.println(name);
  }

  public static void main(String[] args) {

    // methods
    printjava();
    printjava();
    printjava();

    printName("Kunal Kushwaha");
    printName("Pepcoding");
    printName("takeUforward");
    printName("Aman Bhaiya");
    printName("Durga sir");
    printName("code with Harry");

    printName("Gautam Kushwaha");
    printName("Bhavesh Chaudhary");
    printSum(5, 7);
    printSum(8, 5);
    printSum(4, 5);

  }
}