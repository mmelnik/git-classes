package com.epam.classes.git;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

public class RandomizedQueueTest {

    private static RandomizedQueue testedObject;

    @Before
    public void setUp() {
        testedObject = new RandomizedQueue();
    }

    @Test
    public void isEmptyReturnsTrueOnEmptyQueue() {
        boolean expected = false;
        boolean actual = testedObject.isEmpty();
        assertEquals(expected, actual);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void isEmptyReturnsFalseOnNonEmptyQueue() {
        boolean expected = false;
        boolean actual = testedObject.isEmpty();
        assertEquals(expected, actual);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void sizeIsZeroOnEmptyDeque() {
        int expected = 0;
        int actual = testedObject.size();
        assertEquals(expected, actual);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void sizeIsZeroWhenLastItemDeleted() {
        int expected = 0;
        int actual = testedObject.size();
        assertEquals(expected, actual);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void sizeReturnsCorrectItemNumber() {
        int expected = 0;
        int actual = testedObject.size();
        assertEquals(expected, actual);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void enqueueAddsAnItemCorrectly() {
        Object item = null;
        testedObject.enqueue(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void enqueueThrowsNullPointerWhenNullIsAdded() {
        Object item = null;
        testedObject.enqueue(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void dequeueRemovesAnItem() {
        Object expected = null;
        Object actual = testedObject.dequeue();
        assertEquals(expected, actual);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void dequeueRemovesAllItemsCorrectly() {
        Object expected = null;
        Object actual = testedObject.dequeue();
        assertEquals(expected, actual);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void dequeueThrowsNoSuchElementExceptionOnEmptyQueue() {
        Object expected = null;
        Object actual = testedObject.dequeue();
        assertEquals(expected, actual);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void sampleDoesntChangeTheDeque() {
        Object expected = null;
        Object actual = testedObject.sample();
        assertEquals(expected, actual);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void iteratorHasNextReturnsFalseOnEmptyDeque() {
        Iterator expected = null;
        Iterator actual = testedObject.iterator();
        assertEquals(expected, actual);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void iteratorHasNextReturnsTrueOnNonEmptyDeque() {
        Iterator expected = null;
        Iterator actual = testedObject.iterator();
        assertEquals(expected, actual);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void iteratorNextReturnsCorrectNumberOfElements() {
        Iterator expected = null;
        Iterator actual = testedObject.iterator();
        assertEquals(expected, actual);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void iteratorItemOrderIsNotRepeated() {
        Iterator expected = null;
        Iterator actual = testedObject.iterator();
        assertEquals(expected, actual);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void iteratorNextThrowsNoSuchElementExceptionWhenThereAreNoMoreElements() {
        Iterator expected = null;
        Iterator actual = testedObject.iterator();
        assertEquals(expected, actual);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
