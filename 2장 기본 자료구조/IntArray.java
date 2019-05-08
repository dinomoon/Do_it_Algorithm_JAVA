public class IntArray{
  public static void main(String[] args){
    // 배열을 만드는 방법1
    int[] a = new int[5];

    a[1] = 10;
    a[3] = 30;
    a[4] = 24;

    for(int i=0; i<5; i++)
      System.out.printf(" a[" + i + "]=%2d",a[i]);
    System.out.println();

    // 배열을 만드는 방법2
    int[] b = {1,2,3,4,5};

    for(int i=0; i<5; i++)
      System.out.printf(" b[" + i + "]=%2d",b[i]);
    System.out.println();

    // 배열을 만드는 방법3
    int[] c = new int[] {6,7,8,9,10};

    for(int i=0; i<5; i++)
      System.out.printf(" c[" + i + "]=%2d",c[i]);
    System.out.println();
    
    // 배열을 복제하는 방법
    int[] d = c.clone();

    d[3] = 0;
    for(int i=0; i<5; i++)
      System.out.printf(" d[" + i + "]=%2d",d[i]);
  }
}
