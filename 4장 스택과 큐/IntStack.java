// int형 스택 만들기

public class IntStack{
  private int max; // 스택 용량
  private int ptr; // 스택 포인터
  private int[] stk; // 스택 본체

  public class EmptyIntStackException extends RuntimeException{
    public EmptyIntStackException(){}
  }

  public class OverflowIntStackException extends RuntimeException{
    public OverflowIntStackException(){}
  }

  // 생성자
  public IntStack(int capacity){
    ptr = 0;
    max = capacity;
    try{
      stk = new int[max];
    } catch (OutOfMemoryError e){
      max = 0;
    }
  }

  // 스택에 x를 푸시
  public int push(int x) throws OverflowIntStackException{
    if(ptr >= max)
      throw new OverflowIntStackException();
    return stk[ptr++] = x;
  }

  // 팝
  public int pop() throws EmptyIntStackException{
    if(ptr <= 0)
      throw new EmptyIntStackException();
    return stk[--ptr];
  }

  // peek
  public int peek() throws EmptyIntStackException{
    if(ptr <= 0)
      throw new EmptyIntStackException();
    return stk[ptr - 1];
  }

  // 인덱스 찾기
  public int indexOf(int x){
    for(int i = ptr-1; i>=0; i--)
      if(stk[i] == x)
        return i;
      return -1;
  }

  public void clear(){
    ptr = 0;
  }

  public int capacity(){
    return max;
  }

  public int size(){
    return ptr;
  }

  public boolean isEmpty(){
    return ptr<=0;
  }

  public boolean isFull(){
    return ptr >= max;
  }

  // 스택안의 모든 데이터를 출력
  public void dump(){
    if(ptr <= 0)
      System.out.println("The stack is empty.");
    else{
      for(int i=0; i<ptr; i++)
        System.out.print(stk[i] + " ");
      System.out.println();
    }
  }
}
