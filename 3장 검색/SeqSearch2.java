// for문을 이용한 순차 탐색

import java.util.Scanner;

public class SeqSearch2{
  public static int seqSearch(int a[], int num, int key){
    int n = num;

    for(int i=0; i<n; i++)
      if(a[i] == key)
        return i;
    return -1;
  }

  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

    System.out.print("enter the list`s length ");
    int length = stdIn.nextInt();
    int x[] = new int[length];

    for(int i=0; i<length; i++){
      System.out.print("x[" + i + "] = ");
      x[i] = stdIn.nextInt();
    }

    System.out.print("What number are you looking for? ");
    int key = stdIn.nextInt();
    int result = seqSearch(x, length, key);

    if(result == -1)
      System.out.println("I can`t find that number...");
    else
      System.out.println("the number is in x[" + result + "] :)");
  }
}
