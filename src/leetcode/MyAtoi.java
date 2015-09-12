package leetcode;
import java.util.*;
public class MyAtoi {
	public static int myAtoi(String str) {
        long total = 0;
        if(str.length() == 0)
        return 0;
        int length = str.length();
        if(str.charAt(0) != '-')
        		{
        	char a =0;
        for(int i = 0; i < length; i++){
         a = str.charAt(i);
            total += ((long)str.charAt(i))*(long)Math.pow(10,0);
        }
        }
        else{
            for(int i = 1; i < length; i++){
            total += (long)str.charAt(i)*Math.pow(10,length-i-2);
        }
        }
        
        if(total <= Integer.MAX_VALUE){
            if(str.charAt(0) != '-')
            return (int)total;
            else 
            return (int)-total;
        }
        else
        return 0;
    }
	
	public static void main(String[] args){
		String s = "1";
	//	System.out.println(myAtoi(s));
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(1, 5);
		System.out.println(a.get(2));
	}
}
