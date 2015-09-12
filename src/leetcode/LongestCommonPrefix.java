package leetcode;
import java.util.*;
public class LongestCommonPrefix {

	public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0  ) return "";
        if(strs.length == 1) return strs[0];
        ArrayList<String> longestCommon = new ArrayList<String>();
        int i = 0;
        String prefix = "";
        while(true){
            if(i == strs[0].length()) break;
            
            String a = String.valueOf(strs[0].charAt(i));
            int j = 1;
            while(j < strs.length){
                if(i != strs[j].length()) {
                	
                if(String.valueOf(strs[j].charAt(i)).equals(a))
                j++;
                else break;;
                }
                else break;
            }
            if(j == strs.length){
            longestCommon.add(a);
            i++;}
            else break;
        }
        
        for(int k = 0; k < longestCommon.size(); k++){
            prefix += longestCommon.get(k);
        }
        return prefix;
    }
	public static void main(String[] args){
		String[] a ={"c","cb"};
		System.out.println(longestCommonPrefix(a));
	}
}

