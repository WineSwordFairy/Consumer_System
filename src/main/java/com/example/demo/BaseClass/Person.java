package com.example.demo.BaseClass;

import com.example.demo.DataFormat.ResponseInfo;

import java.util.HashMap;

public abstract class Person {

    protected HashMap<String, Book> _myBookList;


    protected String _name;


    protected HashMap<String, Book> get_myBookList() {
        return _myBookList;
    }

    protected void set_myBookList(HashMap<String, Book> _myBookList) {
        this._myBookList = _myBookList;
    }

    protected String get_name() {
        return _name;
    }

    protected void set_name(String _name) {
        this._name = _name;
    }

    ///提供结果。
    public ResponseInfo ProviceResult(int Code, String Message, String Data) {
        return new ResponseInfo(Code, Message, Data);
    }

    public ResponseInfo ProviceResult(int Code, String Message) {
        return new ResponseInfo(Code, Message,"");
    }
}
