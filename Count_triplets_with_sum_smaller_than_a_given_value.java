import java.util.Arrays;
import java.util.Scanner;


public class Count_triplets_with_sum_smaller_than_a_given_value {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int sum = 12;
		int arr[] = {5, 1, 3, 4, 7};
		Arrays.sort(arr);
		int cnt = 0;
		for(int i=0;i<arr.length-2;i++){
			boolean flag = false;
			if(arr[i]+arr[i+1]+arr[i+2] >= sum) break;
				for(int j=i+1;j<arr.length-1;j++){
					if(arr[i]+arr[j] >= sum) { flag = true; break;}
					for(int k=j+1;k<arr.length;k++){
						if(arr[i]+arr[j]+arr[k] < sum) cnt++;
						else break;
					}
				}
				if(flag) break;
			}
		System.out.println(cnt);
		
		/* Another Method in O(n2), Above was in O(n3) in wrost case*/
		int ans = 0;
		for(int i=0;i<arr.length-2;i++){
			int j = i+1;
			int k = arr.length-1;
			
			while(j<k){
				if(arr[i]+arr[j]+arr[k] >= sum){
					k--;
				}
				else{
					ans += k-j;
					j++;
				}
			}
		}
			
		System.out.println(ans);
	}
}
