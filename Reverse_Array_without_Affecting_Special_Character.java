import java.util.Scanner;


public class Reverse_Array_without_Affecting_Special_Character {

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
	//	int t = scan.nextInt();
		
	//	while(t-->0){
			String s = "a!!!b.c.d,e'f,ghi";
			
			char[] c = s.toCharArray();
			int start = 0,end = s.length()-1;
			
			while(start<end){
				if(((c[start] >= 65 && c[start] <= 90) || (c[start] >= 97 && c[start] <= 122)) && 
						((c[end] >= 65 && c[end] <= 90) || (c[end] >= 97 && c[end] <= 122))	){
					char temp = c[start];
					c[start] = c[end];
					c[end] = temp;
					start++;
					end--;
				}
				else{
					if(!((c[start] >= 65 && c[start] <= 90) || (c[start] >= 97 && c[start] <= 122))){
						start++;
					}
					else{
						end--;
					}
				}
				
			}
			
			s = s.valueOf(c);
			System.out.println(s);
			}
	//	}
	}
