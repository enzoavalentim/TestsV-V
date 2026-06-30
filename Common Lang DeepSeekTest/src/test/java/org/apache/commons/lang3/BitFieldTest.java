package org.apache.commons.lang3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CodexGeneratedBitFieldTest {

    @Test
    void intMaskReadsWritesAndClearsShiftedValues() {
        final BitField field = new BitField(0x3F80);
        final int holder = field.setValue(0, 12);

        assertEquals(12, field.getValue(holder));
        assertEquals(12 << 7, field.getRawValue(holder));
        assertTrue(field.isSet(holder));
        assertFalse(field.isAllSet(holder));
        assertEquals(0, field.clear(holder));
        assertEquals(0x3F80, field.set(0));
        assertEquals(0, field.setBoolean(0x3F80, false));
    }

    @Test
    void byteAndShortHelpersDelegateToIntOperations() {
        final BitField bit = new BitField(0x04);
        assertEquals(4, bit.setByte((byte) 0));
        assertEquals(0, bit.clearByte((byte) 4));
        assertEquals(4, bit.setByteBoolean((byte) 0, true));

        final BitField shortField = new BitField(0x00F0);
        assertEquals(0x30, shortField.setShortValue((short) 0, (short) 3));
        assertEquals(3, shortField.getShortValue((short) 0x30));
        assertEquals(0, shortField.setShortBoolean((short) 0x00F0, false));
    }

    @Test
    void longMaskSupportsHighBits() {
        final BitField high = new BitField(0x0000FF0000000000L);
        final long holder = high.setValue(0L, 0xABL);

        assertEquals(0xABL, high.getValue(holder));
        assertEquals(0x00AB0000000000L, high.getRawValue(holder));
        assertTrue(high.isAllSet(high.set(0L)));
        assertFalse(high.isSet(high.clear(holder)));
        assertEquals(0L, high.setBoolean(holder, false));
    }
}
