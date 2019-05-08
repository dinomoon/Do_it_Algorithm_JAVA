// BinarySearch 메서드로 검색하기

import java.util.Scanner;
import java.util.Arrays;

public class BinSearch_method{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

    System.out.print("What is the list`s length? ");
    int length = stdIn.nextInt();
    int[] a = new int[length];

    System.out.print("a[0] = ");
    a[0] = stdIn.nextInt();

    for(int i=1; i<length; i++)
      do{
        System.out.print("a[" + i + "] = ");
        a[i] = stdIn.nextInt();
      } while(a[i] < a[i-1]);

    System.out.print("What number are you looking for? ");
    int key = stdIn.nextInt();

    int idx = Arrays.binarySearch(a, key); // 배열 x에서 키 값이 key인 요소를 검색

    if(idx == -1)
      System.out.println("I can`t find that number...");
    else
      System.out.println("That number is in a[" + idx + "]!!! :)");
  }
}
