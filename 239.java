// import java.util.Collections;
// import java.util.PriorityQueue;

// class SlidingWindow{

//     public int[] maxSlidingWindow(int[] nums, int k) {
//         int len=nums.length;
//         int res[]=new int[len/k];

//         for (int i=0;i<len;i++)
        
        
//     }
//     public static void main(String[] args){
//         PriorityQueue<Integer> queue=new PriorityQueue<>(Collections.reverseOrder());
//         queue.add(1);
//         queue.add(2);
//         queue.add(3);
//         queue.add(4);
//         queue.add(100);
//         queue.add(200);
//         queue.add(300);

//         System.out.println(queue);

//         queue.remove(3);

//         System.out.println(queue);
//         System.out.println("Code is runnig");
//     }
// }


import java.util.PriorityQueue;
import java.util.Arrays;
import java.util.Collections;

class SolutionVishal {

    public static int[] maxSlidingWindow(int[] nums, int k) {

        int len=nums.length;
        int result[]=new int[len-k+1];
        
        PriorityQueue<Integer> queue=new PriorityQueue<>(Collections.reverseOrder());

        for (int i=0;i<k;i++){
            queue.add(nums[i]);
        }
        System.out.println(queue);

        int i=k;
        int j=0;

        while (i<len){
            System.out.println("before : "+queue);

            int num=queue.peek();
            System.out.println("num = "+num);

            result[j]=num;

            queue.remove(nums[j]);
            queue.add(nums[i]);

            System.out.println("after : "+queue);
            i+=1;
            j+=1;
            
        }
        result[j]=queue.peek();

        return result;
        
    }
    public static void main(String[] args){
        System.out.println("Code is running");
        int nums[]={1};
        int k=1;
        int result[]=maxSlidingWindow(nums,k);

        System.out.println(Arrays.toString(result));
    }
}