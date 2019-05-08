// 좀 더 효율적인 방법으로 소수를 구해보자.
// 1. 짝수중의 소수는 2밖에 없다. => 반복문에서 짝수는 제외하자.
// 2. 홀수중에서 그 전의 소수들로 나누어지지 않으면 소수이다.

class PrimeNumber2{
  public static void main(String[] args){
    int counter = 0;  // 나눗셈의 횟수
    int ptr = 0;  // 찾은 소수의 개수
    int[] prime = new int[500]; // 소수를 저장하는 배열

    prime[ptr++] = 2;

    for(int n=3; n<= 1000; n += 2){
      int i;
      for(i = 1; i < ptr; i++){
        counter++;
        if(n % prime[i] == 0)
          break;
      }
      if (ptr == i)
        prime[ptr++] = n;
    }

    for(int i=0; i < ptr; i++)
      System.out.println(prime[i]);

    System.out.println("counter = " + counter);
  }
}
