package com.ArrayOperations;

public class Main {

    public static void main(String[] args) {
        Array arr = new Array(3);
        arr.insert(10);
        arr.insert(20);
        arr.insert(30);
        arr.insert(40);
        arr.insert(50);
        System.out.println(arr.indexOf(300));
        arr.display();
    }
}
