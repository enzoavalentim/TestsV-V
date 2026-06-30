package org.apache.commons.lang3;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;

import org.junit.jupiter.api.Test;

class CodexGeneratedArrayFillTest {

    @Test
    void fillsPrimitiveArraysAndReturnsSameInstance() {
        final int[] ints = { 1, 2, 3 };
        final char[] chars = { 'a', 'b', 'c' };
        final boolean[] booleans = { false, false };

        assertSame(ints, ArrayFill.fill(ints, 9));
        assertSame(chars, ArrayFill.fill(chars, 1, 3, 'z'));
        assertSame(booleans, ArrayFill.fill(booleans, true));

        assertArrayEquals(new int[] { 9, 9, 9 }, ints);
        assertArrayEquals(new char[] { 'a', 'z', 'z' }, chars);
        assertArrayEquals(new boolean[] { true, true }, booleans);
    }

    @Test
    void clearsByteAndCharArrays() {
        assertArrayEquals(new byte[] { 0, 0 }, ArrayFill.clear(new byte[] { 1, 2 }));
        assertArrayEquals(new char[] { 0, 'x', 0 }, ArrayFill.clear(new char[] { 'a', 'x', 'b' }, 0, 3));
        assertNull(ArrayFill.clear((byte[]) null));
        assertNull(ArrayFill.clear((char[]) null));
    }

    @Test
    void fillsObjectArraysWithValueOrGenerator() throws Throwable {
        final String[] values = { "a", "b" };
        assertSame(values, ArrayFill.fill(values, "x"));
        assertArrayEquals(new String[] { "x", "x" }, values);

        final Integer[] generated = ArrayFill.fill(new Integer[3], index -> index * 2);
        assertArrayEquals(new Integer[] { 0, 2, 4 }, generated);
        assertNull(ArrayFill.fill((String[]) null, "x"));
        assertNull(ArrayFill.fill((String[]) null, index -> "x"));
        assertThrows(IOException.class, () -> ArrayFill.fill(new String[2], index -> {
            throw new IOException("stop");
        }));
    }
}
