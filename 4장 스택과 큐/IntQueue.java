public class IntQueue{
  private int max;
  private int front;
  private int rear;
  private int num;
  private int[] que;

  public class EmptyIntQueueException extends RuntimeException{
    public EmptyIntQueueException(){}
  }

  public class OverflowIntQueueException extends RuntimeException{
    public OverflowIntQueueException(){}
  }

  public IntQueue(int capacity){
    num = front = rear = 0;
    max = capacity;
    try{
      que = new int[max];
    } catch (OutOfMemoryError e){
      max = 0;
    }
  }

  // 인큐
  public int enque(int x) throws OverflowIntQueueException{
    if(num >= max)
      throw new OverflowIntQueueException();
    que[rear++] = x;
    num++;
    if(rear == max)
      rear = 0;
    return x;
  }

  // 디큐
  public int deque() throws EmptyIntQueueException{
    if(num<=0)
      throw new EmptyIntQueueException();
    int x = que[front++];
    num--;
    if(front == max)
      front = 0;
    return x;
  }

  // 피크
  public int peek() throws EmptyIntQueueException{
    if(num<=0)
      throw new EmptyIntQueueException();
    return que[front];
  }

  // 인덱스 찾기
  public int indexOf(int x){
    for(int i=0; i<num; i++){
      int idx = (i + front) % max;
      if(que[idx] == x)
        return idx;
    }
    return -1;
  }

  public void clear(){
    num = front = rear = 0;
  }

  public int capacity(){
    return max;
  }

  public int size(){
    return num;
  }

  public boolean isEmpty(){
    return num<=0;
  }

  public boolean isFull(){
    return num >= max;
  }

  // 스택안의 모든 데이터를 출력
  public void dump(){
    if(num <= 0)
      System.out.println("The stack is empty.");
    else{
      for(int i=0; i<num; i++)
        System.out.print(que[(i + front) % max] + " ");
      System.out.println();
    }
  }
}
