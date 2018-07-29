package com.sda.linkedlist;


public class LinkedList {


    private static Node head;
    private static Node tail;
    private int size;


    public LinkedList(Object data) {

        head = new Node(data);

    }


    public void add(Object data) {

        Node copy = head;

        head = new Node(data);

        head.next = copy;

        size++;

    }

    public void addTail(Object data) {

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = new Node(data);
        size++;
    }

    public Object get(int i){
        Node temp = head;
        int j=0;
        while (j<i) {
            temp = temp.next;
            j++;
        }
        return temp.data;

    }


    public static void printList() {

        Node temp = head;

        while (temp != null) {

            System.out.println(temp.data);

            temp = temp.next;

        }

    }

    class Node {

        private Object data;

        private Node next;


        public Node(Object data) {

            this.data = data;

        }


        public Object getData() {

            return data;

        }

    }

}


