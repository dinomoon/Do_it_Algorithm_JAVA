import java.util.Scanner;
// 두 배열이 같을까, 다를까?
public class ArrayEqual{
  public static boolean ArrEqual(int[] a, int[] b){
    if(a.length != b.length)
      return false;

    for(int i=0; i<a.length; i++)
      if(a[i] != b[i])
        return false;

    return true;
  }

  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

    System.out.printf("What is the array a length? ");
    int num = stdIn.nextInt();

    int[] a = new int[num];
    int[] b = new int[num];

    for(int i=0; i<num; i++){
      System.out.printf("a[" + i + "] = ");
      a[i] = stdIn.nextInt();
    }

    for(int i=0; i<num; i++){
      System.out.printf("b[" + i + "] = ");
      b[i] = stdIn.nextInt();
    }

    System.out.println(ArrEqual(a,b));

  }
}
