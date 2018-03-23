import java.util.*;
public class Find_Fraction {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		loop : 
		while(t-->0){
			long a = scan.nextLong();
			long b = scan.nextLong();
			
			if(a%b==0){
				System.out.println(0);
			}
			else{
				long x = a%b;
				int cnt = 0;
				while(x<b){
					x *= 10;
					cnt++;
				}
				Set<Long>  hs = new HashSet<Long>();
				
				while(true){
					if(x%b==0) {break;}
					if(hs.contains(x%b)) { System.out.println("inf");continue loop; }
					x = (x%b)*10;
				}
				System.out.println(hs.size()+cnt);
			}
		}
	}
}
