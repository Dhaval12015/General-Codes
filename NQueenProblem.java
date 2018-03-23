import java.util.*;
public class NQueenProblem {
	
	public static void main(String args[]){
		//	Queue<Integer> q = new PriorityQueue<Integer>();
			Scanner scan = new Scanner(System.in);
			int t = 0;
			while(t-->0){
				String s = scan.next();
				char c = scan.next().charAt(0);
				int n = scan.nextInt();
				System.out.println(n);
			}
			Integer arr[] = new Integer[10];
		//	Arrays.fill(arr, 1);
			for(int i=0;i<10;i++) arr[i] = i+1;
		//	String s = String.valueOf(arr);
			System.out.println(Arrays.toString(arr));
			Collections.rotate(Arrays.asList(arr),2);
			System.out.println(Arrays.toString(arr));
			}
}
