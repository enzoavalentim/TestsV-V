import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        long long8 = bitField1.setValue((long) ' ', (long) ' ');
        java.lang.Class<?> wildcardClass9 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        long long13 = bitField1.setBoolean((long) ' ', false);
        boolean boolean15 = bitField1.isSet((long) 2);
        int int18 = bitField1.setValue(0, (int) (short) -1);
        short short20 = bitField1.clearShort((short) 0);
        java.lang.Class<?> wildcardClass21 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        long long13 = bitField1.setBoolean((long) ' ', false);
        boolean boolean15 = bitField1.isSet((long) 2);
        byte byte18 = bitField1.setByteBoolean((byte) 0, true);
        short short20 = bitField1.getShortValue((short) (byte) 0);
        java.lang.Class<?> wildcardClass21 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 97 + "'", byte18 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        int int12 = bitField1.getRawValue((int) (short) -1);
        long long14 = bitField1.getValue((long) (short) 96);
        short short17 = bitField1.setShortBoolean((short) 0, false);
        java.lang.Class<?> wildcardClass18 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 96L + "'", long14 == 96L);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) (short) 100);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        short short12 = bitField1.getShortRawValue((short) (byte) 10);
        long long14 = bitField1.getRawValue((-1L));
        java.lang.Class<?> wildcardClass15 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        long long9 = bitField1.set((long) (byte) 1);
        int int11 = bitField1.set((int) '4');
        java.lang.Class<?> wildcardClass12 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 117 + "'", int11 == 117);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        boolean boolean3 = bitField1.isAllSet((long) '4');
        int int5 = bitField1.getValue((int) (byte) 0);
        short short7 = bitField1.setShort((short) (byte) 0);
        java.lang.Class<?> wildcardClass8 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 97 + "'", short7 == (short) 97);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        long long13 = bitField1.setBoolean((long) ' ', false);
        boolean boolean15 = bitField1.isSet((long) 2);
        int int18 = bitField1.setValue(0, (int) (short) -1);
        byte byte21 = bitField1.setByteBoolean((byte) 1, true);
        short short23 = bitField1.setShort((short) 10);
        boolean boolean25 = bitField1.isSet((int) (short) -1);
        short short27 = bitField1.clearShort((short) (byte) 100);
        int int29 = bitField1.getRawValue(117);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 97 + "'", byte21 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 107 + "'", short23 == (short) 107);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 4 + "'", short27 == (short) 4);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        int int12 = bitField1.getRawValue((int) (short) -1);
        long long14 = bitField1.getValue((long) (short) 96);
        long long16 = bitField1.set((long) 96);
        java.lang.Class<?> wildcardClass17 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 96L + "'", long14 == 96L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short4 = bitField1.setShortBoolean((short) 96, true);
        short short7 = bitField1.setShortValue((short) 100, (short) (byte) -1);
        long long9 = bitField1.getValue((long) 10);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 97 + "'", short4 == (short) 97);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 101 + "'", short7 == (short) 101);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        int int16 = bitField1.setValue((int) (byte) -1, (int) (short) 10);
        long long18 = bitField1.getValue((long) 2);
        long long20 = bitField1.getValue((long) 97);
        boolean boolean22 = bitField1.isAllSet(97L);
        int int24 = bitField1.clear(107);
        java.lang.Class<?> wildcardClass25 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-98) + "'", int16 == (-98));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short4 = bitField1.setShortBoolean((short) 96, true);
        short short7 = bitField1.setShortValue((short) 100, (short) (byte) -1);
        int int9 = bitField1.getValue(96);
        short short11 = bitField1.setShort((short) 0);
        java.lang.Class<?> wildcardClass12 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 97 + "'", short4 == (short) 97);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 101 + "'", short7 == (short) 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 96 + "'", int9 == 96);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 97 + "'", short11 == (short) 97);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        int int12 = bitField1.getRawValue((int) (short) -1);
        int int14 = bitField1.clear((int) '#');
        long long16 = bitField1.clear((long) (short) 97);
        java.lang.Class<?> wildcardClass17 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        long long13 = bitField1.setBoolean((long) ' ', false);
        boolean boolean15 = bitField1.isSet((long) 2);
        byte byte18 = bitField1.setByteBoolean((byte) 0, true);
        short short20 = bitField1.getShortRawValue((short) -98);
        long long22 = bitField1.clear((long) (byte) 101);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 97 + "'", byte18 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 4L + "'", long22 == 4L);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        boolean boolean3 = bitField1.isAllSet((long) '4');
        int int5 = bitField1.getValue((int) (byte) 0);
        short short7 = bitField1.setShort((short) (byte) 0);
        short short9 = bitField1.getShortRawValue((short) (byte) 0);
        long long11 = bitField1.clear((long) (-1));
        byte byte13 = bitField1.setByte((byte) -1);
        int int15 = bitField1.getRawValue(97);
        long long17 = bitField1.getRawValue((long) 117);
        byte byte19 = bitField1.setByte((byte) 4);
        int int22 = bitField1.setValue((int) (byte) 10, 4);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 97 + "'", short7 == (short) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-98L) + "'", long11 == (-98L));
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 101 + "'", byte19 == (byte) 101);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        int int16 = bitField1.setValue((int) (byte) -1, (int) (short) 10);
        long long18 = bitField1.getValue((long) 2);
        long long20 = bitField1.getValue((long) 97);
        boolean boolean22 = bitField1.isAllSet(97L);
        int int24 = bitField1.clear(107);
        byte byte26 = bitField1.setByte((byte) 97);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-98) + "'", int16 == (-98));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 97 + "'", byte26 == (byte) 97);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        int int15 = bitField1.clear(2);
        byte byte17 = bitField1.clearByte((byte) 1);
        long long20 = bitField1.setValue((-1L), (long) (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-98L) + "'", long20 == (-98L));
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        long long13 = bitField1.setBoolean((long) ' ', false);
        boolean boolean15 = bitField1.isSet((long) 2);
        int int18 = bitField1.setValue(0, (int) (short) -1);
        short short20 = bitField1.clearShort((short) 0);
        long long22 = bitField1.getRawValue(1L);
        byte byte24 = bitField1.clearByte((byte) 100);
        byte byte26 = bitField1.clearByte((byte) 101);
        java.lang.Class<?> wildcardClass27 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 4 + "'", byte24 == (byte) 4);
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 4 + "'", byte26 == (byte) 4);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        int int16 = bitField1.setValue((int) (byte) -1, (int) (short) 10);
        boolean boolean18 = bitField1.isAllSet((-49));
        boolean boolean20 = bitField1.isSet((long) (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-98) + "'", int16 == (-98));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        int int15 = bitField1.clear(2);
        long long17 = bitField1.getRawValue((long) (short) 1);
        boolean boolean19 = bitField1.isSet((long) (short) -1);
        int int21 = bitField1.getValue((int) (short) 11);
        long long24 = bitField1.setBoolean((long) (short) -1, true);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) ' ');
        java.lang.Class<?> wildcardClass2 = bitField1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        int int12 = bitField1.getRawValue((int) (short) -1);
        long long14 = bitField1.getValue((long) (short) 96);
        short short17 = bitField1.setShortBoolean((short) 0, false);
        boolean boolean19 = bitField1.isSet((long) (short) -1);
        int int21 = bitField1.getRawValue((int) (short) -1);
        long long23 = bitField1.clear(0L);
        java.lang.Class<?> wildcardClass24 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 96L + "'", long14 == 96L);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        int int16 = bitField1.setValue((int) (byte) -1, (int) (short) 10);
        long long18 = bitField1.getValue((long) 2);
        long long20 = bitField1.getValue((long) 97);
        boolean boolean22 = bitField1.isAllSet(97L);
        int int24 = bitField1.clear(107);
        int int26 = bitField1.getRawValue(20);
        short short29 = bitField1.setShortValue((short) 11, (short) 97);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-98) + "'", int16 == (-98));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + short29 + "' != '" + (short) 107 + "'", short29 == (short) 107);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        long long13 = bitField1.setBoolean((long) ' ', false);
        boolean boolean15 = bitField1.isSet((long) 2);
        int int18 = bitField1.setValue(0, (int) (short) -1);
        short short20 = bitField1.clearShort((short) 0);
        long long22 = bitField1.getRawValue(1L);
        byte byte24 = bitField1.clearByte((byte) 100);
        java.lang.Class<?> wildcardClass25 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 4 + "'", byte24 == (byte) 4);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short4 = bitField1.setShortBoolean((short) 96, true);
        short short7 = bitField1.setShortValue((short) 100, (short) (byte) -1);
        int int9 = bitField1.getValue(96);
        boolean boolean11 = bitField1.isSet(0);
        short short14 = bitField1.setShortBoolean((short) (byte) 101, true);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 97 + "'", short4 == (short) 97);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 101 + "'", short7 == (short) 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 96 + "'", int9 == 96);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 101 + "'", short14 == (short) 101);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        int int15 = bitField1.clear(2);
        byte byte17 = bitField1.clearByte((byte) 1);
        long long20 = bitField1.setBoolean((long) (byte) 101, true);
        boolean boolean22 = bitField1.isAllSet((long) 97);
        java.lang.Class<?> wildcardClass23 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 101L + "'", long20 == 101L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        int int12 = bitField1.getRawValue((int) (short) -1);
        long long14 = bitField1.getValue((long) (short) 96);
        boolean boolean16 = bitField1.isAllSet(97);
        boolean boolean18 = bitField1.isAllSet(106);
        int int20 = bitField1.getRawValue((int) (byte) -1);
        byte byte22 = bitField1.clearByte((byte) 97);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 96L + "'", long14 == 96L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 0 + "'", byte22 == (byte) 0);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short10 = bitField1.setShortBoolean((short) -1, true);
        short short12 = bitField1.getShortRawValue((short) 101);
        java.lang.Class<?> wildcardClass13 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 97 + "'", short12 == (short) 97);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        int int12 = bitField1.getRawValue((int) (short) -1);
        long long14 = bitField1.getValue((long) (short) 96);
        short short17 = bitField1.setShortBoolean((short) 0, false);
        boolean boolean19 = bitField1.isSet((long) (short) -1);
        int int21 = bitField1.getRawValue((int) (short) -1);
        long long23 = bitField1.clear((long) (-1));
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 96L + "'", long14 == 96L);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-98L) + "'", long23 == (-98L));
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        boolean boolean3 = bitField1.isAllSet((long) '4');
        int int5 = bitField1.getValue((int) (byte) 0);
        short short7 = bitField1.setShort((short) (byte) 0);
        short short9 = bitField1.getShortRawValue((short) (byte) 0);
        long long11 = bitField1.clear((long) (-1));
        short short14 = bitField1.setShortBoolean((short) (byte) 10, false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 97 + "'", short7 == (short) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-98L) + "'", long11 == (-98L));
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 10 + "'", short14 == (short) 10);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        short short12 = bitField1.getShortRawValue((short) (byte) 10);
        long long14 = bitField1.getRawValue((-1L));
        int int16 = bitField1.clear((int) '4');
        int int19 = bitField1.setValue((int) (byte) 10, (int) (short) 96);
        short short21 = bitField1.getShortRawValue((short) -33);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20 + "'", int16 == 20);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 106 + "'", int19 == 106);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 65 + "'", short21 == (short) 65);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        short short12 = bitField1.getShortRawValue((short) (byte) 10);
        long long14 = bitField1.getRawValue((-1L));
        int int16 = bitField1.clear((int) '4');
        int int19 = bitField1.setValue((int) (short) 0, 2);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20 + "'", int16 == 20);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        int int16 = bitField1.setValue((int) (byte) -1, (int) (short) 10);
        boolean boolean18 = bitField1.isAllSet((-49));
        int int20 = bitField1.clear(4);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-98) + "'", int16 == (-98));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) 106);
        short short3 = bitField1.getShortRawValue((short) -98);
        java.lang.Class<?> wildcardClass4 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        int int13 = bitField1.set((int) (byte) 10);
        int int15 = bitField1.getRawValue((int) (byte) 10);
        java.lang.Class<?> wildcardClass16 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 107 + "'", int13 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        long long13 = bitField1.setBoolean((long) ' ', false);
        boolean boolean15 = bitField1.isSet((long) 2);
        int int18 = bitField1.setValue(0, (int) (short) -1);
        byte byte21 = bitField1.setByteBoolean((byte) 1, true);
        byte byte23 = bitField1.setByte((byte) -1);
        int int26 = bitField1.setBoolean((int) (short) 10, false);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 97 + "'", byte21 == (byte) 97);
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) -1 + "'", byte23 == (byte) -1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(1L);
        int int3 = bitField1.getValue((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        short short12 = bitField1.getShortRawValue((short) (byte) 10);
        long long14 = bitField1.getRawValue((-1L));
        int int16 = bitField1.clear((int) '4');
        int int18 = bitField1.clear((int) (short) 97);
        long long20 = bitField1.getRawValue((long) (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20 + "'", int16 == 20);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        long long13 = bitField1.setBoolean((long) ' ', false);
        short short15 = bitField1.setShort((short) (byte) 1);
        boolean boolean17 = bitField1.isAllSet(2);
        short short20 = bitField1.setShortBoolean((short) (byte) 97, false);
        int int22 = bitField1.getValue((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 97 + "'", short15 == (short) 97);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-1));
        int int3 = bitField1.getRawValue(97);
        long long5 = bitField1.clear((long) 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        int int12 = bitField1.getRawValue((int) (short) -1);
        int int14 = bitField1.getRawValue(99);
        java.lang.Class<?> wildcardClass15 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short10 = bitField1.setShortBoolean((short) -1, true);
        long long13 = bitField1.setBoolean(1L, true);
        byte byte15 = bitField1.clearByte((byte) 101);
        boolean boolean17 = bitField1.isSet(0);
        java.lang.Class<?> wildcardClass18 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 4 + "'", byte15 == (byte) 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        int int12 = bitField1.getRawValue((int) (short) -1);
        boolean boolean14 = bitField1.isSet((long) (-1));
        int int16 = bitField1.clear((-1));
        long long19 = bitField1.setBoolean(116L, false);
        int int22 = bitField1.setBoolean((int) (byte) -1, false);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-98) + "'", int16 == (-98));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 20L + "'", long19 == 20L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-98) + "'", int22 == (-98));
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) 0);
        short short4 = bitField1.setShortBoolean((short) (byte) 4, false);
        int int6 = bitField1.getValue(117);
        int int9 = bitField1.setBoolean(107, false);
        java.lang.Class<?> wildcardClass10 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 4 + "'", short4 == (short) 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 107 + "'", int9 == 107);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short4 = bitField1.setShortBoolean((short) 96, true);
        int int6 = bitField1.getRawValue((int) (short) 100);
        byte byte8 = bitField1.clearByte((byte) 100);
        boolean boolean10 = bitField1.isSet((long) (short) 0);
        int int13 = bitField1.setValue((int) (byte) 97, (int) (byte) 0);
        short short15 = bitField1.getShortValue((short) 1);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 97 + "'", short4 == (short) 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 96 + "'", int6 == 96);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 4 + "'", byte8 == (byte) 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 1 + "'", short15 == (short) 1);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) 97);
        int int3 = bitField1.clear(1);
        short short5 = bitField1.clearShort((short) (byte) 14);
        byte byte7 = bitField1.setByte((byte) 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 14 + "'", short5 == (short) 14);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) 97);
        byte byte3 = bitField1.setByte((byte) 97);
        boolean boolean5 = bitField1.isAllSet((int) (byte) -1);
        long long8 = bitField1.setBoolean((long) '#', true);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 97 + "'", byte3 == (byte) 97);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 99L + "'", long8 == 99L);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        long long13 = bitField1.setBoolean((long) ' ', false);
        boolean boolean15 = bitField1.isSet((long) 2);
        int int18 = bitField1.setValue(0, (int) (short) -1);
        byte byte21 = bitField1.setByteBoolean((byte) 1, true);
        byte byte23 = bitField1.setByte((byte) -1);
        int int26 = bitField1.setValue((int) (byte) -1, (int) (short) -98);
        long long28 = bitField1.getValue((long) 'a');
        java.lang.Class<?> wildcardClass29 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 97 + "'", byte21 == (byte) 97);
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) -1 + "'", byte23 == (byte) -1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-98) + "'", int26 == (-98));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 97L + "'", long28 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) 106);
        short short3 = bitField1.getShortRawValue((short) -98);
        boolean boolean5 = bitField1.isSet((int) (short) 1);
        java.lang.Class<?> wildcardClass6 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        int int16 = bitField1.setValue((int) (byte) -1, (int) (short) 10);
        long long18 = bitField1.getValue((long) 2);
        long long20 = bitField1.getValue((long) 97);
        long long23 = bitField1.setValue((long) (byte) 1, (long) 107);
        short short26 = bitField1.setShortBoolean((short) (byte) 101, true);
        long long29 = bitField1.setValue((long) (short) 96, (long) 10);
        boolean boolean31 = bitField1.isAllSet(5);
        short short34 = bitField1.setShortValue((short) (byte) 107, (short) 14);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-98) + "'", int16 == (-98));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 97L + "'", long23 == 97L);
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 101 + "'", short26 == (short) 101);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + short34 + "' != '" + (short) 10 + "'", short34 == (short) 10);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        short short5 = bitField1.getShortRawValue((short) 0);
        int int8 = bitField1.setValue(1, 96);
        long long10 = bitField1.getValue((long) 100);
        short short13 = bitField1.setShortBoolean((short) 0, true);
        long long16 = bitField1.setValue((long) (-1), 8L);
        boolean boolean18 = bitField1.isAllSet((long) (byte) 100);
        short short20 = bitField1.setShort((short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 96 + "'", int8 == 96);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 96L + "'", long10 == 96L);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 97 + "'", short13 == (short) 97);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-98L) + "'", long16 == (-98L));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 97 + "'", short20 == (short) 97);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short4 = bitField1.setShortBoolean((short) 96, true);
        short short7 = bitField1.setShortValue((short) 100, (short) (byte) -1);
        int int9 = bitField1.getValue(96);
        boolean boolean11 = bitField1.isSet(0);
        java.lang.Class<?> wildcardClass12 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 97 + "'", short4 == (short) 97);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 101 + "'", short7 == (short) 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 96 + "'", int9 == 96);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(96);
        short short4 = bitField1.setShortValue((short) (byte) -98, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -2 + "'", short4 == (short) -2);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        long long13 = bitField1.setBoolean((long) ' ', false);
        boolean boolean15 = bitField1.isSet((long) 2);
        int int18 = bitField1.setValue(0, (int) (short) -1);
        byte byte21 = bitField1.setByteBoolean((byte) 1, true);
        short short23 = bitField1.setShort((short) 10);
        boolean boolean25 = bitField1.isSet((int) (short) -1);
        long long27 = bitField1.getValue((long) (byte) 107);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 97 + "'", byte21 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 107 + "'", short23 == (short) 107);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 97L + "'", long27 == 97L);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        long long5 = bitField1.getValue((long) (byte) 0);
        long long7 = bitField1.clear((long) 10);
        int int10 = bitField1.setBoolean((int) (short) 101, true);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        long long13 = bitField1.setBoolean((long) ' ', false);
        boolean boolean15 = bitField1.isSet((long) 2);
        int int18 = bitField1.setValue(0, (int) (short) -1);
        byte byte21 = bitField1.setByteBoolean((byte) 1, true);
        short short23 = bitField1.setShort((short) 10);
        boolean boolean25 = bitField1.isSet((int) (short) -1);
        java.lang.Class<?> wildcardClass26 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 97 + "'", byte21 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 107 + "'", short23 == (short) 107);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        int int12 = bitField1.getRawValue((int) (short) -1);
        boolean boolean14 = bitField1.isSet((long) (-1));
        boolean boolean16 = bitField1.isAllSet((long) (byte) 1);
        byte byte19 = bitField1.setByteBoolean((byte) 97, true);
        java.lang.Class<?> wildcardClass20 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 97 + "'", byte19 == (byte) 97);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        int int16 = bitField1.setValue((int) (byte) -1, (int) (short) 10);
        long long18 = bitField1.getValue((long) 2);
        long long20 = bitField1.getValue((long) 97);
        long long23 = bitField1.setValue((long) (byte) 1, (long) 107);
        int int25 = bitField1.getRawValue((int) (byte) -1);
        int int28 = bitField1.setValue(106, (int) (byte) 97);
        int int30 = bitField1.set((int) (short) 101);
        long long32 = bitField1.set((long) (-1));
        int int34 = bitField1.set((int) (short) 97);
        java.lang.Class<?> wildcardClass35 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-98) + "'", int16 == (-98));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 97L + "'", long23 == 97L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 107 + "'", int28 == 107);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 101 + "'", int30 == 101);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) 97);
        byte byte3 = bitField1.setByte((byte) 97);
        int int5 = bitField1.set((int) (short) 96);
        int int8 = bitField1.setValue(100, (int) (short) 14);
        short short11 = bitField1.setShortValue((short) -97, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 97 + "'", byte3 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) -2 + "'", short11 == (short) -2);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) (short) 4);
        short short4 = bitField1.setShortValue((short) 107, (short) -98);
        boolean boolean6 = bitField1.isAllSet(20);
        byte byte9 = bitField1.setByteBoolean((byte) 101, true);
        int int11 = bitField1.getValue(117);
        short short13 = bitField1.getShortRawValue((short) 97);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 107 + "'", short4 == (short) 107);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 101 + "'", byte9 == (byte) 101);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 0 + "'", short13 == (short) 0);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        byte byte13 = bitField1.setByteBoolean((byte) 100, true);
        java.lang.Class<?> wildcardClass14 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 101 + "'", byte13 == (byte) 101);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) 97);
        byte byte3 = bitField1.setByte((byte) 97);
        java.lang.Class<?> wildcardClass4 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 97 + "'", byte3 == (byte) 97);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        boolean boolean3 = bitField1.isAllSet((long) '4');
        int int5 = bitField1.getValue((int) (byte) 0);
        short short7 = bitField1.setShort((short) (byte) 0);
        short short9 = bitField1.getShortRawValue((short) (byte) 0);
        long long11 = bitField1.clear((long) (-1));
        byte byte13 = bitField1.setByte((byte) -1);
        int int15 = bitField1.getRawValue(97);
        long long17 = bitField1.getRawValue((long) 117);
        int int19 = bitField1.getValue(63);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 97 + "'", short7 == (short) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-98L) + "'", long11 == (-98L));
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 33 + "'", int19 == 33);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 97);
        long long3 = bitField1.clear(0L);
        int int5 = bitField1.getValue((int) (short) 107);
        short short7 = bitField1.clearShort((short) (byte) -98);
        short short10 = bitField1.setShortValue((short) (byte) 14, (short) 11);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -98 + "'", short7 == (short) -98);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 15 + "'", short10 == (short) 15);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short10 = bitField1.setShortBoolean((short) -1, true);
        int int13 = bitField1.setBoolean((int) (byte) 100, false);
        long long15 = bitField1.getRawValue((long) (short) 15);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short4 = bitField1.setShortBoolean((short) 96, true);
        boolean boolean6 = bitField1.isAllSet((long) (short) 97);
        int int8 = bitField1.set((int) (short) 107);
        long long10 = bitField1.clear((long) 33);
        boolean boolean12 = bitField1.isAllSet((long) (-49));
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 97 + "'", short4 == (short) 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 107 + "'", int8 == 107);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) 106);
        short short3 = bitField1.getShortRawValue((short) -98);
        long long5 = bitField1.getRawValue((long) 117);
        short short8 = bitField1.setShortValue((short) (byte) -1, (short) (byte) 101);
        boolean boolean10 = bitField1.isSet((int) (byte) 10);
        java.lang.Class<?> wildcardClass11 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 96L + "'", long5 == 96L);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -33 + "'", short8 == (short) -33);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) (byte) -98);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        boolean boolean3 = bitField1.isAllSet((long) '4');
        int int5 = bitField1.getValue((int) (byte) 0);
        short short7 = bitField1.setShort((short) (byte) 0);
        short short9 = bitField1.getShortRawValue((short) (byte) 0);
        long long11 = bitField1.clear((long) (-1));
        byte byte13 = bitField1.setByte((byte) -1);
        long long15 = bitField1.clear(4L);
        int int17 = bitField1.getRawValue(32);
        short short19 = bitField1.setShort((short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 97 + "'", short7 == (short) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-98L) + "'", long11 == (-98L));
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4L + "'", long15 == 4L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 97 + "'", short19 == (short) 97);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) 1);
        short short4 = bitField1.setShortValue((short) 10, (short) 65);
        long long6 = bitField1.set((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 11 + "'", short4 == (short) 11);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(11);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short4 = bitField1.setShortBoolean((short) 96, true);
        int int6 = bitField1.getRawValue((int) (short) 100);
        int int8 = bitField1.getValue(4);
        boolean boolean10 = bitField1.isSet((long) 10);
        int int12 = bitField1.set(0);
        short short14 = bitField1.setShort((short) 10);
        java.lang.Class<?> wildcardClass15 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 97 + "'", short4 == (short) 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 96 + "'", int6 == 96);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 107 + "'", short14 == (short) 107);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        long long9 = bitField1.set((long) (byte) 1);
        int int11 = bitField1.set((int) '4');
        short short13 = bitField1.getShortRawValue((short) 97);
        int int16 = bitField1.setBoolean(0, false);
        boolean boolean18 = bitField1.isSet((int) 'a');
        boolean boolean20 = bitField1.isSet((int) ' ');
        short short22 = bitField1.setShort((short) 48);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 117 + "'", int11 == 117);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 97 + "'", short13 == (short) 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 113 + "'", short22 == (short) 113);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) 107);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        int int12 = bitField1.getRawValue((int) (short) -1);
        long long14 = bitField1.getValue((long) (short) 96);
        short short17 = bitField1.setShortBoolean((short) 0, false);
        boolean boolean19 = bitField1.isSet((long) (short) -1);
        int int21 = bitField1.getRawValue((int) (short) -1);
        long long23 = bitField1.set(20L);
        long long25 = bitField1.getRawValue((long) 4);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 96L + "'", long14 == 96L);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 117L + "'", long23 == 117L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        int int12 = bitField1.getRawValue((int) (short) -1);
        boolean boolean14 = bitField1.isSet((long) (-1));
        boolean boolean16 = bitField1.isAllSet((int) '#');
        byte byte19 = bitField1.setByteBoolean((byte) 0, true);
        byte byte22 = bitField1.setByteBoolean((byte) 0, true);
        short short25 = bitField1.setShortBoolean((short) 14, false);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 97 + "'", byte19 == (byte) 97);
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 97 + "'", byte22 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 14 + "'", short25 == (short) 14);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) 0);
        short short4 = bitField1.setShortBoolean((short) (byte) 4, false);
        int int6 = bitField1.getValue(117);
        short short9 = bitField1.setShortBoolean((short) (byte) 97, false);
        short short11 = bitField1.getShortValue((short) (byte) 101);
        boolean boolean13 = bitField1.isAllSet((long) 'a');
        java.lang.Class<?> wildcardClass14 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 4 + "'", short4 == (short) 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 97 + "'", short9 == (short) 97);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        int int12 = bitField1.getRawValue((int) (short) -1);
        boolean boolean14 = bitField1.isSet((long) (-1));
        boolean boolean16 = bitField1.isAllSet((int) '#');
        byte byte19 = bitField1.setByteBoolean((byte) 0, true);
        java.lang.Class<?> wildcardClass20 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 97 + "'", byte19 == (byte) 97);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) (byte) 100);
        short short11 = bitField1.getShortValue((short) 97);
        short short13 = bitField1.getShortValue((short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 96 + "'", short9 == (short) 96);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 97 + "'", short11 == (short) 97);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 0 + "'", short13 == (short) 0);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) 97);
        byte byte3 = bitField1.setByte((byte) 97);
        byte byte5 = bitField1.setByte((byte) 10);
        long long8 = bitField1.setBoolean((long) (byte) 107, false);
        short short11 = bitField1.setShortValue((short) 107, (short) -98);
        long long13 = bitField1.clear((long) (byte) -98);
        long long15 = bitField1.getValue((long) 99);
        short short18 = bitField1.setShortValue((short) (byte) 100, (short) 113);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 97 + "'", byte3 == (byte) 97);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 107 + "'", byte5 == (byte) 107);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-98L) + "'", long13 == (-98L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 101 + "'", short18 == (short) 101);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        int int15 = bitField1.clear(2);
        long long17 = bitField1.getRawValue((long) (short) 1);
        long long19 = bitField1.set(0L);
        int int21 = bitField1.set((int) (byte) 4);
        long long23 = bitField1.set((long) 32);
        long long25 = bitField1.getValue((-97L));
        long long27 = bitField1.getValue((long) 97);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 97L + "'", long19 == 97L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 101 + "'", int21 == 101);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 97L + "'", long23 == 97L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 97L + "'", long27 == 97L);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short4 = bitField1.setShortBoolean((short) 96, true);
        short short6 = bitField1.getShortValue((short) 97);
        long long8 = bitField1.getValue(2L);
        short short10 = bitField1.getShortRawValue((short) (byte) 62);
        java.lang.Class<?> wildcardClass11 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 97 + "'", short4 == (short) 97);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 97 + "'", short6 == (short) 97);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 32 + "'", short10 == (short) 32);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        long long9 = bitField1.set((long) (byte) 1);
        int int11 = bitField1.set((int) '4');
        short short13 = bitField1.getShortRawValue((short) 97);
        int int16 = bitField1.setBoolean(0, false);
        boolean boolean18 = bitField1.isSet((int) 'a');
        short short20 = bitField1.getShortRawValue((short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 117 + "'", int11 == 117);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 97 + "'", short13 == (short) 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        int int12 = bitField1.getRawValue((int) (short) -1);
        boolean boolean14 = bitField1.isSet((long) (-1));
        boolean boolean16 = bitField1.isAllSet((int) '#');
        byte byte18 = bitField1.setByte((byte) 123);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 123 + "'", byte18 == (byte) 123);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        boolean boolean3 = bitField1.isAllSet((long) '4');
        int int5 = bitField1.getValue((int) (byte) 0);
        short short7 = bitField1.setShort((short) 1);
        int int10 = bitField1.setBoolean((int) (byte) 0, true);
        java.lang.Class<?> wildcardClass11 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 97 + "'", short7 == (short) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        int int16 = bitField1.setValue((int) (byte) -1, (int) (short) 10);
        long long18 = bitField1.getValue((long) 2);
        long long20 = bitField1.getValue((long) 97);
        long long23 = bitField1.setValue((long) (byte) 1, (long) 107);
        int int25 = bitField1.getRawValue((int) (byte) -1);
        long long27 = bitField1.getRawValue((long) (byte) 1);
        int int30 = bitField1.setValue((int) (byte) 4, 100);
        java.lang.Class<?> wildcardClass31 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-98) + "'", int16 == (-98));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 97L + "'", long23 == 97L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        long long5 = bitField1.set((long) 100);
        short short7 = bitField1.getShortRawValue((short) 97);
        int int9 = bitField1.getRawValue((int) (short) 75);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 101L + "'", long5 == 101L);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 97 + "'", short7 == (short) 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        int int15 = bitField1.clear(2);
        long long17 = bitField1.getRawValue((long) (short) 1);
        long long19 = bitField1.set(0L);
        java.lang.Class<?> wildcardClass20 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 97L + "'", long19 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        boolean boolean3 = bitField1.isAllSet((long) '4');
        int int5 = bitField1.getValue((int) (byte) 0);
        long long7 = bitField1.getRawValue((long) ' ');
        java.lang.Class<?> wildcardClass8 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        long long13 = bitField1.setBoolean((long) ' ', false);
        boolean boolean15 = bitField1.isSet((long) 2);
        int int18 = bitField1.setValue(0, (int) (short) -1);
        long long21 = bitField1.setBoolean(0L, false);
        short short23 = bitField1.clearShort((short) (byte) 127);
        boolean boolean25 = bitField1.isSet((long) 106);
        java.lang.Class<?> wildcardClass26 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 30 + "'", short23 == (short) 30);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 91);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) 0);
        short short4 = bitField1.setShortBoolean((short) (byte) 4, false);
        int int7 = bitField1.setBoolean((int) (short) 11, false);
        byte byte9 = bitField1.clearByte((byte) -98);
        long long11 = bitField1.getRawValue((long) 63);
        int int14 = bitField1.setBoolean((int) (byte) -1, true);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 4 + "'", short4 == (short) 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -98 + "'", byte9 == (byte) -98);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        byte byte6 = bitField1.setByteBoolean((byte) 10, false);
        boolean boolean8 = bitField1.isSet((long) (short) 65);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short4 = bitField1.setShortBoolean((short) 96, true);
        boolean boolean6 = bitField1.isAllSet((long) (short) 97);
        boolean boolean8 = bitField1.isSet((long) (short) 4);
        boolean boolean10 = bitField1.isAllSet(0L);
        int int12 = bitField1.clear(0);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 97 + "'", short4 == (short) 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        int int15 = bitField1.clear(2);
        byte byte17 = bitField1.clearByte((byte) 1);
        long long19 = bitField1.set((long) (byte) 101);
        boolean boolean21 = bitField1.isAllSet(101);
        boolean boolean23 = bitField1.isSet(1L);
        short short25 = bitField1.getShortRawValue((short) (byte) 14);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 101L + "'", long19 == 101L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 0 + "'", short25 == (short) 0);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-1));
        int int3 = bitField1.getRawValue(97);
        short short6 = bitField1.setShortBoolean((short) -98, true);
        int int8 = bitField1.clear((int) (short) -2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        boolean boolean3 = bitField1.isAllSet((long) '4');
        int int5 = bitField1.getValue((int) (byte) 0);
        short short7 = bitField1.setShort((short) (byte) 0);
        short short9 = bitField1.getShortRawValue((short) (byte) 0);
        long long11 = bitField1.clear((long) (-1));
        byte byte13 = bitField1.setByte((byte) -1);
        long long15 = bitField1.clear(4L);
        long long17 = bitField1.clear((long) 127);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 97 + "'", short7 == (short) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-98L) + "'", long11 == (-98L));
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4L + "'", long15 == 4L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 30L + "'", long17 == 30L);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        int int15 = bitField1.clear(2);
        byte byte17 = bitField1.clearByte((byte) 1);
        long long20 = bitField1.setBoolean((long) (byte) 101, true);
        long long22 = bitField1.getValue((long) (-1));
        short short24 = bitField1.setShort((short) -2);
        boolean boolean26 = bitField1.isSet((long) (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 101L + "'", long20 == 101L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 97L + "'", long22 == 97L);
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) -1 + "'", short24 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        long long13 = bitField1.setBoolean((long) ' ', false);
        short short15 = bitField1.setShort((short) (byte) 1);
        boolean boolean17 = bitField1.isAllSet(2);
        short short20 = bitField1.setShortBoolean((short) (byte) 97, false);
        short short23 = bitField1.setShortBoolean((short) 48, false);
        byte byte26 = bitField1.setByteBoolean((byte) 30, true);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 97 + "'", short15 == (short) 97);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 16 + "'", short23 == (short) 16);
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 127 + "'", byte26 == (byte) 127);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        int int16 = bitField1.setValue((int) (byte) -1, (int) (short) 10);
        long long18 = bitField1.getValue((long) 2);
        long long20 = bitField1.getValue((long) 97);
        long long23 = bitField1.setValue((long) (byte) 1, (long) 107);
        int int25 = bitField1.getRawValue((int) (byte) -1);
        long long27 = bitField1.getRawValue((long) (byte) 1);
        byte byte29 = bitField1.clearByte((byte) 68);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-98) + "'", int16 == (-98));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 97L + "'", long23 == 97L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertTrue("'" + byte29 + "' != '" + (byte) 4 + "'", byte29 == (byte) 4);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-1));
        short short4 = bitField1.setShortValue((short) 96, (short) 75);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 75 + "'", short4 == (short) 75);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        int int12 = bitField1.getRawValue((int) (short) -1);
        long long14 = bitField1.getValue((long) (short) 96);
        long long16 = bitField1.set((long) 96);
        long long18 = bitField1.getRawValue((long) (short) 4);
        short short20 = bitField1.getShortValue((short) (byte) 30);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 96L + "'", long14 == 96L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        int int16 = bitField1.setValue((int) (byte) -1, (int) (short) 10);
        boolean boolean18 = bitField1.isAllSet((long) (short) 107);
        short short20 = bitField1.getShortRawValue((short) 11);
        long long23 = bitField1.setValue((long) (byte) 10, (long) 107);
        short short25 = bitField1.getShortValue((short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-98) + "'", int16 == (-98));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 1 + "'", short20 == (short) 1);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 107L + "'", long23 == 107L);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 1 + "'", short25 == (short) 1);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        long long13 = bitField1.setBoolean((long) ' ', false);
        boolean boolean15 = bitField1.isSet((long) 2);
        int int18 = bitField1.setValue(0, (int) (short) -1);
        long long21 = bitField1.setBoolean(0L, false);
        boolean boolean23 = bitField1.isAllSet((long) (short) 16);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) (short) 96);
        short short3 = bitField1.setShort((short) 1);
        byte byte5 = bitField1.setByte((byte) -1);
        int int8 = bitField1.setBoolean(20, true);
        byte byte10 = bitField1.setByte((byte) 107);
        byte byte12 = bitField1.clearByte((byte) 62);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 97 + "'", short3 == (short) 97);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 116 + "'", int8 == 116);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 107 + "'", byte10 == (byte) 107);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 30 + "'", byte12 == (byte) 30);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        boolean boolean3 = bitField1.isAllSet((long) '4');
        long long5 = bitField1.getValue((long) (short) 100);
        long long8 = bitField1.setValue((long) '4', (long) (short) 96);
        java.lang.Class<?> wildcardClass9 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 96L + "'", long5 == 96L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 116L + "'", long8 == 116L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        short short12 = bitField1.getShortRawValue((short) (byte) 10);
        int int14 = bitField1.getRawValue((int) (byte) -1);
        byte byte17 = bitField1.setByteBoolean((byte) 100, false);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 4 + "'", byte17 == (byte) 4);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short4 = bitField1.setShortBoolean((short) 96, true);
        int int6 = bitField1.getRawValue((int) (short) 100);
        long long8 = bitField1.set(117L);
        int int10 = bitField1.getRawValue(107);
        byte byte12 = bitField1.clearByte((byte) 1);
        java.lang.Class<?> wildcardClass13 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 97 + "'", short4 == (short) 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 96 + "'", int6 == 96);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 117L + "'", long8 == 117L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        short short12 = bitField1.getShortRawValue((short) (byte) 10);
        int int14 = bitField1.getRawValue(99);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        long long9 = bitField1.set((long) (byte) 1);
        boolean boolean11 = bitField1.isSet(1L);
        boolean boolean13 = bitField1.isAllSet((long) 20);
        long long16 = bitField1.setValue(0L, 0L);
        boolean boolean18 = bitField1.isAllSet(0L);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) (byte) 100);
        int int11 = bitField1.set(0);
        int int13 = bitField1.set(99);
        long long15 = bitField1.set(95L);
        short short17 = bitField1.getShortRawValue((short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 96 + "'", short9 == (short) 96);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 99 + "'", int13 == 99);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 127L + "'", long15 == 127L);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        long long7 = bitField1.set((long) ' ');
        short short9 = bitField1.getShortValue((short) -98);
        int int11 = bitField1.set(32);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        long long13 = bitField1.setBoolean((long) ' ', false);
        boolean boolean15 = bitField1.isSet((long) 2);
        byte byte18 = bitField1.setByteBoolean((byte) 0, true);
        short short20 = bitField1.getShortRawValue((short) -98);
        long long22 = bitField1.set(10L);
        long long24 = bitField1.clear((long) '#');
        byte byte26 = bitField1.clearByte((byte) 111);
        boolean boolean28 = bitField1.isSet(1L);
        short short30 = bitField1.getShortValue((short) 4);
        boolean boolean32 = bitField1.isSet(65L);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 97 + "'", byte18 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 107L + "'", long22 == 107L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 2L + "'", long24 == 2L);
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 14 + "'", byte26 == (byte) 14);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + short30 + "' != '" + (short) 0 + "'", short30 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 100);
        long long3 = bitField1.clear((long) (short) 101);
        boolean boolean5 = bitField1.isAllSet((int) (short) 91);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.setByte((byte) 100);
        short short15 = bitField1.clearShort((short) (byte) 97);
        java.lang.Class<?> wildcardClass16 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 101 + "'", byte13 == (byte) 101);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 0 + "'", short15 == (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) '4');
        short short3 = bitField1.getShortRawValue((short) 10);
        long long5 = bitField1.getRawValue((long) 20);
        long long7 = bitField1.getValue(97L);
        java.lang.Class<?> wildcardClass8 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 20L + "'", long5 == 20L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 8L + "'", long7 == 8L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        long long16 = bitField1.setValue((long) (-1), (long) (short) 97);
        long long19 = bitField1.setValue((-98L), (long) (short) -1);
        boolean boolean21 = bitField1.isSet(117L);
        long long23 = bitField1.getRawValue(65L);
        long long26 = bitField1.setBoolean((long) (short) -33, true);
        short short28 = bitField1.setShort((short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 65L + "'", long23 == 65L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertTrue("'" + short28 + "' != '" + (short) 97 + "'", short28 == (short) 97);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        int int12 = bitField1.getRawValue((int) (short) -1);
        boolean boolean14 = bitField1.isSet((long) (-1));
        boolean boolean16 = bitField1.isAllSet((long) (byte) 1);
        byte byte19 = bitField1.setByteBoolean((byte) 97, true);
        long long21 = bitField1.getValue(14L);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 97 + "'", byte19 == (byte) 97);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        short short12 = bitField1.getShortRawValue((short) (byte) 10);
        short short14 = bitField1.getShortValue((short) 0);
        long long16 = bitField1.getRawValue(117L);
        short short18 = bitField1.getShortRawValue((short) (byte) 127);
        boolean boolean20 = bitField1.isAllSet((-98));
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 97 + "'", short18 == (short) 97);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short10 = bitField1.setShortBoolean((short) -1, true);
        long long13 = bitField1.setBoolean(1L, true);
        byte byte15 = bitField1.clearByte((byte) 101);
        boolean boolean17 = bitField1.isSet(0);
        int int20 = bitField1.setBoolean(2, false);
        long long23 = bitField1.setBoolean(99L, false);
        int int25 = bitField1.set(16);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 4 + "'", byte15 == (byte) 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 2L + "'", long23 == 2L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 113 + "'", int25 == 113);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        long long13 = bitField1.setBoolean((long) ' ', false);
        boolean boolean15 = bitField1.isSet((long) 2);
        byte byte18 = bitField1.setByteBoolean((byte) 0, true);
        short short20 = bitField1.getShortRawValue((short) -98);
        long long22 = bitField1.set(10L);
        boolean boolean24 = bitField1.isAllSet(96);
        boolean boolean26 = bitField1.isSet(0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 97 + "'", byte18 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 107L + "'", long22 == 107L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.setByte((byte) 100);
        short short15 = bitField1.clearShort((short) (byte) 97);
        long long18 = bitField1.setBoolean(4L, true);
        int int20 = bitField1.getRawValue((int) (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 101 + "'", byte13 == (byte) 101);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 0 + "'", short15 == (short) 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 101L + "'", long18 == 101L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) (short) 96);
        short short3 = bitField1.setShort((short) 1);
        byte byte5 = bitField1.setByte((byte) -1);
        int int8 = bitField1.setBoolean(20, true);
        long long11 = bitField1.setValue((long) 63, 1L);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 97 + "'", short3 == (short) 97);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 116 + "'", int8 == 116);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 63L + "'", long11 == 63L);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        long long9 = bitField1.set((long) (byte) 1);
        boolean boolean11 = bitField1.isSet(1L);
        boolean boolean13 = bitField1.isAllSet((long) 20);
        byte byte15 = bitField1.clearByte((byte) 1);
        short short17 = bitField1.getShortRawValue((short) (byte) 101);
        short short19 = bitField1.getShortValue((short) -2);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15 == (byte) 0);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 97 + "'", short17 == (short) 97);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 96 + "'", short19 == (short) 96);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        int int12 = bitField1.getRawValue((int) (short) -1);
        long long14 = bitField1.getValue((long) (short) 96);
        long long16 = bitField1.set((long) 96);
        int int18 = bitField1.getValue(4);
        short short20 = bitField1.getShortValue((short) 1);
        long long22 = bitField1.set((long) (byte) -98);
        boolean boolean24 = bitField1.isSet((long) (short) 96);
        short short26 = bitField1.clearShort((short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 96L + "'", long14 == 96L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 1 + "'", short20 == (short) 1);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 0 + "'", short26 == (short) 0);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) '4');
        short short3 = bitField1.getShortRawValue((short) 10);
        long long5 = bitField1.getRawValue((long) 20);
        long long7 = bitField1.set((-1L));
        java.lang.Class<?> wildcardClass8 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 20L + "'", long5 == 20L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short4 = bitField1.setShortBoolean((short) 96, true);
        short short6 = bitField1.getShortValue((short) 97);
        long long8 = bitField1.set(1L);
        int int10 = bitField1.set(0);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 97 + "'", short4 == (short) 97);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 97 + "'", short6 == (short) 97);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        long long13 = bitField1.setBoolean((long) ' ', false);
        boolean boolean15 = bitField1.isSet((long) 2);
        boolean boolean17 = bitField1.isAllSet((long) (byte) 10);
        java.lang.Class<?> wildcardClass18 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short4 = bitField1.setShortBoolean((short) 96, true);
        boolean boolean6 = bitField1.isAllSet((long) (short) 97);
        int int8 = bitField1.set((int) (short) 107);
        int int10 = bitField1.getRawValue(10);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 97 + "'", short4 == (short) 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 107 + "'", int8 == 107);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        long long13 = bitField1.setBoolean((long) ' ', false);
        boolean boolean15 = bitField1.isSet((long) 2);
        int int18 = bitField1.setValue(0, (int) (short) -1);
        short short20 = bitField1.clearShort((short) 0);
        int int23 = bitField1.setBoolean(116, true);
        java.lang.Class<?> wildcardClass24 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 117 + "'", int23 == 117);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        boolean boolean3 = bitField1.isAllSet((long) '4');
        int int5 = bitField1.getValue((int) (byte) 0);
        short short7 = bitField1.setShort((short) (byte) 0);
        short short9 = bitField1.getShortRawValue((short) (byte) 0);
        long long11 = bitField1.clear((long) (-1));
        byte byte13 = bitField1.setByte((byte) -1);
        int int15 = bitField1.getRawValue(97);
        long long17 = bitField1.getRawValue((long) 117);
        byte byte19 = bitField1.setByte((byte) 4);
        long long22 = bitField1.setValue((long) 117, (long) 97);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 97 + "'", short7 == (short) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-98L) + "'", long11 == (-98L));
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 101 + "'", byte19 == (byte) 101);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 117L + "'", long22 == 117L);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        boolean boolean3 = bitField1.isAllSet((long) '4');
        int int5 = bitField1.getValue((int) (byte) 0);
        short short7 = bitField1.setShort((short) 1);
        short short10 = bitField1.setShortBoolean((short) 16, true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 97 + "'", short7 == (short) 97);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 113 + "'", short10 == (short) 113);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        long long16 = bitField1.setValue((long) (-1), (long) (short) 97);
        short short19 = bitField1.setShortBoolean((short) 96, true);
        short short21 = bitField1.getShortValue((short) (byte) 0);
        short short23 = bitField1.getShortRawValue((short) -97);
        short short26 = bitField1.setShortValue((short) (byte) 10, (short) (byte) 1);
        long long28 = bitField1.clear(97L);
        int int31 = bitField1.setValue(117, 11);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 97 + "'", short19 == (short) 97);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 0 + "'", short21 == (short) 0);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 1 + "'", short23 == (short) 1);
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 11 + "'", short26 == (short) 11);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 21 + "'", int31 == 21);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        int int12 = bitField1.getRawValue((int) (short) -1);
        boolean boolean14 = bitField1.isSet((long) (-1));
        long long16 = bitField1.getRawValue((long) (byte) 97);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        short short5 = bitField1.getShortRawValue((short) 0);
        int int8 = bitField1.setValue(1, 96);
        long long10 = bitField1.getValue((long) 100);
        boolean boolean12 = bitField1.isAllSet((long) (short) 0);
        short short14 = bitField1.setShort((short) -2);
        int int17 = bitField1.setBoolean(69, false);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 96 + "'", int8 == 96);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 96L + "'", long10 == 96L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) -1 + "'", short14 == (short) -1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        long long13 = bitField1.setBoolean((long) ' ', false);
        boolean boolean15 = bitField1.isSet((long) 2);
        byte byte18 = bitField1.setByteBoolean((byte) 0, true);
        short short20 = bitField1.getShortValue((short) (byte) 0);
        short short22 = bitField1.clearShort((short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 97 + "'", byte18 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 0 + "'", short22 == (short) 0);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        int int15 = bitField1.clear(2);
        long long17 = bitField1.getRawValue((long) (short) 1);
        byte byte19 = bitField1.clearByte((byte) 1);
        int int21 = bitField1.getRawValue(0);
        int int23 = bitField1.set((int) 'a');
        byte byte26 = bitField1.setByteBoolean((byte) 111, true);
        int int29 = bitField1.setValue(2, (int) (short) 10);
        short short31 = bitField1.getShortValue((short) 16);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 111 + "'", byte26 == (byte) 111);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) 0 + "'", short31 == (short) 0);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        long long13 = bitField1.setBoolean((long) ' ', false);
        boolean boolean15 = bitField1.isSet((long) 2);
        byte byte18 = bitField1.setByteBoolean((byte) 0, true);
        short short20 = bitField1.getShortRawValue((short) -98);
        long long22 = bitField1.set(10L);
        long long24 = bitField1.clear((long) '#');
        java.lang.Class<?> wildcardClass25 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 97 + "'", byte18 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 107L + "'", long22 == 107L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 2L + "'", long24 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        long long13 = bitField1.setBoolean((long) ' ', false);
        boolean boolean15 = bitField1.isSet((long) 2);
        byte byte18 = bitField1.setByteBoolean((byte) 0, true);
        short short20 = bitField1.getShortRawValue((short) -98);
        long long22 = bitField1.set(10L);
        long long24 = bitField1.clear((long) '#');
        short short26 = bitField1.clearShort((short) 110);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 97 + "'", byte18 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 107L + "'", long22 == 107L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 2L + "'", long24 == 2L);
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 14 + "'", short26 == (short) 14);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        short short5 = bitField1.getShortRawValue((short) (byte) -1);
        byte byte8 = bitField1.setByteBoolean((byte) 97, false);
        long long11 = bitField1.setValue((long) 5, 10L);
        long long13 = bitField1.getValue(106L);
        java.lang.Class<?> wildcardClass14 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 97 + "'", short5 == (short) 97);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 4L + "'", long11 == 4L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 96L + "'", long13 == 96L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) 97);
        int int4 = bitField1.setValue(97, (int) (short) 97);
        boolean boolean6 = bitField1.isAllSet((int) (byte) 100);
        java.lang.Class<?> wildcardClass7 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        short short12 = bitField1.getShortRawValue((short) (byte) 10);
        short short14 = bitField1.getShortValue((short) 0);
        long long16 = bitField1.getRawValue(117L);
        boolean boolean18 = bitField1.isAllSet((long) (short) 97);
        int int20 = bitField1.getRawValue((int) (short) 11);
        boolean boolean22 = bitField1.isAllSet(48);
        long long24 = bitField1.set((long) (short) -97);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) 97);
        int int3 = bitField1.getRawValue(2);
        byte byte5 = bitField1.setByte((byte) 100);
        short short7 = bitField1.setShort((short) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 101 + "'", byte5 == (byte) 101);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 14);
        byte byte4 = bitField1.setByteBoolean((byte) 127, true);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 127 + "'", byte4 == (byte) 127);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) (short) 4);
        short short4 = bitField1.setShortValue((short) 107, (short) -98);
        boolean boolean6 = bitField1.isAllSet(20);
        byte byte8 = bitField1.clearByte((byte) -1);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 107 + "'", short4 == (short) 107);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -5 + "'", byte8 == (byte) -5);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short4 = bitField1.setShortBoolean((short) 96, true);
        int int6 = bitField1.getRawValue((int) (short) 100);
        byte byte8 = bitField1.clearByte((byte) 100);
        byte byte11 = bitField1.setByteBoolean((byte) 4, false);
        boolean boolean13 = bitField1.isAllSet(20);
        boolean boolean15 = bitField1.isSet((int) (byte) 0);
        short short18 = bitField1.setShortValue((short) 107, (short) (byte) 1);
        boolean boolean20 = bitField1.isSet((long) (-97));
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 97 + "'", short4 == (short) 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 96 + "'", int6 == 96);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 4 + "'", byte8 == (byte) 4);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 4 + "'", byte11 == (byte) 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 11 + "'", short18 == (short) 11);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        int int12 = bitField1.getRawValue((int) (short) -1);
        long long14 = bitField1.getValue((long) (short) 96);
        short short17 = bitField1.setShortBoolean((short) 0, false);
        byte byte20 = bitField1.setByteBoolean((byte) 1, false);
        short short22 = bitField1.setShort((short) 96);
        long long24 = bitField1.clear((long) (short) 26);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 96L + "'", long14 == 96L);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 0 + "'", byte20 == (byte) 0);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 97 + "'", short22 == (short) 97);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 26L + "'", long24 == 26L);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        long long16 = bitField1.setValue((long) (-1), (long) (short) 97);
        short short19 = bitField1.setShortBoolean((short) 96, true);
        short short22 = bitField1.setShortBoolean((short) 11, true);
        java.lang.Class<?> wildcardClass23 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 97 + "'", short19 == (short) 97);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 107 + "'", short22 == (short) 107);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        boolean boolean3 = bitField1.isAllSet((long) '4');
        int int5 = bitField1.getValue((int) (byte) 0);
        long long7 = bitField1.getRawValue((long) ' ');
        long long9 = bitField1.getRawValue((long) (byte) 1);
        boolean boolean11 = bitField1.isAllSet(99);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        long long13 = bitField1.setBoolean((long) ' ', false);
        boolean boolean15 = bitField1.isSet((long) 2);
        int int18 = bitField1.setValue(0, (int) (short) -1);
        short short20 = bitField1.clearShort((short) 0);
        long long22 = bitField1.getRawValue(1L);
        byte byte24 = bitField1.clearByte((byte) 100);
        short short26 = bitField1.getShortValue((short) (byte) -1);
        long long28 = bitField1.getValue((-102L));
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 4 + "'", byte24 == (byte) 4);
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 97 + "'", short26 == (short) 97);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        int int12 = bitField1.getRawValue((int) (short) -1);
        long long14 = bitField1.getValue((long) (short) 96);
        short short17 = bitField1.setShortBoolean((short) 0, false);
        boolean boolean19 = bitField1.isSet((long) (short) -1);
        int int21 = bitField1.getRawValue((int) (short) -1);
        short short24 = bitField1.setShortBoolean((short) -1, false);
        int int27 = bitField1.setBoolean((int) (byte) 100, false);
        byte byte29 = bitField1.clearByte((byte) 10);
        boolean boolean31 = bitField1.isSet((int) (short) 16);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 96L + "'", long14 == 96L);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) -98 + "'", short24 == (short) -98);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + byte29 + "' != '" + (byte) 10 + "'", byte29 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short10 = bitField1.setShortBoolean((short) -1, true);
        short short12 = bitField1.getShortRawValue((short) 101);
        int int14 = bitField1.set((-97));
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 97 + "'", short12 == (short) 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        long long13 = bitField1.setBoolean((long) ' ', false);
        boolean boolean15 = bitField1.isSet((long) 2);
        long long17 = bitField1.clear((long) (byte) 97);
        byte byte20 = bitField1.setByteBoolean((byte) 101, true);
        int int23 = bitField1.setBoolean(0, false);
        long long26 = bitField1.setBoolean((long) (short) 113, false);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 101 + "'", byte20 == (byte) 101);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 16L + "'", long26 == 16L);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        long long16 = bitField1.setValue((long) (-1), (long) (short) 97);
        long long19 = bitField1.setValue((-98L), (long) (short) -1);
        int int22 = bitField1.setBoolean(0, false);
        int int24 = bitField1.getRawValue((int) (short) 30);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        int int12 = bitField1.getRawValue((int) (short) -1);
        long long14 = bitField1.getValue((long) (short) 96);
        int int16 = bitField1.set(97);
        int int18 = bitField1.getValue((int) (short) -33);
        int int20 = bitField1.getValue((int) (short) -5);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 96L + "'", long14 == 96L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 65 + "'", int18 == 65);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        int int16 = bitField1.setValue((int) (byte) -1, (int) (short) 10);
        long long18 = bitField1.getValue((long) 2);
        long long20 = bitField1.getValue((long) 97);
        boolean boolean22 = bitField1.isAllSet(97L);
        long long25 = bitField1.setValue(97L, (long) (byte) 0);
        long long27 = bitField1.getRawValue((long) 65);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-98) + "'", int16 == (-98));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 65L + "'", long27 == 65L);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        int int12 = bitField1.getRawValue((int) (short) -1);
        long long14 = bitField1.getValue((long) (short) 96);
        short short17 = bitField1.setShortBoolean((short) 0, false);
        boolean boolean19 = bitField1.isSet((long) (short) -1);
        int int21 = bitField1.getRawValue((int) (short) -1);
        long long23 = bitField1.clear(0L);
        short short25 = bitField1.getShortRawValue((short) 0);
        long long28 = bitField1.setBoolean((long) (short) 10, false);
        boolean boolean30 = bitField1.isSet((-5));
        short short33 = bitField1.setShortBoolean((short) -33, true);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 96L + "'", long14 == 96L);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 0 + "'", short25 == (short) 0);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 10L + "'", long28 == 10L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + short33 + "' != '" + (short) -1 + "'", short33 == (short) -1);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        boolean boolean7 = bitField1.isSet(0L);
        int int9 = bitField1.set((int) ' ');
        long long12 = bitField1.setBoolean(16L, false);
        java.lang.Class<?> wildcardClass13 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 16L + "'", long12 == 16L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        long long16 = bitField1.setValue((long) (-1), (long) (short) 97);
        short short19 = bitField1.setShortBoolean((short) 96, true);
        short short21 = bitField1.getShortValue((short) (byte) 0);
        short short23 = bitField1.getShortRawValue((short) -97);
        short short26 = bitField1.setShortValue((short) (byte) 10, (short) (byte) 1);
        int int29 = bitField1.setBoolean((int) (byte) 26, true);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 97 + "'", short19 == (short) 97);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 0 + "'", short21 == (short) 0);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 1 + "'", short23 == (short) 1);
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 11 + "'", short26 == (short) 11);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 123 + "'", int29 == 123);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        long long13 = bitField1.setBoolean((long) ' ', false);
        boolean boolean15 = bitField1.isSet((long) 2);
        long long17 = bitField1.clear((long) (byte) 97);
        boolean boolean19 = bitField1.isAllSet(97);
        long long22 = bitField1.setBoolean(11L, true);
        int int25 = bitField1.setValue(116, (int) (short) -5);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 107L + "'", long22 == 107L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 117 + "'", int25 == 117);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) '4');
        int int4 = bitField1.setValue((int) (byte) -1, (int) (byte) 97);
        byte byte7 = bitField1.setByteBoolean((byte) 10, true);
        java.lang.Class<?> wildcardClass8 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-49) + "'", int4 == (-49));
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 62 + "'", byte7 == (byte) 62);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 30);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) 11);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        long long13 = bitField1.setBoolean((long) ' ', false);
        boolean boolean15 = bitField1.isSet((long) 2);
        byte byte18 = bitField1.setByteBoolean((byte) 0, true);
        short short20 = bitField1.getShortRawValue((short) -98);
        long long22 = bitField1.getValue((long) (byte) 4);
        short short24 = bitField1.getShortRawValue((short) 24);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 97 + "'", byte18 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 0 + "'", short24 == (short) 0);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        long long16 = bitField1.setValue((long) (-1), (long) (short) 97);
        long long19 = bitField1.setValue((-98L), (long) (short) -1);
        byte byte21 = bitField1.clearByte((byte) 30);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 30 + "'", byte21 == (byte) 30);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) 97);
        byte byte3 = bitField1.setByte((byte) 97);
        int int5 = bitField1.set((int) (short) 96);
        int int8 = bitField1.setValue(100, (int) (short) 14);
        int int10 = bitField1.getRawValue(5);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 97 + "'", byte3 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        short short5 = bitField1.getShortRawValue((short) 0);
        byte byte8 = bitField1.setByteBoolean((byte) -1, true);
        short short11 = bitField1.setShortBoolean((short) 107, true);
        short short13 = bitField1.getShortRawValue((short) (byte) 4);
        short short16 = bitField1.setShortBoolean((short) 1, false);
        short short18 = bitField1.setShort((short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 107 + "'", short11 == (short) 107);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 0 + "'", short13 == (short) 0);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 0 + "'", short16 == (short) 0);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 97 + "'", short18 == (short) 97);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        long long13 = bitField1.setBoolean((long) ' ', false);
        boolean boolean15 = bitField1.isSet((long) 2);
        int int18 = bitField1.setValue(0, (int) (short) -1);
        byte byte21 = bitField1.setByteBoolean((byte) 1, true);
        boolean boolean23 = bitField1.isAllSet((long) '#');
        java.lang.Class<?> wildcardClass24 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 97 + "'", byte21 == (byte) 97);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-1L));
        short short4 = bitField1.setShortValue((short) 10, (short) (byte) -1);
        byte byte6 = bitField1.setByte((byte) 30);
        short short9 = bitField1.setShortValue((short) (byte) -98, (short) (byte) 62);
        short short11 = bitField1.getShortRawValue((short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -1 + "'", short4 == (short) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 62 + "'", short9 == (short) 62);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        boolean boolean3 = bitField1.isAllSet((long) '4');
        int int5 = bitField1.getValue((int) (byte) 0);
        short short7 = bitField1.setShort((short) (byte) 30);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 127 + "'", short7 == (short) 127);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short4 = bitField1.setShortBoolean((short) 96, true);
        boolean boolean6 = bitField1.isAllSet((long) (short) 97);
        int int8 = bitField1.set((int) (short) 107);
        long long10 = bitField1.getRawValue((long) (byte) 5);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 97 + "'", short4 == (short) 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 107 + "'", int8 == 107);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.setByte((byte) 100);
        short short15 = bitField1.clearShort((short) (byte) 97);
        long long17 = bitField1.getRawValue((long) (short) 91);
        int int20 = bitField1.setValue((int) (short) -33, (int) (byte) -107);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 101 + "'", byte13 == (byte) 101);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 0 + "'", short15 == (short) 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 65L + "'", long17 == 65L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-97) + "'", int20 == (-97));
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        int int12 = bitField1.getRawValue((int) (short) -1);
        long long14 = bitField1.getValue((long) (short) 96);
        short short17 = bitField1.setShortBoolean((short) 0, false);
        boolean boolean19 = bitField1.isSet((long) (short) -1);
        int int21 = bitField1.getRawValue((int) (short) -1);
        long long23 = bitField1.clear(0L);
        byte byte25 = bitField1.clearByte((byte) 97);
        int int28 = bitField1.setBoolean((int) (short) 11, false);
        short short31 = bitField1.setShortValue((short) (byte) -107, (short) -33);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 96L + "'", long14 == 96L);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 0 + "'", byte25 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) -43 + "'", short31 == (short) -43);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        long long16 = bitField1.setValue((long) (-1), (long) (short) 97);
        short short19 = bitField1.setShortBoolean((short) 96, true);
        short short21 = bitField1.getShortValue((short) (byte) 0);
        byte byte23 = bitField1.clearByte((byte) -1);
        long long25 = bitField1.set((long) ' ');
        short short28 = bitField1.setShortValue((short) 107, (short) (byte) 1);
        long long31 = bitField1.setBoolean(0L, true);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 97 + "'", short19 == (short) 97);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 0 + "'", short21 == (short) 0);
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) -98 + "'", byte23 == (byte) -98);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 97L + "'", long25 == 97L);
        org.junit.Assert.assertTrue("'" + short28 + "' != '" + (short) 11 + "'", short28 == (short) 11);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 97L + "'", long31 == 97L);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) (short) 4);
        int int3 = bitField1.clear((int) (short) 4);
        int int5 = bitField1.set((int) (byte) 4);
        int int7 = bitField1.set((int) (short) -1);
        int int10 = bitField1.setValue((int) (short) 96, 16);
        boolean boolean12 = bitField1.isSet((long) (short) 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 96 + "'", int10 == 96);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(65);
        long long3 = bitField1.getRawValue(0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) 0);
        short short4 = bitField1.setShortBoolean((short) (byte) 4, false);
        int int6 = bitField1.getValue(117);
        int int9 = bitField1.setBoolean(107, false);
        int int11 = bitField1.set(96);
        java.lang.Class<?> wildcardClass12 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 4 + "'", short4 == (short) 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 107 + "'", int9 == 107);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 96 + "'", int11 == 96);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        long long8 = bitField1.setValue((long) ' ', (long) ' ');
        short short10 = bitField1.getShortValue((short) (byte) -1);
        int int12 = bitField1.set((int) (byte) 100);
        int int15 = bitField1.setValue(20, 99);
        int int17 = bitField1.getRawValue((int) (short) 0);
        short short19 = bitField1.setShort((short) (byte) -1);
        long long21 = bitField1.clear(121L);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 97 + "'", short10 == (short) 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 117 + "'", int15 == 117);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) -1 + "'", short19 == (short) -1);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 24L + "'", long21 == 24L);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 14);
        boolean boolean3 = bitField1.isAllSet(11);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        long long16 = bitField1.setValue((long) (-1), (long) (short) 97);
        short short19 = bitField1.setShortBoolean((short) 96, true);
        short short21 = bitField1.getShortRawValue((short) 97);
        int int24 = bitField1.setBoolean((int) '#', false);
        long long27 = bitField1.setBoolean(2L, true);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 97 + "'", short19 == (short) 97);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 97 + "'", short21 == (short) 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 99L + "'", long27 == 99L);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        long long8 = bitField1.setValue((long) ' ', (long) ' ');
        short short10 = bitField1.getShortValue((short) (byte) -1);
        byte byte13 = bitField1.setByteBoolean((byte) 5, true);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 97 + "'", short10 == (short) 97);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 101 + "'", byte13 == (byte) 101);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        int int12 = bitField1.getRawValue((int) (short) -1);
        long long14 = bitField1.getRawValue((long) ' ');
        int int16 = bitField1.getValue(96);
        int int18 = bitField1.set(1);
        byte byte20 = bitField1.clearByte((byte) 0);
        long long22 = bitField1.getValue((long) (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 96 + "'", int16 == 96);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 0 + "'", byte20 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        boolean boolean3 = bitField1.isAllSet((long) '4');
        int int5 = bitField1.getValue((int) (byte) 0);
        short short7 = bitField1.setShort((short) (byte) 0);
        short short9 = bitField1.getShortRawValue((short) (byte) 0);
        long long11 = bitField1.clear((long) (-1));
        int int13 = bitField1.getRawValue((int) (byte) 10);
        short short15 = bitField1.getShortRawValue((short) 107);
        long long18 = bitField1.setValue((long) (-102), 8L);
        byte byte21 = bitField1.setByteBoolean((byte) 107, false);
        long long24 = bitField1.setBoolean(0L, false);
        int int26 = bitField1.set(48);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 97 + "'", short7 == (short) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-98L) + "'", long11 == (-98L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 97 + "'", short15 == (short) 97);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-102L) + "'", long18 == (-102L));
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 10 + "'", byte21 == (byte) 10);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 113 + "'", int26 == 113);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        boolean boolean3 = bitField1.isAllSet((long) '4');
        int int5 = bitField1.getValue((int) (byte) 0);
        short short7 = bitField1.setShort((short) (byte) 0);
        short short9 = bitField1.getShortRawValue((short) (byte) 0);
        long long11 = bitField1.clear((long) (-1));
        byte byte13 = bitField1.setByte((byte) -1);
        int int15 = bitField1.getRawValue(97);
        long long17 = bitField1.clear(0L);
        short short20 = bitField1.setShortBoolean((short) 127, true);
        short short23 = bitField1.setShortValue((short) 16, (short) 96);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 97 + "'", short7 == (short) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-98L) + "'", long11 == (-98L));
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 127 + "'", short20 == (short) 127);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 112 + "'", short23 == (short) 112);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short4 = bitField1.setShortBoolean((short) 96, true);
        int int6 = bitField1.getRawValue((int) (short) 100);
        boolean boolean8 = bitField1.isAllSet((int) (short) -97);
        byte byte10 = bitField1.setByte((byte) 4);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 97 + "'", short4 == (short) 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 96 + "'", int6 == 96);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 101 + "'", byte10 == (byte) 101);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short4 = bitField1.setShortBoolean((short) 96, true);
        int int6 = bitField1.getRawValue((int) (short) 100);
        int int8 = bitField1.getValue((int) (short) -98);
        short short10 = bitField1.setShort((short) 15);
        short short12 = bitField1.getShortValue((short) 75);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 97 + "'", short4 == (short) 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 96 + "'", int6 == 96);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 111 + "'", short10 == (short) 111);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 65 + "'", short12 == (short) 65);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) (short) 96);
        short short3 = bitField1.setShort((short) 1);
        byte byte5 = bitField1.setByte((byte) -1);
        int int7 = bitField1.clear(97);
        long long9 = bitField1.getValue(14L);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 97 + "'", short3 == (short) 97);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 100);
        long long3 = bitField1.clear((long) (short) 101);
        int int5 = bitField1.set(96);
        boolean boolean7 = bitField1.isSet((long) (short) 96);
        short short9 = bitField1.getShortRawValue((short) (byte) 14);
        long long11 = bitField1.getRawValue((long) (short) 101);
        long long14 = bitField1.setBoolean((long) 30, false);
        byte byte16 = bitField1.clearByte((byte) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 4 + "'", short9 == (short) 4);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 26L + "'", long14 == 26L);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 0 + "'", byte16 == (byte) 0);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        int int12 = bitField1.getRawValue((int) (short) -1);
        java.lang.Class<?> wildcardClass13 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        int int15 = bitField1.clear(2);
        byte byte17 = bitField1.clearByte((byte) 1);
        long long19 = bitField1.set((long) (byte) 101);
        boolean boolean21 = bitField1.isAllSet(101);
        short short23 = bitField1.clearShort((short) (byte) -98);
        short short26 = bitField1.setShortValue((short) (byte) 30, (short) 65);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 101L + "'", long19 == 101L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) -98 + "'", short23 == (short) -98);
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 95 + "'", short26 == (short) 95);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short10 = bitField1.setShortBoolean((short) -1, true);
        long long12 = bitField1.getValue(20L);
        long long15 = bitField1.setBoolean((long) 2, false);
        int int18 = bitField1.setValue((int) (short) 100, (int) (short) 107);
        int int21 = bitField1.setValue(65, (int) (short) -1);
        long long23 = bitField1.set((long) (short) 113);
        java.lang.Class<?> wildcardClass24 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2L + "'", long15 == 2L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 113L + "'", long23 == 113L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        long long9 = bitField1.set((long) (byte) 1);
        int int11 = bitField1.set((int) '4');
        byte byte14 = bitField1.setByteBoolean((byte) 14, true);
        int int17 = bitField1.setValue(14, (-98));
        int int19 = bitField1.set((int) (short) 111);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 117 + "'", int11 == 117);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 111 + "'", byte14 == (byte) 111);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 14 + "'", int17 == 14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 111 + "'", int19 == 111);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short4 = bitField1.setShortBoolean((short) 96, true);
        int int6 = bitField1.getRawValue((int) (short) 100);
        boolean boolean8 = bitField1.isAllSet((int) (short) -97);
        int int10 = bitField1.getValue((int) (short) 97);
        byte byte13 = bitField1.setByteBoolean((byte) -98, false);
        long long15 = bitField1.clear((long) 48);
        byte byte17 = bitField1.clearByte((byte) 107);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 97 + "'", short4 == (short) 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 96 + "'", int6 == 96);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -98 + "'", byte13 == (byte) -98);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 16L + "'", long15 == 16L);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 10 + "'", byte17 == (byte) 10);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) -1);
        java.lang.Class<?> wildcardClass2 = bitField1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        boolean boolean7 = bitField1.isSet(0L);
        int int9 = bitField1.set((int) ' ');
        short short11 = bitField1.getShortValue((short) 4);
        short short13 = bitField1.setShort((short) 101);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 101 + "'", short13 == (short) 101);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        long long13 = bitField1.setBoolean((long) ' ', false);
        long long16 = bitField1.setValue((long) (-98), (long) (byte) 0);
        byte byte18 = bitField1.clearByte((byte) 107);
        long long20 = bitField1.set(0L);
        byte byte22 = bitField1.clearByte((byte) 4);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-98L) + "'", long16 == (-98L));
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 10 + "'", byte18 == (byte) 10);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 4 + "'", byte22 == (byte) 4);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        byte byte6 = bitField1.setByteBoolean((byte) 10, false);
        long long8 = bitField1.getValue((long) 20);
        long long11 = bitField1.setValue(110L, 2L);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 14L + "'", long11 == 14L);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) (short) 4);
        short short4 = bitField1.setShortValue((short) 107, (short) -98);
        boolean boolean6 = bitField1.isAllSet(20);
        byte byte9 = bitField1.setByteBoolean((byte) 101, true);
        int int11 = bitField1.getValue(117);
        long long13 = bitField1.set((long) (short) -97);
        long long16 = bitField1.setBoolean(123L, true);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 107 + "'", short4 == (short) 107);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 101 + "'", byte9 == (byte) 101);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-97L) + "'", long13 == (-97L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 127L + "'", long16 == 127L);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) (short) 32);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        int int16 = bitField1.setValue((int) (byte) -1, (int) (short) 10);
        long long18 = bitField1.getValue((long) 2);
        long long20 = bitField1.getValue((long) 97);
        boolean boolean22 = bitField1.isAllSet(97L);
        int int24 = bitField1.clear(107);
        short short26 = bitField1.getShortRawValue((short) 10);
        boolean boolean28 = bitField1.isSet(30L);
        boolean boolean30 = bitField1.isSet((long) (short) 123);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-98) + "'", int16 == (-98));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 0 + "'", short26 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        long long16 = bitField1.setValue((long) (-1), (long) (short) 97);
        byte byte18 = bitField1.setByte((byte) 4);
        long long20 = bitField1.clear((long) (short) -98);
        long long22 = bitField1.clear((long) 63);
        boolean boolean24 = bitField1.isAllSet((long) (short) 4);
        long long26 = bitField1.getRawValue(69L);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 101 + "'", byte18 == (byte) 101);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-98L) + "'", long20 == (-98L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 30L + "'", long22 == 30L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 65L + "'", long26 == 65L);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        short short12 = bitField1.getShortRawValue((short) (byte) 10);
        byte byte15 = bitField1.setByteBoolean((byte) 0, true);
        long long17 = bitField1.getValue((long) (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 97 + "'", byte15 == (byte) 97);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(62L);
        boolean boolean3 = bitField1.isSet(122);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        long long16 = bitField1.setValue((long) (-1), (long) (short) 97);
        short short19 = bitField1.setShortBoolean((short) 96, true);
        short short22 = bitField1.setShortBoolean((short) 11, true);
        long long24 = bitField1.getRawValue(20L);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 97 + "'", short19 == (short) 97);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 107 + "'", short22 == (short) 107);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(32L);
        long long3 = bitField1.set((long) 127);
        boolean boolean5 = bitField1.isAllSet((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 127L + "'", long3 == 127L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        int int15 = bitField1.clear(2);
        byte byte17 = bitField1.clearByte((byte) 111);
        int int20 = bitField1.setBoolean((int) (byte) 4, false);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 14 + "'", byte17 == (byte) 14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-1L));
        short short4 = bitField1.setShortValue((short) 10, (short) (byte) -1);
        short short6 = bitField1.setShort((short) (byte) 4);
        java.lang.Class<?> wildcardClass7 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -1 + "'", short4 == (short) -1);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        int int5 = bitField1.getRawValue(0);
        byte byte7 = bitField1.clearByte((byte) 0);
        long long10 = bitField1.setBoolean((long) (byte) 0, true);
        long long12 = bitField1.set((long) (short) 91);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 123L + "'", long12 == 123L);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short10 = bitField1.setShortBoolean((short) -1, true);
        long long12 = bitField1.getValue(20L);
        long long15 = bitField1.setBoolean((long) 2, false);
        int int18 = bitField1.setValue((int) (short) 100, (int) (short) 107);
        long long20 = bitField1.set((long) 'a');
        boolean boolean22 = bitField1.isAllSet((long) (short) 1);
        boolean boolean24 = bitField1.isSet(123);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2L + "'", long15 == 2L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-1L));
        short short4 = bitField1.setShortValue((short) 10, (short) (byte) -1);
        short short6 = bitField1.clearShort((short) (byte) -96);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -1 + "'", short4 == (short) -1);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) 106);
        short short3 = bitField1.getShortRawValue((short) -98);
        long long5 = bitField1.getRawValue((long) 117);
        short short8 = bitField1.setShortValue((short) (byte) -1, (short) (byte) 101);
        boolean boolean10 = bitField1.isSet((int) (byte) 10);
        int int12 = bitField1.set(113);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 96L + "'", long5 == 96L);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -33 + "'", short8 == (short) -33);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 123 + "'", int12 == 123);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        int int12 = bitField1.set(106);
        long long14 = bitField1.getRawValue((long) 107);
        boolean boolean16 = bitField1.isSet((long) (byte) 30);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        int int12 = bitField1.getRawValue((int) (short) -1);
        long long14 = bitField1.getValue((long) (short) 96);
        short short17 = bitField1.setShortBoolean((short) 0, false);
        boolean boolean19 = bitField1.isSet((long) (short) -1);
        int int21 = bitField1.getRawValue((int) (short) -1);
        short short24 = bitField1.setShortBoolean((short) -1, false);
        int int27 = bitField1.setBoolean((int) (byte) 100, false);
        long long29 = bitField1.getRawValue((long) (byte) 101);
        short short31 = bitField1.setShort((short) 16);
        byte byte33 = bitField1.clearByte((byte) 5);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 96L + "'", long14 == 96L);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) -98 + "'", short24 == (short) -98);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 97L + "'", long29 == 97L);
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) 113 + "'", short31 == (short) 113);
        org.junit.Assert.assertTrue("'" + byte33 + "' != '" + (byte) 4 + "'", byte33 == (byte) 4);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) 97);
        byte byte3 = bitField1.setByte((byte) 97);
        byte byte5 = bitField1.setByte((byte) 10);
        long long8 = bitField1.setBoolean((long) (byte) 107, false);
        short short11 = bitField1.setShortValue((short) 107, (short) -98);
        long long13 = bitField1.clear((long) (byte) -98);
        byte byte16 = bitField1.setByteBoolean((byte) 26, true);
        long long18 = bitField1.getRawValue((long) (byte) 111);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 97 + "'", byte3 == (byte) 97);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 107 + "'", byte5 == (byte) 107);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-98L) + "'", long13 == (-98L));
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 123 + "'", byte16 == (byte) 123);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 97L + "'", long18 == 97L);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        int int15 = bitField1.clear(2);
        long long17 = bitField1.getRawValue((long) (short) 1);
        long long19 = bitField1.set(0L);
        int int21 = bitField1.set((int) (byte) 4);
        long long23 = bitField1.set((long) 32);
        long long25 = bitField1.getValue((-97L));
        byte byte28 = bitField1.setByteBoolean((byte) -5, true);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 97L + "'", long19 == 97L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 101 + "'", int21 == 101);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 97L + "'", long23 == 97L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertTrue("'" + byte28 + "' != '" + (byte) -5 + "'", byte28 == (byte) -5);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short4 = bitField1.setShortBoolean((short) 96, true);
        short short6 = bitField1.getShortRawValue((short) 97);
        int int9 = bitField1.setBoolean((int) (byte) 97, true);
        boolean boolean11 = bitField1.isAllSet(0L);
        long long14 = bitField1.setValue(20L, (long) 'a');
        long long17 = bitField1.setBoolean(100L, true);
        short short19 = bitField1.getShortRawValue((short) 100);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 97 + "'", short4 == (short) 97);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 97 + "'", short6 == (short) 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 117L + "'", long14 == 117L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 101L + "'", long17 == 101L);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 96 + "'", short19 == (short) 96);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-49));
        java.lang.Class<?> wildcardClass2 = bitField1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 100);
        long long3 = bitField1.clear((long) (short) 101);
        int int5 = bitField1.set(96);
        boolean boolean7 = bitField1.isSet((long) (short) 96);
        short short9 = bitField1.getShortRawValue((short) (byte) 14);
        long long11 = bitField1.getRawValue((long) (short) 101);
        short short14 = bitField1.setShortValue((short) (byte) 100, (short) (byte) 30);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 4 + "'", short9 == (short) 4);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 96 + "'", short14 == (short) 96);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        short short5 = bitField1.getShortRawValue((short) 0);
        int int8 = bitField1.setValue(1, 96);
        long long10 = bitField1.getValue((long) 100);
        short short13 = bitField1.setShortBoolean((short) 0, true);
        long long16 = bitField1.setValue((long) (-1), 8L);
        int int18 = bitField1.getValue((int) (short) 1);
        int int20 = bitField1.set((int) (short) 110);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 96 + "'", int8 == 96);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 96L + "'", long10 == 96L);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 97 + "'", short13 == (short) 97);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-98L) + "'", long16 == (-98L));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 111 + "'", int20 == 111);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) 106);
        short short3 = bitField1.getShortRawValue((short) -98);
        boolean boolean5 = bitField1.isSet((int) (short) 1);
        short short7 = bitField1.getShortValue((short) (byte) 97);
        int int9 = bitField1.getRawValue((int) (short) 75);
        byte byte11 = bitField1.setByte((byte) 32);
        short short13 = bitField1.getShortValue((short) 48);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 48 + "'", short7 == (short) 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 106 + "'", byte11 == (byte) 106);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 16 + "'", short13 == (short) 16);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        int int12 = bitField1.getRawValue((int) (short) -1);
        long long14 = bitField1.getValue((long) (short) 96);
        short short17 = bitField1.setShortBoolean((short) 0, false);
        boolean boolean19 = bitField1.isSet((long) (short) -1);
        int int21 = bitField1.getRawValue((int) (short) -1);
        short short24 = bitField1.setShortBoolean((short) -1, false);
        int int27 = bitField1.setBoolean((int) (byte) 100, false);
        byte byte29 = bitField1.clearByte((byte) 10);
        java.lang.Class<?> wildcardClass30 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 96L + "'", long14 == 96L);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) -98 + "'", short24 == (short) -98);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + byte29 + "' != '" + (byte) 10 + "'", byte29 == (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short4 = bitField1.setShortBoolean((short) 96, true);
        int int6 = bitField1.getRawValue((int) (short) 100);
        byte byte8 = bitField1.clearByte((byte) 100);
        byte byte11 = bitField1.setByteBoolean((byte) 4, false);
        boolean boolean13 = bitField1.isAllSet(20);
        long long15 = bitField1.getRawValue((long) 97);
        short short17 = bitField1.getShortRawValue((short) (byte) -1);
        short short20 = bitField1.setShortValue((short) (byte) 26, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 97 + "'", short4 == (short) 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 96 + "'", int6 == 96);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 4 + "'", byte8 == (byte) 4);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 4 + "'", byte11 == (byte) 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 97 + "'", short17 == (short) 97);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 122 + "'", short20 == (short) 122);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.setByte((byte) 100);
        short short15 = bitField1.clearShort((short) (byte) 97);
        long long17 = bitField1.getRawValue((long) (short) 91);
        long long19 = bitField1.getValue((long) (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 101 + "'", byte13 == (byte) 101);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 0 + "'", short15 == (short) 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 65L + "'", long17 == 65L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 96L + "'", long19 == 96L);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        int int12 = bitField1.getRawValue((int) (short) -1);
        long long14 = bitField1.getValue((long) (short) 96);
        short short17 = bitField1.setShortBoolean((short) 0, false);
        boolean boolean19 = bitField1.isSet((long) (short) -1);
        int int21 = bitField1.getRawValue((int) (short) -1);
        byte byte24 = bitField1.setByteBoolean((byte) 0, false);
        short short26 = bitField1.getShortValue((short) (byte) 101);
        short short28 = bitField1.setShort((short) (byte) -107);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 96L + "'", long14 == 96L);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 0 + "'", byte24 == (byte) 0);
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 97 + "'", short26 == (short) 97);
        org.junit.Assert.assertTrue("'" + short28 + "' != '" + (short) -11 + "'", short28 == (short) -11);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        short short5 = bitField1.getShortRawValue((short) (byte) -1);
        long long8 = bitField1.setValue((long) 43, 117L);
        int int11 = bitField1.setValue((int) (short) 100, (int) (short) 4);
        int int13 = bitField1.getRawValue(48);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 97 + "'", short5 == (short) 97);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 107L + "'", long8 == 107L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        int int5 = bitField1.getRawValue(0);
        byte byte7 = bitField1.clearByte((byte) 0);
        boolean boolean9 = bitField1.isAllSet((long) (short) 48);
        int int11 = bitField1.getRawValue((int) (short) 10);
        byte byte13 = bitField1.setByte((byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 97 + "'", byte13 == (byte) 97);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) ' ');
        long long3 = bitField1.set((long) 30);
        int int6 = bitField1.setValue((-15), (int) (short) 91);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 62L + "'", long3 == 62L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-15) + "'", int6 == (-15));
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short4 = bitField1.setShortBoolean((short) 96, true);
        short short7 = bitField1.setShortValue((short) 100, (short) (byte) -1);
        long long9 = bitField1.getRawValue(2L);
        long long12 = bitField1.setValue(116L, (long) 96);
        byte byte14 = bitField1.clearByte((byte) 127);
        short short16 = bitField1.clearShort((short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 97 + "'", short4 == (short) 97);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 101 + "'", short7 == (short) 101);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 116L + "'", long12 == 116L);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 30 + "'", byte14 == (byte) 30);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 0 + "'", short16 == (short) 0);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        long long16 = bitField1.setValue((long) (-1), (long) (short) 97);
        short short19 = bitField1.setShortBoolean((short) 96, true);
        short short21 = bitField1.getShortValue((short) (byte) 0);
        byte byte23 = bitField1.clearByte((byte) -1);
        byte byte25 = bitField1.clearByte((byte) 62);
        long long27 = bitField1.set((long) 2);
        long long29 = bitField1.getRawValue((long) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 97 + "'", short19 == (short) 97);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 0 + "'", short21 == (short) 0);
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) -98 + "'", byte23 == (byte) -98);
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 30 + "'", byte25 == (byte) 30);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 99L + "'", long27 == 99L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) 97);
        byte byte3 = bitField1.setByte((byte) 97);
        byte byte5 = bitField1.setByte((byte) 10);
        long long8 = bitField1.setBoolean((long) (byte) 107, false);
        int int10 = bitField1.getValue(33);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 97 + "'", byte3 == (byte) 97);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 107 + "'", byte5 == (byte) 107);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 33 + "'", int10 == 33);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        boolean boolean3 = bitField1.isAllSet((long) '4');
        int int5 = bitField1.getValue((int) (byte) 0);
        short short7 = bitField1.setShort((short) (byte) 0);
        short short9 = bitField1.getShortRawValue((short) (byte) 0);
        long long11 = bitField1.clear((long) (-1));
        java.lang.Class<?> wildcardClass12 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 97 + "'", short7 == (short) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-98L) + "'", long11 == (-98L));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-1L));
        short short4 = bitField1.setShortValue((short) 10, (short) (byte) -1);
        byte byte6 = bitField1.setByte((byte) 30);
        int int8 = bitField1.clear((int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -1 + "'", short4 == (short) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(106);
        byte byte3 = bitField1.clearByte((byte) 97);
        byte byte5 = bitField1.clearByte((byte) 101);
        java.lang.Class<?> wildcardClass6 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 5 + "'", byte5 == (byte) 5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) '4');
        short short3 = bitField1.getShortRawValue((short) 10);
        long long5 = bitField1.getRawValue((long) 20);
        long long7 = bitField1.set((-1L));
        int int9 = bitField1.getValue(32);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 20L + "'", long5 == 20L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        boolean boolean3 = bitField1.isAllSet((long) '4');
        int int5 = bitField1.getValue((int) (byte) 0);
        long long7 = bitField1.set((long) (short) 96);
        int int9 = bitField1.getValue(5);
        long long12 = bitField1.setValue((long) (byte) 97, (long) 69);
        boolean boolean14 = bitField1.isAllSet((long) (short) 30);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 65L + "'", long12 == 65L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short4 = bitField1.setShortBoolean((short) 96, true);
        int int6 = bitField1.getRawValue((int) (short) 100);
        long long8 = bitField1.set(117L);
        int int10 = bitField1.getRawValue(107);
        int int12 = bitField1.clear((int) (short) -98);
        short short14 = bitField1.clearShort((short) (byte) 4);
        long long17 = bitField1.setValue(0L, (long) (short) 123);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 97 + "'", short4 == (short) 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 96 + "'", int6 == 96);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 117L + "'", long8 == 117L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-98) + "'", int12 == (-98));
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 4 + "'", short14 == (short) 4);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        long long9 = bitField1.set((long) (byte) 1);
        int int11 = bitField1.set((int) '4');
        short short14 = bitField1.setShortBoolean((short) -98, false);
        int int17 = bitField1.setBoolean((int) (byte) 10, true);
        long long20 = bitField1.setValue((long) (short) 96, (long) (short) 123);
        boolean boolean22 = bitField1.isAllSet((int) '#');
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 117 + "'", int11 == 117);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) -98 + "'", short14 == (short) -98);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 107 + "'", int17 == 107);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 97);
        long long3 = bitField1.clear(0L);
        int int5 = bitField1.getValue((int) (short) 107);
        short short7 = bitField1.clearShort((short) (byte) -98);
        int int9 = bitField1.set((int) (short) 16);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -98 + "'", short7 == (short) -98);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 113 + "'", int9 == 113);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        int int13 = bitField1.set((int) (byte) 10);
        long long15 = bitField1.clear((long) 20);
        boolean boolean17 = bitField1.isSet(110L);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 107 + "'", int13 == 107);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 20L + "'", long15 == 20L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        boolean boolean3 = bitField1.isAllSet((long) '4');
        int int5 = bitField1.getValue((int) (byte) 0);
        short short7 = bitField1.setShort((short) (byte) 0);
        short short9 = bitField1.getShortRawValue((short) (byte) 0);
        long long11 = bitField1.clear((long) (-1));
        byte byte13 = bitField1.setByte((byte) -1);
        int int15 = bitField1.getRawValue(97);
        long long17 = bitField1.getRawValue((long) 117);
        long long19 = bitField1.getRawValue((long) (short) -33);
        int int22 = bitField1.setValue((int) (byte) 127, (int) '#');
        int int25 = bitField1.setValue(63, (-5));
        java.lang.Class<?> wildcardClass26 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 97 + "'", short7 == (short) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-98L) + "'", long11 == (-98L));
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 65L + "'", long19 == 65L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 63 + "'", int22 == 63);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 127 + "'", int25 == 127);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short4 = bitField1.setShortBoolean((short) 96, true);
        short short7 = bitField1.setShortValue((short) 100, (short) (byte) -1);
        long long9 = bitField1.getRawValue(2L);
        short short11 = bitField1.getShortValue((short) 1);
        long long13 = bitField1.getRawValue((long) 33);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 97 + "'", short4 == (short) 97);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 101 + "'", short7 == (short) 101);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 1 + "'", short11 == (short) 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 33L + "'", long13 == 33L);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) (short) 4);
        byte byte4 = bitField1.setByteBoolean((byte) 107, true);
        short short6 = bitField1.setShort((short) -98);
        java.lang.Class<?> wildcardClass7 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 111 + "'", byte4 == (byte) 111);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -98 + "'", short6 == (short) -98);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        boolean boolean3 = bitField1.isAllSet((long) '4');
        int int5 = bitField1.getValue((int) (byte) 0);
        short short7 = bitField1.setShort((short) (byte) 0);
        short short9 = bitField1.getShortRawValue((short) (byte) 0);
        long long11 = bitField1.clear((long) (-1));
        byte byte13 = bitField1.setByte((byte) -1);
        int int15 = bitField1.getRawValue(97);
        long long17 = bitField1.getRawValue((long) 117);
        byte byte19 = bitField1.setByte((byte) 4);
        int int21 = bitField1.getRawValue((-97));
        int int23 = bitField1.getRawValue((int) (byte) 127);
        boolean boolean25 = bitField1.isAllSet(0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 97 + "'", short7 == (short) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-98L) + "'", long11 == (-98L));
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 101 + "'", byte19 == (byte) 101);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        int int16 = bitField1.setValue((int) (byte) -1, (int) (short) 10);
        boolean boolean18 = bitField1.isAllSet((-49));
        short short20 = bitField1.getShortValue((short) (byte) 97);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-98) + "'", int16 == (-98));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 97 + "'", short20 == (short) 97);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        long long16 = bitField1.setValue((long) (-1), (long) (short) 97);
        long long19 = bitField1.setValue((-98L), (long) (short) -1);
        boolean boolean21 = bitField1.isSet(117L);
        int int24 = bitField1.setValue(126, (int) (short) 4);
        int int26 = bitField1.set(99);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 30 + "'", int24 == 30);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 99 + "'", int26 == 99);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short10 = bitField1.setShortBoolean((short) -1, true);
        long long13 = bitField1.setBoolean((long) (short) 10, true);
        long long15 = bitField1.clear((long) (short) -97);
        int int17 = bitField1.clear((int) (byte) 107);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 107L + "'", long13 == 107L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-98L) + "'", long15 == (-98L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        long long4 = bitField1.setValue((long) (byte) 10, 4L);
        short short7 = bitField1.setShortBoolean((short) (byte) 30, true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 127 + "'", short7 == (short) 127);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        int int16 = bitField1.setValue((int) (byte) -1, (int) (short) 10);
        long long18 = bitField1.getValue((long) 2);
        long long20 = bitField1.getValue((long) 97);
        boolean boolean22 = bitField1.isAllSet(97L);
        long long25 = bitField1.setValue(97L, (long) (byte) 0);
        int int27 = bitField1.clear(74);
        long long29 = bitField1.getValue((long) (-49));
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-98) + "'", int16 == (-98));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 65L + "'", long29 == 65L);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short10 = bitField1.setShortBoolean((short) -1, true);
        byte byte13 = bitField1.setByteBoolean((byte) 4, true);
        long long16 = bitField1.setValue(127L, 99L);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 101 + "'", byte13 == (byte) 101);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 127L + "'", long16 == 127L);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        int int13 = bitField1.set((int) (byte) 10);
        boolean boolean15 = bitField1.isAllSet(0);
        short short17 = bitField1.getShortValue((short) (byte) 0);
        long long20 = bitField1.setValue(0L, (long) (short) 26);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 107 + "'", int13 == 107);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        boolean boolean3 = bitField1.isAllSet((long) '4');
        int int5 = bitField1.getValue((int) (byte) 0);
        short short7 = bitField1.setShort((short) 1);
        int int10 = bitField1.setBoolean((int) (byte) 0, true);
        short short12 = bitField1.clearShort((short) (byte) 10);
        int int14 = bitField1.getValue((int) (short) -97);
        int int17 = bitField1.setBoolean((int) (short) -7, true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 97 + "'", short7 == (short) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 10 + "'", short12 == (short) 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-7) + "'", int17 == (-7));
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 14);
        short short3 = bitField1.getShortValue((short) 107);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 5 + "'", short3 == (short) 5);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        long long16 = bitField1.setValue((long) (-1), (long) (short) 97);
        short short19 = bitField1.setShortBoolean((short) 96, true);
        short short21 = bitField1.getShortValue((short) (byte) 0);
        short short23 = bitField1.getShortRawValue((short) -97);
        boolean boolean25 = bitField1.isAllSet(65L);
        long long27 = bitField1.getValue((long) 30);
        short short30 = bitField1.setShortBoolean((short) 14, false);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 97 + "'", short19 == (short) 97);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 0 + "'", short21 == (short) 0);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 1 + "'", short23 == (short) 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + short30 + "' != '" + (short) 14 + "'", short30 == (short) 14);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        int int16 = bitField1.setValue(4, (int) (byte) 1);
        short short19 = bitField1.setShortBoolean((short) 100, true);
        java.lang.Class<?> wildcardClass20 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 101 + "'", short19 == (short) 101);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        long long13 = bitField1.setBoolean((long) ' ', false);
        boolean boolean15 = bitField1.isSet((long) 2);
        byte byte18 = bitField1.setByteBoolean((byte) 0, true);
        boolean boolean20 = bitField1.isSet(100);
        short short23 = bitField1.setShortValue((short) (byte) -1, (short) 1);
        short short25 = bitField1.getShortRawValue((short) (byte) 107);
        long long28 = bitField1.setValue((-6L), (long) (short) 4);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 97 + "'", byte18 == (byte) 97);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) -97 + "'", short23 == (short) -97);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 97 + "'", short25 == (short) 97);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-102L) + "'", long28 == (-102L));
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        boolean boolean3 = bitField1.isAllSet((long) '4');
        int int5 = bitField1.set(1);
        boolean boolean7 = bitField1.isSet((int) (byte) 100);
        int int10 = bitField1.setValue(0, (int) (short) 10);
        short short13 = bitField1.setShortBoolean((short) (byte) 107, true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 107 + "'", short13 == (short) 107);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) 97);
        int int3 = bitField1.clear(1);
        short short5 = bitField1.getShortValue((short) 10);
        int int7 = bitField1.set((-112));
        boolean boolean9 = bitField1.isAllSet((int) (byte) 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-15) + "'", int7 == (-15));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) (short) 4);
        int int3 = bitField1.clear((int) (short) 4);
        int int5 = bitField1.set((int) (byte) 4);
        int int7 = bitField1.set((int) (short) -1);
        int int10 = bitField1.setValue((int) (short) 96, 16);
        long long13 = bitField1.setBoolean((long) 116, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 96 + "'", int10 == 96);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 116L + "'", long13 == 116L);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) 97);
        int int4 = bitField1.setValue(97, (int) (short) 97);
        boolean boolean6 = bitField1.isAllSet((int) (byte) 100);
        int int8 = bitField1.set(33);
        long long10 = bitField1.getRawValue((long) 116);
        java.lang.Class<?> wildcardClass11 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 96L + "'", long10 == 96L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short4 = bitField1.setShortBoolean((short) 96, true);
        short short6 = bitField1.getShortValue((short) 97);
        int int9 = bitField1.setValue(116, (-108));
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 97 + "'", short4 == (short) 97);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 97 + "'", short6 == (short) 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.clearShort((short) -1);
        long long6 = bitField1.setValue((long) (short) 91, (long) (byte) -5);
        byte byte9 = bitField1.setByteBoolean((byte) 101, false);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -98 + "'", short3 == (short) -98);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 123L + "'", long6 == 123L);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 4 + "'", byte9 == (byte) 4);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        long long13 = bitField1.setBoolean((long) ' ', false);
        boolean boolean15 = bitField1.isSet((long) 2);
        long long17 = bitField1.clear((long) (byte) 97);
        boolean boolean19 = bitField1.isAllSet(97);
        long long22 = bitField1.setBoolean(11L, true);
        int int25 = bitField1.setBoolean(48, true);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 107L + "'", long22 == 107L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 113 + "'", int25 == 113);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        int int16 = bitField1.setValue((int) (byte) -1, (int) (short) 10);
        long long18 = bitField1.getValue((long) 2);
        long long20 = bitField1.getValue((long) 97);
        long long23 = bitField1.setValue((long) (byte) 1, (long) 107);
        int int25 = bitField1.getRawValue((int) (byte) -1);
        int int28 = bitField1.setValue(106, (int) (byte) 97);
        byte byte31 = bitField1.setByteBoolean((byte) 107, true);
        long long33 = bitField1.set(32L);
        long long36 = bitField1.setValue((long) 65, (long) (-43));
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-98) + "'", int16 == (-98));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 97L + "'", long23 == 97L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 107 + "'", int28 == 107);
        org.junit.Assert.assertTrue("'" + byte31 + "' != '" + (byte) 107 + "'", byte31 == (byte) 107);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 97L + "'", long33 == 97L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 65L + "'", long36 == 65L);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short10 = bitField1.setShortBoolean((short) -1, true);
        long long13 = bitField1.setBoolean(1L, true);
        short short15 = bitField1.getShortRawValue((short) (byte) 100);
        int int17 = bitField1.clear((int) (short) 14);
        short short20 = bitField1.setShortBoolean((short) 96, true);
        int int22 = bitField1.clear((-7));
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 96 + "'", short15 == (short) 96);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 14 + "'", int17 == 14);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 97 + "'", short20 == (short) 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-104) + "'", int22 == (-104));
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        long long13 = bitField1.setBoolean((long) ' ', false);
        boolean boolean15 = bitField1.isSet((long) 2);
        long long17 = bitField1.clear((long) (byte) 97);
        boolean boolean19 = bitField1.isAllSet(97);
        int int22 = bitField1.setValue(20, 97);
        int int25 = bitField1.setBoolean((int) (byte) -98, false);
        long long27 = bitField1.getValue((long) (short) 101);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 117 + "'", int22 == 117);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-98) + "'", int25 == (-98));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 97L + "'", long27 == 97L);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) '4');
        int int4 = bitField1.setValue((int) (byte) -1, (int) (byte) 97);
        java.lang.Class<?> wildcardClass5 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-49) + "'", int4 == (-49));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        boolean boolean3 = bitField1.isAllSet((long) '4');
        int int5 = bitField1.getValue((int) (byte) 0);
        long long7 = bitField1.set((long) (short) 96);
        short short10 = bitField1.setShortBoolean((short) -98, true);
        int int13 = bitField1.setBoolean(4, false);
        short short16 = bitField1.setShortBoolean((short) 96, true);
        long long18 = bitField1.getRawValue(10L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 97 + "'", short16 == (short) 97);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) 24);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        int int13 = bitField1.clear((int) (short) 0);
        boolean boolean15 = bitField1.isSet((int) (byte) 0);
        long long17 = bitField1.getRawValue((long) 21);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short4 = bitField1.setShortBoolean((short) 96, true);
        int int6 = bitField1.getRawValue((int) (short) 100);
        long long8 = bitField1.set(117L);
        int int10 = bitField1.getRawValue(107);
        int int13 = bitField1.setValue((int) (short) 107, 111);
        byte byte15 = bitField1.clearByte((byte) 14);
        short short17 = bitField1.getShortValue((short) 14);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 97 + "'", short4 == (short) 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 96 + "'", int6 == 96);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 117L + "'", long8 == 117L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 107 + "'", int13 == 107);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 14 + "'", byte15 == (byte) 14);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) (byte) 10);
        int int3 = bitField1.set(0);
        java.lang.Class<?> wildcardClass4 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 14);
        short short4 = bitField1.setShortBoolean((short) (byte) 1, true);
        long long6 = bitField1.getRawValue((long) 116);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 15 + "'", short4 == (short) 15);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4L + "'", long6 == 4L);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) (short) 4);
        int int3 = bitField1.clear((int) (short) 4);
        int int5 = bitField1.set((int) (byte) 4);
        int int7 = bitField1.set((int) (short) -1);
        int int10 = bitField1.setValue((int) (short) 96, 16);
        int int13 = bitField1.setBoolean((int) (byte) 4, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 96 + "'", int10 == 96);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        int int12 = bitField1.getRawValue((int) (short) -1);
        long long14 = bitField1.getValue((long) (short) 96);
        short short17 = bitField1.setShortBoolean((short) 0, false);
        boolean boolean19 = bitField1.isSet((long) (short) -1);
        int int21 = bitField1.getRawValue((int) (short) -1);
        long long23 = bitField1.clear(0L);
        int int25 = bitField1.clear((int) (byte) -1);
        boolean boolean27 = bitField1.isSet(97L);
        byte byte29 = bitField1.setByte((byte) 14);
        long long31 = bitField1.getValue(0L);
        short short33 = bitField1.getShortRawValue((short) (byte) 30);
        long long36 = bitField1.setValue((long) (byte) 1, (long) (byte) 101);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 96L + "'", long14 == 96L);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-98) + "'", int25 == (-98));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + byte29 + "' != '" + (byte) 111 + "'", byte29 == (byte) 111);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + short33 + "' != '" + (short) 0 + "'", short33 == (short) 0);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 97L + "'", long36 == 97L);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        int int15 = bitField1.clear(2);
        byte byte17 = bitField1.clearByte((byte) 1);
        long long20 = bitField1.setBoolean((long) (byte) 101, true);
        long long22 = bitField1.getValue((long) (-1));
        int int24 = bitField1.set(0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 101L + "'", long20 == 101L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 97L + "'", long22 == 97L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        long long13 = bitField1.setBoolean((long) ' ', false);
        boolean boolean15 = bitField1.isSet((long) 2);
        byte byte18 = bitField1.setByteBoolean((byte) 0, true);
        boolean boolean20 = bitField1.isSet(100);
        short short23 = bitField1.setShortValue((short) (byte) -1, (short) 1);
        short short25 = bitField1.getShortRawValue((short) (byte) 107);
        boolean boolean27 = bitField1.isSet(0);
        short short29 = bitField1.getShortRawValue((short) (byte) 100);
        java.lang.Class<?> wildcardClass30 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 97 + "'", byte18 == (byte) 97);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) -97 + "'", short23 == (short) -97);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 97 + "'", short25 == (short) 97);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + short29 + "' != '" + (short) 96 + "'", short29 == (short) 96);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        int int16 = bitField1.setValue((int) (byte) -1, (int) (short) 10);
        long long18 = bitField1.getValue((long) 2);
        long long20 = bitField1.getValue((long) 97);
        long long23 = bitField1.setValue((long) (byte) 1, (long) 107);
        int int25 = bitField1.getRawValue((int) (byte) -1);
        int int28 = bitField1.setValue(106, (int) (byte) 97);
        int int30 = bitField1.set((int) (short) 101);
        long long32 = bitField1.set((long) (-1));
        int int34 = bitField1.set((int) (short) 97);
        boolean boolean36 = bitField1.isAllSet((int) (byte) -98);
        short short38 = bitField1.clearShort((short) 112);
        int int40 = bitField1.clear(113);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-98) + "'", int16 == (-98));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 97L + "'", long23 == 97L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 107 + "'", int28 == 107);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 101 + "'", int30 == 101);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + short38 + "' != '" + (short) 16 + "'", short38 == (short) 16);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 16 + "'", int40 == 16);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        int int15 = bitField1.clear(2);
        long long17 = bitField1.getRawValue((long) (short) 1);
        byte byte19 = bitField1.clearByte((byte) 1);
        int int21 = bitField1.getRawValue(0);
        int int23 = bitField1.set((int) (short) 100);
        byte byte25 = bitField1.setByte((byte) 127);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 101 + "'", int23 == 101);
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 127 + "'", byte25 == (byte) 127);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        boolean boolean3 = bitField1.isAllSet((long) '4');
        int int5 = bitField1.getValue((int) (byte) 0);
        boolean boolean7 = bitField1.isSet(63L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) -98);
        long long3 = bitField1.getValue((long) (-108));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2147483594L + "'", long3 == 2147483594L);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) 0);
        short short4 = bitField1.setShortBoolean((short) (byte) 4, false);
        long long7 = bitField1.setBoolean((long) (short) 0, false);
        boolean boolean9 = bitField1.isAllSet((long) (short) -97);
        boolean boolean11 = bitField1.isSet(101);
        short short13 = bitField1.getShortRawValue((short) (byte) 111);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 4 + "'", short4 == (short) 4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 0 + "'", short13 == (short) 0);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        long long13 = bitField1.setBoolean((long) ' ', false);
        boolean boolean15 = bitField1.isSet((long) 2);
        int int18 = bitField1.setValue(0, (int) (short) -1);
        short short20 = bitField1.clearShort((short) 0);
        long long22 = bitField1.getRawValue(1L);
        long long24 = bitField1.set((long) (byte) 32);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 97L + "'", long24 == 97L);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        boolean boolean3 = bitField1.isAllSet((long) '4');
        int int5 = bitField1.getValue((int) (byte) 0);
        short short7 = bitField1.setShort((short) 1);
        int int10 = bitField1.setBoolean((int) (byte) 0, true);
        short short12 = bitField1.clearShort((short) (byte) 10);
        boolean boolean14 = bitField1.isAllSet((long) 107);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 97 + "'", short7 == (short) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 10 + "'", short12 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        int int16 = bitField1.setValue((int) (byte) -1, (int) (short) 10);
        long long18 = bitField1.getValue((long) 2);
        long long20 = bitField1.getValue((long) 97);
        long long23 = bitField1.setValue((long) (byte) 1, (long) 107);
        int int25 = bitField1.getRawValue((int) (byte) -1);
        long long27 = bitField1.getValue((long) (byte) 127);
        short short30 = bitField1.setShortValue((short) (byte) 111, (short) (byte) 68);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-98) + "'", int16 == (-98));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 97L + "'", long23 == 97L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 97L + "'", long27 == 97L);
        org.junit.Assert.assertTrue("'" + short30 + "' != '" + (short) 78 + "'", short30 == (short) 78);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(95);
        short short3 = bitField1.getShortValue((short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        boolean boolean3 = bitField1.isAllSet((long) '4');
        int int5 = bitField1.getValue((int) (byte) 0);
        short short7 = bitField1.setShort((short) 1);
        int int10 = bitField1.setBoolean((int) (byte) 0, true);
        long long12 = bitField1.set(98L);
        long long14 = bitField1.getRawValue((long) 106);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 97 + "'", short7 == (short) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 99L + "'", long12 == 99L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 96L + "'", long14 == 96L);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        boolean boolean3 = bitField1.isAllSet((long) '4');
        int int5 = bitField1.getValue((int) (byte) 0);
        long long7 = bitField1.set((long) (short) 96);
        short short9 = bitField1.getShortValue((short) (byte) 100);
        int int11 = bitField1.getValue((int) (byte) 101);
        long long14 = bitField1.setBoolean((long) (byte) 100, true);
        short short16 = bitField1.setShort((short) 11);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 96 + "'", short9 == (short) 96);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 101L + "'", long14 == 101L);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 107 + "'", short16 == (short) 107);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) (byte) 100);
        byte byte11 = bitField1.clearByte((byte) 97);
        byte byte14 = bitField1.setByteBoolean((byte) 1, false);
        short short16 = bitField1.getShortRawValue((short) 48);
        boolean boolean18 = bitField1.isAllSet((int) (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 96 + "'", short9 == (short) 96);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 0 + "'", byte11 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 0 + "'", byte14 == (byte) 0);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 32 + "'", short16 == (short) 32);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        int int12 = bitField1.getRawValue((int) (short) -1);
        int int14 = bitField1.clear((int) '#');
        java.lang.Class<?> wildcardClass15 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) (short) 26);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-43));
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) '4');
        short short3 = bitField1.getShortRawValue((short) 10);
        long long5 = bitField1.getRawValue((long) 20);
        long long7 = bitField1.set((long) 32);
        long long10 = bitField1.setBoolean((long) (-15), false);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 20L + "'", long5 == 20L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-63L) + "'", long10 == (-63L));
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.setShort((short) (byte) -1);
        long long12 = bitField1.setBoolean(116L, true);
        short short14 = bitField1.getShortRawValue((short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 117L + "'", long12 == 117L);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(0);
        short short3 = bitField1.setShort((short) 10);
        short short5 = bitField1.getShortRawValue((short) 5);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        int int13 = bitField1.set((int) (byte) 10);
        short short15 = bitField1.clearShort((short) 24);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 107 + "'", int13 == 107);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 24 + "'", short15 == (short) 24);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(1L);
        short short3 = bitField1.clearShort((short) -1);
        long long5 = bitField1.set((long) (short) -97);
        java.lang.Class<?> wildcardClass6 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -2 + "'", short3 == (short) -2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-97L) + "'", long5 == (-97L));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(5);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) 106);
        short short3 = bitField1.getShortRawValue((short) -98);
        boolean boolean5 = bitField1.isAllSet(100L);
        int int7 = bitField1.clear((int) ' ');
        long long10 = bitField1.setValue((long) 65, 0L);
        short short13 = bitField1.setShortBoolean((short) 1, false);
        int int15 = bitField1.getValue(32);
        java.lang.Class<?> wildcardClass16 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        int int12 = bitField1.getRawValue((int) (short) -1);
        long long14 = bitField1.getValue((long) (short) 96);
        short short17 = bitField1.setShortValue((short) (byte) -1, (short) 1);
        long long20 = bitField1.setValue((long) (byte) -98, (-49L));
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 96L + "'", long14 == 96L);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) -97 + "'", short17 == (short) -97);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-33L) + "'", long20 == (-33L));
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        long long9 = bitField1.set((long) (byte) 1);
        int int11 = bitField1.getRawValue(106);
        short short13 = bitField1.clearShort((short) -107);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 96 + "'", int11 == 96);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) -108 + "'", short13 == (short) -108);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) (short) 4);
        short short4 = bitField1.setShortValue((short) 107, (short) -98);
        boolean boolean6 = bitField1.isAllSet(20);
        byte byte9 = bitField1.setByteBoolean((byte) 101, true);
        int int11 = bitField1.getValue(117);
        boolean boolean13 = bitField1.isAllSet((long) (byte) 30);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 107 + "'", short4 == (short) 107);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 101 + "'", byte9 == (byte) 101);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) (byte) 100);
        int int11 = bitField1.set(0);
        short short13 = bitField1.getShortRawValue((short) 96);
        int int15 = bitField1.getRawValue((int) (short) -1);
        short short17 = bitField1.clearShort((short) 0);
        int int19 = bitField1.set(107);
        long long22 = bitField1.setValue((long) (short) -1, (long) (short) 113);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 96 + "'", short9 == (short) 96);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 96 + "'", short13 == (short) 96);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 107 + "'", int19 == 107);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        int int13 = bitField1.clear((int) (short) 0);
        boolean boolean15 = bitField1.isSet((int) (byte) 0);
        long long17 = bitField1.clear(0L);
        boolean boolean19 = bitField1.isAllSet((long) (-1));
        long long22 = bitField1.setBoolean(0L, false);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        int int16 = bitField1.setValue((int) (byte) -1, (int) (short) 10);
        long long18 = bitField1.getValue((long) 2);
        long long20 = bitField1.getValue((long) 97);
        boolean boolean22 = bitField1.isAllSet(97L);
        int int24 = bitField1.clear(107);
        short short26 = bitField1.clearShort((short) (byte) 4);
        boolean boolean28 = bitField1.isAllSet((long) (short) 11);
        boolean boolean30 = bitField1.isAllSet((long) (short) 26);
        long long32 = bitField1.getValue((long) 16);
        int int34 = bitField1.getValue((int) (short) 110);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-98) + "'", int16 == (-98));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 4 + "'", short26 == (short) 4);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 96 + "'", int34 == 96);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        short short5 = bitField1.getShortRawValue((short) 0);
        int int8 = bitField1.setValue(1, 96);
        long long10 = bitField1.getValue((long) 100);
        short short13 = bitField1.setShortBoolean((short) 0, true);
        long long16 = bitField1.setValue((long) (-1), 8L);
        int int18 = bitField1.getValue((int) (short) 1);
        short short20 = bitField1.getShortValue((short) (byte) 30);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 96 + "'", int8 == 96);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 96L + "'", long10 == 96L);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 97 + "'", short13 == (short) 97);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-98L) + "'", long16 == (-98L));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(96L);
        short short4 = bitField1.setShortBoolean((short) -98, true);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -2 + "'", short4 == (short) -2);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(65L);
        long long3 = bitField1.getRawValue(10L);
        long long5 = bitField1.clear(111L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 46L + "'", long5 == 46L);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) (short) -1);
        byte byte4 = bitField1.setByteBoolean((byte) 106, false);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        long long13 = bitField1.setBoolean((long) ' ', false);
        boolean boolean15 = bitField1.isSet((long) 2);
        byte byte18 = bitField1.setByteBoolean((byte) 0, true);
        short short20 = bitField1.getShortRawValue((short) -98);
        long long22 = bitField1.set(10L);
        long long24 = bitField1.clear((long) '#');
        byte byte26 = bitField1.clearByte((byte) 111);
        long long28 = bitField1.set((long) (-98));
        long long30 = bitField1.getRawValue((long) (short) 96);
        long long32 = bitField1.getValue(0L);
        byte byte34 = bitField1.clearByte((byte) -1);
        long long37 = bitField1.setValue((long) 122, 126L);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 97 + "'", byte18 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 107L + "'", long22 == 107L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 2L + "'", long24 == 2L);
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 14 + "'", byte26 == (byte) 14);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 96L + "'", long30 == 96L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + byte34 + "' != '" + (byte) -98 + "'", byte34 == (byte) -98);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 122L + "'", long37 == 122L);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        long long13 = bitField1.setBoolean((long) ' ', false);
        boolean boolean15 = bitField1.isSet((long) 2);
        int int18 = bitField1.setValue(0, (int) (short) -1);
        long long21 = bitField1.setBoolean(0L, false);
        short short23 = bitField1.clearShort((short) (byte) 127);
        short short25 = bitField1.getShortRawValue((short) 113);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 30 + "'", short23 == (short) 30);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 97 + "'", short25 == (short) 97);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        int int12 = bitField1.getRawValue((int) (short) -1);
        long long14 = bitField1.getValue((long) (short) 96);
        long long16 = bitField1.set((long) 96);
        long long19 = bitField1.setBoolean((long) 100, true);
        boolean boolean21 = bitField1.isAllSet((int) (short) 75);
        byte byte23 = bitField1.setByte((byte) 123);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 96L + "'", long14 == 96L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 101L + "'", long19 == 101L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) 123 + "'", byte23 == (byte) 123);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) (short) 4);
        int int3 = bitField1.clear((int) (short) 4);
        int int5 = bitField1.set((int) (byte) 4);
        short short7 = bitField1.setShort((short) (byte) 62);
        boolean boolean9 = bitField1.isSet((-104));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 62 + "'", short7 == (short) 62);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        short short12 = bitField1.getShortRawValue((short) (byte) 10);
        long long14 = bitField1.getRawValue((-1L));
        int int16 = bitField1.getValue((int) (short) 5);
        java.lang.Class<?> wildcardClass17 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        int int12 = bitField1.getRawValue((int) (short) -1);
        long long14 = bitField1.getRawValue((long) ' ');
        int int16 = bitField1.getValue(96);
        short short18 = bitField1.setShort((short) 97);
        boolean boolean20 = bitField1.isSet(52L);
        byte byte22 = bitField1.clearByte((byte) 62);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 96 + "'", int16 == 96);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 97 + "'", short18 == (short) 97);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 30 + "'", byte22 == (byte) 30);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short4 = bitField1.setShortBoolean((short) 96, true);
        boolean boolean6 = bitField1.isAllSet((long) (short) 97);
        int int8 = bitField1.set((int) (short) 107);
        long long10 = bitField1.getValue(0L);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 97 + "'", short4 == (short) 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 107 + "'", int8 == 107);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short4 = bitField1.setShortBoolean((short) 96, true);
        int int6 = bitField1.getRawValue((int) (short) 100);
        long long8 = bitField1.set(117L);
        int int10 = bitField1.getRawValue(107);
        int int13 = bitField1.setValue((int) (byte) 111, 20);
        short short15 = bitField1.getShortValue((short) 100);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 97 + "'", short4 == (short) 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 96 + "'", int6 == 96);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 117L + "'", long8 == 117L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 14 + "'", int13 == 14);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 96 + "'", short15 == (short) 96);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        int int15 = bitField1.clear(2);
        byte byte17 = bitField1.clearByte((byte) 1);
        long long19 = bitField1.set((long) (byte) 101);
        boolean boolean21 = bitField1.isAllSet(101);
        short short23 = bitField1.clearShort((short) (byte) -98);
        long long25 = bitField1.clear(0L);
        short short27 = bitField1.clearShort((short) (byte) -98);
        long long30 = bitField1.setBoolean((long) (-97), false);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 101L + "'", long19 == 101L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) -98 + "'", short23 == (short) -98);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) -98 + "'", short27 == (short) -98);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-98L) + "'", long30 == (-98L));
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) 48);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        short short12 = bitField1.getShortValue((short) -98);
        int int14 = bitField1.getValue((-15));
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) 97);
        byte byte3 = bitField1.setByte((byte) 97);
        byte byte5 = bitField1.setByte((byte) 10);
        long long8 = bitField1.setBoolean((long) (byte) 107, false);
        short short11 = bitField1.setShortValue((short) 107, (short) -98);
        byte byte13 = bitField1.clearByte((byte) 62);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 97 + "'", byte3 == (byte) 97);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 107 + "'", byte5 == (byte) 107);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 30 + "'", byte13 == (byte) 30);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        long long8 = bitField1.setValue((long) ' ', (long) ' ');
        byte byte11 = bitField1.setByteBoolean((byte) 14, false);
        int int14 = bitField1.setValue((int) (byte) 0, (int) (short) 91);
        java.lang.Class<?> wildcardClass15 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 14 + "'", byte11 == (byte) 14);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 65 + "'", int14 == 65);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) (byte) 100);
        int int11 = bitField1.set(0);
        short short13 = bitField1.getShortRawValue((short) 96);
        int int15 = bitField1.getRawValue((int) (short) -1);
        int int18 = bitField1.setBoolean((int) (short) -33, false);
        int int20 = bitField1.set((int) (byte) 123);
        int int22 = bitField1.getRawValue((int) (short) 63);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 96 + "'", short9 == (short) 96);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 96 + "'", short13 == (short) 96);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-98) + "'", int18 == (-98));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 123 + "'", int20 == 123);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 33 + "'", int22 == 33);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        int int12 = bitField1.getRawValue((int) (short) -1);
        boolean boolean14 = bitField1.isSet((long) (-1));
        boolean boolean16 = bitField1.isAllSet((long) (byte) 1);
        short short18 = bitField1.getShortValue((short) (byte) 100);
        int int20 = bitField1.getRawValue((int) (short) 100);
        long long22 = bitField1.getValue((long) (short) 97);
        long long24 = bitField1.clear((long) (short) 5);
        java.lang.Class<?> wildcardClass25 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 96 + "'", short18 == (short) 96);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 96 + "'", int20 == 96);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 97L + "'", long22 == 97L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 4L + "'", long24 == 4L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        long long13 = bitField1.setBoolean((long) ' ', false);
        boolean boolean15 = bitField1.isSet((long) 2);
        int int18 = bitField1.setValue(0, (int) (short) -1);
        long long21 = bitField1.setBoolean(0L, false);
        short short23 = bitField1.clearShort((short) (byte) 127);
        byte byte26 = bitField1.setByteBoolean((byte) 127, false);
        boolean boolean28 = bitField1.isSet((int) (short) 30);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 30 + "'", short23 == (short) 30);
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 30 + "'", byte26 == (byte) 30);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) 106);
        int int3 = bitField1.getRawValue((int) (byte) 1);
        boolean boolean5 = bitField1.isAllSet(2147483594L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short4 = bitField1.setShortBoolean((short) 96, true);
        short short7 = bitField1.setShortValue((short) 100, (short) (byte) -1);
        long long9 = bitField1.getRawValue(2L);
        short short11 = bitField1.getShortValue((short) 1);
        short short14 = bitField1.setShortValue((short) 97, (short) 0);
        long long16 = bitField1.getRawValue((long) (short) 5);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 97 + "'", short4 == (short) 97);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 101 + "'", short7 == (short) 101);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 1 + "'", short11 == (short) 1);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) 97);
        int int3 = bitField1.clear(1);
        short short5 = bitField1.clearShort((short) (byte) 14);
        boolean boolean7 = bitField1.isAllSet((int) (byte) 0);
        int int9 = bitField1.getValue((int) (short) 0);
        int int11 = bitField1.getRawValue((int) (short) 30);
        java.lang.Class<?> wildcardClass12 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 14 + "'", short5 == (short) 14);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        int int15 = bitField1.clear(2);
        byte byte17 = bitField1.clearByte((byte) 1);
        long long19 = bitField1.set((long) (byte) 101);
        boolean boolean21 = bitField1.isAllSet(101);
        short short23 = bitField1.clearShort((short) (byte) -98);
        byte byte25 = bitField1.setByte((byte) 30);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 101L + "'", long19 == 101L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) -98 + "'", short23 == (short) -98);
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 127 + "'", byte25 == (byte) 127);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        long long16 = bitField1.setValue((long) (-1), (long) (short) 97);
        long long18 = bitField1.clear(1L);
        long long20 = bitField1.clear(52L);
        byte byte22 = bitField1.clearByte((byte) 62);
        byte byte25 = bitField1.setByteBoolean((byte) -66, true);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 20L + "'", long20 == 20L);
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 30 + "'", byte22 == (byte) 30);
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) -1 + "'", byte25 == (byte) -1);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short4 = bitField1.setShortBoolean((short) 96, true);
        short short7 = bitField1.setShortValue((short) 100, (short) (byte) -1);
        short short9 = bitField1.getShortRawValue((short) (byte) 107);
        boolean boolean11 = bitField1.isSet(32);
        int int14 = bitField1.setValue(24, (int) (short) 3);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 97 + "'", short4 == (short) 97);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 101 + "'", short7 == (short) 101);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 97 + "'", short9 == (short) 97);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 25 + "'", int14 == 25);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) -6);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(100L);
        int int4 = bitField1.setValue((int) (short) 5, (int) (byte) 127);
        long long7 = bitField1.setValue((long) (short) 1, (-114L));
        java.lang.Class<?> wildcardClass8 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 33L + "'", long7 == 33L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) (short) 4);
        byte byte3 = bitField1.clearByte((byte) 4);
        java.lang.Class<?> wildcardClass4 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        int int15 = bitField1.clear(2);
        long long17 = bitField1.getRawValue((long) (short) 1);
        boolean boolean19 = bitField1.isSet((long) (short) -1);
        int int21 = bitField1.getValue((int) (short) 11);
        long long23 = bitField1.getRawValue((long) 4);
        long long25 = bitField1.getValue((long) (-43));
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 65L + "'", long25 == 65L);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        boolean boolean3 = bitField1.isAllSet((long) '4');
        int int5 = bitField1.set(1);
        byte byte8 = bitField1.setByteBoolean((byte) 107, true);
        int int11 = bitField1.setValue((-98), (-15));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 107 + "'", byte8 == (byte) 107);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        boolean boolean7 = bitField1.isSet(0L);
        int int9 = bitField1.set((int) ' ');
        long long12 = bitField1.setBoolean(16L, false);
        int int15 = bitField1.setValue(11, 96);
        int int17 = bitField1.set(109);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 16L + "'", long12 == 16L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 106 + "'", int15 == 106);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 109 + "'", int17 == 109);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        int int16 = bitField1.setValue((int) (byte) -1, (int) (short) 10);
        long long18 = bitField1.getValue((long) 2);
        long long20 = bitField1.getValue((long) 97);
        long long23 = bitField1.setValue((long) (byte) 1, (long) 107);
        int int25 = bitField1.getRawValue((int) (byte) -1);
        long long27 = bitField1.getRawValue((long) (byte) 1);
        int int30 = bitField1.setValue((int) (byte) 4, 100);
        short short32 = bitField1.clearShort((short) 111);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-98) + "'", int16 == (-98));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 97L + "'", long23 == 97L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + short32 + "' != '" + (short) 14 + "'", short32 == (short) 14);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        long long9 = bitField1.set((long) (byte) 1);
        int int11 = bitField1.set((int) '4');
        boolean boolean13 = bitField1.isSet((long) (-102));
        byte byte15 = bitField1.setByte((byte) -98);
        short short17 = bitField1.setShort((short) -37);
        long long19 = bitField1.getValue((long) (short) 3);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 117 + "'", int11 == 117);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) -1 + "'", byte15 == (byte) -1);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) -5 + "'", short17 == (short) -5);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) 106);
        int int4 = bitField1.setValue(5, (int) (byte) 0);
        boolean boolean6 = bitField1.isSet((long) 97);
        java.lang.Class<?> wildcardClass7 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short10 = bitField1.setShortBoolean((short) -1, true);
        int int13 = bitField1.setBoolean((int) (byte) 100, false);
        byte byte16 = bitField1.setByteBoolean((byte) 111, false);
        byte byte19 = bitField1.setByteBoolean((byte) 62, true);
        long long21 = bitField1.set((long) (short) 24);
        boolean boolean23 = bitField1.isAllSet((-98));
        boolean boolean25 = bitField1.isAllSet((long) (short) 1);
        byte byte28 = bitField1.setByteBoolean((byte) 116, true);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 14 + "'", byte16 == (byte) 14);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 127 + "'", byte19 == (byte) 127);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 121L + "'", long21 == 121L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + byte28 + "' != '" + (byte) 117 + "'", byte28 == (byte) 117);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(121);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(64L);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        int int13 = bitField1.clear((int) (short) 0);
        boolean boolean15 = bitField1.isSet((int) (byte) 0);
        long long17 = bitField1.clear(0L);
        java.lang.Class<?> wildcardClass18 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) (byte) -128);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) ' ');
        byte byte3 = bitField1.setByte((byte) -98);
        short short5 = bitField1.setShort((short) (byte) -107);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -66 + "'", byte3 == (byte) -66);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -75 + "'", short5 == (short) -75);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        int int12 = bitField1.getRawValue((int) (short) -1);
        boolean boolean14 = bitField1.isSet((long) (-1));
        boolean boolean16 = bitField1.isAllSet((int) '#');
        byte byte19 = bitField1.setByteBoolean((byte) 0, true);
        byte byte22 = bitField1.setByteBoolean((byte) 0, true);
        long long24 = bitField1.clear(16L);
        int int26 = bitField1.set(0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 97 + "'", byte19 == (byte) 97);
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 97 + "'", byte22 == (byte) 97);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 16L + "'", long24 == 16L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short4 = bitField1.setShortBoolean((short) 96, true);
        short short7 = bitField1.setShortValue((short) 100, (short) (byte) -1);
        int int9 = bitField1.getValue(96);
        boolean boolean11 = bitField1.isSet(0);
        short short13 = bitField1.setShort((short) 0);
        short short16 = bitField1.setShortBoolean((short) (byte) 5, false);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 97 + "'", short4 == (short) 97);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 101 + "'", short7 == (short) 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 96 + "'", int9 == 96);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 97 + "'", short13 == (short) 97);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 4 + "'", short16 == (short) 4);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        long long13 = bitField1.setBoolean((long) ' ', false);
        boolean boolean15 = bitField1.isSet((long) 2);
        int int18 = bitField1.setValue(0, (int) (short) -1);
        byte byte21 = bitField1.setByteBoolean((byte) 1, true);
        byte byte23 = bitField1.setByte((byte) -1);
        int int26 = bitField1.setValue((int) (byte) -1, (int) (short) -98);
        long long28 = bitField1.getValue((long) 'a');
        long long30 = bitField1.getRawValue((long) (byte) -96);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 97 + "'", byte21 == (byte) 97);
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) -1 + "'", byte23 == (byte) -1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-98) + "'", int26 == (-98));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 97L + "'", long28 == 97L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 32L + "'", long30 == 32L);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        long long13 = bitField1.setBoolean((long) ' ', false);
        short short15 = bitField1.setShort((short) (byte) 1);
        boolean boolean17 = bitField1.isAllSet(2);
        short short20 = bitField1.setShortBoolean((short) (byte) 97, false);
        short short23 = bitField1.setShortBoolean((short) 100, true);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 97 + "'", short15 == (short) 97);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 101 + "'", short23 == (short) 101);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        long long13 = bitField1.setBoolean((long) ' ', false);
        short short15 = bitField1.setShort((short) (byte) 1);
        boolean boolean17 = bitField1.isAllSet(2);
        int int20 = bitField1.setValue(116, 97);
        long long22 = bitField1.getValue(14L);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 97 + "'", short15 == (short) 97);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 117 + "'", int20 == 117);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        int int12 = bitField1.getRawValue((int) (short) -1);
        long long14 = bitField1.getValue((long) (short) 96);
        short short17 = bitField1.setShortBoolean((short) 0, false);
        boolean boolean19 = bitField1.isSet((long) (short) -1);
        int int21 = bitField1.getRawValue((int) (short) -1);
        short short24 = bitField1.setShortBoolean((short) -1, false);
        int int27 = bitField1.setBoolean((int) (byte) 100, false);
        long long29 = bitField1.getRawValue((long) (byte) 101);
        short short31 = bitField1.setShort((short) 16);
        byte byte34 = bitField1.setByteBoolean((byte) -11, false);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 96L + "'", long14 == 96L);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) -98 + "'", short24 == (short) -98);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 97L + "'", long29 == 97L);
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) 113 + "'", short31 == (short) 113);
        org.junit.Assert.assertTrue("'" + byte34 + "' != '" + (byte) -108 + "'", byte34 == (byte) -108);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        long long13 = bitField1.setBoolean((long) ' ', false);
        boolean boolean15 = bitField1.isSet((long) 2);
        byte byte18 = bitField1.setByteBoolean((byte) 0, true);
        short short20 = bitField1.getShortRawValue((short) -98);
        long long22 = bitField1.set(10L);
        long long24 = bitField1.clear((long) '#');
        byte byte26 = bitField1.clearByte((byte) 111);
        long long28 = bitField1.set((long) (-98));
        long long30 = bitField1.getRawValue((long) (short) 96);
        long long32 = bitField1.getValue(0L);
        byte byte34 = bitField1.clearByte((byte) -1);
        long long36 = bitField1.clear((long) (short) -98);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 97 + "'", byte18 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 107L + "'", long22 == 107L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 2L + "'", long24 == 2L);
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 14 + "'", byte26 == (byte) 14);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 96L + "'", long30 == 96L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + byte34 + "' != '" + (byte) -98 + "'", byte34 == (byte) -98);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-98L) + "'", long36 == (-98L));
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        int int15 = bitField1.clear(2);
        long long17 = bitField1.getRawValue((long) (short) 1);
        byte byte19 = bitField1.clearByte((byte) 1);
        int int21 = bitField1.getRawValue(0);
        int int23 = bitField1.set((int) 'a');
        java.lang.Class<?> wildcardClass24 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) (short) -33);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) 0);
        short short4 = bitField1.setShortBoolean((short) (byte) 4, false);
        long long7 = bitField1.setBoolean((long) (short) 0, false);
        boolean boolean9 = bitField1.isAllSet((long) (short) -97);
        int int12 = bitField1.setValue(117, 106);
        java.lang.Class<?> wildcardClass13 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 4 + "'", short4 == (short) 4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 117 + "'", int12 == 117);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        byte byte6 = bitField1.setByteBoolean((byte) 10, false);
        boolean boolean8 = bitField1.isAllSet((int) (short) 11);
        short short10 = bitField1.setShort((short) 15);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 111 + "'", short10 == (short) 111);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        long long8 = bitField1.setValue((long) ' ', (long) ' ');
        short short10 = bitField1.getShortValue((short) (byte) -1);
        int int12 = bitField1.set((int) (byte) 100);
        int int15 = bitField1.setValue(20, 99);
        int int17 = bitField1.getRawValue((int) (short) 0);
        java.lang.Class<?> wildcardClass18 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 97 + "'", short10 == (short) 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 117 + "'", int15 == 117);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        int int16 = bitField1.setValue((int) (byte) -1, (int) (short) 10);
        long long18 = bitField1.getValue((long) 2);
        long long20 = bitField1.getValue((long) 97);
        long long23 = bitField1.setValue((long) (byte) 1, (long) 107);
        int int25 = bitField1.getRawValue((int) (byte) -1);
        int int28 = bitField1.setValue(106, (int) (byte) 97);
        int int30 = bitField1.getValue((int) (short) -98);
        byte byte33 = bitField1.setByteBoolean((byte) 106, false);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-98) + "'", int16 == (-98));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 97L + "'", long23 == 97L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 107 + "'", int28 == 107);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + byte33 + "' != '" + (byte) 10 + "'", byte33 == (byte) 10);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 106);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) 97);
        int int3 = bitField1.clear(1);
        short short5 = bitField1.clearShort((short) (byte) 14);
        boolean boolean7 = bitField1.isAllSet((int) (byte) 0);
        int int9 = bitField1.getValue((int) (short) 0);
        java.lang.Class<?> wildcardClass10 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 14 + "'", short5 == (short) 14);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short10 = bitField1.setShortBoolean((short) -1, true);
        long long12 = bitField1.getValue(20L);
        long long15 = bitField1.setBoolean((long) 2, false);
        int int18 = bitField1.setValue((int) (short) 100, (int) (short) 107);
        int int21 = bitField1.setValue(65, (int) (short) -1);
        long long23 = bitField1.set((long) (short) 113);
        long long25 = bitField1.getValue(123L);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2L + "'", long15 == 2L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 113L + "'", long23 == 113L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 97L + "'", long25 == 97L);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 11);
        boolean boolean3 = bitField1.isAllSet((int) (short) 97);
        java.lang.Class<?> wildcardClass4 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        short short5 = bitField1.getShortRawValue((short) 0);
        byte byte8 = bitField1.setByteBoolean((byte) -1, true);
        long long10 = bitField1.clear((long) 1);
        int int13 = bitField1.setValue((-112), (int) (short) -31);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-15) + "'", int13 == (-15));
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        long long9 = bitField1.set((long) (byte) 1);
        int int12 = bitField1.setBoolean(5, true);
        short short14 = bitField1.getShortRawValue((short) (byte) -98);
        short short17 = bitField1.setShortValue((short) (byte) 97, (short) (byte) 0);
        short short19 = bitField1.setShort((short) -43);
        int int21 = bitField1.getRawValue((int) (short) 96);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) -11 + "'", short19 == (short) -11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 96 + "'", int21 == 96);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        long long16 = bitField1.setValue((long) (-1), (long) (short) 97);
        long long18 = bitField1.clear(1L);
        long long21 = bitField1.setValue((long) (short) 30, (long) (short) 30);
        short short24 = bitField1.setShortValue((short) 113, (short) (byte) 127);
        java.lang.Class<?> wildcardClass25 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 30L + "'", long21 == 30L);
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 113 + "'", short24 == (short) 113);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        int int16 = bitField1.setValue(4, (int) (byte) 1);
        short short18 = bitField1.clearShort((short) 96);
        long long20 = bitField1.getValue((long) (byte) 30);
        short short23 = bitField1.setShortValue((short) 63, (short) 33);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 0 + "'", short18 == (short) 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 63 + "'", short23 == (short) 63);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 97);
        long long3 = bitField1.clear(0L);
        int int5 = bitField1.getValue((int) (short) 107);
        byte byte7 = bitField1.clearByte((byte) 127);
        long long9 = bitField1.set(0L);
        long long12 = bitField1.setValue((long) 43, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 30 + "'", byte7 == (byte) 30);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        int int13 = bitField1.set((int) (byte) 10);
        long long15 = bitField1.clear((long) 20);
        short short18 = bitField1.setShortValue((short) (byte) 10, (short) 11);
        java.lang.Class<?> wildcardClass19 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 107 + "'", int13 == 107);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 20L + "'", long15 == 20L);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 11 + "'", short18 == (short) 11);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) 97);
        int int4 = bitField1.setValue(97, (int) (short) 97);
        boolean boolean6 = bitField1.isAllSet((int) (byte) 100);
        int int8 = bitField1.set(33);
        int int11 = bitField1.setBoolean(48, false);
        short short14 = bitField1.setShortValue((short) (byte) -5, (short) 30);
        short short16 = bitField1.getShortValue((short) (byte) 111);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) -102 + "'", short14 == (short) -102);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 97 + "'", short16 == (short) 97);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(122L);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        int int15 = bitField1.clear(2);
        byte byte17 = bitField1.clearByte((byte) 1);
        short short20 = bitField1.setShortBoolean((short) 1, true);
        boolean boolean22 = bitField1.isSet((long) (byte) 100);
        int int25 = bitField1.setValue(106, (int) (short) 4);
        long long28 = bitField1.setBoolean(0L, false);
        boolean boolean30 = bitField1.isSet((int) (byte) -66);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 97 + "'", short20 == (short) 97);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        long long13 = bitField1.setBoolean((long) ' ', false);
        boolean boolean15 = bitField1.isSet((long) 2);
        byte byte18 = bitField1.setByteBoolean((byte) 0, true);
        short short20 = bitField1.getShortRawValue((short) -98);
        boolean boolean22 = bitField1.isSet((long) (short) 113);
        short short24 = bitField1.setShort((short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 97 + "'", byte18 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 97 + "'", short24 == (short) 97);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        short short5 = bitField1.getShortRawValue((short) 0);
        byte byte8 = bitField1.setByteBoolean((byte) -1, true);
        long long10 = bitField1.clear((long) 1);
        boolean boolean12 = bitField1.isAllSet((-97));
        short short14 = bitField1.setShort((short) -128);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) -31 + "'", short14 == (short) -31);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        long long16 = bitField1.setValue((long) (-1), (long) (short) 97);
        short short19 = bitField1.setShortBoolean((short) 96, true);
        int int21 = bitField1.getRawValue((-1));
        java.lang.Class<?> wildcardClass22 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 97 + "'", short19 == (short) 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short4 = bitField1.setShortBoolean((short) 96, true);
        int int6 = bitField1.getRawValue((int) (short) 100);
        boolean boolean8 = bitField1.isAllSet((int) (short) -97);
        int int10 = bitField1.getValue((int) (short) 97);
        boolean boolean12 = bitField1.isSet((int) (short) 1);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 97 + "'", short4 == (short) 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 96 + "'", int6 == 96);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        long long9 = bitField1.set((long) (byte) 1);
        int int12 = bitField1.setBoolean(5, true);
        short short14 = bitField1.getShortRawValue((short) (byte) -98);
        short short17 = bitField1.setShortValue((short) (byte) 97, (short) (byte) 0);
        short short19 = bitField1.setShort((short) -43);
        short short21 = bitField1.setShort((short) 78);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) -11 + "'", short19 == (short) -11);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 111 + "'", short21 == (short) 111);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        long long13 = bitField1.setBoolean((long) ' ', false);
        boolean boolean15 = bitField1.isSet((long) 2);
        int int18 = bitField1.setValue(0, (int) (short) -1);
        long long21 = bitField1.setBoolean(0L, false);
        short short23 = bitField1.clearShort((short) (byte) 127);
        boolean boolean25 = bitField1.isSet((long) 106);
        byte byte27 = bitField1.clearByte((byte) 62);
        short short29 = bitField1.getShortValue((short) (byte) 127);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 30 + "'", short23 == (short) 30);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + byte27 + "' != '" + (byte) 30 + "'", byte27 == (byte) 30);
        org.junit.Assert.assertTrue("'" + short29 + "' != '" + (short) 97 + "'", short29 == (short) 97);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) 106);
        int int4 = bitField1.setValue(5, (int) (byte) 0);
        int int6 = bitField1.getValue(0);
        int int8 = bitField1.set(99);
        boolean boolean10 = bitField1.isSet((-7));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 107 + "'", int8 == 107);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short10 = bitField1.setShortBoolean((short) -1, true);
        long long12 = bitField1.getValue(20L);
        long long15 = bitField1.setBoolean((long) 2, false);
        int int17 = bitField1.clear((int) (byte) -98);
        int int19 = bitField1.getRawValue((int) (short) 113);
        long long21 = bitField1.getRawValue((long) (short) 48);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2L + "'", long15 == 2L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-98) + "'", int17 == (-98));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) -1);
        java.lang.Class<?> wildcardClass2 = bitField1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        long long13 = bitField1.setBoolean((long) ' ', false);
        boolean boolean15 = bitField1.isSet((long) 2);
        byte byte18 = bitField1.setByteBoolean((byte) 0, true);
        short short20 = bitField1.getShortRawValue((short) -98);
        long long22 = bitField1.set(10L);
        long long24 = bitField1.clear((long) '#');
        byte byte26 = bitField1.clearByte((byte) 111);
        long long28 = bitField1.set((long) (-98));
        long long30 = bitField1.getRawValue((long) (short) 96);
        boolean boolean32 = bitField1.isSet((long) (short) 127);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 97 + "'", byte18 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 107L + "'", long22 == 107L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 2L + "'", long24 == 2L);
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 14 + "'", byte26 == (byte) 14);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 96L + "'", long30 == 96L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        int int12 = bitField1.getRawValue((int) (short) -1);
        long long14 = bitField1.getValue((long) (short) 96);
        int int16 = bitField1.set(97);
        int int18 = bitField1.getValue((int) (short) -33);
        byte byte21 = bitField1.setByteBoolean((byte) 123, false);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 96L + "'", long14 == 96L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 65 + "'", int18 == 65);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 26 + "'", byte21 == (byte) 26);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 97);
        long long3 = bitField1.clear(0L);
        int int6 = bitField1.setValue(100, 0);
        int int8 = bitField1.clear(0);
        int int11 = bitField1.setValue((int) (short) -98, 127);
        long long13 = bitField1.set((long) 95);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 127L + "'", long13 == 127L);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        int int15 = bitField1.clear(2);
        byte byte17 = bitField1.clearByte((byte) 1);
        long long19 = bitField1.set((long) (byte) 101);
        int int21 = bitField1.clear((int) (short) -108);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 101L + "'", long19 == 101L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-108) + "'", int21 == (-108));
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        int int12 = bitField1.getRawValue((int) (short) -1);
        boolean boolean14 = bitField1.isSet((long) (-1));
        boolean boolean16 = bitField1.isAllSet((int) '#');
        byte byte19 = bitField1.setByteBoolean((byte) 0, true);
        byte byte22 = bitField1.setByteBoolean((byte) 0, true);
        long long24 = bitField1.set(69L);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 97 + "'", byte19 == (byte) 97);
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 97 + "'", byte22 == (byte) 97);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 101L + "'", long24 == 101L);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        int int16 = bitField1.setValue((int) (byte) -1, (int) (short) 10);
        long long18 = bitField1.getValue((long) 2);
        long long20 = bitField1.getValue((long) 97);
        boolean boolean22 = bitField1.isAllSet(97L);
        int int24 = bitField1.clear(107);
        short short27 = bitField1.setShortBoolean((short) -33, true);
        long long29 = bitField1.set((long) (short) 32);
        boolean boolean31 = bitField1.isSet((long) (short) 12);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-98) + "'", int16 == (-98));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) -1 + "'", short27 == (short) -1);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 97L + "'", long29 == 97L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) 97);
        byte byte3 = bitField1.setByte((byte) 97);
        int int5 = bitField1.set((int) (short) 96);
        long long7 = bitField1.clear((long) (short) -37);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 97 + "'", byte3 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-102L) + "'", long7 == (-102L));
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        short short5 = bitField1.getShortRawValue((short) 0);
        byte byte8 = bitField1.setByteBoolean((byte) -1, true);
        long long10 = bitField1.clear((long) 1);
        boolean boolean12 = bitField1.isAllSet((-97));
        long long14 = bitField1.set((long) 63);
        boolean boolean16 = bitField1.isAllSet((int) (short) 14);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 127L + "'", long14 == 127L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        long long16 = bitField1.setValue((long) (-1), (long) (short) 97);
        long long18 = bitField1.clear(1L);
        long long20 = bitField1.clear(52L);
        byte byte22 = bitField1.clearByte((byte) 62);
        byte byte24 = bitField1.clearByte((byte) -11);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 20L + "'", long20 == 20L);
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 30 + "'", byte22 == (byte) 30);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) -108 + "'", byte24 == (byte) -108);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        long long13 = bitField1.setBoolean((long) ' ', false);
        boolean boolean15 = bitField1.isSet((long) 2);
        int int18 = bitField1.setValue(0, (int) (short) -1);
        long long21 = bitField1.setBoolean(0L, false);
        short short23 = bitField1.clearShort((short) (byte) 127);
        byte byte26 = bitField1.setByteBoolean((byte) 127, false);
        byte byte28 = bitField1.setByte((byte) -98);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 30 + "'", short23 == (short) 30);
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 30 + "'", byte26 == (byte) 30);
        org.junit.Assert.assertTrue("'" + byte28 + "' != '" + (byte) -1 + "'", byte28 == (byte) -1);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 14);
        short short4 = bitField1.setShortBoolean((short) (byte) 1, true);
        boolean boolean6 = bitField1.isSet((-53L));
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 15 + "'", short4 == (short) 15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        boolean boolean3 = bitField1.isAllSet((long) '4');
        int int5 = bitField1.getValue((int) (byte) 0);
        short short7 = bitField1.setShort((short) (byte) 0);
        short short9 = bitField1.getShortRawValue((short) (byte) 0);
        long long11 = bitField1.clear((long) (-1));
        byte byte13 = bitField1.setByte((byte) -1);
        int int15 = bitField1.getRawValue(97);
        long long17 = bitField1.getRawValue((long) 117);
        byte byte19 = bitField1.setByte((byte) 111);
        long long22 = bitField1.setValue((long) (byte) 127, (long) 69);
        short short24 = bitField1.clearShort((short) 11);
        long long27 = bitField1.setValue(98L, (long) (-17));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 97 + "'", short7 == (short) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-98L) + "'", long11 == (-98L));
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 111 + "'", byte19 == (byte) 111);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 95L + "'", long22 == 95L);
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 10 + "'", short24 == (short) 10);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 99L + "'", long27 == 99L);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(100L);
        int int4 = bitField1.setValue((int) (short) 5, (int) (byte) 127);
        long long7 = bitField1.setValue((long) (short) 1, (-114L));
        int int9 = bitField1.getValue((int) (byte) 117);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 33L + "'", long7 == 33L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 25 + "'", int9 == 25);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        int int12 = bitField1.getRawValue((int) (short) -1);
        long long14 = bitField1.getValue((long) (short) 96);
        long long16 = bitField1.set((long) 96);
        long long19 = bitField1.setBoolean((long) 100, true);
        byte byte21 = bitField1.clearByte((byte) 10);
        boolean boolean23 = bitField1.isAllSet((long) (short) -5);
        boolean boolean25 = bitField1.isAllSet(46);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 96L + "'", long14 == 96L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 101L + "'", long19 == 101L);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 10 + "'", byte21 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        boolean boolean3 = bitField1.isAllSet((long) '4');
        int int5 = bitField1.getValue((int) (byte) 0);
        short short7 = bitField1.setShort((short) (byte) 0);
        short short9 = bitField1.getShortRawValue((short) (byte) 0);
        long long11 = bitField1.clear((long) (-1));
        byte byte13 = bitField1.setByte((byte) -1);
        int int15 = bitField1.getRawValue(97);
        long long17 = bitField1.getRawValue((long) 117);
        long long19 = bitField1.getRawValue((long) (short) -33);
        int int22 = bitField1.setValue((int) (byte) 127, (int) '#');
        long long24 = bitField1.getRawValue((long) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 97 + "'", short7 == (short) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-98L) + "'", long11 == (-98L));
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 65L + "'", long19 == 65L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 63 + "'", int22 == 63);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 97L + "'", long24 == 97L);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        long long13 = bitField1.setBoolean((long) ' ', false);
        boolean boolean15 = bitField1.isSet((long) 2);
        int int18 = bitField1.setValue(0, (int) (short) -1);
        byte byte21 = bitField1.setByteBoolean((byte) 1, true);
        int int23 = bitField1.set((int) '#');
        java.lang.Class<?> wildcardClass24 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 97 + "'", byte21 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 99 + "'", int23 == 99);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.setShort((short) (byte) -1);
        long long12 = bitField1.setBoolean(116L, true);
        java.lang.Class<?> wildcardClass13 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 117L + "'", long12 == 117L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short4 = bitField1.setShortBoolean((short) 96, true);
        short short7 = bitField1.setShortValue((short) 100, (short) (byte) -1);
        int int9 = bitField1.getValue(96);
        boolean boolean11 = bitField1.isSet(0);
        short short13 = bitField1.setShort((short) 0);
        int int15 = bitField1.getRawValue(5);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 97 + "'", short4 == (short) 97);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 101 + "'", short7 == (short) 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 96 + "'", int9 == 96);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 97 + "'", short13 == (short) 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        short short5 = bitField1.getShortRawValue((short) 0);
        int int8 = bitField1.setValue(1, 96);
        long long10 = bitField1.getValue((long) 100);
        short short13 = bitField1.setShortBoolean((short) 0, true);
        long long16 = bitField1.setValue((long) (-1), 8L);
        short short18 = bitField1.getShortRawValue((short) 1);
        java.lang.Class<?> wildcardClass19 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 96 + "'", int8 == 96);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 96L + "'", long10 == 96L);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 97 + "'", short13 == (short) 97);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-98L) + "'", long16 == (-98L));
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 1 + "'", short18 == (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        int int15 = bitField1.clear(2);
        long long17 = bitField1.getRawValue((long) (short) 1);
        byte byte19 = bitField1.clearByte((byte) 1);
        int int21 = bitField1.getRawValue(0);
        int int23 = bitField1.set((int) 'a');
        short short25 = bitField1.setShort((short) (byte) 10);
        short short27 = bitField1.setShort((short) -1);
        int int29 = bitField1.getRawValue((int) (byte) 14);
        long long31 = bitField1.getValue(0L);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 107 + "'", short25 == (short) 107);
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) -1 + "'", short27 == (short) -1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        byte byte6 = bitField1.setByteBoolean((byte) 10, false);
        boolean boolean8 = bitField1.isAllSet((int) (short) 11);
        byte byte10 = bitField1.clearByte((byte) 106);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 10 + "'", byte10 == (byte) 10);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) (short) 62);
        int int3 = bitField1.clear((int) (byte) -66);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-128) + "'", int3 == (-128));
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        int int16 = bitField1.setValue((int) (byte) -1, (int) (short) 10);
        long long18 = bitField1.getValue((long) 2);
        long long20 = bitField1.getValue((long) 97);
        boolean boolean22 = bitField1.isAllSet(97L);
        int int24 = bitField1.clear(107);
        short short26 = bitField1.getShortRawValue((short) 10);
        boolean boolean28 = bitField1.isSet(30L);
        short short30 = bitField1.clearShort((short) 30);
        int int32 = bitField1.getValue((int) (byte) -22);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-98) + "'", int16 == (-98));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 0 + "'", short26 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + short30 + "' != '" + (short) 30 + "'", short30 == (short) 30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 96 + "'", int32 == 96);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        long long16 = bitField1.setValue((long) (-1), (long) (short) 97);
        long long18 = bitField1.clear(1L);
        long long20 = bitField1.clear(52L);
        byte byte22 = bitField1.setByte((byte) 5);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 20L + "'", long20 == 20L);
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 101 + "'", byte22 == (byte) 101);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        short short12 = bitField1.getShortRawValue((short) (byte) 10);
        int int14 = bitField1.getRawValue((int) (byte) -1);
        long long17 = bitField1.setValue((long) (-1), (long) (byte) 10);
        java.lang.Class<?> wildcardClass18 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-98L) + "'", long17 == (-98L));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short4 = bitField1.setShortBoolean((short) 96, true);
        int int6 = bitField1.getRawValue((int) (short) 100);
        byte byte8 = bitField1.clearByte((byte) 100);
        boolean boolean10 = bitField1.isSet((long) (short) 0);
        int int13 = bitField1.setValue((int) (byte) 97, (int) (byte) 0);
        byte byte15 = bitField1.setByte((byte) -1);
        long long18 = bitField1.setBoolean((long) (short) 14, true);
        long long21 = bitField1.setValue((long) 96, (long) 0);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 97 + "'", short4 == (short) 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 96 + "'", int6 == 96);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 4 + "'", byte8 == (byte) 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) -1 + "'", byte15 == (byte) -1);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 111L + "'", long18 == 111L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        int int16 = bitField1.setValue((int) (byte) -1, (int) (short) 10);
        long long18 = bitField1.getValue((long) 2);
        long long20 = bitField1.getValue((long) 97);
        long long23 = bitField1.setValue((long) (byte) 1, (long) 107);
        short short26 = bitField1.setShortBoolean((short) (byte) 101, true);
        long long29 = bitField1.setValue((long) (short) 96, (long) 10);
        short short32 = bitField1.setShortBoolean((short) (byte) 10, false);
        long long35 = bitField1.setValue(107L, (long) (short) 113);
        long long37 = bitField1.set((long) 21);
        long long40 = bitField1.setBoolean((long) (short) -108, true);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-98) + "'", int16 == (-98));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 97L + "'", long23 == 97L);
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 101 + "'", short26 == (short) 101);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + short32 + "' != '" + (short) 10 + "'", short32 == (short) 10);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 107L + "'", long35 == 107L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 117L + "'", long37 == 117L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-11L) + "'", long40 == (-11L));
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        boolean boolean3 = bitField1.isAllSet((long) '4');
        int int5 = bitField1.getValue((int) (byte) 0);
        short short7 = bitField1.setShort((short) (byte) 0);
        short short9 = bitField1.getShortRawValue((short) (byte) 0);
        long long11 = bitField1.clear((long) (-1));
        byte byte13 = bitField1.setByte((byte) -1);
        int int15 = bitField1.getRawValue(97);
        long long17 = bitField1.getRawValue((long) 117);
        byte byte19 = bitField1.setByte((byte) 4);
        int int21 = bitField1.getRawValue((-97));
        long long23 = bitField1.clear((long) 20);
        boolean boolean25 = bitField1.isAllSet((int) (short) -97);
        short short27 = bitField1.getShortRawValue((short) (byte) 4);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 97 + "'", short7 == (short) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-98L) + "'", long11 == (-98L));
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 101 + "'", byte19 == (byte) 101);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 20L + "'", long23 == 20L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 0 + "'", short27 == (short) 0);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short4 = bitField1.setShortBoolean((short) 96, true);
        byte byte6 = bitField1.clearByte((byte) 4);
        boolean boolean8 = bitField1.isAllSet(69);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 97 + "'", short4 == (short) 97);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 4 + "'", byte6 == (byte) 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short10 = bitField1.setShortBoolean((short) -1, true);
        long long12 = bitField1.getValue(20L);
        long long15 = bitField1.setBoolean((long) 2, false);
        int int17 = bitField1.clear((int) (byte) -98);
        int int19 = bitField1.getRawValue((int) (short) 113);
        int int21 = bitField1.clear((int) (short) 113);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2L + "'", long15 == 2L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-98) + "'", int17 == (-98));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 16 + "'", int21 == 16);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) (byte) 100);
        short short11 = bitField1.getShortValue((short) 97);
        int int14 = bitField1.setBoolean((int) (short) 30, false);
        int int17 = bitField1.setValue(62, (int) (byte) 106);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 96 + "'", short9 == (short) 96);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 97 + "'", short11 == (short) 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 30 + "'", int14 == 30);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 126 + "'", int17 == 126);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short4 = bitField1.setShortBoolean((short) 96, true);
        int int6 = bitField1.getRawValue((int) (short) 100);
        long long8 = bitField1.set(117L);
        int int11 = bitField1.setValue((int) (short) 48, (int) (short) 16);
        int int14 = bitField1.setValue((int) (byte) -1, 0);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 97 + "'", short4 == (short) 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 96 + "'", int6 == 96);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 117L + "'", long8 == 117L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-98) + "'", int14 == (-98));
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        long long16 = bitField1.setValue((long) (-1), (long) (short) 97);
        byte byte18 = bitField1.clearByte((byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) -98 + "'", byte18 == (byte) -98);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        int int16 = bitField1.setValue((int) (byte) -1, (int) (short) 10);
        long long18 = bitField1.getValue((long) 2);
        long long20 = bitField1.getValue((long) 97);
        boolean boolean22 = bitField1.isAllSet(97L);
        int int24 = bitField1.clear(107);
        short short26 = bitField1.clearShort((short) (byte) 4);
        boolean boolean28 = bitField1.isAllSet((long) (short) 11);
        boolean boolean30 = bitField1.isAllSet((long) (short) 26);
        byte byte32 = bitField1.clearByte((byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-98) + "'", int16 == (-98));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 4 + "'", short26 == (short) 4);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + byte32 + "' != '" + (byte) -98 + "'", byte32 == (byte) -98);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        boolean boolean3 = bitField1.isAllSet((long) '4');
        long long5 = bitField1.getValue((long) (short) 100);
        long long8 = bitField1.setValue((long) '4', (long) (short) 96);
        long long10 = bitField1.clear(20L);
        byte byte13 = bitField1.setByteBoolean((byte) -108, false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 96L + "'", long5 == 96L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 116L + "'", long8 == 116L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 20L + "'", long10 == 20L);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -108 + "'", byte13 == (byte) -108);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 30);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short4 = bitField1.setShortBoolean((short) 96, true);
        int int6 = bitField1.getRawValue((int) (short) 100);
        int int8 = bitField1.getValue((int) (short) -98);
        short short10 = bitField1.setShort((short) 1);
        long long12 = bitField1.getValue((long) (short) -8);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 97 + "'", short4 == (short) 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 96 + "'", int6 == 96);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 97 + "'", short10 == (short) 97);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 96L + "'", long12 == 96L);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        short short5 = bitField1.getShortRawValue((short) 0);
        int int8 = bitField1.setValue(1, 96);
        long long10 = bitField1.getValue((long) 100);
        short short13 = bitField1.setShortValue((short) 14, (short) (byte) 4);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 96 + "'", int8 == 96);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 96L + "'", long10 == 96L);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 14 + "'", short13 == (short) 14);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        long long9 = bitField1.set((long) (byte) 1);
        int int11 = bitField1.set((int) '4');
        byte byte13 = bitField1.clearByte((byte) 123);
        java.lang.Class<?> wildcardClass14 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 117 + "'", int11 == 117);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 26 + "'", byte13 == (byte) 26);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) ' ');
        int int3 = bitField1.getValue((int) (byte) 97);
        short short5 = bitField1.getShortRawValue((short) -8);
        short short8 = bitField1.setShortValue((short) -37, (short) -8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 32 + "'", short5 == (short) 32);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -37 + "'", short8 == (short) -37);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(4);
        int int3 = bitField1.getValue(96);
        short short5 = bitField1.getShortValue((short) 30);
        long long7 = bitField1.getValue((long) (-108));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        boolean boolean3 = bitField1.isAllSet((long) '4');
        int int5 = bitField1.getValue((int) (byte) 0);
        short short7 = bitField1.setShort((short) (byte) 0);
        short short9 = bitField1.getShortRawValue((short) (byte) 0);
        byte byte12 = bitField1.setByteBoolean((byte) -107, true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 97 + "'", short7 == (short) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) -11 + "'", byte12 == (byte) -11);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        int int12 = bitField1.getRawValue((int) (short) -1);
        boolean boolean14 = bitField1.isSet((long) (-1));
        boolean boolean16 = bitField1.isAllSet((int) '#');
        byte byte19 = bitField1.setByteBoolean((byte) 0, true);
        long long22 = bitField1.setValue((long) 4, (long) 48);
        int int24 = bitField1.clear((int) (byte) -5);
        int int27 = bitField1.setBoolean((int) (short) 106, false);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 97 + "'", byte19 == (byte) 97);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 36L + "'", long22 == 36L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-102) + "'", int24 == (-102));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) 0);
        short short4 = bitField1.setShortBoolean((short) (byte) 4, false);
        int int6 = bitField1.getValue(117);
        short short8 = bitField1.clearShort((short) 112);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 4 + "'", short4 == (short) 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 112 + "'", short8 == (short) 112);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        byte byte5 = bitField1.setByte((byte) 101);
        long long7 = bitField1.getRawValue((long) (short) 32);
        short short9 = bitField1.getShortRawValue((short) (byte) -11);
        short short12 = bitField1.setShortValue((short) 0, (short) (byte) -124);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 101 + "'", byte5 == (byte) 101);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 97 + "'", short9 == (short) 97);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        long long7 = bitField1.set((long) ' ');
        short short9 = bitField1.clearShort((short) 11);
        boolean boolean11 = bitField1.isSet(10);
        java.lang.Class<?> wildcardClass12 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        long long16 = bitField1.setValue((long) (-1), (long) (short) 97);
        short short19 = bitField1.setShortBoolean((short) 96, true);
        short short21 = bitField1.getShortValue((short) (byte) 0);
        short short23 = bitField1.getShortRawValue((short) -97);
        short short26 = bitField1.setShortValue((short) (byte) 10, (short) (byte) 1);
        long long28 = bitField1.clear(97L);
        long long31 = bitField1.setValue((long) '#', (long) (short) -2);
        short short34 = bitField1.setShortBoolean((short) 4, true);
        int int36 = bitField1.getRawValue(91);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 97 + "'", short19 == (short) 97);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 0 + "'", short21 == (short) 0);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 1 + "'", short23 == (short) 1);
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 11 + "'", short26 == (short) 11);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 98L + "'", long31 == 98L);
        org.junit.Assert.assertTrue("'" + short34 + "' != '" + (short) 101 + "'", short34 == (short) 101);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 65 + "'", int36 == 65);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) '4');
        int int4 = bitField1.setValue((int) (byte) -1, (int) (byte) 97);
        int int6 = bitField1.getRawValue((int) (short) 113);
        boolean boolean8 = bitField1.isAllSet((int) (short) 111);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-49) + "'", int4 == (-49));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(1L);
        short short3 = bitField1.clearShort((short) -1);
        short short6 = bitField1.setShortBoolean((short) (byte) -108, false);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -2 + "'", short3 == (short) -2);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -108 + "'", short6 == (short) -108);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        int int12 = bitField1.getRawValue((int) (short) -1);
        long long14 = bitField1.getRawValue((long) ' ');
        int int16 = bitField1.getValue(96);
        int int18 = bitField1.clear((-102));
        byte byte20 = bitField1.clearByte((byte) 68);
        byte byte22 = bitField1.setByte((byte) 5);
        long long25 = bitField1.setValue((long) 10, (long) (short) 111);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 96 + "'", int16 == 96);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-102) + "'", int18 == (-102));
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 4 + "'", byte20 == (byte) 4);
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 101 + "'", byte22 == (byte) 101);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 107L + "'", long25 == 107L);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(62L);
        long long3 = bitField1.getValue(100L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 18L + "'", long3 == 18L);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) (short) 4);
        short short4 = bitField1.setShortValue((short) 107, (short) -98);
        boolean boolean6 = bitField1.isAllSet((long) 116);
        long long8 = bitField1.set((long) (-97));
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 107 + "'", short4 == (short) 107);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-97L) + "'", long8 == (-97L));
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short4 = bitField1.setShortBoolean((short) 96, true);
        int int6 = bitField1.getRawValue((int) (short) 100);
        long long8 = bitField1.set(117L);
        int int10 = bitField1.getRawValue(107);
        int int12 = bitField1.clear((int) (short) -98);
        short short14 = bitField1.clearShort((short) (byte) 4);
        short short17 = bitField1.setShortBoolean((short) (byte) 123, true);
        int int19 = bitField1.getValue((int) (short) 65);
        long long22 = bitField1.setBoolean((-113L), false);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 97 + "'", short4 == (short) 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 96 + "'", int6 == 96);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 117L + "'", long8 == 117L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-98) + "'", int12 == (-98));
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 4 + "'", short14 == (short) 4);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 123 + "'", short17 == (short) 123);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 65 + "'", int19 == 65);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-114L) + "'", long22 == (-114L));
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) (short) 14);
        boolean boolean3 = bitField1.isAllSet(26L);
        boolean boolean5 = bitField1.isSet((long) 16);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        long long9 = bitField1.set((long) (byte) 1);
        int int11 = bitField1.set((int) '4');
        short short14 = bitField1.setShortBoolean((short) -98, false);
        byte byte16 = bitField1.setByte((byte) 116);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 117 + "'", int11 == 117);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) -98 + "'", short14 == (short) -98);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 117 + "'", byte16 == (byte) 117);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        long long13 = bitField1.setBoolean((long) ' ', false);
        boolean boolean15 = bitField1.isSet((long) 2);
        int int18 = bitField1.setValue(0, (int) (short) -1);
        byte byte21 = bitField1.setByteBoolean((byte) 1, true);
        byte byte23 = bitField1.setByte((byte) -1);
        byte byte26 = bitField1.setByteBoolean((byte) 62, false);
        long long28 = bitField1.clear((long) (-43));
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 97 + "'", byte21 == (byte) 97);
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) -1 + "'", byte23 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 30 + "'", byte26 == (byte) 30);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-108L) + "'", long28 == (-108L));
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-1L));
        short short4 = bitField1.setShortValue((short) 10, (short) (byte) -1);
        byte byte6 = bitField1.setByte((byte) 30);
        boolean boolean8 = bitField1.isSet(98L);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -1 + "'", short4 == (short) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short4 = bitField1.setShortBoolean((short) 96, true);
        long long6 = bitField1.clear((long) (byte) -98);
        short short8 = bitField1.clearShort((short) 112);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 97 + "'", short4 == (short) 97);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-98L) + "'", long6 == (-98L));
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 16 + "'", short8 == (short) 16);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        long long13 = bitField1.setBoolean((long) ' ', false);
        boolean boolean15 = bitField1.isSet((long) 2);
        byte byte18 = bitField1.setByteBoolean((byte) 0, true);
        short short20 = bitField1.getShortRawValue((short) -98);
        long long23 = bitField1.setBoolean((long) ' ', true);
        long long25 = bitField1.set((long) 107);
        long long27 = bitField1.getValue((long) 20);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 97 + "'", byte18 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 97L + "'", long23 == 97L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 107L + "'", long25 == 107L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short4 = bitField1.setShortBoolean((short) 96, true);
        int int6 = bitField1.getRawValue((int) (short) 100);
        byte byte8 = bitField1.clearByte((byte) 100);
        byte byte11 = bitField1.setByteBoolean((byte) 4, false);
        boolean boolean13 = bitField1.isAllSet(20);
        int int15 = bitField1.clear(43);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 97 + "'", short4 == (short) 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 96 + "'", int6 == 96);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 4 + "'", byte8 == (byte) 4);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 4 + "'", byte11 == (byte) 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short4 = bitField1.setShortBoolean((short) 96, true);
        int int6 = bitField1.getRawValue((int) (short) 100);
        long long8 = bitField1.set(117L);
        int int10 = bitField1.getRawValue(107);
        byte byte12 = bitField1.clearByte((byte) 1);
        byte byte14 = bitField1.clearByte((byte) 4);
        short short16 = bitField1.getShortRawValue((short) 16);
        boolean boolean18 = bitField1.isAllSet((int) (short) 4);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 97 + "'", short4 == (short) 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 96 + "'", int6 == 96);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 117L + "'", long8 == 117L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 4 + "'", byte14 == (byte) 4);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 0 + "'", short16 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        long long13 = bitField1.setBoolean((long) ' ', false);
        boolean boolean15 = bitField1.isSet((long) 2);
        long long17 = bitField1.clear((long) (byte) 97);
        boolean boolean19 = bitField1.isAllSet(97);
        long long22 = bitField1.setBoolean(11L, true);
        int int24 = bitField1.set(113);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 107L + "'", long22 == 107L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 113 + "'", int24 == 113);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        long long13 = bitField1.setBoolean((long) ' ', false);
        boolean boolean15 = bitField1.isSet((long) 2);
        long long17 = bitField1.clear((long) (byte) 97);
        byte byte20 = bitField1.setByteBoolean((byte) 101, true);
        int int23 = bitField1.setBoolean(0, false);
        int int25 = bitField1.clear(123);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 101 + "'", byte20 == (byte) 101);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 26 + "'", int25 == 26);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 100);
        long long3 = bitField1.clear((long) (short) 101);
        int int5 = bitField1.set(96);
        boolean boolean7 = bitField1.isSet((long) (short) 96);
        short short9 = bitField1.getShortRawValue((short) (byte) 14);
        int int11 = bitField1.getRawValue((int) (byte) 20);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 4 + "'", short9 == (short) 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        boolean boolean15 = bitField1.isSet(117);
        int int18 = bitField1.setBoolean((-97), false);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-98) + "'", int18 == (-98));
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(14);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        short short5 = bitField1.getShortRawValue((short) (byte) -1);
        byte byte8 = bitField1.setByteBoolean((byte) 97, false);
        int int11 = bitField1.setValue((int) (short) 0, (int) (short) -33);
        short short13 = bitField1.getShortValue((short) (byte) 62);
        int int15 = bitField1.getRawValue(0);
        short short18 = bitField1.setShortValue((short) 20, (short) (byte) -31);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 97 + "'", short5 == (short) 97);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 65 + "'", int11 == 65);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 32 + "'", short13 == (short) 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 117 + "'", short18 == (short) 117);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        long long16 = bitField1.setValue((long) (-1), (long) (short) 97);
        short short19 = bitField1.setShortBoolean((short) 96, true);
        short short21 = bitField1.getShortValue((short) (byte) 0);
        short short23 = bitField1.getShortRawValue((short) -97);
        short short26 = bitField1.setShortValue((short) (byte) 10, (short) (byte) 1);
        long long28 = bitField1.clear(97L);
        long long31 = bitField1.setValue((long) '#', (long) (short) -2);
        short short34 = bitField1.setShortBoolean((short) 4, true);
        short short37 = bitField1.setShortBoolean((short) (byte) 97, true);
        long long40 = bitField1.setBoolean((long) (short) 11, false);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 97 + "'", short19 == (short) 97);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 0 + "'", short21 == (short) 0);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 1 + "'", short23 == (short) 1);
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 11 + "'", short26 == (short) 11);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 98L + "'", long31 == 98L);
        org.junit.Assert.assertTrue("'" + short34 + "' != '" + (short) 101 + "'", short34 == (short) 101);
        org.junit.Assert.assertTrue("'" + short37 + "' != '" + (short) 97 + "'", short37 == (short) 97);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 10L + "'", long40 == 10L);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short4 = bitField1.setShortBoolean((short) 96, true);
        short short7 = bitField1.setShortValue((short) 100, (short) (byte) -1);
        long long9 = bitField1.getRawValue(2L);
        long long12 = bitField1.setValue(116L, (long) 96);
        int int14 = bitField1.getRawValue(30);
        short short17 = bitField1.setShortBoolean((short) 5, false);
        long long19 = bitField1.set(97L);
        long long21 = bitField1.set((long) (byte) 26);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 97 + "'", short4 == (short) 97);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 101 + "'", short7 == (short) 101);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 116L + "'", long12 == 116L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 4 + "'", short17 == (short) 4);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 97L + "'", long19 == 97L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 123L + "'", long21 == 123L);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short10 = bitField1.setShortBoolean((short) -1, true);
        long long12 = bitField1.getValue(20L);
        long long15 = bitField1.setBoolean((long) 2, false);
        int int18 = bitField1.setValue((int) (short) 100, (int) (short) 107);
        short short20 = bitField1.getShortValue((short) 11);
        int int23 = bitField1.setValue((int) (short) 75, (int) (short) 91);
        short short25 = bitField1.getShortValue((short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2L + "'", long15 == 2L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 1 + "'", short20 == (short) 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 75 + "'", int23 == 75);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 96 + "'", short25 == (short) 96);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) (short) 11);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        long long16 = bitField1.setValue((long) (-1), (long) (short) 97);
        long long18 = bitField1.clear(1L);
        short short20 = bitField1.setShort((short) (byte) 97);
        int int22 = bitField1.set((int) (short) -97);
        short short24 = bitField1.setShort((short) 10);
        short short26 = bitField1.clearShort((short) 75);
        short short28 = bitField1.clearShort((short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 97 + "'", short20 == (short) 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 107 + "'", short24 == (short) 107);
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 10 + "'", short26 == (short) 10);
        org.junit.Assert.assertTrue("'" + short28 + "' != '" + (short) 0 + "'", short28 == (short) 0);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        long long16 = bitField1.setValue((long) (-1), (long) (short) 97);
        short short19 = bitField1.setShortBoolean((short) 96, true);
        short short21 = bitField1.getShortValue((short) (byte) 0);
        short short23 = bitField1.getShortRawValue((short) -97);
        short short26 = bitField1.setShortValue((short) (byte) 10, (short) (byte) 1);
        long long28 = bitField1.clear(97L);
        int int30 = bitField1.getRawValue(123);
        boolean boolean32 = bitField1.isAllSet(99L);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 97 + "'", short19 == (short) 97);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 0 + "'", short21 == (short) 0);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 1 + "'", short23 == (short) 1);
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 11 + "'", short26 == (short) 11);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        long long9 = bitField1.set((long) (byte) 1);
        boolean boolean11 = bitField1.isSet(1L);
        boolean boolean13 = bitField1.isAllSet((long) 20);
        boolean boolean15 = bitField1.isSet((int) (byte) 0);
        long long17 = bitField1.clear((long) (byte) 101);
        byte byte20 = bitField1.setByteBoolean((byte) 1, false);
        byte byte22 = bitField1.clearByte((byte) 106);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 4L + "'", long17 == 4L);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 0 + "'", byte20 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 10 + "'", byte22 == (byte) 10);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        byte byte5 = bitField1.setByte((byte) 101);
        java.lang.Class<?> wildcardClass6 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 101 + "'", byte5 == (byte) 101);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        int int12 = bitField1.getRawValue((int) (short) -1);
        boolean boolean14 = bitField1.isSet((long) (-1));
        boolean boolean16 = bitField1.isAllSet((int) '#');
        boolean boolean18 = bitField1.isSet((long) (byte) 1);
        long long21 = bitField1.setBoolean((long) 'a', true);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 97L + "'", long21 == 97L);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) (short) 4);
        short short4 = bitField1.setShortValue((short) 107, (short) -98);
        int int7 = bitField1.setValue((int) (short) -98, 0);
        int int10 = bitField1.setValue((-98), 101);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 107 + "'", short4 == (short) 107);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-102) + "'", int7 == (-102));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-98) + "'", int10 == (-98));
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        long long13 = bitField1.setBoolean((long) ' ', false);
        boolean boolean15 = bitField1.isSet((long) 2);
        byte byte18 = bitField1.setByteBoolean((byte) 0, true);
        short short20 = bitField1.getShortRawValue((short) -98);
        long long23 = bitField1.setBoolean((long) ' ', true);
        long long25 = bitField1.set((long) 107);
        byte byte28 = bitField1.setByteBoolean((byte) -98, false);
        byte byte30 = bitField1.setByte((byte) -108);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 97 + "'", byte18 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 97L + "'", long23 == 97L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 107L + "'", long25 == 107L);
        org.junit.Assert.assertTrue("'" + byte28 + "' != '" + (byte) -98 + "'", byte28 == (byte) -98);
        org.junit.Assert.assertTrue("'" + byte30 + "' != '" + (byte) -11 + "'", byte30 == (byte) -11);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        long long13 = bitField1.setBoolean((long) ' ', false);
        boolean boolean15 = bitField1.isSet((long) 2);
        int int18 = bitField1.setValue(0, (int) (short) -1);
        short short20 = bitField1.clearShort((short) 0);
        int int23 = bitField1.setBoolean(116, true);
        long long25 = bitField1.getValue((long) (short) 1);
        int int27 = bitField1.set((int) (short) 32);
        short short29 = bitField1.getShortRawValue((short) (byte) 30);
        java.lang.Class<?> wildcardClass30 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 117 + "'", int23 == 117);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertTrue("'" + short29 + "' != '" + (short) 0 + "'", short29 == (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        int int12 = bitField1.getRawValue((int) (short) -1);
        boolean boolean14 = bitField1.isSet((long) (-1));
        boolean boolean16 = bitField1.isAllSet((int) '#');
        byte byte19 = bitField1.setByteBoolean((byte) 0, true);
        byte byte22 = bitField1.setByteBoolean((byte) 0, true);
        long long24 = bitField1.clear(16L);
        int int26 = bitField1.getRawValue((-114));
        java.lang.Class<?> wildcardClass27 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 97 + "'", byte19 == (byte) 97);
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 97 + "'", byte22 == (byte) 97);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 16L + "'", long24 == 16L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) 97);
        byte byte3 = bitField1.setByte((byte) 97);
        byte byte5 = bitField1.setByte((byte) 10);
        long long8 = bitField1.setBoolean((long) (byte) 107, false);
        short short11 = bitField1.setShortValue((short) 107, (short) -98);
        long long14 = bitField1.setBoolean((long) (short) 122, false);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 97 + "'", byte3 == (byte) 97);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 107 + "'", byte5 == (byte) 107);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 26L + "'", long14 == 26L);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        boolean boolean3 = bitField1.isAllSet((long) '4');
        int int5 = bitField1.getValue((int) (byte) 0);
        short short7 = bitField1.setShort((short) (byte) 0);
        short short9 = bitField1.getShortRawValue((short) (byte) 0);
        long long11 = bitField1.clear((long) (-1));
        int int13 = bitField1.getRawValue((int) (short) 101);
        boolean boolean15 = bitField1.isAllSet((long) 'a');
        long long17 = bitField1.getValue((long) (short) -97);
        long long20 = bitField1.setValue(2L, (long) (byte) -5);
        byte byte23 = bitField1.setByteBoolean((byte) -31, false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 97 + "'", short7 == (short) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-98L) + "'", long11 == (-98L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 99L + "'", long20 == 99L);
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) -128 + "'", byte23 == (byte) -128);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        boolean boolean7 = bitField1.isSet(0L);
        int int9 = bitField1.set((int) ' ');
        short short11 = bitField1.getShortValue((short) 4);
        long long13 = bitField1.set(100L);
        int int16 = bitField1.setBoolean(107, false);
        int int18 = bitField1.set((int) (short) 96);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 101L + "'", long13 == 101L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) 97);
        byte byte3 = bitField1.setByte((byte) 97);
        short short5 = bitField1.getShortRawValue((short) 65);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 97 + "'", byte3 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 65 + "'", short5 == (short) 65);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        long long9 = bitField1.set((long) (byte) 1);
        int int11 = bitField1.set((int) '4');
        short short14 = bitField1.setShortBoolean((short) -98, false);
        int int17 = bitField1.setBoolean((int) (byte) 10, true);
        java.lang.Class<?> wildcardClass18 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 117 + "'", int11 == 117);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) -98 + "'", short14 == (short) -98);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 107 + "'", int17 == 107);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) 97);
        byte byte3 = bitField1.setByte((byte) 97);
        byte byte5 = bitField1.setByte((byte) 10);
        long long8 = bitField1.setBoolean((long) (byte) 107, false);
        short short11 = bitField1.setShortValue((short) 107, (short) -98);
        long long13 = bitField1.clear((long) (byte) -98);
        long long15 = bitField1.clear((long) (byte) 4);
        byte byte18 = bitField1.setByteBoolean((byte) 1, false);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 97 + "'", byte3 == (byte) 97);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 107 + "'", byte5 == (byte) 107);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-98L) + "'", long13 == (-98L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4L + "'", long15 == 4L);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 0 + "'", byte18 == (byte) 0);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) (short) -107);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short4 = bitField1.setShortBoolean((short) 96, true);
        int int6 = bitField1.getRawValue((int) (short) 100);
        byte byte8 = bitField1.clearByte((byte) 100);
        byte byte11 = bitField1.setByteBoolean((byte) 4, false);
        boolean boolean13 = bitField1.isAllSet(20);
        long long16 = bitField1.setBoolean((long) (byte) -98, true);
        byte byte18 = bitField1.clearByte((byte) 26);
        long long21 = bitField1.setValue((long) (-43), (long) (byte) -108);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 97 + "'", short4 == (short) 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 96 + "'", int6 == 96);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 4 + "'", byte8 == (byte) 4);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 4 + "'", byte11 == (byte) 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 26 + "'", byte18 == (byte) 26);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-108L) + "'", long21 == (-108L));
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        int int15 = bitField1.clear(2);
        long long17 = bitField1.getRawValue((long) (short) 1);
        long long19 = bitField1.set(0L);
        int int21 = bitField1.set((int) (byte) 4);
        byte byte23 = bitField1.setByte((byte) 100);
        long long25 = bitField1.getValue((long) 32);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 97L + "'", long19 == 97L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 101 + "'", int21 == 101);
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) 101 + "'", byte23 == (byte) 101);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 32L + "'", long25 == 32L);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        long long9 = bitField1.set((long) (byte) 1);
        int int12 = bitField1.setBoolean(5, true);
        short short14 = bitField1.getShortRawValue((short) (byte) -98);
        short short17 = bitField1.setShortValue((short) (byte) 97, (short) (byte) 0);
        short short19 = bitField1.setShort((short) -43);
        int int22 = bitField1.setBoolean(0, true);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) -11 + "'", short19 == (short) -11);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        long long13 = bitField1.setBoolean((long) ' ', false);
        boolean boolean15 = bitField1.isSet((long) 2);
        int int18 = bitField1.setValue(0, (int) (short) -1);
        byte byte21 = bitField1.setByteBoolean((byte) 1, true);
        byte byte23 = bitField1.setByte((byte) -1);
        int int26 = bitField1.setValue((int) (byte) -1, (int) (short) -98);
        long long28 = bitField1.set((long) (-5));
        short short31 = bitField1.setShortValue((short) 107, (short) 122);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 97 + "'", byte21 == (byte) 97);
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) -1 + "'", byte23 == (byte) -1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-98) + "'", int26 == (-98));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-5L) + "'", long28 == (-5L));
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) 106 + "'", short31 == (short) 106);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        short short12 = bitField1.getShortRawValue((short) (byte) 10);
        byte byte15 = bitField1.setByteBoolean((byte) 0, true);
        boolean boolean17 = bitField1.isSet(28L);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 97 + "'", byte15 == (byte) 97);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        int int15 = bitField1.clear(2);
        long long17 = bitField1.getRawValue((long) (short) 1);
        long long19 = bitField1.set(0L);
        int int21 = bitField1.set((int) (byte) 4);
        long long23 = bitField1.set((long) 32);
        long long25 = bitField1.getRawValue((long) (byte) 123);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 97L + "'", long19 == 97L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 101 + "'", int21 == 101);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 97L + "'", long23 == 97L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 97L + "'", long25 == 97L);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(32);
        short short3 = bitField1.setShort((short) 107);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 107 + "'", short3 == (short) 107);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        boolean boolean3 = bitField1.isAllSet((long) '4');
        int int5 = bitField1.getValue((int) (byte) 0);
        short short7 = bitField1.setShort((short) 1);
        byte byte9 = bitField1.setByte((byte) 4);
        long long11 = bitField1.set(10L);
        boolean boolean13 = bitField1.isSet((int) (short) 11);
        byte byte16 = bitField1.setByteBoolean((byte) 101, true);
        int int18 = bitField1.getValue((int) (short) 75);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 97 + "'", short7 == (short) 97);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 101 + "'", byte9 == (byte) 101);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 107L + "'", long11 == 107L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 101 + "'", byte16 == (byte) 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 65 + "'", int18 == 65);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        long long3 = bitField1.clear((long) (short) 0);
        boolean boolean5 = bitField1.isSet(26L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) (byte) 10);
        int int3 = bitField1.set(0);
        boolean boolean5 = bitField1.isSet(14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        byte byte13 = bitField1.setByteBoolean((byte) 100, true);
        long long15 = bitField1.getValue((long) (short) 101);
        int int17 = bitField1.set((int) (short) 64);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 101 + "'", byte13 == (byte) 101);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) (short) 62);
        byte byte3 = bitField1.setByte((byte) 111);
        long long6 = bitField1.setValue((long) (short) -8, 101L);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 127 + "'", byte3 == (byte) 127);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-54L) + "'", long6 == (-54L));
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) 97);
        byte byte3 = bitField1.setByte((byte) 97);
        boolean boolean5 = bitField1.isAllSet((int) (byte) -1);
        short short7 = bitField1.setShort((short) (byte) 123);
        long long9 = bitField1.clear(30L);
        int int11 = bitField1.set((int) (short) 117);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 97 + "'", byte3 == (byte) 97);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 123 + "'", short7 == (short) 123);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 30L + "'", long9 == 30L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 117 + "'", int11 == 117);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        long long8 = bitField1.setValue((long) ' ', (long) ' ');
        short short10 = bitField1.getShortValue((short) (byte) -1);
        int int12 = bitField1.set((int) (byte) 100);
        int int14 = bitField1.clear((int) (byte) 101);
        boolean boolean16 = bitField1.isAllSet((int) '4');
        boolean boolean18 = bitField1.isAllSet((int) (byte) 30);
        short short20 = bitField1.setShort((short) (byte) -102);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 97 + "'", short10 == (short) 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) -5 + "'", short20 == (short) -5);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) (short) 1);
        boolean boolean3 = bitField1.isSet((-102L));
        int int5 = bitField1.getRawValue((int) (short) 111);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) (byte) 100);
        int int11 = bitField1.set(0);
        short short13 = bitField1.getShortValue((short) 10);
        int int16 = bitField1.setValue((int) '#', (int) (byte) 14);
        long long19 = bitField1.setValue((long) 48, (long) (short) 65);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 96 + "'", short9 == (short) 96);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 0 + "'", short13 == (short) 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 81L + "'", long19 == 81L);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(100);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        int int15 = bitField1.clear(2);
        long long17 = bitField1.getValue(96L);
        byte byte19 = bitField1.clearByte((byte) 123);
        long long21 = bitField1.getValue(113L);
        int int23 = bitField1.getRawValue((int) (byte) -96);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 96L + "'", long17 == 96L);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 26 + "'", byte19 == (byte) 26);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 97L + "'", long21 == 97L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(69);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        int int12 = bitField1.getRawValue((int) (short) -1);
        boolean boolean14 = bitField1.isSet((long) (-1));
        int int17 = bitField1.setBoolean((int) (short) -98, false);
        int int20 = bitField1.setBoolean(64, false);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-98) + "'", int17 == (-98));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 3);
        boolean boolean3 = bitField1.isAllSet(101);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        boolean boolean3 = bitField1.isAllSet((long) '4');
        short short5 = bitField1.getShortRawValue((short) -97);
        int int8 = bitField1.setBoolean((int) (short) 3, false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        short short9 = bitField1.getShortValue((short) 0);
        boolean boolean11 = bitField1.isAllSet((int) (byte) 1);
        byte byte13 = bitField1.clearByte((byte) 97);
        int int16 = bitField1.setValue(4, (int) (byte) 1);
        short short18 = bitField1.clearShort((short) 96);
        boolean boolean20 = bitField1.isAllSet(0);
        long long22 = bitField1.getRawValue((long) (short) 75);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 0 + "'", short18 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 65L + "'", long22 == 65L);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) -7);
        short short4 = bitField1.setShortBoolean((short) 15, false);
        long long6 = bitField1.clear((long) (byte) -107);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 6 + "'", short4 == (short) 6);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-4294967292L) + "'", long6 == (-4294967292L));
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) (-97));
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        int int12 = bitField1.getRawValue((int) (short) -1);
        long long14 = bitField1.getValue((long) (short) 96);
        short short17 = bitField1.setShortBoolean((short) 0, false);
        boolean boolean19 = bitField1.isSet((long) (short) -1);
        int int21 = bitField1.getRawValue((int) (short) -1);
        short short24 = bitField1.setShortBoolean((short) -1, false);
        long long26 = bitField1.clear((long) (short) 97);
        int int28 = bitField1.clear((int) (short) 16);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 96L + "'", long14 == 96L);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) -98 + "'", short24 == (short) -98);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 16 + "'", int28 == 16);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        long long9 = bitField1.set((long) (byte) 1);
        int int12 = bitField1.setBoolean(5, true);
        short short14 = bitField1.getShortRawValue((short) (byte) -98);
        short short17 = bitField1.setShortBoolean((short) 107, false);
        int int19 = bitField1.getRawValue((int) (short) 20);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 10 + "'", short17 == (short) 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        short short3 = bitField1.getShortRawValue((short) (byte) 100);
        boolean boolean5 = bitField1.isSet((long) (short) 96);
        byte byte7 = bitField1.setByte((byte) 0);
        int int10 = bitField1.setBoolean((int) (byte) 0, false);
        int int12 = bitField1.getRawValue((int) (short) -1);
        long long14 = bitField1.getValue((long) (short) 96);
        int int16 = bitField1.set(97);
        int int18 = bitField1.getValue((int) (short) -33);
        short short20 = bitField1.setShort((short) 10);
        int int22 = bitField1.getRawValue((int) (short) 0);
        boolean boolean24 = bitField1.isAllSet(74);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 96 + "'", short3 == (short) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 97 + "'", byte7 == (byte) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 96L + "'", long14 == 96L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 65 + "'", int18 == 65);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 107 + "'", short20 == (short) 107);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((long) (short) 4);
        long long4 = bitField1.setValue((long) (short) -98, (long) ' ');
        long long7 = bitField1.setValue(16L, (-97L));
        short short10 = bitField1.setShortBoolean((short) 2, true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-102L) + "'", long4 == (-102L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 20L + "'", long7 == 20L);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 6 + "'", short10 == (short) 6);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-54L));
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 0);
        long long4 = bitField1.setBoolean(117L, false);
        int int6 = bitField1.clear((int) (byte) 1);
        java.lang.Class<?> wildcardClass7 = bitField1.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 117L + "'", long4 == 117L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
}

