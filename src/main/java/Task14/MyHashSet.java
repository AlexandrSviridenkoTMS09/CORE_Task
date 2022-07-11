package Task14;

import java.io.Serializable;
import java.util.*;

public class MyHashSet<E> extends AbstractSet<E> implements Set<E> {
        private final static Object PRESENT = new Object();
        private MyHashMap<E, Object> map = new MyHashMap<>();

        @Override
        public Iterator<E> iterator() {
            return null;
        }

        @Override
        public int size() {
            return map.size();
        }

        @Override
        public boolean add(E e) {
            return map.put(e, PRESENT) != PRESENT;
        }

        @Override
        public boolean remove(Object o) {
            return map.remove(o) == PRESENT;
        }

        @Override
        public boolean contains(Object o) {
            return map.get(o) == PRESENT;
        }
    }
