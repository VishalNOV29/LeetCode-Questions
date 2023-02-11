// // // package com.ques;
// // import java.util.ArrayDeque;
// // import java.util.Deque;
// // public class Solution1352 {
// //      Deque<Integer> dq;
// //     public Solution1352() {
// //         dq=new ArrayDeque<Integer>();
        
// //     }
    
// //     public void add(int num) {
// //         dq.add(num);   
// //     }

// //     public int getProduct(int k) {
// //         int i =0;
// //         int res=1;
// //         int[] temp=new int[k];
// //         while (i<k){
// //             int num=dq.pollLast();
// //             res=res*num;
// //             temp[i]=num;
// //             i++;
// //         }
// //         while (i>=0){
// //             dq.add(temp[i]);
// //             i-=1;
// //         }
// //         return res;

// //     }

// //     public static void main(String[] args) {
// //     	System.out.println("Code is running");
// //     	Solution1352 obj=new Solution1352();
// //     	obj.add(2);
// //     	obj.add(0);
// //     	obj.add(2);
// //     	obj.add(5);
// //     	obj.add(4);
// //     	System.out.println(obj.dq);
// //     	int res1=obj.getProduct(2);
// //     	System.out.println(res1);
// //     }
// // }

// import java.util.Date;

// class Document {
//     private String[] authors;
//     private Date date;
//     int index;
    
//     public Document(){
//         authors =new String[50];
//         index=0;
//     }
    
//     public String[] getAuthors() {
//         return authors;
//     }
    
//     public void setAuthor(String name) {
//         authors[index]=name;
//         index++;
//     }
    
//     public Date getDate(){
//         return date;
//     }
// }

// class Book extends Document{
//     private String title;
    
//     public void setTitle(String title) {
//         this.title = title;
//     }
    
//     public String getTitle(){
//         return title;
//     }
// }
// class Email extends Document{
//     private String subject;
//     private String to;
    
//     public void setSubject(String subject) {
//         this.subject = subject;
//     }
    
//     public String getSubject() {
//         return subject;
//     }
    
//     public void setTo(String to) {
//         this.to = to;
//     }
    
//     public String getTo() {
//         return to;
//     }
// }

// public static void main (String[] args) {
//     Book book = new Book();
//     book.setTitle("the");
//     book.setAuthor("ghaida");
    
//     Email email = new Email();
//     email.setAuthor("gh");
//     email.setSubject("order");
//     email.setTo("Jeeee");
    
//     System.out.println("Subject: " + email.getSubject());
//     System.out.println("Dear " + email.getTo() + ", Thank you for your purchase on the book '" + book.getTitle() + "' by " + book.getAuthors()[0] + ". We are from " + email.getAuthors()[0] + ". Happy reading!");
// }
