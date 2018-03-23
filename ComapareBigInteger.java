// Java program to find large factorials using BigInteger
import java.math.BigInteger;
import java.util.Scanner;
public class ComapareBigInteger {
    static String covertInt(String a){
        StringBuffer s = new StringBuffer(a);
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='.') {
             s.deleteCharAt(i);
             if(i+1<a.length()){ if(a.charAt(i+1)=='0') {s.deleteCharAt(i); i++;}}        
            }
        }
        System.out.println(s.toString());
        return (s.toString());
    }
	public int compareVersion(String a, String b) {
		String s1[] = a.split(".");
	    String s2[] = b.split(".");
	    int n = Math.min(s1.length,s2.length);
	    for(int i=0;i<n;i++){
	    	BigInteger b1 = new BigInteger(s1[i]);
	 	    BigInteger b2 = new BigInteger(s2[i]);
	 	   if(b1.compareTo(b2)>0) return 1;
	 	   if(b1.compareTo(b2)<0) return -1;
	    }
	    return 0;
	}
}
