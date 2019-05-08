// 별표로 사용자가 원하는 크기의 직각이등변삼각형 만들기
import java.util.Scanner;

public class Triangle{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    System.out.print("n = ");
    int n = stdIn.nextInt();

    for(int i=1; i<=n; i++){
      for(int j=1; j<=i; j++)
        System.out.printf("*");
      System.out.println();
    }
  }
}
