import java.util.Scanner;

class BubbleSort{
  static void swap(int[] a, int idx1, int idx2){
    int t = a[idx1];
    a[idx1] = a[idx2];
    a[idx2] = t;
  }

  static void bubbleSort(int[] a, int n){
    for(int i=0; i<n-1; i++)
      for(int j=n-1; j>i; j--)
        if(a[j-1] > a[j])
          swap(a, j-1, j);
  }

// 알고리즘 개선1 정렬되어있으면 반복문 종료
  static void bubbleSort2(int[] a, int n){
    for(int i=0; i<n-1; i++){
      int exchg = 0;
      for(int j=n-1; j>i; j--)
        if(a[j-1] > a[j]){
          swap(a, j-1, j);
          exchg++;
        }
      if(exchg == 0) break;
    }
  }

// 알고리즘 개선2 마지막으로 정렬된 이후 부분만 정렬하기

  static void bubbleSort3(int[] a, int n){
    int k = 0;
    while(k < n-1){
      int last = n-1;
      for(int j=n-1; j>k; j--)
        if(a[j-1] > a[j]){
          swap(a, j-1, j);
          last = j;
        }
      k = last;
    }
  }
  
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

    System.out.println("BubbleSort");
    System.out.print("list`s number = ");
    int nx = stdIn.nextInt();
    int[] x = new int[nx];

    for(int i=0; i<nx; i++){
      System.out.print("x[" + i + "] = ");
      x[i] = stdIn.nextInt();
    }

    bubbleSort(x, nx);

    System.out.println("ascending sort");
    for(int i=0; i<nx; i++)
      System.out.println("x[" + i + "] = " + x[i]);
  }
}
