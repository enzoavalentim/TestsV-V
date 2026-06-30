package org.apache.commons.lang3;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.Comparator;

import org.junit.jupiter.api.Test;

class CodexGeneratedArraySorterTest {

    @Test
    void sortsPrimitiveArraysInPlace() {
        final int[] ints = { 3, 1, 2 };
        final long[] longs = { 9L, 1L, 5L };
        final char[] chars = { 'c', 'a', 'b' };

        assertSame(ints, ArraySorter.sort(ints));
        assertSame(longs, ArraySorter.sort(longs));
        assertSame(chars, ArraySorter.sort(chars));

        assertArrayEquals(new int[] { 1, 2, 3 }, ints);
        assertArrayEquals(new long[] { 1L, 5L, 9L }, longs);
        assertArrayEquals(new char[] { 'a', 'b', 'c' }, chars);
    }

    @Test
    void sortsObjectArraysWithNaturalAndCustomOrder() {
        final String[] names = { "Bob", "Ana", "Cid" };
        final String[] reverse = { "Bob", "Ana", "Cid" };

        assertSame(names, ArraySorter.sort(names));
        assertSame(reverse, ArraySorter.sort(reverse, Comparator.reverseOrder()));

        assertArrayEquals(new String[] { "Ana", "Bob", "Cid" }, names);
        assertArrayEquals(new String[] { "Cid", "Bob", "Ana" }, reverse);
    }

    @SuppressWarnings("deprecation")
    @Test
    void nullArraysRemainNullAndConstructorExistsForCompatibility() {
        assertNull(ArraySorter.sort((int[]) null));
        assertNull(ArraySorter.sort((String[]) null));
        assertNull(ArraySorter.sort(null, Comparator.naturalOrder()));
        new ArraySorter();
    }
}
