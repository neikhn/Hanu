//package example;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class test {
    public static void main(String[] args) {
        IntegerLinkedList lt = new IntegerLinkedList();
        lt.add(1);
        lt.add(2);
        lt.add(4);
        lt.add(5);
        lt.add(7);

        Iterator<Integer> it = lt.iterator();
        while (it.hasNext()) {
            System.out.print(it.next());
            System.out.print(" ");
        }
        System.out.println("");
    }
}

class IntegerLinkedList extends LinkedList<Integer> {
    int index;

    public Iterator iterator() {
        return new evenIterator();
    }

    class evenIterator implements Iterator<Integer> {
        public evenIterator() {
            index = 0;
        }

        boolean isEven(int e) {
            return e % 2 == 0;
        }
        @Override
        public boolean hasNext() {
            // while (index < size()) {
            //     if (isEven(get(index))) {
            //         return true;
            //     }
            //     index++;
            // }
            // return false;
            for(int i = index; i< size();i++) {
                if(isEven(get(i))) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public Integer next() {
            if (!hasNext()) {
                throw new NoSuchElementException("....");
            }
            Integer i = get(index++);
            return i;
        }

    }
}
