// import java.util.Comparator;
// import java.util.HashMap;
// import java.util.PriorityQueue;

// class Vishal1 {

//     public static int help(int i,int nums[],int multipliers[],int s,int e,String status){
//         System.out.println("status : "+status);
//         if (i==multipliers.length){
//             System.out.println("***********************************************************");
//             return 0;
//         }
//         int op1=multipliers[i]*nums[s]+help(i+1, nums, multipliers, s+1, e,"first index = "+s);
//         System.out.println("op1 : "+op1);
//         int op2=multipliers[i]*nums[e]+help(i+1, nums, multipliers, s, e-1,"second index = "+e);
//         System.out.println("op2 : "+op2);
//         System.out.println("Returning maximum value: "+Math.max(op1, op2));
//         return Math.max(op1, op2);
//     }
//     public static  int maximumScore(int[] nums, int[] multipliers) {
//         int i=0,s=0,e=nums.length-1;
//         int result=help(i,nums,multipliers,s,e,"Starting");
//         return result;

//     }

//     public static void main(String[] arsg) {
//         System.out.println("Code is working.");
//         int nums[]={-5,-3,-3,-2,7,1};
//         int multipliers[]={-10,-5,3,4,6};
//         System.out.println(maximumScore(nums, multipliers));
//     }

// }

// import java.util.HashMap;
// import java.util.Map;
// import java.util.Iterator;
// import java.util.Comparator;
// import java.util.PriorityQueue;
// import java.util.AbstractMap;

// class Vishal11 {
//     public static void main(String[] args){
//         System.out.println("Code is running....");

//         HashMap<Integer,Integer>map=new HashMap<>();
//         map.put(1, 2);
//         map.put(10, 20);
//         map.put(40, 50);

//         // Iterator<Integer> itr=map.iterator();
//         System.out.println(map.size());

//         // Iterator<Map.Entry<Integer,Integer>> itr = map.entrySet().iterator();
//         // while (itr.hasNext()){
//         //     Map.Entry<Integer,Integer> entry=itr.next();
//         //     System.out.println(entry.getKey()+" "+entry.getValue());
//         // }

//         PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(Map.Entry.comparingByValue(Comparator.reverseOrder()));

//         queue.offer(new AbstractMap.SimpleEntry<>(1, 10));
//         queue.offer(new AbstractMap.SimpleEntry<>(2,20));
//         queue.offer(new AbstractMap.SimpleEntry<>(3, 30));
//         queue.offer(new AbstractMap.SimpleEntry<>(0, 40));

//         Map.Entry<Integer,Integer> data=queue.poll();
//         System.out.println(data.getKey()+" "+data.getValue());

//         System.out.println(queue.contains(0));
        
//     }
// }

// import java.util.*;
// class Vishal111{
//     class Node implements Comparable<Node>{
//         int val1;
//         int val2;
//         Node(int val1,int val2){
//             this.val1=val1;
//             this.val2=val2;
//         }

//         @Override
//         public int compareTo(Node nt){
//             return nt.val2-this.val2;
//         }
//     }
//     public static void main(String[] args){
//         PriorityQueue<Node> queue=new PriorityQueue<>();
//         Vishal111 obj=new Vishal111();
//         // Node obj1=new Node(1, 2);
//         // Node obj1=new Node(1, 2);
//         // Node obj1=new Node(1, 2);
//         // Node obj1=new Node(1, 2);
//         // Node obj1=new Node(1, 2);
//         // Node obj1=new Node(1, 2);

//         // queue.add(new Node(1, 10));
//         queue.add(obj.new Node(2, 20));
//         queue.add(obj.new Node(3, 30));
//         queue.add(obj.new Node(4, 40));
//         queue.add(obj.new Node(5, 50));
//         queue.add(obj.new Node(0, 60));

//         Node data=queue.poll();
//         System.out.println(data.val1+" "+data.val2);

//         Node data2=queue.poll();
//         System.out.println(data2.val1+" "+data2.val2);
        
        
//     }
// }

// class Solution11111{
//     public static void main(String[] args){
//         System.out.println("Code is running");

//         HashMap<Integer,Integer> map=new HashMap<>();
//         map.put(1, 10);
//         System.out.println(map.containsKey(1));
//         // map.get(1)
//         System.out.println(map.get(1));
//         int data=map.get(1);
//         map.put(1, data+1);

//         System.out.println(map.get(1));
//         // map.get(1)=map.get(1)+1;

//     }
// }