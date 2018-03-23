import java.util.*;
import java.math.*;
public class TopKNumbersInStream {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
			int n = scan.nextInt();
			int k = scan.nextInt();
			Map<Integer,Set<Integer>> m = new TreeMap<Integer,Set<Integer>>(Collections.reverseOrder());
			Map<Integer,Integer> mp = new TreeMap<Integer,Integer>();
			
			while(n-->0){
			int key = scan.nextInt();
			int occ = 0;
			int b = -1;
			if(mp.containsKey(key)){
				occ = mp.get(key);
				b = occ;
				System.out.println(occ+" "+key);
				mp.put(key,++occ);	
			}
			else{
				System.out.println(occ+" "+key);
				mp.put(key,++occ);
			}
			if(b!=-1){
				System.out.println(b+" b "+key);
			    m.get(b).remove(key);
			}
			if(m.containsKey(occ)){
				System.out.println(occ+" "+key);
				m.get(occ).add(key);
			}
			else{
				System.out.println(occ+" "+key);
				m.put(occ,new TreeSet<Integer>());
				m.get(occ).add(key);
			}
			int count = 0 ;
		       for( int e : m.keySet())
		       {
		           for(int j : m.get(e) )
		           {
		               System.out.print(j+" ") ;
		               count++ ;
		               if( count == k ) break ;
		           }
		           if( count == k ) break ;
		       }
		}
			System.out.println();
	}
	}
}
