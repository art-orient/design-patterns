package com.epam.rd.autocode.iterator;

import java.util.Iterator;

public class TableIterator implements Iterable<String> {
    private String[] columns;
    private int[] rows;

    public TableIterator(String[] columns, int[] rows) {
        this.columns = columns;
        this.rows = rows;
    }

    @Override
    public Iterator<String> iterator() {
        return new PairIterator();
    }

    private class PairIterator implements Iterator<String> {
        private int indexColumns;
        private int indexRows;

        @Override
        public boolean hasNext() {
            return indexColumns < columns.length && indexRows < rows.length;
        }

        @Override
        public String next() {
            String result = "";
            for (int i = indexColumns; i < columns.length; i++) {
                for (int j = indexRows; j < rows.length; j++) {
                    indexRows++;
                    if (indexRows == rows.length) {
                        indexRows = 0;
                        indexColumns++;
                    }
                    return result = columns[i] + rows[j];
                }
            }
            return result;
        }
    }
}