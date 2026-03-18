package edu.cmu.cs.cs214.rec04;

public class DelegationSortedIntList implements IntegerList {
    private final SortedIntList sortedList = new SortedIntList();
    private int totalAdded = 0;

    @Override
    public boolean add(int num) {
        totalAdded++; 
        return sortedList.add(num);
    }

    @Override
    public boolean addAll(IntegerList list) {
        totalAdded += list.size(); 
        return sortedList.addAll(list);
    }

    public int getTotalAdded() {
        return totalAdded;
    }

    
    @Override
    public int get(int index) { return sortedList.get(index); }
    @Override
    public boolean remove(int num) { return sortedList.remove(num); }
    @Override
    public boolean removeAll(IntegerList list) { return sortedList.removeAll(list); }
    @Override
    public int size() { return sortedList.size(); }
}