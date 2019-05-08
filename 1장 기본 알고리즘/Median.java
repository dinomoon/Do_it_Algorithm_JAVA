// 21p 중앙값을 구하기
// 중앙값을 구하는 것은 최댓값이나 최소값을 구하는 것보다 훨씬 복잡함..

import java.util.Scanner;

public class Median{
  static int median3(int a, int b, int c){
    if(a>=b)
      if(b>=c)
        return b;
      else if(a<=c)
        return a;
      else
        return c;
    else if(a>c)
      return a;
    else if(b>c)
      return c;
    else
      return b;
  }

  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    System.out.println("This program is Median.java :) enter the integers ");
    System.out.print("a = ");
    int a = stdIn.nextInt();
    System.out.print("b = ");
    int b = stdIn.nextInt();
    System.out.print("c = ");
    int c = stdIn.nextInt();

    System.out.println("Median = " + median3(a,b,c));
  }
}
