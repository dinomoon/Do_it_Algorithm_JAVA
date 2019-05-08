// 클래스를 이용하여 데이터를 따로따로 저장하지 말고 다 같이 저장해보자.
import java.util.Scanner;

class PhysicalExamination{

  static final int VMAX = 21; // 시력 분포(0.0에서 0.1단위로 21개)

  static class PhysData{
    String name;
    int height;
    double vision;

    // 생성자
    PhysData(String name, int height, double vision){
      this.name = name;
      this.height = height;
      this.vision = vision;
    }
  }

  // 키의 평균값 구하기
  // aveHeight 메서드는 PhysData의 인스턴스를 매개변수로 받는다.
  static double aveHeight(PhysData[] data){
    double sum = 0;

    for(int i=0; i<data.length; i++)
      sum += data[i].height;

    return sum / data.length;
  }

  // 시력 분포 구하기
  // distVision 메서드는 PhysData의 인스턴스와 배열 한 개를 매개변수로 받는다.
  static void distVision(PhysData[] data, int[] dist){
    int i = 0;

    dist[i] = 0;
    for(i=0; i<data.length; i++)
      if(data[i].vision >= 0.0 && data[i].vision <= VMAX / 10.0)
        dist[(int)(data[i].vision * 10)]++;
  }

  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

    PhysData[] x = {
      new PhysData("A", 175, 0.5),
      new PhysData("B", 174, 0.3),
      new PhysData("C", 183, 1.0),
      new PhysData("D", 174, 0.2),
      new PhysData("E", 175, 0.1),
      new PhysData("F", 175, 1.2),
      new PhysData("G", 180, 0.6),
      new PhysData("H", 175, 0.3),
    };
    int[] vdist = new int[VMAX];

    for(int i=0; i<x.length; i++)
      System.out.printf("%s %3d %.1f \n", x[i].name, x[i].height, x[i].vision);

    System.out.printf("average of height = %.1fcm\n", aveHeight(x));

    distVision(x, vdist);

    System.out.println("distribution of Vision");
    for(int i=0; i<VMAX; i++)
      System.out.printf("%.1f ~ : %d\n", i/10.0, vdist[i]);
  }
}
