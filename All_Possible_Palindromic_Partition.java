import java.util.Scanner;


public class All_Possible_Palindromic_Partition {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String s = "geeks";
		for(int k=0;k<s.length();k++){
			System.out.print(s.charAt(k)+" ");
		}
		System.out.println();
		for(int i=1;i<s.length()-1;i++){
			int start = i-1;
			int end = i+1;
			
			while(start>=0 && end<=s.length() && (s.charAt(start)==(s.charAt(end)))){
				String palandromic = s.substring(start,end+1);
				
				for(int j=0;j<s.length();j++){
					if(j!=start){
						System.out.print(s.charAt(j)+" ");
					}
					else{
						System.out.print(palandromic+" ");
						j = end;
					}
				}

				System.out.println();
				start--;
				end++;
			}
			
		}
		for(int i=0;i<s.length()-1;i++){
			int start = i;
			int end = i+1;
			
			while(start>=0 && end<=s.length() && (s.charAt(start)==(s.charAt(end)))){
				String palandromic = s.substring(start,end+1);
				
				for(int j=0;j<s.length();j++){
					if(j!=start){
						System.out.print(s.charAt(j)+" ");
					}
					else{
						System.out.print(palandromic+" ");
						j = end;
					}
				}

				System.out.println();
				start--;
				end++;
			}
			
		}
		
		
	}
}
