import java.util.Scanner;
// 배열의 값들을 역순으로 변경하기.
public class ReverseArray{
  public static void swap(int[] a, int left, int right){
    int tmp = a[left];
    a[left] = a[right];
    a[right] = tmp;
  }

  public static void ReverseArr(int[] a){
    int n = a.length;
    for(int i=0; i<(n/2); i++)
      swap(a, i, n-i-1);
  }

  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

    System.out.printf("What is the length of array? ");
    int num = stdIn.nextInt();

    int[] array = new int[num];

    for(int i=0; i<num; i++){
      System.out.printf("array[" + i + "] = ");
      array[i] = stdIn.nextInt();
    }

    ReverseArr(array);

    System.out.println("Mission Complete! ");
    for(int i=0; i<num; i++)
      System.out.println("array[" + i + "] = " + array[i]);
  }
}
