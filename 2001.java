import java.util.Arrays;
import java.util.HashSet;
import java.util.ArrayList;

// class Solution {
//     public int[] findOriginalArray(int[] changed) {
//         int len=changed.length/2;
//         HashSet<Integer> set=new HashSet<>();
//         for (int i=len;i<changed.length;i++){
//             set.add(changed[i]);
//         }
        
//         ArrayList<Integer> arr=new ArrayList<>();
//         for (int i=0;i<len;i++){
//             int nums=changed[i];
//             if (set.contains(nums*2)){
//                arr.add(nums);
//             }
//         }
//         int result[]=new int[arr.size()];
//         result=arr.toArray();
//         if (result.length==len){
//             return result;
//         }
//         return new int[0];
        
//     }
//     public static void main(String[] args){
//         System.out.println("Code is running");
//     }
// }


// A Java program to convert an ArrayList to arr[]
// import java.io.*;
import java.util.List;
// import java.util.ArrayList;

class GFG {
 public static void main(String[] args)
 {
  List<Integer> al = new ArrayList<Integer>();
  al.add(10);
  al.add(20);
  al.add(30);
  al.add(40);

  Integer[] arr = new Integer[al.size()];
  arr = al.toArray(arr);

  for (Integer x : arr)
   System.out.print(x + " ");
 }
}
