// import java.util.Iterator;
// import java.util.PriorityQueue;

// class Hello {
//     public static void main(String[] args) {
//         // System.out.println("Code is running");
//         PriorityQueue<Integer> queue = new PriorityQueue<>();
//         queue.add(3);
//         queue.add(6);
//         queue.add(9);
//         queue.add(1);
//         int max=0;
//         while (queue.size() != 1) {
//             int num1 = queue.poll();
//             int num2 = queue.peek();
//             max = Math.max(max, num2 - num1);

//         }
//         System.out.println("Maximum difference : "+max);
//     }
// }

// class Main{

//     class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data=data;
//             next=null;
//         }
//     }
//     Node head; // Head of linked list.

//     // Method to add node at the end of linked list.
//     Node addNode(int num){
//         Node newNode=new Node(num);
//         if (head==null){
//             head=newNode;
//             return head;
//         }
//         Node temp=head;
//         while (temp.next!=null){
//             temp=temp.next;
//         }
//         temp.next=newNode;
//         return head;
//     }

//     // Method to delete node from the linked list.
//     Node deleteNode(Node head,Node Q){

//         // Check whether the next of current node is null or not.
//         if (Q.next==null){
//             Q=null;
//             return head;
//         }
//         Q.data=Q.next.data; // coping data of next node.
//         Q.next=Q.next.next; // deleting next node.
//         return head;
    
//     }

//     // Method to display node of linked list.
//     void display(Node head){
//         if (head==null){
//             System.out.println("Empty linked list");
//         }else{
//             Node temp=head;
//             while (temp!=null){
//                 System.out.print(temp.data+"->");
//                 temp=temp.next;
//             }

//             System.out.println("Null");
//         }
//     }
//     public static void main(String[] args){

        
//         Main obj=new Main();
//         obj.addNode(1);
//         obj.addNode(2);
//         obj.addNode(3);
//         obj.addNode(4);
//         obj.addNode(5);
//         obj.display(obj.head);

//         Node deleteNode=obj.head.next.next.next; // Node containing data 4.

//         obj.deleteNode(obj.head, deleteNode); // Deleting node 3.
//         obj.display(obj.head);

//     }
// }

