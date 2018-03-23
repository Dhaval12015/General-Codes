import java.util.Scanner;

// Stock Buy Sell to Maximize Profit

public class StockBuySelltoMaximizeProfit {
	public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	int arr[] = {23, 13, 25, 29, 33, 19, 34, 45, 65, 67};
	boolean f1 = false;
	int a = 0;
	for(int i=0;i<arr.length-1;i++){
		if(!f1){
		if(arr[i]<arr[i+1]){
			a = i;
			f1 = true;
			continue;
		}}
		if(f1){
			if(arr[i]>arr[i+1]){
				System.out.print("("+a+" "+i+") ");
				f1 = false;
			}
			if(i==arr.length-2){
				System.out.print("("+a+" "+(i+1)+") ");
			}
		}
		}
	}
}
