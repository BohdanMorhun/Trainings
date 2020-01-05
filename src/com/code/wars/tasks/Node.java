package com.code.wars.tasks;

import java.util.LinkedList;
import java.util.List;

public class Node<T> {
    public Object data;
    public Node next;

    Node(T data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(T data) {
        this(data, null);
    }
}

class Solution {

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Node<List<Integer>> node = new Node<>(list);
        System.out.println(length(node));
    }

    static int length(Node head) {

        if (head == null) {
            return 0;
        }
        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }
        return count;
    }
}



