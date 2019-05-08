// 한 해의 경과 일수를 알려주는 프로그램

import java.util.Scanner;

public class DayOfYear{
  // 각 달의 일수 저장
  public static int[][] mdays = {
    {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, // 평년
    {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, // 윤년
  };

  // 서기 year년은 윤년인가? (윤년 : 1 / 평년 : 0)
  // 4로 나누어 떨어지면 윤년인데 100으로 나누어 떨어지면 평년이야 그런데 400으로 나누어 떨어지면 또 윤년이야. 이런 윤년~
  public static int isLeap(int year){
    return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
  }

  // 서기 y년 m월 d일의 그 해 경과 일 수를 구함.
  public static int dayOfYear(int y, int m, int d){
    int days = d; // 그 달의 일수를 저장.

    for(int i=1; i<m; i++)  // 1월 ~ (m-1)월의 일 수를 더함.
      days += mdays[isLeap(y)][i-1];
    return days;
  }

  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    int retry;

    do{
      System.out.print("month = "); int month = stdIn.nextInt();
      System.out.print("day = "); int day = stdIn.nextInt();
      System.out.print("year = "); int year = stdIn.nextInt();

      int dayofyear = dayOfYear(year, month, day);
      System.out.printf("%d / %d / %d = %d",month, day, year, dayofyear);
      System.out.println();
      System.out.print("Retry? (1.Yes / 0.No) ");
      retry = stdIn.nextInt();
    }while(retry==1);
  }
}
