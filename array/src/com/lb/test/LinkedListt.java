package com.lb.test;

public class LinkedListt<E> {
    transient Node<E> head;
    transient int size = 0;
    private static class Node<E> {
        E item;
        Node<E> next;

        public Node(E item) {
            this.item = item;
        }
    }

    public boolean add(E e) {
        linkLast(e);
        return true;
    }

    private void linkLast(E e) {
//        Node<E> l = last;
        Node newNode = new Node(e);
        if (head == null) {
            head = newNode;
            return;
        } else {
            Node tmp = head;
            while (tmp != null) {
                tmp = tmp.next;
            }
            tmp.next = newNode;
        }
        size++;
    }

    public void print() {
        Node e = head;
        while (e != null) {
            System.out.println(e.item);
            e = e.next;
        }
    }

    public static void main(String[] args) {
        LinkedListt l = new LinkedListt();
        l.add("aa");
        l.add("assa");
        l.add("asa");
        System.out.println(l.size);
        l.print();
    }
}
