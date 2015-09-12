package leetcode;

public class Reverse {
	public static int reverse(int x) {
        int a = Math.abs(x);
        int[] reverseArray = new int[32];
        int i = 0;
       while(a > 0){
        int remain = a%10;
        a = a/10;
        reverseArray[i] = remain;
        i++;
       }
       
       
       long total = 0;
       for(int j = 0; j < i ; j++){
           int add = reverseArray[j];
           total = total+(long)add*((int)Math.pow(10, i-j-1));
       }
      if(total <= Integer.MAX_VALUE){
          if(x >= 0)
          return (int)total;
          else
          return (int)-total;
      }
      else return 0;
       
    }
	public static void main(String[] args){
		System.out.println(reverse(1234563112));
	}
}
