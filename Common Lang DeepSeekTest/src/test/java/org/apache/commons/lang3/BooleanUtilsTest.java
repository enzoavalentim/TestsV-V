package org.apache.commons.lang3;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class CodexGeneratedBooleanUtilsTest {

    @Test
    void logicalOperationsHandlePrimitiveAndWrapperArrays() {
        assertTrue(BooleanUtils.and(true, true));
        assertFalse(BooleanUtils.and(true, false));
        assertTrue(BooleanUtils.or(false, true));
        assertTrue(BooleanUtils.xor(true, false, false));
        assertTrue(BooleanUtils.oneHot(false, true, false));
        assertFalse(BooleanUtils.oneHot(true, true, false));
        assertEquals(Boolean.TRUE, BooleanUtils.and(Boolean.TRUE, Boolean.TRUE));
        assertThrows(NullPointerException.class, () -> BooleanUtils.and(Boolean.TRUE, null));
    }

    @Test
    void stringAndIntegerConversionsCoverTrueFalseNullAndInvalidValues() {
        assertTrue(BooleanUtils.toBoolean("yes"));
        assertFalse(BooleanUtils.toBoolean("off"));
        assertTrue(BooleanUtils.toBoolean(1, 1, 0));
        assertFalse(BooleanUtils.toBoolean(Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0)));
        assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject("T"));
        assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject("No"));
        assertNull(BooleanUtils.toBooleanObject("maybe"));
        assertNull(BooleanUtils.toBooleanObject(3, 1, 2, 3));
        assertThrows(IllegalArgumentException.class, () -> BooleanUtils.toBoolean("maybe", "true", "false"));
    }

    @Test
    void formattingValuesAndIterationAreStable() {
        assertEquals("yes", BooleanUtils.toStringYesNo(true));
        assertEquals("off", BooleanUtils.toStringOnOff(Boolean.FALSE));
        assertNull(BooleanUtils.toStringTrueFalse((Boolean) null));
        assertEquals(10, BooleanUtils.toInteger(Boolean.TRUE, 10, 20, 30));
        assertEquals(Integer.valueOf(20), BooleanUtils.toIntegerObject(false, 10, 20));
        assertArrayEquals(new boolean[] { false, true }, BooleanUtils.primitiveValues());
        assertArrayEquals(new Boolean[] { Boolean.FALSE, Boolean.TRUE }, BooleanUtils.booleanValues());

        final List<Boolean> visited = new ArrayList<>();
        BooleanUtils.forEach(visited::add);
        assertEquals(BooleanUtils.values(), visited);
    }
}
