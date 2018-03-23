import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class ValidIPAddress {
	static boolean checkValidIPAddress(String s){
					System.out.println(s);
				String arr[] = s.split("\\.");
				for(int i=0;i<arr.length;i++){
					if(Integer.parseInt(arr[i])<0 || Integer.parseInt(arr[i])> 255 || arr[i].length()>3){
						return false;
					}
				}
				return true;
	}
	static String removeZero(String s){
		String arr[] = s.split("\\.");
		for(int i=0;i<arr.length;i++){
			int n = Integer.parseInt(arr[i]);
		//	System.out.println(n);
			arr[i] = Integer.toString(n);
		}
		StringBuffer s2 = new StringBuffer();
		for(int i=0;i<arr.length-1;i++){
			s2.append(arr[i]);
			s2.append('.');
		}
		s2.append(arr[arr.length-1]);
		String s1 = s2.toString();
	//	System.out.println(s1);
		return s1;
	}
	public static void main(String args[]){
		ArrayList<String> al = new ArrayList<String>();
	//	HashSet<String> hm = new HashSet<String>();
		String a = "0100100";
		int n = a.length();
		if(n<4 && n>12){
			return; 
		}
		int b = 3;
		for(int i=0;i<b;i++){
			for(int j=i+1;j<b+i+1;j++){
				for(int k=j+1;k<b+j+1 && k<n;k++){
					
						StringBuffer s = new StringBuffer(a);
						System.out.println(a);
						s.insert(i+1,'.');
						s.insert(j+2,'.');
						s.insert(k+3,'.');
						
						String s1 = s.toString();
						if(checkValidIPAddress(s1)){
							String s2 = removeZero(s1);
						//	hm.add(s2);
						//	System.out.println(s2 +" "+true);
							if(!al.contains(s2) && s2.length()==a.length()+3){
								System.out.println(s2 +" "+false);
								al.add(s2);
							}
						}
				}
			}
		}
	}
}
