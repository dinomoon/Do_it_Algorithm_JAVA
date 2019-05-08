// 예제 5-6
// 하노이의 탑

import java.util.Scanner;

public class Hanoi{
  static void move(int no, int x, int y){
    if(no > 1)
      move(no-1, x, 6-x-y);

    System.out.println("Circle(" + no + ") " + x + " => " + y);

    if(no > 1)
      move(no-1, 6-x-y, y);
  }

  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

    System.out.print("What number of circle? ");
    int n = stdIn.nextInt();

    move(n, 1, 3);
  }
}
