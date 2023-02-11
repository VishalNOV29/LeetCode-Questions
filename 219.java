// import java.util.HashMap;
// class Solution {
//     public static  boolean containsNearbyDuplicate(int[] nums, int k) {
//         HashMap<Integer,Integer> map=new HashMap<>();
//         for (int i=0;i<nums.length;i++){
//             System.out.println("Inside loop : "+nums[i]);
//             int data=nums[i];
//             System.out.println(map.containsKey(data));
//             if (map.containsKey(data)){
//                 System.out.println("c s : "+nums[i]);
//                 int index=map.get(data);
//                 int difference=Math.abs(i-index);
//                 if (difference<=k){
//                     return true;
//                 }
//                 map.replace(data,index,i);
//             }else{
//                 map.put(data, i);
//             }
//         }
//         return false;

//     }
//     public static void main(String[] args){
//         int arr[]={1,2,3,1};
//         int k=3;
//         System.out.println(containsNearbyDuplicate(arr,k));

//     }
// }