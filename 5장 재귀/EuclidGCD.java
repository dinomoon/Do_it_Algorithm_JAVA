// 예제 5-2
// 유클리드 호제법으로 최대공약수 구하기

import java.util.Scanner;

public class EuclidGCD{
  public static int gcd(int x, int y){
    if(y==0)
      return x;
    else
      return gcd(y, x%y);
  }

  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

    System.out.print("What integer x? "); int x = stdIn.nextInt();
    System.out.print("What integer y? "); int y = stdIn.nextInt();

    System.out.println("GCD(x,y) = " + gcd(x,y));
  }
}
