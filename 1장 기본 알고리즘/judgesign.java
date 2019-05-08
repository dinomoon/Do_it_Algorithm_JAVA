import java.util.Scanner;

public class judgesign{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

    System.out.print("a = "); int a = stdIn.nextInt();

    if(a>0)
      System.out.println("positive");
    else if(a<0)
      System.out.println("negative");
    else
      System.out.println("zero");
  }
}
