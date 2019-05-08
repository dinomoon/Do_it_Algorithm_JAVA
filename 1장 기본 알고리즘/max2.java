import java.util.Scanner;
// 메서드를 만들어서 최대값 구하기
public class max2{
  public static int max2(int a, int b, int c){
    int max = a;
    if(b > max)
      max = b;
    if(c > max)
      max = c;

    return max;
  }

  public static void main(String[] args){
    System.out.println(max2(1,2,3));
    System.out.println(max2(3,2,1));
    System.out.println(max2(2,2,3));
  }
}
