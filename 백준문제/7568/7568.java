import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] member = new int [n][2];

    for (int i = 0; i < n; i++) {
      member[i][0] = sc.nextInt();
      member[i][1] = sc.nextInt();
    }

    for(int i = 0 ; i<n; i++){
      int rank =1;
      for(int j=0;j<n;j++){
        if(i==j) continue;
        if(member[i][0]<member[j][0] && member[i][1]<member[j][1])
          rank++;
      }
      System.out.print(rank+" ");
    }
    sc.close();
  }
}
