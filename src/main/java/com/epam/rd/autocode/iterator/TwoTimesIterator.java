package com.epam.rd.autocode.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class TwoTimesIterator implements Iterator {
    private int[] array;
    private int index;
    private boolean isRepeat;
    public TwoTimesIterator(int[] array) {
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
        if (!isRepeat) {
            isRepeat = true;
            return array[index];
        }
        isRepeat = false;
        return array[index++];
    }
}
