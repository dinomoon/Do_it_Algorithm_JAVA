import java.util.Scanner;

class InsertionSort{
  static void insertionSort(int[] a, int n){
    for(int i=1; i<n; i++){
      int j;
      int tmp = a[i];
      for(j=i; i>0 && a[j-1]>tmp; j--)
        a[j] = a[j-1];
      a[j] = tmp;
    }
  }

  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

    System.out.println("InsertionSort");
    System.out.print("list`s number = ");
    int nx = stdIn.nextInt();
    int[] x = new int[nx];

    for(int i=0; i<nx; i++){
      System.out.print("x[" + i + "] = ");
      x[i] = stdIn.nextInt();
    }

    insertionSort(x, nx);

    System.out.println("ascending sort");
    for(int i=0; i<nx; i++)
      System.out.println("x[" + i + "] = " + x[i]);
  }
}
