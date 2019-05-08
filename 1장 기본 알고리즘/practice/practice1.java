// 19p 연습문제
public class practice1{
  // Q1) 네 값의 최댓값을 구하는 max4 메서드
  public static int max4(int a, int b, int c, int d){
    int max = a;

    if(b>max) max = b;
    if(c>max) max = c;
    if(d>max) max = d;

    return max;
  }
  // Q2) 세 값의 최소값을 구하는 min3 메서드
  public static int min3(int a, int b, int c){
    int min = a;

    if(b<min) min = b;
    if(c<min) min = c;

    return min;
  }
  // Q3) 네 값의 최소값을 구하는 min4 메서드
  public static int min4(int a, int b, int c, int d){
    int min = a;

    if(b<min) min = b;
    if(c<min) min = c;
    if(d<min) min = d;

    return min;
  }

  public static void main(String[] args){
    System.out.println(max4(1,2,3,4));
    System.out.println(min3(2,2,3));
    System.out.println(min4(5,6,7,4));
  }
}
