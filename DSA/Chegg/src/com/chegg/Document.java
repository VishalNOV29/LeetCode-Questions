package com.chegg;

import java.util.Date;

public class Document {
    private String[] authors;
    private Date date;
    int index;
    
    public Document(){
        authors =new String[50];
        index=0;
    }
    
    public String[] getAuthors() {
        return authors;
    }
    
    public void setAuthor(String name) {
        authors[index]=name;
        index++;
    }
    
    public Date getDate(){
        return date;
    }
}
