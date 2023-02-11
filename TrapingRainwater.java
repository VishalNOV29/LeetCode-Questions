// import java.util.Arrays;

// // This problem basically about the water trapped inside after the rain. Here first of all we have to pre-preocess the array by both sides.
// // The water stored at a particular pillar is the min(left[i],right[i])-currnet. This the amount of water that will be stored at any point.
// // Let's see the code....

// public class TrapingRainwater {
//     public static void main(String[] args) {
//         System.out.println("Code is running");
//         // int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
//         int arr[]={4,2,0,3,2,5};
//         int n=arr.length-1;

//         // Start pre-processing the array.

//         // Left preprocessing...
//         int leftProcessing[]=new int[n+1];
//         int maxValue1=arr[n];
//         for (int i=n;i>=0;i--){
//             if (arr[i]>maxValue1){
//                 maxValue1=arr[i];
//             }
//             leftProcessing[i]=maxValue1;
//         }

        

//         // Right preprocessing...
//         int rightProcessing[]=new int[n+1];
//         int maxValue2=arr[0];
//         for (int i=0;i<n+1;i++){
//             if (arr[i]>maxValue2){
//                 maxValue2=arr[i];
//             }
//             rightProcessing[i]=maxValue2;
//         }

//         System.out.println("Left PreProcessing : "+Arrays.toString(leftProcessing));
//         System.out.println("Right PreProcessing: "+Arrays.toString(rightProcessing));

//         int trappedWater=0;
//         for (int i=0;i<=n;i++){
//             int temp=Math.min(leftProcessing[i], rightProcessing[i])-arr[i];
//             System.out.println("Current water trapped: "+temp);
//             trappedWater+=temp;

//         }

//         System.out.println("Total water trapped: "+trappedWater);

//     }

// }
