// 사용자가 음수를 입력하면 다시 입력하게 만들기
import java.util.Scanner;

public class sumPos{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    int n;
    do{
      System.out.print("n = ");
      n = stdIn.nextInt();
    } while(n<=0);

    int sum = 0;

    for(int i=1; i<=n; i++)
      sum += i;

    System.out.println(sum);
  }
}
