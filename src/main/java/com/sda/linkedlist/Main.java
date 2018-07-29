package com.sda.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList lista = new LinkedList(100);
        for(int i=0;i<=99;i++){
            lista.add(99-i);
        }

       LinkedList.printList();
        System.out.println(lista.get(1));
    }
}
