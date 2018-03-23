import java.io.*;
import java.util.*;
public class RomanToInt {
	public static void main(String args[]){
	String a = "MMCDLXXV";
	   HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
	   hm.put('I',1);hm.put('V',5);hm.put('X',10);hm.put('L',50);hm.put('C',100);
	   hm.put('D',500);hm.put('M',1000);
	   int ans = 0;
	   
	   for(int i=0;i<a.length();i++){
		   if(i+1<a.length())
		   if(hm.get(a.charAt(i))<hm.get( a.charAt(i+1))){
			   ans += hm.get(a.charAt(i+1)) - hm.get(a.charAt(i));
			   i++;
			   continue;
		   }
		   
			   ans += hm.get( a.charAt(i));
		 
		/*   if(i==a.length()-2){
			   if(a.charAt(i)=='I' && a.charAt(i+1)!='I'){
				   ans += hm.get( a.charAt(i+1)) - 1;
				   break;
			   }
			   else{
				   ans += hm.get( a.charAt(i+1)) + hm.get( a.charAt(i));
				   break;
			   }
		   }
		   ans += hm.get( a.charAt(i)); */
	   }
	   System.out.println(ans);
	}   
}
