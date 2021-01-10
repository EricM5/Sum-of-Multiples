import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    while (true) {
      System.out.print("\nPlease enter a multiple and the ending point separated by a comma: ");
      Scanner in = new Scanner (System.in);
      int multiple = in.nextInt();
      String comma = in.next();
      int epoint = in.nextInt();
      int a = 0;
      int sum = a;
      int b = 0;
      while(a <= epoint) {
        b += a;
        a += multiple;
      }
      System.out.print("The sum is " + b +"\n");
    }
  }
}