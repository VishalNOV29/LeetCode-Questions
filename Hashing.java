
// // // import java.util.HashMap;
// // // import java.util.Iterator;
// // import java.util.*;
// // // import java.util.PriorityQueue;

// // public class Hashing {
// //     // Step1 . Creating Node class
// //     class Node implements Comparable<Node> {
// //         int value1, value2;

// //         Node(int value1, int value2) {
// //             this.value1 = value1;
// //             this.value2 = value2;
// //         }
// //         @Override
// //         public int compareTo(Node nd) {
// //             // return this.value1-nd.value1;
// //             return nd.value1 - this.value1;
// //         }
// //     }

// //     public static void myFun() {

// //         HashMap<Integer, Integer> map = new HashMap<>();

// //         int arr[]={1,2,3,4,5};
// //         for (int i=0;i<arr.length;i++){
// //             int number=arr[i];
// //             if (map.containsKey(number)){
// //                 int val=map.get(number);
// //                 map.put(number, val);
// //             }else{
// //                 map.put(number, 1);
// //             }
// //         }
// //         System.out.println(map);
// //         PriorityQueue<Node> queue = new PriorityQueue<>();
// //         Hashing obj = new Hashing();
// //         Iterator<Map.Entry<Integer, Integer>> itr = map.entrySet().iterator();
// //         while (itr.hasNext()) {
// //             Map.Entry<Integer, Integer> data = itr.next();
// //             Node newNode = obj.new Node(data.getKey(), data.getValue());
// //             System.out.println("data.getKey = " + data.getKey() + " data.getValue() = " + data.getValue());
// //             queue.add(newNode);
// //             System.out.println("Value added to queue successfully...");

// //         }

// //         Node data1 = queue.poll();
// //         System.out.println(data1.value1 + " " + data1.value2);
// //     }

// //     public static void main(String[] args) {
// //         myFun();
// //     }

// // }

// class Solution {
//     class Node implements Comparable<Node> {
//         int val1, val2;

//         Node(int val1, int val2) {
//             this.val1 = val1;
//             this.val2 = val2;
//         }

//         @Override
//         public int compateTo(Node nt) {
//             return nt.val2 - this.val2;
//         }
//     }
//     // public int[] topKFrequent(int[] nums, int k) {

//     // // Adding elements and their frequency in the HashMap.
//     // HashMap<Integer,Integer> map=new HashMap<>();
//     // for (int i=0;i<nums.lenght;i++){
//     // int num=nums[i];
//     // if (map.contains(num)){
//     // map.getValue(num)+=1;
//     // }else{
//     // map.put(num,1);
//     // }
//     // }

//     // // Adding Node to the priority queue.
//     // PriorityQueue<Node> queue=new PriorityQueue<>();

//     // Sol

//     // }
//     public int topKFrequent(int[] arr, int k) {

//         // Adding element to the hashmap
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for (int i = 0; i < arr.length; i++) {
//             int number = arr[i];
//             if (map.containsKey(number)) {
//                 int val = map.get(number);
//                 map.put(number, val);
//             } else {
//                 map.put(number, 1);
//             }
//         }

//         // Adding nodes to priority queue.
//         PriorityQueue<Node> queue = new PriorityQueue<>();
//         Hashing obj = new Hashing();
//         Iterator<Map.Entry<Integer, Integer>> itr = map.entrySet().iterator();
//         while (itr.hasNext()) {
//             Map.Entry<Integer, Integer> data = itr.next();
//             Node newNode = obj.new Node(data.getKey(), data.getValue());
//             queue.add(newNode);
//         }

//         // Adding most frequent element to the integer array.
//         int[] result = new int[k];
//         for (int i = 0; i < k; i++) {
//             result[i] = queue.poll().value1;
//         }
//         return result;
//     }
// }

// import java.util.*;
// import java.lang.*;

// class Solution1{
//     class Node implements Comparable<Node> {
//         int val1, val2;

//         Node(int val1, int val2) {
//             this.val1 = val1;
//             this.val2 = val2;
//         }

//         @Override
//         public int compareTo(Node nt) {
//             return nt.val2 - this.val2;
//         }
//     }

//     public static int[] topKFrequent(int[] arr, int k) {

//         // Adding element to the hashmap
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for (int i = 0; i < arr.length; i++) {
//             int number = arr[i];
//             if (map.containsKey(number)) {
//                 int val = map.get(number);
//                 map.put(number, val+1);
//             } else {
//                 map.put(number, 1);
//             }
//         }

//         System.out.println(map);
//         // Adding nodes to priority queue.
//         PriorityQueue<Node> queue = new PriorityQueue<>();
//         Solution1 obj = new Solution1();
//         Iterator<Map.Entry<Integer, Integer>> itr = map.entrySet().iterator();
//         while (itr.hasNext()) {
//             Map.Entry<Integer, Integer> data = itr.next();
//             Node newNode = obj.new Node(data.getKey(), data.getValue());
//             queue.add(newNode);
//         }

//         // Adding most frequent element to the integer array.
//         int[] result = new int[k];
//         for (int i = 0; i < k; i++) {
//             result[i] = queue.poll().val1;
//         }
//         return result;
//     }
//     public static void main(String[] args){

//         System.out.println("main method");
//         int arr[]={1,1,1,2,2,3};
//         int result[]=topKFrequent(arr, 2);
//         System.out.println("Result: "+Arrays.toString(result));
//     }
// }

