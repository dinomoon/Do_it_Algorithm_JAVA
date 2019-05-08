public class Multi99Table{
  public static void main(String[] args){
    for(int i=1; i<=9; i++){
      for(int j=1; j<=9; j++)
        // printf는 형식화된 출력이다.
        // 줄바꿈기능이 없다. 줄바꿈기능: %n
        // %3d는 3자리의 정수를 넣는다는 것이다. 따라서 3자리의 정수가 들어갈 수있도록 자리를 만들어 준다.
        System.out.printf("%3d", i*j);
      System.out.println();
    }
  }
}
