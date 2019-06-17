package CustomList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CustomList<T extends Comparable<T>> implements Iterable<T> {
    private List<T> list;

    public CustomList() {
        this.list = new ArrayList<>();
    }

    public void add(T element) {
        this.list.add(element);
    }

    public T get(int index) {
        return this.list.get(index);
    }

    public T remove(int index) {
        this.checkIndex(index);
        return this.list.remove(index);
    }

    public boolean contains(T element) {
        return this.list.contains(element);
    }

    public void swap(int firstIndex, int secondIndex) {
        this.checkIndex(firstIndex);
        this.checkIndex(secondIndex);
        Collections.swap(this.list, firstIndex, secondIndex);
    }

    public int countGreaterThan(T element) {
        int counter = 0;
        for (T t : this.list) {
            if (t.compareTo(element) > 0) {
                counter++;
            }
        }
        return counter;
    }

    public int size() {
        return this.list.size();
    }

//    public void print() {
//        for (T t : this.list) {
//            System.out.println(t);
//        }
//    }

    public T getMax() {
        return Collections.max(this.list);
    }

    public T getMin() {
        return Collections.min(this.list);
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= this.list.size()) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private  int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < list.size();
            }

            @Override
            public T next() {
                return list.get(currentIndex++);
            }
        };
    }
}
