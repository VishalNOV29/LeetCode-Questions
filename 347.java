// import java.util.HashMap;
// import java.util.Iterator;
// import java.util.HashMap;
// import java.util.List;
// class  Hello111{
//     public static void main(String[] args){
//         System.out.println("Code is running");
//         HashMap<Integer,Integer> map=new HashMap<>();
//         map.put(10, 10);
//         map.put(2, 20);
//         List.sort(map);
//         int arr[][]=new int[map.size()][2]
//         System.out.println(map);
//     }

// }

// import java.util.Arrays;
// import java.util.HashMap;
// class Hello{
//     public static void main(String[] args){
//         System.out.println("Code is running");
//         HashMap<Integer,Integer> map=new HashMap<>();
//         int arr[]={1,2,3,4,5,6,7,8};
//         map.put(1, 2);
//         map.put(2, 3);
//         map.put(3, 4);
//         System.out.println(map.get(1));
//         System.out.println(map.containsKey(1));
//     }
// }

// class Hello {
//     public static int[] twoSum(int[] nums, int target) {
//         HashMap<Integer,Integer> map=new HashMap<>();
//         int res[]=new int[2];
//         for (int i=0;i<nums.length;i++){
//             map.put(nums[i],i);
//         }
//         for (int i=0;i<nums.length;i++){
//             int diff=target-nums[i];
//             if (map.containsKey(diff) && map.get(diff)!=i){
//                 System.out.println("Codition matched."+i+" "+map.get(diff));
//                 res[0]=i;
//                 res[1]=map.get(diff);
//                 System.out.println(nums[1]);
//                 break;
//             }
//         }
//         System.out.println(map);
//         return res;

//     }
//     public static void main(String[] args){
//         System.out.println("Code is running");
//         int arr[]={3,2,4};
//         System.out.println(Arrays.toString(twoSum(arr, 6)));
//     }
// }

// class Solution {
//     public static int subarraySum(int[] nums, int k) {
//         System.out.println("Method is called.");
//         HashMap<Integer, Integer> map = new HashMap<>();
//         int sum = 0, count = 0;

//         for (int i = 0; i < nums.length; i++) {
//             System.out.println("******************************************");
//             sum += nums[i];
//             System.out.println("sum = " + sum);
//             int diff = sum - k;
//             System.out.println("diff = " + diff);
//             System.out.println("count = " + count);
//             if (diff == 0) {
//                 System.out.println("Count will be increased.");
//                 count += 1;
//             }
//             if (map.containsKey(diff)) {
//                 System.out.println("Condition 1");
//                 count += (map.get(diff));
//                 map.replace(diff, map.get(diff) + 1);
//             } else {
//                 System.out.println("Condition 2");
//                 if (map.containsKey(sum)) {
//                     map.replace(sum, map.get(sum) + 1);
//                 } else {
//                     map.put(sum, 1);
//                 }
//             }
//             System.out.println(map);
//         }
//         return count;

//     }

//     public static void main(String[] args) {
//         int arr[] = { 10, 2, -2, -20, 10 };
//         // int arr[] = { 9, 4, 20, 3, 10, 5 };
//         // int arr[] = { 1, 1 };
//         int k = -10;
//         int res = subarraySum(arr, k);
//         System.out.println(res);
//     }

// }

// class Solution{
//     public static void main(String[] args){
//         System.out.println("Code is running");
//         HashMap<Integer,Integer> map =new HashMap<>();
//         map.replace(1, map.get(1)+1);
//     }
// }

import java.util.Random;

class Extra {
    int arr[][];

    public Extra() {
        arr = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = randNum();
            }
        }

    }

    public Extra(int row, int column) {
        arr = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = randNum();
            }
        }
    }

    int randNum() {

        Random random = new Random();
        int min = 50;
        int max = 150;
        int num = random.nextInt(max - min + 1) + min;

        return num;
    }

    void printData() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    int getPosition(int row, int col) {
        return arr[row][col];
    }

    int setValue(int row, int col, int val) {
        arr[row][col] = val;
        return arr[row][col];
    }

    boolean isEvenRow(int row) {
        int sum = 0;
        for (int i = 0; i < arr[row].length; i++) {
            sum += arr[row][i];

        }
        return sum % 2 == 0;
    }

    boolean isEvenCol(int col) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][col];
        }
        return sum % 2 == 0;
    }

    public static void main(String[] args) {

        Extra obj = new Extra();
        obj.printData();

        System.out.println("Even sum of row: "+obj.isEvenRow(0));

        System.out.println("Even sum of col: "+obj.isEvenCol(0));

       
    }
}


