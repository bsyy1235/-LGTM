# 백준 11866번 문제 < 요세푸스 문제 0 >
<https://www.acmicpc.net/problem/11866>

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    LinkedList <Integer> list = new LinkedList<Integer>();

    for(int i=1;i<=k;i++)
      list.add(i);

    int n = sc.nextInt();
    
    System.out.print("<");
    while(!list.isEmpty()){
      if(list.size()==1){ // 마지막 요소 출력할 때 ","를 없애기 위함.
        System.out.print(list.remove());
        break;
      }
        
      for(int i=0;i<n-1;i++) // n번째 사람을 제거하기 위해 n-1명의 사람을 뒤쪽으로 보냄.
        list.add(list.remove());
      
      System.out.print(list.remove()+", ");
    }
    System.out.print(">");
    sc.close();
}}
