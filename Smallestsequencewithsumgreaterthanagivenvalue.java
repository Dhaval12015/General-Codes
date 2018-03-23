import java.util.Arrays;
import java.util.Scanner;

// Smallest sequence with sum greater than a given value
public class Smallestsequencewithsumgreaterthanagivenvalue {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int arr[] = {1, 4, 45, 6, 0, 19};
		int sum = 0;
		int x = 51;
		for(int i=0;i<arr.length;i++){
			sum += arr[i];
		}
		if(x>sum){
			System.out.println("Not Possible");
			return;
		}
		if(x==sum){
			System.out.println(arr.length);
			return;
		}
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++){
			sum -= arr[i];
			
			if(sum==x){
				System.out.println(arr.length - i);
				return;
			}
			if(sum<x){
				int cnt = 1;
				if(arr[i]>x){System.out.println(1);return;}
				for(int j=i-1;j>=0;j--){
					sum += arr[j];
					cnt++;
					if(sum>x)break;
				}
				System.out.println(cnt);
				return;
			}
			
		}
	}
}
