import java.util.Scanner;

class BubbleSort{
  static void swap(int[] a, int idx1, int idx2){
    int t = a[idx1];
    a[idx1] = a[idx2];
    a[idx2] = t;
  }
  // 단순 선택 정렬 메서드
  // 단순 선택 => 가장 작은 값을 찾은 뒤 바꾸기
  static void selectionSort(int[] a, int n){
    for(int i=0; i<n-1; i++){
      int min = i;
      for(int j=i+1; j<n; j++)
        if(a[j] < a[min])
          min = j;
      swap(a, i, min);
    }
  }

  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

    System.out.println("SelectionSort");
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
