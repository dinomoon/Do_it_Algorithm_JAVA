// 이진탐색

import java.util.Scanner;

public class BinSearch{
  public static int binSearch(int a[], int length, int key){
    int pl = 0;
    int pr = length-1;

    do{
      int pc = (pl+pr)/2;
      if(a[pc] == key)
        return pc;
      else if(a[pc] > key)
        pr = pc - 1;
      else
        pl = pc + 1;
    } while(pl <= pr);

    return -1;
  }

  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

    System.out.print("What is the list`s length? ");
    int length = stdIn.nextInt();
    int[] arr = new int[length];

    System.out.print("arr[0] = ");
    arr[0] = stdIn.nextInt();

    for(int i=1; i<length; i++){
      do{
        System.out.print("arr[" + i + "] = ");
        arr[i] = stdIn.nextInt();
      } while(arr[i] < arr[i-1]);
    }

    System.out.print("What number are you looking for? ");
    int key = stdIn.nextInt();

    int result = binSearch(arr, length, key);

    if(result == -1)
      System.out.println("I can`t find that number...");
    else
      System.out.println(key + " is in arr[" + result + "]");
  }
}
