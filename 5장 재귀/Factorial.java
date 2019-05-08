// 예제 5-1
// 재귀의 가장 기본적인 문제 팩토리얼 함수 구하기

import java.util.Scanner;

public class Factorial{
  public static int factorial(int n){
    if(n>0)
      return n * factorial(n-1);
    else
      return 1;
  }

  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

    System.out.print("What integer you want to change? ");
    int x = stdIn.nextInt();

    System.out.println(x + "! is " + factorial(x));
  }
}
