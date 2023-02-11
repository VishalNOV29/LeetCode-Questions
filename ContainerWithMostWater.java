// // // import java.net.PortUnreachableException;

// // class Main123{

// //     public static int maxWater(int arr[]){
// //         int max=0;
// //         int distance=arr.length-1;
// //         int i=0;
// //         int j=arr.length-1;
// //         while (i!=j){
// //             int waterContaining=distance*Math.min(arr[i], arr[j]);
// //             System.out.println(waterContaining);
// //             distance--;
// //             if (waterContaining>max){
// //                 max=waterContaining;
// //             }

// //             if (arr[i]<arr[i+1]){
// //                 i+=1;
// //             }else{
// //                 j-=1;
// //             }

// //         }
// //         return max;
// //     }
// //     public static void main(String[] args){
// //         System.out.println("Code is running. 123");

// //         // int arr[]={1,8,6,2,5,4,8,3,7};
// //         // int arr[]={1,1};
// //         int arr[]={1,3,2,5,25,24,5};
// //         System.out.println(maxWater(arr));
// //     }
// // }

// class Hello {
//     public static  boolean canJump(int[] nums) {
//         int n = nums.length;
//         int l = n - 1;
//         for (int i = n - 1; i >= 0; i--) {
//             System.out.println("************************************");
//             System.out.println("l : "+l);
//             System.out.println("i : "+i);
//             System.out.println("i+nums[i] : "+(i+nums[i]));
//             System.out.println((i+nums[i])>=l);
//             if (i + nums[i] >= l) {
//                 l = i;
//             }
//         }
//         return l == 0;
//     }

//     public static void main(String args[]) {
//         int arr[]={1,2,3,0,4};
//         boolean result=canJump(arr);
//         System.out.println(result);
//     }
// }