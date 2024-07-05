package ru.netology;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    private final int min;
    private final int max;
    protected Random random;

    public Randoms(int min, int max) {
        this.random = new Random();
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomIterator();
    }

    private class RandomIterator implements Iterator<Integer> {
        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            // Генерируем случайное число в диапазоне [min, max]
            return random.nextInt(max - min + 1) + min;
        }
    }
}