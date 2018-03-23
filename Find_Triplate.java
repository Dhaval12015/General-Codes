import java.util.*;
public class Find_Triplate {
	public static void main(String args[]){
		int arr[] = {7,8,6,5,3,2,1,9,4};
		Arrays.sort(arr);
		int l = arr.length;
		int X = 13;
		
		for(int i=0;i<l-2;i++){
			int j=i+1,k=l-1;
			while(j<k){
				int sum = arr[i]+arr[j]+arr[k];
				if(sum==X){
					System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
					break;
				}
				else if(sum<X){
					j++;
				}
				else if(sum>X){
					k--;
				}
			}
		}
	}
}
