import java.util.Scanner;
// 배열의 최대값 구하기.
public class MaxOfArray{
  public static int MaxOfArr(int[] a){
    int max = a[0];
    for(int i=1; i<a.length; i++)
      if(a[i]>max)
        max = a[i];

    return max;
  }

  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

    System.out.printf("How many people? "); int n = stdIn.nextInt();

    int[] height = new int[n];

    for(int i=0; i<n; i++){
      System.out.printf("height[" + i + "] = ");
      height[i] = stdIn.nextInt();
    }

    System.out.println("The max of height is " + MaxOfArr(height));
  }
}
