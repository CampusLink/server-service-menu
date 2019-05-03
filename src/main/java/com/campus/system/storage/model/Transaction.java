package com.campus.system.storage.model;

public class Transaction {
    private Box mBox;

    public Transaction(Box box) {
        mBox = box;
    }

    public void commit() throws Exception{}
}
