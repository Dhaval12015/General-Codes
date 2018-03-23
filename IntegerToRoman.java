import java.io.*;
import java.util.*;
public class IntegerToRoman {
	public static void main(String args[]){
	int ans = 900;
	   HashMap<Integer,String> hm = new HashMap<Integer,String>();
	   hm.put(1,"I");hm.put(4,"IV");hm.put(5,"V");hm.put(9,"IX");hm.put(10,"X");
	   hm.put(40,"XL");hm.put(50,"L");hm.put(90,"XC");hm.put(100,"C");
	   hm.put(400,"CD");hm.put(500,"D");hm.put(900,"CM");hm.put(1000,"M");
	   StringBuffer s = new StringBuffer();

	   while(ans!=0){
		   if(ans>=1000){
			   s.append(hm.get(1000));
			   ans = ans - 1000;
			   continue;
		   }
		   if(ans>=990){
			   s.append(hm.get(990));
			   ans = ans - 990;
			   continue;
		   }
		   if(ans>=500){
			   s.append(hm.get(500));
			   ans -= 500;
			   continue;
		   }
		   if(ans>=400){
			   s.append(hm.get(400));
			   ans -= 400;
			   continue;
		   }
		   if(ans>=100){
			   s.append(hm.get(100));
			   ans -= 100;
			   continue;
		   }
		   if(ans>=90){
			   s.append(hm.get(90));
			   ans = ans - 90;
			   continue;
		   }
		   if(ans>=50){
			   s.append(hm.get(50));
			   ans -= 50;
			   continue;
		   }
		   if(ans>=40){
			   s.append(hm.get(40));
			   ans -= 40;
			   continue;
		   }
		   if(ans>=9){
			   s.append(hm.get(9));
			   ans = ans - 9;
			   continue;
		   }
		   if(ans>=10){
			   s.append(hm.get(10));
			   ans -= 10;
			   continue;
		   }
		   if(ans>=5){
			   s.append(hm.get(5));
			   ans -= 5;
			   continue;
		   }
		   if(ans>=4){
			   s.append(hm.get(4));
			   ans -= 4;
			   continue;
		   }
		   if(ans>=1){
			   s.append(hm.get(1));
			   ans -= 1;
			   continue;
		   }
	   }
	   String s1 = s.toString();
	   System.out.println(s1);
}
}