// import java.util.Arrays;
// import java.util.PriorityQueue;

// class Hello {

//     static int[] myMethod(int arr[], int x, int k) {

//         System.out.println("This method is called");

//         int i = 0, j = k;
//         int newArr[] = new int[k];
//         while (j < arr.length) {
//             if (Math.abs(arr[i] - x) > Math.abs(arr[j] - x)) {
//                 i++;
//                 j++;
//             } else {
//                 break;
//             }
//         }

//         System.out.println("value of i :"+i+"\nvalue of j : "+j);

//         for (int ptr1 = 0; ptr1 < k; ptr1++) {
//             newArr[ptr1] = arr[i + ptr1];
//         }

//         return newArr;
//     }

//     public static void main(String[] args) {
//         System.out.println("Code is running 658.");
//         int arr[] = { 1, 2, 3, 4 };
//         int k = 4;
//         int x = 10;
//         int result[] = myMethod(arr, x, k);
//         System.out.println("Result : " + Arrays.toString(result));

//     }
// }

import java.util.*;

class Solution111111 {
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        int i=0,j=k;
        
        while (j<arr.length){
            if (Math.abs(arr[i]-x)>Math.abs(arr[j]-x)){
                i++;
                j++;
            }else{
                break;
            }
        }
        
        // int newArr[]=new int[k];
        List<Integer> newArr=new ArrayList<Integer>();
        
        for (int ptr=i;ptr<j;ptr++){
            newArr.add(arr[ptr]);
            
        }
        
        return newArr;
        
    }
    public static void main(String[] args){
        System.out.println("Code is running");
        int arr[]={1,2,3,4,5};
        int x=3;
        int k=4;
        ArrayList<Integer> result=findClosestElements(arr, k, x);
    }
}