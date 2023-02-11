// import java.util.Arrays;
// class HelloSirJi {
//     public static int threeSumClosest(int[] nums, int target) {
//         System.out.println("This method is called.");
        
//         int len=nums.length-1;
//         Arrays.sort(nums);

//         System.out.println(Arrays.toString(nums));
        
//         int tempDiff=Math.abs(nums[0]+nums[1]+nums[2]-target);
//         int closest=0;

//         // int res=nums[0]+nums[1]+nums[2];
//         int res=0;


        
//         for (int i=0;i<len-1;i++){
//             int j=i+1;
//             int k=len;
            
//             while (j<k){
//                 System.out.println("***************************************************");
//                 int tempSum=nums[i]+nums[j]+nums[k];

//                 System.out.println(nums[i]+" "+nums[j]+" "+nums[k]);

//                 System.out.println("Closest1 : "+tempDiff);
                
//                 if (Math.abs(tempSum-target)<=tempDiff){
//                     closest=Math.abs(tempSum);
//                     tempDiff=Math.abs(tempSum-target);
//                     res=tempSum;
//                 }
                
//                 System.out.println("Closest2 : "+tempDiff);
//                 if (tempSum<=closest){
//                     j+=1;
//                 }else{
//                     k-=1;
//                 }
//             }
//         }
//         return res;
//     }
//     public static void main(String[] args){
//         System.out.println("Code is running well.");
//         int arr[]={4,0,5,-5,3,3,0,-4,-5};
//         int target=-2;

//         System.out.println(threeSumClosest(arr, target));
//     }
// }