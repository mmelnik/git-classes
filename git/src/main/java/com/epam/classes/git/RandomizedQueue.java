package com.epam.classes.git;

import java.util.Iterator;

public class RandomizedQueue<Item> implements Iterable<Item> {

    private Node<Item> head;
    private Node<Item> tail;

    public RandomizedQueue() {
        // construct an empty randomized queue
    }

    /**
     * Checks if the queue is empty or not.
     *
     * @return true if the queue is empty, else otherwise.
     */
    public boolean isEmpty() {
        throw new UnsupportedOperationException("isEmpty");
    }

    /**
     * Return the number of items on the queue
     *
     * @return items count
     */
    public int size() {
        throw new UnsupportedOperationException("size");
    }

    /**
     * Adds item to the queue.
     * Throws NullPointerException if item is null.
     *
     * @param item item to add.
     */
    public void enqueue(Item item) {
        throw new UnsupportedOperationException("enqueue");
    }

    /**
     * Removes and returns a random item.
     * Throws NoSuchElementException when method is called on empty dequeue.
     *
     * @return
     */
    public Item dequeue() {
        throw new UnsupportedOperationException("dequeue");
    }

    /**
     * Return (but do not remove) a random item.
     *
     * @return sample item.
     */
    public Item sample() {
        throw new UnsupportedOperationException("sample");
    }

    /**
     * Return an iterator over this collection.
     *
     * @return an iterator object.
     */
    @Override
    public Iterator<Item> iterator() {
        return new RandomizedQueueIterator();
    } // return an independent iterator over items in random order

    private Node<Item> getRandomNode() {
        throw new UnsupportedOperationException("hasNext");
    }

    /**
     *
     * An iterator over RandomizedQueue.
     * Every new instance of this class generates new random sequence of the items
     * from the source queue, so the items order must be different.
     *
     * @return
     */
    private class RandomizedQueueIterator implements Iterator<Item> {

        /**
         * Checks if there is next element in parent queue.
         *
         * @return false if there are no more unvisited elements in queue, true in other case.
         */
        @Override
        public boolean hasNext() {
            throw new UnsupportedOperationException("hasNext");
        }

        /**
         * Returns the next item of the parent queue.
         * Throws NoSuchElementException if called when there are no more items.
         *
         * @return next item.
         */
        @Override
        public Item next() {
            throw new UnsupportedOperationException("next");
        }

        /**
         * No need to implement.
         */
        @Override
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }

    }

    /**
     * Represents node in Queue class.
     *
     * @param <Item> Type of the queue element.
     */
    private static class Node<Item> {

        private Node previous;
        private Node next;
        private final Item value;

        private Node(Item item) {
            value = item;
        }

    }

}
