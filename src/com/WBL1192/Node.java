package com.WBL1192;

public class Node {
    private String Nama;
    private Node next;

    //constructor
    public Node() {
    }

    public Node(String data) {
        Nama = data;
    }

    //getter
    public String getNama() {
        return Nama;
    }

    public Node getNext() {
        return next;
    }

    //setter
    public void setNama(String nama) {
        Nama = nama;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Nama='" + Nama +"', ";
    }
}
