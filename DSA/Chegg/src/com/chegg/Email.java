package com.chegg;

public class Email extends Document{
    private String subject;
    private String to;
    
    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    public String getSubject() {
        return subject;
    }
    
    public void setTo(String to) {
        this.to = to;
    }
    
    public String getTo() {
        return to;
    }


public static void main (String[] args) {
    Book book = new Book();
    book.setTitle("the");
    book.setAuthor("ghaida");
    
    Email email = new Email();
    email.setAuthor("gh");
    email.setSubject("order");
    email.setTo("Jeeee");
    
    System.out.println("Subject: " + email.getSubject());
    System.out.println("Dear " + email.getTo() + ", Thank you for your purchase on the book '" + book.getTitle() + "' by " + book.getAuthors()[0] + ". We are from " + email.getAuthors()[0] + ". Happy reading!");
}
}