package com.ques;

public class Solution904 {
	public static int totalFruit(int[] tree) {
		System.out.println("This method is called");
        int n = tree.length;
        int type1 = tree[0], type2 = -1;
        int combos = 1;//assume type1 is prev type
        int curLen = 1, max = 1;
        for(int i=1;i<n;i++)
        {
        	System.out.println("####################################################");
        	System.out.println("type1 = "+type1);
        	System.out.println("type2 = "+type2);
        	System.out.println("tree[i] = "+tree[i]);
            if(tree[i] != type1 && tree[i] != type2 && type2!=-1)
            {
            	System.out.println("New fruit found...");
                max = Math.max(curLen, max);
                curLen = combos + 1;
                type2 = type1; 
                type1 = tree[i];
                combos = 1;
                continue;
            }
            if(tree[i] == type1) {
            	System.out.println("type1 fruit found...");
                combos++;
            }
            else //swap type1 and type2 
            {
            	System.out.println("Swapping...");
                type2 = type1;
                type1 = tree[i];
                combos = 1;
            }
            curLen++;
        }
        return Math.max(max,curLen);
    }
	public static void main(String[] args) {
		System.out.println("Code is running");
		int[] fruits= {1,2,3,2,2};
		int res=totalFruit(fruits);
		System.out.println(res);
	}

}
