import java.util.Scanner;

public class sum{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

    System.out.print("n = "); int n = stdIn.nextInt();
    int sum = 0;
    for(int i=1; i<=n; i++)
      sum += i;

    System.out.println(sum);
  }
}
