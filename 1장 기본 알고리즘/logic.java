import java.util.Scanner;

public class logic{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    int n;

    do{
      System.out.print("n = ");
      n = stdIn.nextInt();
    } while(n<10 || n>99);

    System.out.println(n);
  }
}
