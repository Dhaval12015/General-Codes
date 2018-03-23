import java.util.*;
public class Comment_Check {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		boolean bool = false;
		int l = str.length();
		for(int i=0;i<l-1;i++) {
		if(str.charAt(i)==47 && str.charAt(i+1)==47)
		{
			bool = true;
			break;
		}
		else if(str.charAt(i)==47 && str.charAt(i+1)=='*') {
			for(int j=i+2;j<l-1;j++) {
				if( str.charAt(j+1)==47 && str.charAt(j)=='*')
				{
					bool=true;
					break;
				}
			}
		}
		}
		if(bool==true)
			System.out.println("Given line is a comment");
		else
			System.out.println("Given line is not a comment");
		}
}
