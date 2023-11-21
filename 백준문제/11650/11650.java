import java.util.*;

public class Main {	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int[][] list = new int[n][2];
    	for(int i=0;i<n;i++) {
    		list[i][0]=sc.nextInt();  
    		list[i][1]=sc.nextInt();
    	}
    	
    	Arrays.sort(list,new Comparator<int[]>() {
    		@Override
    		public int compare(int[] a, int[] b) {
    			if(a[0]==b[0])
    				return a[1]-b[1];
    			return a[0]-b[0];
    		}
    	});
    	
    	for(int i=0;i<n;i++) {
    		System.out.println(list[i][0]+" "+list[i][1]);
    	}

    	sc.close();
}
}
