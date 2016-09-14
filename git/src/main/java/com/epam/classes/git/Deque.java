package com.epam.classes.git;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @param <Item>
 */
public class Deque<Item> implements Iterable<Item> {

    private Node<Item> head;
    private Node<Item> tail;
    private int size;

    public Deque() {
    } // construct an empty deque

    public boolean isEmpty() {
        return head == null;
    } // is the deque empty?

    public int size() {
        return size;
    } // return the number of items on the deque

    public void addFirst(Item item) {
        if (item == null) {
            throw new NullPointerException(
                    "You're attempting to add a null item!");
        }

        Node<Item> newNode = new Node<>(item);
        if (size++ != 0) {
            newNode.next = head;
            head.previous = newNode;
        } else {
            tail = newNode;
        }
        head = newNode;
    } // add the item to the front

    public void addLast(Item item) {
        if (item == null) {
            throw new NullPointerException(
                    "You're attempting to add a null item!");
        }

        Node<Item> newNode = new Node<>(item);
        if (size++ != 0) {
            tail.next = newNode;
            newNode.previous = tail;
        } else {
            head = newNode;
        }
        tail = newNode;
    } // add the item to the end

    public Item removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException(
                    "You're attempting to remove an item from empty queue!");
        }

        Item result = head.value;
        head = head.next;
        if (--size == 0) {
            tail = null;
        } else {
            head.previous = null;
        }

        return result;
    } // remove and return the item from the front

    public Item removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException(
                    "You're attempting to remove an item from empty queue!");
        }

        Item result = tail.value;
        tail = tail.previous;
        if (--size == 0) {
            head = null;
        } else {
            tail.next = null;
        }

        return result;
    } // remove and return the item from the end

    @Override
    public Iterator<Item> iterator() {
        return new DequeIterator();
    } // return an iterator over items in order from front to end

    private class DequeIterator implements Iterator<Item> {

        private Node<Item> currentNode = head;

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public Item next() {
            if (!hasNext()) {
                throw new NoSuchElementException("There is no items to return.");
            }
            Item result = currentNode.value;
            currentNode = currentNode.next;
            return result;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }

    }

    private static class Node<Item> {

        private Node<Item> previous;
        private Node<Item> next;
        private final Item value;

        private Node(Item item) {
            value = item;
        }

    }

}
