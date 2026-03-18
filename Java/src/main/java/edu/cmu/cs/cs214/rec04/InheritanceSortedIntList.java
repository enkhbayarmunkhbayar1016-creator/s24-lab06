package edu.cmu.cs.cs214.rec04;

public class InheritanceSortedIntList extends SortedIntList {
    private int totalAdded = 0;

    @Override
    public boolean add(int num) {
        totalAdded++; // Нэг тоо нэмэх бүрт тоолно
        return super.add(num);
    }

    @Override
    public boolean addAll(IntegerList list) {
        return super.addAll(list); 
    }

    public int getTotalAdded() {
        return totalAdded;
    }
}