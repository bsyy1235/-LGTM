import java.util.*;
import java.io.*;

public class Main {	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());
    	
    	LinkedList<Integer> list = new LinkedList<Integer>();
    	StringBuilder sb = new StringBuilder();
    	StringTokenizer st;
    	
    	for(int i = 0; i<n ;i++) {
    		st = new StringTokenizer(br.readLine());
    		String queue = st.nextToken();
    		
    		switch(queue) {
    		case "push":
    			list.add(Integer.parseInt(st.nextToken()));
    			break;
    		case "pop":
    			if(list.isEmpty()) sb.append(-1).append("\n");
    			else sb.append(list.poll()).append("\n");
    			break;
    		case "size":
    			sb.append(list.size()).append("\n");
        		break;
    		case "empty":
    			if(list.isEmpty()) sb.append(1).append("\n");
    			else sb.append(0).append("\n");
    			break;
    		case "front":
    			if(list.isEmpty()) sb.append(-1).append("\n");
    			else sb.append(list.peek()).append("\n");
    			break;
    		case "back":
    			if(list.isEmpty()) sb.append(-1).append("\n");
    			else sb.append(list.get(list.size()-1)).append("\n");
    			break;}
    	}
    	System.out.println(sb);

}
}
