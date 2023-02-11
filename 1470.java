import java.util.Arrays;

class Solution{

    public static int[] shuffle(int[] nums, int n) {
        int newArr[]=new int[2*n];
        int i=0;
        int j=n;
        int ptr=0;
        while (j<nums.length){
            newArr[ptr]=nums[i];
            newArr[ptr+1]=nums[j];
            i++;
            j++;
            ptr+=2;
        }
        return newArr;
        
    }
    public static void main(String[] args){
        System.out.println("Code is running");
        int arr[]={2,5,1,3,4,7};
        int n=3;
        int[] res=shuffle(arr,n);
        System.out.println(Arrays.toString(res));


    }
}