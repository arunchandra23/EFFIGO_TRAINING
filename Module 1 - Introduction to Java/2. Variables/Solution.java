import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String inputString;
    static int count=0;
    public static void main(String[] args) {
        List<String> inp=new ArrayList<String>();
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        while (stdin.hasNext()) {
            inputString=stdin.next();
            System.out.println(inputString);
            if(inputString.equals("")){
                break;
            }
            inp.add(inputString);
            count++;
        }
        
        inp.forEach(x->System.out.println(x));
        System.out.println(inp);
        stdin.close();
    }
}