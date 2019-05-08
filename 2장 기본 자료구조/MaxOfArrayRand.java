import java.util.Scanner;
import java.util.Random;
// 랜덤으로 배열의 값을 생성한 뒤 최대값 구하기.
public class MaxOfArrayRand{
  public static int MaxOfArrRand(int[] a){
    int max = a[0];
    for(int i=1; i<a.length; i++)
      if(a[i] > max)
        max = a[i];

    return max;
  }

  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    Random rand = new Random();

    System.out.printf("How many people? ");
    int n = stdIn.nextInt();

    int[] height = new int[n];

    for(int i=0; i<n; i++){
      height[i] = 100 + rand.nextInt(90);
      System.out.println("height[" + i + "] = " + height[i]);
    }

    System.out.printf("The max of height is " + MaxOfArrRand(height));
  }
}
