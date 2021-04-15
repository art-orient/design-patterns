package com.epam.rd.autocode.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class FiveTimesIterator implements Iterator {
    private int[] array;
    private int index;
    private int count;

    public FiveTimesIterator(int[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return index < array.length;
    }

    @Override
    public Object next() throws NoSuchElementException {
        if (array.length == 0 || index >= array.length) {
            throw new NoSuchElementException();
        }
        if (count < 4) {
            count++;
            return array[index];
        }
        count = 0;
        return array[index++];
    }
}
