// int형 스택을 사용한 프로그램을 만들어보자

import java.util.Scanner;

public class IntStackTester{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    IntStack s = new IntStack(64); // 최대 64개를 푸시할 수 있는 스택

    while(true){
      System.out.println("Current data count: " + s.size() + " / " + s.capacity());
      System.out.print("(1)push (2)pop (3)peak (4)dump (5)end : ");

      int menu = stdIn.nextInt();
      if(menu ==0) break;

      int x;
      switch(menu){
        case 1: System.out.print("data : "); x = stdIn.nextInt();
          try{
            s.push(x);
          } catch(IntStack.OverflowIntStackException e){
            System.out.println("Stack is full");
          }
        break;

        case 2:
          try{
            x = s.pop();
            System.out.println("pop : " + x);
          } catch(IntStack.EmptyIntStackException e){
            System.out.println("Stack is empty");
          }
        break;

        case 3:
          try{
            x = s.peek();
            System.out.println("peek : " + x);
          } catch(IntStack.EmptyIntStackException e){
            System.out.println("Stack is empty");
          }
        break;

        case 4:
          s.dump();
          break;
      }
    }


  }
}
