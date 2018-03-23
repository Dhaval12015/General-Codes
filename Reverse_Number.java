import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Reverse_Number {
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        StringBuffer input = new StringBuffer(scan.nextLine());
        input.reverse();
        System.out.println(input.toString());
        System.out.println(Integer.parseInt(input.toString()));
    }
}
