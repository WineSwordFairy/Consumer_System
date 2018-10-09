package com.example.demo.BaseClass;

import org.apache.tomcat.util.bcel.Const;

public class Book {

    protected String BookName;

    protected void setBookName(String bookName) {
        BookName = bookName;
    }

    protected String getBookName() {
        return BookName;
    }
}
