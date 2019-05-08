import java.util.Scanner;
// 입력받은 10진수를 2진수 ~ 36진수로 기수 변환하여 나타내기

public class NumberToNumber{
  public static int NTN(int x, int r, char[] d){
    int digits = 0;
    String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    do{
      d[digits++] = dchar.charAt(x % r);
      x /= r;
    } while(x!=0);
    return digits;
  }

  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    int no;  // 변환하는 정수
    int cd;   // 기수
    int dno; // 변환 후의 자릿수
    int retry;  // 다시 한 번?
    // 변환 후 각 자리의 숫자를 넣어두는 문자의 배열.
    char[] cno = new char[32];

    System.out.println("Welcome to Number To Number");
    do{
      do{
        System.out.print("Please enter positive number you want change ");
        no = stdIn.nextInt();
      } while(no < 0);

      do{
        System.out.print("What kind of number do you want?(2 ~ 36) ");
        cd = stdIn.nextInt();
      } while(cd < 2 || cd > 36);

      dno = NTN(no, cd, cno);

      for(int i = dno-1; i>=0; i--)
        System.out.print(cno[i]);
      System.out.println("");

      System.out.print("Do you want to play again? (1.Yes / 0.No) ");
      retry = stdIn.nextInt();
    } while(retry == 1);
  }
}
