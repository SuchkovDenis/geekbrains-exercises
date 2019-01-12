package ru.suchkov.lesson2;

public class LinkedList<E> {
    private Node head;
    private Node tail;
    private int size;

    public class Node<E> {
        private Node<E> next;
        private Node<E> prev;
        private E element;

        public Node(E element) {
            this.element = element;
        }

        @Override
        public String toString() {
            return element.toString();
        }
    }

    public LinkedList() {

    }

    public LinkedList(E element) {
        head = new Node(element);
        size = 1;
    }

    public int size() {
        return size;
    }

    public void add(E element) {
        Node temp = new Node(element);
        if (size == 0) {
            head = tail = temp;
        } else {
            if (size == 1) {
                tail = temp;
                head.next = tail;
                tail.prev = head;
            } else {
                tail.next = temp;
                temp.prev = tail;
                tail = temp;
            }
        }
        size++;
    }

    public void add(int index, E element) {
        if (index > size) {
            throw new IndexOutOfBoundsException("Index not in range");
        }
        if (size == 0) {
            add(element);
        } else {
            Node temp = new Node(element);
            Node current = head;

            if (index == 0) {
                temp.next = head;
                head.prev = temp;
                head = temp;
                return;
            }
            if (index == size) {
                temp.prev = tail;
                tail.next = temp;
                tail = temp;
                return;
            }
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            temp.next = current;
            temp.prev = current.prev;
            current.prev.next = temp;
            current.prev = temp;
        }
        size++;
    }

    // методы remove по аналогии с add

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        Node node = head;
        String del = "";
        while (node != null) {
            sb.append(del).append(node);
            del = " -> ";
            node = node.next;
        }
        sb.append("}");
        return sb.toString();
    }
}