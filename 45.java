// class Vishal {
//     public static int minStepCount(int arr[]){
//         int currrentIndex=arr.length-1;
//         int jumpCount=0;
//         for (int i=currrentIndex;i>=0;i--){
//             if (i+arr[i]>=currrentIndex){
//                 System.out.println("Reachable");
//                 jumpCount+=(currrentIndex-i);
//                 currrentIndex=i;
//             }
//         }
//         return jumpCount;
//     }

//     public static int minJumpCount(int arr[]){
//         int i=0;
//         int maxReachable=0;
//         int jumpCount=0;
//         while (i<=maxReachable && i<arr.length){
//             int currentReachable=i+arr[i];
//             if (currentReachable>maxReachable){
//                 System.out.println("Index : "+i);
//                 maxReachable=currentReachable;
//                 System.out.println("Requires a jump : ");
//                 System.out.println("Maximum Reachable : "+maxReachable);
//                 jumpCount++;
//             }
//             if (maxReachable>=arr.length-1){
//                 System.out.println("Condition matched.");
//                 break;
//             }
//             i++;
//         }
//         return jumpCount;
//     }
//     public static void main(String[] args){

//         System.out.println("Code is running");
//         // int arr[]={2,3,1,1,4};
//         // int arr[]={2,0,1,100,4};
//         // int arr[]={1,2};
//         int arr[]={7,0,9,6,9,6,1,7,9,0,1,2,9,0,3};
//         // int result=minStepCount(arr);
//         // System.out.println(result);

//         int result2=minJumpCount(arr);
//         System.out.println("Minimum Jump: "+result2);
//     }

// }

// class Solution {
//     public static  int jump(int[] nums) {
//         int jumpCount=0;
//         int maxReachableIndex=0;
//         int currentReachableIndex=0;
//         int i=0;
//         int len=nums.length-1;
//         while (i<=len){
//             currentReachableIndex=Math.max(currentReachableIndex,i+nums[i]);
//             if (i==maxReachableIndex){
//                 jumpCount++;
//                 maxReachableIndex=currentReachableIndex;
//             }
//             if (maxReachableIndex==len){
//                 break;
//             }
//             i++;
//         }
//         return jumpCount;

//     }
//     public static void main(String[] args){
//         int arr[]={2,3,1,1,4};
//         int result=jump(arr);
//         System.out.println("Minimum JUmp: "+result);
//     }
// }

// import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.*;
import java.util.PriorityQueue;

// import javax.swing.text.html.parser.Entity;

class HelloVishal {
    public static void main(String[] args) {

        System.out.println("Code is running");

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Vishal", 1);
        map.put("kumar", 2);
        map.put("singh", 12);
        map.put("Hello", 0);
        

        PriorityQueue<Map.Entry<String, Integer>> queue = new PriorityQueue<>(Map.Entry.comparingByValue());
        Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();

        while (itr.hasNext()) {
            Map.Entry<String, Integer> entry = itr.next();
            
            queue.offer(entry);
        
        }

        System.out.println(map);
        System.out.println(queue);
    }
}