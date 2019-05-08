// while문을 이용한 순차 탐색

import java.util.Scanner;

public class SeqSearch{
  public static int seqSearch(int[] a, int n, int ky){
    int i = 0;

    while(true){
      if(i == n)
        return -1;
      if(a[i] == ky)
        return i;
      i++;
    }
  }
    public static void main(String[] args){
      Scanner stdIn = new Scanner(System.in);

      System.out.print("enter the list`s length ");
      int num = stdIn.nextInt();
      int[] arr = new int[num];

      for(int i=0; i<num; i++){
        System.out.print("arr[" + i + "] = ");
        arr[i] = stdIn.nextInt();
      }

      System.out.print("What number are you looking for? ");
      int key = stdIn.nextInt();
      int result = seqSearch(arr, num, key);

      if(result == -1)
        System.out.println("I can`t find that number...");
      else
        System.out.println(key + " is in the arr[" + result + "]");
  }
}
