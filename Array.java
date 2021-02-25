package com.ArrayOperations;

public class Array {

    private  int[] items;
    private int count = 0;

    public Array(int size){
        items = new int[size];
    }

    public  void removeAt(int index){
        if (index >= count || index < 0)
            throw new IllegalArgumentException();

        for (int i = index; i < count; i++)
            items[i] = items[i+1];
        count--;
    }

    public void display(){
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

    public void insert(int item){
        if (count == items.length){
            int[] newItems = new int[count * 2];
            for (int i = 0; i < count; i++)
                newItems[i] = items[i];
            items = newItems;
        }
        items[count++] = item;
    }

    public int indexOf(int item){
        for (int i = 0; i < count; i++)
            if (items[i] == item)
                return i;

        return -1;
    }

}
