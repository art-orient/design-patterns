package com.epam.rd.autocode.iterator;

import java.util.Iterator;

class Iterators {

    public static Iterator<Integer> intArrayTwoTimesIterator(int[] array){
        if (array == null) {
            throw new UnsupportedOperationException();
        }
        return new TwoTimesIterator(array);
    }

    public static Iterator<Integer> intArrayThreeTimesIterator(int[] array) {
        if (array == null) {
            throw new UnsupportedOperationException();
        }
        return new ThreeTimesIterator(array);
    }

    public static Iterator<Integer> intArrayFiveTimesIterator(int[] array) {
        if (array == null) {
            throw new UnsupportedOperationException();
        }
        return new FiveTimesIterator(array);
    }

    public static Iterable<String> table(String[] columns, int[] rows){
        if (columns == null || rows == null) {
            throw new UnsupportedOperationException();
        }
        return new TableIterator(columns, rows);
    }



}
