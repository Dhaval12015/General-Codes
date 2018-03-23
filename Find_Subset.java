import java.util.*;
import java.io.*;
import java.math.*;
public class Subset {
	static void printSubset(int arr[]){
		int l = arr.length;
		for(int i=0;i<(1<<l);i++){
			System.out.print("{");
			int sum = 0;
			for(int j=0;j<l;j++)
				if((i&(1<<j))>0)
					sum += arr[j];
	
					System.out.print(sum+" ");
		System.out.println("}");
		}
	}
	static void printSubsetMyWay(int arr[]){
		int l = arr.length;
		for(int i=0;i<(1<<l);i++){
			String s = Integer.toBinaryString(i);
			System.out.print("{");
			for(int j=0;j<s.length();j++)
				if(s.charAt(j)=='1')
					System.out.print(arr[j]+" ");
		System.out.println("}");
		}
	}
	public static void main(String args[]){
		int arr[] = {1,2,3,4};
		printSubset(arr);
	}
}
