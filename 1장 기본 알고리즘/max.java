import java.util.Scanner;

public class max{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

    System.out.print("a = "); int a = stdIn.nextInt();
    System.out.print("b = "); int b = stdIn.nextInt();
    System.out.print("c = "); int c = stdIn.nextInt();

    int max = a;
    if(b>max)
      max = b;
    if(c>max)
      max = c;
    System.out.println("max = " + max);
  }
}
