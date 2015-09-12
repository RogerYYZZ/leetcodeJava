package leetcode;

public class MaxArea {
	public static int maxArea(int[] height) {
        int maxArea = 0;
    
        for(int i = 0; i < height.length; i++){
            for(int j = i+1; j < height.length; j++){
                
                int area = (height[i] + height[j])*(j-i)/2;
                if(area > maxArea)
                maxArea = area;
            }
        }
        return maxArea;
    }
	public static void main(String[] args){
	
}
}
