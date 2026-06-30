package org.apache.commons.lang3;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CodexGeneratedArrayUtilsTest {

    @Test
    void addAddAllAndInsertHandlePrimitiveArrays() {
        assertArrayEquals(new int[] { 1, 2, 3 }, ArrayUtils.add(new int[] { 1, 2 }, 3));
        assertArrayEquals(new int[] { 1, 9, 2 }, ArrayUtils.add(new int[] { 1, 2 }, 1, 9));
        assertArrayEquals(new int[] { 1, 2, 3, 4 }, ArrayUtils.addAll(new int[] { 1, 2 }, 3, 4));
        assertArrayEquals(new int[] { 1, 7, 8, 2 }, ArrayUtils.insert(1, new int[] { 1, 2 }, 7, 8));
        assertThrows(IndexOutOfBoundsException.class, () -> ArrayUtils.add(new int[] { 1 }, 3, 2));
    }

    @Test
    void cloneContainsAndIndexOfCoverNullAndFoundCases() {
        final String[] words = { "a", null, "b" };
        assertArrayEquals(words, ArrayUtils.clone(words));
        assertNull(ArrayUtils.clone((Object[]) null));
        assertTrue(ArrayUtils.contains(words, null));
        assertTrue(ArrayUtils.contains(new int[] { 1, 2, 3 }, 2));
        assertFalse(ArrayUtils.contains(new int[] { 1, 2, 3 }, 9));
        assertEquals(2, ArrayUtils.indexOf(words, "b"));
        assertEquals(ArrayUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(words, "z"));
    }

    @Test
    void subarrayReverseSwapAndPrimitiveConversionsWork() {
        final int[] numbers = { 1, 2, 3, 4 };
        assertArrayEquals(new int[] { 2, 3 }, ArrayUtils.subarray(numbers, 1, 3));

        ArrayUtils.reverse(numbers);
        assertArrayEquals(new int[] { 4, 3, 2, 1 }, numbers);

        ArrayUtils.swap(numbers, 0, 2);
        assertArrayEquals(new int[] { 2, 3, 4, 1 }, numbers);

        assertArrayEquals(new int[] { 1, 2 }, ArrayUtils.toPrimitive(new Integer[] { 1, 2 }));
        assertArrayEquals(new Integer[] { 1, 2 }, ArrayUtils.toObject(new int[] { 1, 2 }));
    }
}
