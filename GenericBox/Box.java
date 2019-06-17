package GenericBox;

import java.util.Collections;
import java.util.List;

public class Box<T extends  Comparable<T>> implements Comparable<T> {
    private T data;

    public Box(T data) {
        this.data = data;
    }

    public static <T> List<T> swap(List<T> list, int firstIndex, int secondIndex) {
        Collections.swap(list, firstIndex, secondIndex);
        return list;
    }

    public static <T extends   Comparable<T>> int comparingByValue(List<Box<T>> list, T element) {
        int count = 0;
        for (Box<T> t : list) {
            if (t.compareTo(element) > 0) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return this.data.getClass().getName() +  ": " + this.data;
    }

    @Override
    public int compareTo(T o) {
        return this.data.compareTo(o);
    }
}
