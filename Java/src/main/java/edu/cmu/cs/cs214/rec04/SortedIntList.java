package edu.cmu.cs.cs214.rec04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A simple sorted list of integers (ascending). Allows duplicates.
 */
public class SortedIntList extends AbstractIntList {

    private final List<Integer> elems;

    public SortedIntList() {
        this.elems = new ArrayList<>();
    }

    @Override
    public boolean add(int num) {
        int idx = Collections.binarySearch(elems, num);
        if (idx < 0) idx = -idx - 1;
        elems.add(idx, num);
        return true;
    }

    @Override
    public int get(int index) {
        return elems.get(index);
    }

    @Override
    public boolean remove(int num) {
        return elems.remove(Integer.valueOf(num));
    }

    @Override
    public boolean removeAll(IntegerList list) {
        boolean changed = false;
        for (int i = 0; i < list.size(); i++) {
            Integer val = Integer.valueOf(list.get(i));
            while (elems.remove(val)) {
                changed = true;
            }
        }
        return changed;
    }

    @Override
    public int size() {
        return elems.size();
    }
}
