import java.util.Stack;

// import java.util.HashSet;
// import java.util.Iterator;
// class Hash{
//     public static void main(String[] args){
//         System.out.println("Code is running");
//         int c=10;
//         System.out.println(c);

// double c=c;

// HashSet<Integer> set=new HashSet<>();

// set.add(1);
// set.add(2);
// set.add(3);
// set.add(4);
// set.add(5);

// System.out.println(set);

// Iterator<Integer> itr=set.iterator();
// while(itr.hasNext()){
//     int num=itr.next();
//     System.out.println("num = "+num);
// }

//     }
// }

import java.util.Stack;
import java.util.*;
// import java.lang.*;

// class Stock {
//         public static void main(String[] args) {
//                 Stack stk = new Stack<>();
//                 // stk.push("Vishal");
//                 // stk.push("singh");
//                 // System.out.println("Code is running");
//                 // System.out.println(stk.peek());
//                 String name = "vishal kumar singh";
//                 char[] arr = name.toCharArray();
//                 for (char ch : arr) {
//                         System.out.println(ch);
//                         stk.push(ch);
//                 }
//                 System.out.println(stk);

//         }
// }

import java.util.*;
import java.util.ArrayDeque;

class ArrayDequeExample {

        public String removeDuplicates(String s) {
                Deque<Character> deque = new ArrayDeque<>();
                char charArr[] = s.toCharArray();
                for (char ch : charArr) {
                        if (deque.peekLast() == null) {
                                deque.offerLast(ch);
                        } else if (deque.peekLast() == ch) {
                                deque.pollLast();
                        } else {
                                deque.offerLast(ch);
                        }
                }
                String result = "";
                while (deque.size() != 0) {
                        result += deque.pollFirst();
                }
                return result;

        }

        public static void main(String[] args) {

                ArrayDequeExample obj = new ArrayDequeExample();
                // Creating Deque and adding elements

                // deque.add("Ravi");
                // deque.add("Vijay");
                // deque.add("Ajay");
                // Traversing elements
                // for (String str : deque) {
                // System.out.println(str);
                // }
                // System.out.println(deque);
                // deque.offerLast("Vishal");

                // System.out.println(deque);

                // deque.offerFirst("Singh");
                // System.out.println(deque);
                // System.out.println(deque.pollLast());

                // System.out.println(deque.peekLast());
                // System.out.println(deque.peekLast() == null);
                String str = "abbccddabc";
                System.out.println(obj.removeDuplicates(str));
        }
}