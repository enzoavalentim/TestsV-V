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
        byte[] byteArray0 = null;
        byte[] byteArray3 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray0, (int) 'a', (int) 'a');
        org.junit.Assert.assertNull(byteArray3);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.lang.reflect.Type[] typeArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_TYPE_ARRAY;
        org.junit.Assert.assertNotNull(typeArray0);
        org.junit.Assert.assertArrayEquals(typeArray0, new java.lang.reflect.Type[] {});
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        char[] charArray3 = new char[] { 'a', 'a', 'a' };
        int[] intArray9 = new int[] { (byte) 1, (short) 10, (byte) -1, '#', (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray10 = org.apache.commons.lang3.ArrayUtils.removeAll(charArray3, intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] { 'a', 'a', 'a' });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 10, (-1), 35, 10 });
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        int[] intArray0 = null;
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.contains(intArray0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        double[] doubleArray0 = new double[] {};
        int[] intArray3 = new int[] { 'a', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.removeAll(doubleArray0, intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 97, 32 });
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        long[] longArray0 = new long[] {};
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray0, (long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray4 = org.apache.commons.lang3.ArrayUtils.remove(longArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertArrayEquals(longArray0, new long[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.apache.commons.lang3.BooleanUtils booleanUtils0 = new org.apache.commons.lang3.BooleanUtils();
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        boolean[] booleanArray1 = new boolean[] {};
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray1);
        boolean[] booleanArray7 = new boolean[] { false, true, true, false };
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.insert((int) (byte) -1, booleanArray1, booleanArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray1);
        assertBooleanArrayEquals(booleanArray1, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(booleanArray7);
        assertBooleanArrayEquals(booleanArray7, new boolean[] { false, true, true, false });
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        char[] charArray1 = new char[] { '4' };
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray1, 'a');
        java.lang.String str5 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) int3, "hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        java.lang.Object obj1 = org.apache.commons.lang3.ArrayUtils.toPrimitive((java.lang.Object) (short) 1);
        org.junit.Assert.assertEquals("'" + obj1 + "' != '" + (short) 1 + "'", obj1, (short) 1);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        double[] doubleArray6 = new double[] { (byte) -1, (byte) 1, 100L, (byte) 10, 1L };
        double[] doubleArray9 = new double[] { (byte) 10, 1 };
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.insert(0, doubleArray6, doubleArray9);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.add(doubleArray10, (int) (short) 100, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 7");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 1.0d, 100.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 1.0d, (-1.0d), 1.0d, 100.0d, 10.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        int int0 = org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        boolean[] booleanArray0 = null;
        boolean[] booleanArray2 = org.apache.commons.lang3.ArrayUtils.removeAllOccurences(booleanArray0, false);
        org.junit.Assert.assertNull(booleanArray2);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean("-1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 100, (java.lang.Integer) 100, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("-1");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.isFalse((java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.apache.commons.lang3.arch.Processor processor1 = org.apache.commons.lang3.ArchUtils.getProcessor("-1");
        org.junit.Assert.assertNull(processor1);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        boolean[] booleanArray0 = null;
        org.apache.commons.lang3.ArrayUtils.shift(booleanArray0, (int) '4');
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        long[] longArray0 = new long[] {};
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray0, (long) ' ');
        org.apache.commons.lang3.ArrayUtils.shift(longArray0, (int) (short) -1);
        org.apache.commons.lang3.ArrayUtils.shuffle(longArray0);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertArrayEquals(longArray0, new long[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        java.lang.Object obj0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(byteArray7, (byte) 0);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.contains(byteArray7, (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isSameType(obj0, (java.lang.Object) byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        float[] floatArray1 = new float[] {};
        org.apache.commons.lang3.ArrayUtils.shift(floatArray1, 100, (int) '4', 100);
        float[] floatArray9 = new float[] { 1.0f, (-1), 1.0f };
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.clone(floatArray9);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.insert(1, floatArray1, floatArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertArrayEquals(floatArray1, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertArrayEquals(floatArray9, new float[] { 1.0f, (-1.0f), 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertArrayEquals(floatArray10, new float[] { 1.0f, (-1.0f), 1.0f }, (float) 1.0E-15);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.lang.reflect.Field[] fieldArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_FIELD_ARRAY;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object) fieldArray0, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new java.lang.reflect.Field[] {});
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        short[] shortArray3 = new short[] { (short) -1, (byte) 10 };
        short[] shortArray6 = new short[] { (short) 1, (short) 1 };
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray3, shortArray6);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray6);
        short[] shortArray11 = new short[] { (short) -1, (byte) 10 };
        short[] shortArray14 = new short[] { (short) 1, (short) 1 };
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray11, shortArray14);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray11);
        short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray11, (int) (short) -1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray20 = org.apache.commons.lang3.ArrayUtils.insert((-1), shortArray6, shortArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertArrayEquals(shortArray3, new short[] { (short) -1, (short) 10 });
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] { (short) 1, (short) 1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] { (short) 10, (short) -1 });
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray14, new short[] { (short) 1, (short) 1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray19, new short[] { (short) 10 });
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray2 = org.apache.commons.lang3.ArrayUtils.remove(charArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        short[] shortArray3 = new short[] { (short) -1, (byte) 10 };
        short[] shortArray6 = new short[] { (short) 1, (short) 1 };
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray3, shortArray6);
        org.apache.commons.lang3.ArrayUtils.shift(shortArray6, (int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        short[] shortArray16 = new short[] { (short) 1, (byte) 0, (byte) -1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.insert((int) (short) 10, shortArray6, shortArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertArrayEquals(shortArray3, new short[] { (short) -1, (short) 10 });
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] { (short) 1, (short) 1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray16, new short[] { (short) 1, (short) 0, (short) -1, (short) 1 });
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.isTrue((java.lang.Boolean) true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        short[] shortArray0 = null;
        short[] shortArray2 = org.apache.commons.lang3.ArrayFill.fill(shortArray0, (short) 1);
        org.junit.Assert.assertNull(shortArray2);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        int int0 = org.apache.commons.lang3.ArrayUtils.SAFE_MAX_ARRAY_LENGTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2147483639 + "'", int0 == 2147483639);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.lang.Character[] charArray2 = new java.lang.Character[] { '#', '4' };
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray2);
        org.apache.commons.lang3.ArrayUtils.shuffle(charArray3);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray6 = org.apache.commons.lang3.ArrayUtils.remove(charArray3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new java.lang.Character[] { '#', '4' });
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] { '4', '#' });
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.apache.commons.lang3.AnnotationUtils annotationUtils0 = new org.apache.commons.lang3.AnnotationUtils();
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        float[] floatArray0 = null;
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.removeAllOccurences(floatArray0, (float) 1);
        org.junit.Assert.assertNull(floatArray2);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        float[] floatArray1 = new float[] { 1 };
        float[] floatArray2 = null;
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray1, floatArray2);
        float[] floatArray5 = org.apache.commons.lang3.ArrayFill.fill(floatArray2, (float) (-1));
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertArrayEquals(floatArray1, new float[] { 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(floatArray5);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(1, (int) (short) 0, 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.lang.Object[] objArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY;
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[] {});
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.lang.AutoCloseable autoCloseable0 = null;
        org.apache.commons.lang3.function.FailableConsumer<java.lang.Exception, java.lang.Exception> exceptionFailableConsumer1 = null;
        org.apache.commons.lang3.AutoCloseables.close(autoCloseable0, exceptionFailableConsumer1);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        int[] intArray4 = new int[] { (short) -1, (short) 100, (short) 10, (byte) -1 };
        int[] intArray6 = org.apache.commons.lang3.ArrayFill.fill(intArray4, (int) (byte) 10);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray6);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray6, (int) (short) 0);
        int[] intArray14 = new int[] { (short) -1, (short) 100, (short) 10, (byte) -1 };
        int[] intArray16 = org.apache.commons.lang3.ArrayFill.fill(intArray14, (int) (byte) 10);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray16);
        int[] intArray19 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray16, (int) (short) 0);
        int[] intArray21 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray16, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = org.apache.commons.lang3.ArrayUtils.removeAll(intArray6, intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 10, 10, 10 });
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        double[] doubleArray6 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray6);
        double[] doubleArray8 = org.apache.commons.lang3.ArraySorter.sort(doubleArray6);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray8, (int) (short) 0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray8, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true, (java.lang.Integer) (-1), (java.lang.Integer) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        int[] intArray0 = null;
        org.apache.commons.lang3.ArrayUtils.shuffle(intArray0);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.isNotTrue((java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        int int1 = org.apache.commons.lang3.BooleanUtils.toInteger(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        java.lang.Boolean[][] booleanArray0 = new java.lang.Boolean[][] {};
        java.lang.Boolean[] booleanArray7 = new java.lang.Boolean[] { true, true, false, false, false, false };
        java.lang.Boolean[] booleanArray14 = new java.lang.Boolean[] { true, true, false, false, false, false };
        java.lang.Boolean[] booleanArray21 = new java.lang.Boolean[] { true, true, false, false, false, false };
        java.lang.Boolean[] booleanArray28 = new java.lang.Boolean[] { true, true, false, false, false, false };
        java.lang.Boolean[][] booleanArray29 = new java.lang.Boolean[][] { booleanArray7, booleanArray14, booleanArray21, booleanArray28 };
        java.lang.Boolean[][] booleanArray30 = org.apache.commons.lang3.ArrayUtils.nullTo(booleanArray0, booleanArray29);
        java.lang.String[] strArray31 = org.apache.commons.lang3.ArrayUtils.toStringArray((java.lang.Object[]) booleanArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray33 = org.apache.commons.lang3.ArrayUtils.remove(strArray31, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertArrayEquals(booleanArray0, new java.lang.Boolean[][] {});
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertArrayEquals(booleanArray7, new java.lang.Boolean[] { true, true, false, false, false, false });
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertArrayEquals(booleanArray14, new java.lang.Boolean[] { true, true, false, false, false, false });
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertArrayEquals(booleanArray21, new java.lang.Boolean[] { true, true, false, false, false, false });
        org.junit.Assert.assertNotNull(booleanArray28);
        org.junit.Assert.assertArrayEquals(booleanArray28, new java.lang.Boolean[] { true, true, false, false, false, false });
        org.junit.Assert.assertNotNull(booleanArray29);
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] {});
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (byte) 100, 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.lang.String str1 = org.apache.commons.lang3.BooleanUtils.toStringTrueFalse((java.lang.Boolean) false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "false" + "'", str1, "false");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        boolean[] booleanArray0 = new boolean[] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray0);
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isSorted(booleanArray0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        assertBooleanArrayEquals(booleanArray0, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 5, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        long[] longArray6 = new long[] { (short) -1, (byte) 10, 100L, (byte) 10, (short) 100, (byte) -1 };
        org.apache.commons.lang3.ArrayUtils.swap(longArray6, (int) (byte) 10, (int) (short) 10, (int) (short) 10);
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.removeAllOccurences(longArray6, (long) 100);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray14 = org.apache.commons.lang3.ArrayUtils.remove(longArray6, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { (-1L), 10L, 100L, 10L, 100L, (-1L) });
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertArrayEquals(longArray12, new long[] { (-1L), 10L, 10L, (-1L) });
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        long[] longArray0 = new long[] {};
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray0, (long) ' ');
        org.apache.commons.lang3.ArrayUtils.shift(longArray0, (int) (short) -1);
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray0, (long) (-1));
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.removeElements(longArray0, longArray7);
        org.apache.commons.lang3.ArrayUtils.shift(longArray8, (-1));
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray12 = org.apache.commons.lang3.ArrayUtils.remove(longArray8, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertArrayEquals(longArray0, new long[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertArrayEquals(longArray7, new long[] {});
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] {});
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("hi!");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.remove(byteArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] {});
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        long[] longArray0 = new long[] {};
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray0, (long) ' ');
        org.apache.commons.lang3.ArrayUtils.shift(longArray0, (int) (short) -1);
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray0, (long) (-1));
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.removeElements(longArray0, longArray7);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray0, 10L);
        int[] intArray15 = new int[] { (short) -1, (short) 100, (short) 10, (byte) -1 };
        int[] intArray17 = org.apache.commons.lang3.ArrayFill.fill(intArray15, (int) (byte) 10);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray17);
        int[] intArray20 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray17, (int) (short) 0);
        int[] intArray22 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray17, (int) (byte) 10);
        int[] intArray28 = new int[] { (-1), 0, (short) 0, (byte) 0, (-1) };
        int[] intArray29 = org.apache.commons.lang3.ArrayUtils.clone(intArray28);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.containsAny(intArray22, intArray28);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray31 = org.apache.commons.lang3.ArrayUtils.removeAll(longArray0, intArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertArrayEquals(longArray0, new long[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertArrayEquals(longArray7, new long[] {});
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        java.util.function.Consumer<java.lang.Boolean> booleanConsumer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.BooleanUtils.forEach(booleanConsumer0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.lang.AutoCloseable autoCloseable0 = null;
        org.apache.commons.lang3.AutoCloseables.close(autoCloseable0);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.lang.String str0 = org.apache.commons.lang3.BooleanUtils.OFF;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "off" + "'", str0, "off");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("off", "{1,1,-1}", "false", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.lang.String str0 = org.apache.commons.lang3.BooleanUtils.YES;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "yes" + "'", str0, "yes");
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        float[] floatArray4 = new float[] { (short) 10, (short) 1, 100.0f, 10.0f };
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.add(floatArray4, (float) 100);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray4, (float) 10, 5);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.remove(floatArray4, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 10.0f, 1.0f, 100.0f, 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertArrayEquals(floatArray6, new float[] { 10.0f, 1.0f, 100.0f, 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        boolean[] booleanArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_ARRAY;
        int[] intArray5 = new int[] { (short) -1, (short) 100, (short) 10, (byte) -1 };
        int[] intArray7 = org.apache.commons.lang3.ArrayFill.fill(intArray5, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.removeAll(booleanArray0, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        assertBooleanArrayEquals(booleanArray0, new boolean[] {});
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 10, 10, 10, 10 });
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.lang.Character[] charArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new java.lang.Character[] {});
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        double[] doubleArray6 = new double[] { (byte) -1, (byte) 1, 100L, (byte) 10, 1L };
        double[] doubleArray9 = new double[] { (byte) 10, 1 };
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.insert(0, doubleArray6, doubleArray9);
        double[] doubleArray11 = null;
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.removeElements(doubleArray9, doubleArray11);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 1.0d, 100.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 1.0d, (-1.0d), 1.0d, 100.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        double[][] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.concat(doubleArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"<local2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        float[] floatArray5 = new float[] { 5, 0, (byte) 1, (short) -1 };
        java.lang.Float[] floatArray12 = new java.lang.Float[] { 1.0f, 1.0f, 10.0f, (-1.0f), (-1.0f), 1.0f };
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray12);
        java.util.BitSet bitSet16 = org.apache.commons.lang3.ArrayUtils.indexesOf(floatArray13, (float) 10L, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.insert(100, floatArray5, floatArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertArrayEquals(floatArray5, new float[] { 5.0f, 0.0f, 1.0f, (-1.0f) }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertArrayEquals(floatArray12, new java.lang.Float[] { 1.0f, 1.0f, 10.0f, (-1.0f), (-1.0f), 1.0f });
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertArrayEquals(floatArray13, new float[] { 1.0f, 1.0f, 10.0f, (-1.0f), (-1.0f), 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(bitSet16);
        org.junit.Assert.assertEquals(bitSet16.toString(), "{}");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        java.lang.String str1 = org.apache.commons.lang3.BooleanUtils.toStringTrueFalse((java.lang.Boolean) true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "true" + "'", str1, "true");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.lang.String str1 = org.apache.commons.lang3.BooleanUtils.toStringYesNo((java.lang.Boolean) false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "no" + "'", str1, "no");
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        int[] intArray4 = new int[] { (short) -1, (short) 100, (short) 10, (byte) -1 };
        int[] intArray6 = org.apache.commons.lang3.ArrayFill.fill(intArray4, (int) (byte) 10);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray4, (int) (byte) 0);
        int[] intArray13 = new int[] { (short) -1, (short) 100, (short) 10, (byte) -1 };
        int[] intArray15 = org.apache.commons.lang3.ArrayFill.fill(intArray13, (int) (byte) 10);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray15);
        int[] intArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray15, (int) (short) 0);
        int[] intArray20 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray15, (int) (byte) 10);
        int[] intArray26 = new int[] { (-1), 0, (short) 0, (byte) 0, (-1) };
        int[] intArray27 = org.apache.commons.lang3.ArrayUtils.clone(intArray26);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.containsAny(intArray20, intArray26);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = org.apache.commons.lang3.ArrayUtils.removeAll(intArray4, intArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        char[] charArray1 = new char[] { '4' };
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray1, 'a');
        org.apache.commons.lang3.ArrayUtils.swap(charArray1, (int) (short) -1, (int) (short) 1, 0);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray1);
        org.apache.commons.lang3.ArrayUtils.shift(charArray1, 2147483639);
        char[] charArray11 = org.apache.commons.lang3.ArrayFill.clear(charArray1);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray11, '4');
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] { '\000' });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '\000' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        boolean[] booleanArray0 = null;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        int[] intArray4 = new int[] { (short) -1, (short) 100, (short) 10, (byte) -1 };
        int[] intArray6 = org.apache.commons.lang3.ArrayFill.fill(intArray4, (int) (byte) 10);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray6);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray6, (int) (short) 0);
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.removeAllOccurences(intArray9, 3);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = org.apache.commons.lang3.ArrayUtils.remove(intArray9, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 10, 10, 10, 10 });
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("{1,1,-1}");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        float[] floatArray3 = new float[] { 1.0f, (-1), 1.0f };
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.clone(floatArray3);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.remove(floatArray3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertArrayEquals(floatArray3, new float[] { 1.0f, (-1.0f), 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 1.0f, (-1.0f), 1.0f }, (float) 1.0E-15);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        float[] floatArray3 = new float[] { 1.0f, (-1), 1.0f };
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.clone(floatArray3);
        float[] floatArray6 = org.apache.commons.lang3.ArrayFill.fill(floatArray3, (float) ' ');
        int[] intArray12 = new int[] { (-1), 0, (short) 0, (byte) 0, (-1) };
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.clone(intArray12);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray12, 3);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray12, (int) '4', 10);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray19 = org.apache.commons.lang3.ArrayUtils.removeAll(floatArray3, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertArrayEquals(floatArray3, new float[] { 32.0f, 32.0f, 32.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 1.0f, (-1.0f), 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertArrayEquals(floatArray6, new float[] { 32.0f, 32.0f, 32.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.lang.Object[] objArray0 = null;
        boolean[] booleanArray2 = new boolean[] { false };
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray2);
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(objArray0, (java.lang.Object) boolean3, (int) (short) -1);
        org.junit.Assert.assertNotNull(booleanArray2);
        assertBooleanArrayEquals(booleanArray2, new boolean[] { false });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        double[] doubleArray4 = new double[] { 1.0d, 1.0d, ' ', 1.0f };
        java.util.BitSet bitSet8 = org.apache.commons.lang3.ArrayUtils.indexesOf(doubleArray4, (double) (byte) 0, (int) (byte) 10, (double) (short) 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 1.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(bitSet8);
        org.junit.Assert.assertEquals(bitSet8.toString(), "{}");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.negate((java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        float[] floatArray4 = new float[] { (short) 10, (short) 1, 100.0f, 10.0f };
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.add(floatArray4, (float) 100);
        org.apache.commons.lang3.ArrayUtils.shuffle(floatArray6);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray6, (float) '4');
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.remove(floatArray6, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 10.0f, 1.0f, 100.0f, 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertArrayEquals(floatArray6, new float[] { 100.0f, 1.0f, 100.0f, 10.0f, 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        long long3 = bitField1.getRawValue((long) (short) 100);
        java.lang.Object obj4 = org.apache.commons.lang3.ArrayUtils.toPrimitive((java.lang.Object) (short) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 100 + "'", obj4, (short) 100);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.isNotFalse((java.lang.Boolean) true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 52, (java.lang.Integer) 100, (java.lang.Integer) 0);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        java.lang.String str1 = org.apache.commons.lang3.BooleanUtils.toStringOnOff(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "on" + "'", str1, "on");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(byteArray6, (byte) 0);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(byteArray6, (byte) -1);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (int) '#', (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 52, (java.lang.Integer) 52, (java.lang.Integer) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { false, true, false, true };
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.Constable[] constableArray7 = org.apache.commons.lang3.ArrayUtils.addFirst((java.lang.constant.Constable[]) booleanArray4, (java.lang.constant.Constable) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: arraycopy: element type mismatch: can not cast one of the elements of java.lang.Object[] to the type of the destination array, java.lang.Boolean");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertArrayEquals(booleanArray4, new java.lang.Boolean[] { false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        double[] doubleArray0 = null;
        java.util.BitSet bitSet4 = org.apache.commons.lang3.ArrayUtils.indexesOf(doubleArray0, (double) 52, (int) (short) 0, (double) (short) 100);
        org.junit.Assert.assertNotNull(bitSet4);
        org.junit.Assert.assertEquals(bitSet4.toString(), "{}");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        java.lang.Boolean[][] booleanArray0 = new java.lang.Boolean[][] {};
        java.lang.Boolean[] booleanArray7 = new java.lang.Boolean[] { true, true, false, false, false, false };
        java.lang.Boolean[] booleanArray14 = new java.lang.Boolean[] { true, true, false, false, false, false };
        java.lang.Boolean[] booleanArray21 = new java.lang.Boolean[] { true, true, false, false, false, false };
        java.lang.Boolean[] booleanArray28 = new java.lang.Boolean[] { true, true, false, false, false, false };
        java.lang.Boolean[][] booleanArray29 = new java.lang.Boolean[][] { booleanArray7, booleanArray14, booleanArray21, booleanArray28 };
        java.lang.Boolean[][] booleanArray30 = org.apache.commons.lang3.ArrayUtils.nullTo(booleanArray0, booleanArray29);
        java.lang.String[] strArray31 = org.apache.commons.lang3.ArrayUtils.toStringArray((java.lang.Object[]) booleanArray0);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) booleanArray0);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertArrayEquals(booleanArray0, new java.lang.Boolean[][] {});
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertArrayEquals(booleanArray7, new java.lang.Boolean[] { true, true, false, false, false, false });
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertArrayEquals(booleanArray14, new java.lang.Boolean[] { true, true, false, false, false, false });
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertArrayEquals(booleanArray21, new java.lang.Boolean[] { true, true, false, false, false, false });
        org.junit.Assert.assertNotNull(booleanArray28);
        org.junit.Assert.assertArrayEquals(booleanArray28, new java.lang.Boolean[] { true, true, false, false, false, false });
        org.junit.Assert.assertNotNull(booleanArray29);
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        long[] longArray2 = new long[] { (byte) 1, (short) 100 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray2, (long) (byte) 10);
        long[] longArray11 = new long[] { (short) -1, (byte) 10, 100L, (byte) 10, (short) 100, (byte) -1 };
        org.apache.commons.lang3.ArrayUtils.swap(longArray11, (int) (byte) 10, (int) (short) 10, (int) (short) 10);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray2, longArray11);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray19 = org.apache.commons.lang3.ArrayUtils.add(longArray11, (int) (short) -1, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertArrayEquals(longArray2, new long[] { 1L, 100L });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { (-1L), 10L, 100L, 10L, 100L, (-1L) });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        boolean[] booleanArray0 = new boolean[] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray0);
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray0, true);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray0, 2147483639);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2147483639, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        assertBooleanArrayEquals(booleanArray0, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(booleanArray3);
        assertBooleanArrayEquals(booleanArray3, new boolean[] {});
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        java.lang.Short[] shortArray0 = new java.lang.Short[] {};
        java.lang.Short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray0);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertArrayEquals(shortArray0, new java.lang.Short[] {});
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertArrayEquals(shortArray1, new java.lang.Short[] {});
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        float[] floatArray5 = new float[] { 'a', (short) 0, 100.0f, (short) 100, 3 };
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.add(floatArray5, (-1), (float) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertArrayEquals(floatArray5, new float[] { 97.0f, 0.0f, 100.0f, 100.0f, 3.0f }, (float) 1.0E-15);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        short[] shortArray2 = new short[] { (short) -1, (byte) 10 };
        short[] shortArray5 = new short[] { (short) 1, (short) 1 };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray2, shortArray5);
        java.lang.Short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray5);
        org.apache.commons.lang3.ArrayUtils.swap((java.lang.Object[]) shortArray7, (int) (short) 10, 3);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] { (short) -1, (short) 10 });
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 1, (short) 1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertArrayEquals(shortArray7, new java.lang.Short[] { (short) 1, (short) 1 });
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        java.lang.Character[] charArray2 = new java.lang.Character[] { '#', '4' };
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray2);
        char[] charArray9 = new char[] { 'a', '4', '#', ' ', '4' };
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.removeElements(charArray3, charArray9);
        java.lang.Character[] charArray11 = org.apache.commons.lang3.ArrayUtils.toObject(charArray9);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray15 = org.apache.commons.lang3.ArrayFill.fill(charArray9, 100, 100, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new java.lang.Character[] { '#', '4' });
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] { '#', '4' });
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '4', '#', ' ', '4' });
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new java.lang.Character[] { 'a', '4', '#', ' ', '4' });
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(byteArray6, (byte) 0);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) -1);
        int[] intArray11 = null;
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.removeAll(byteArray6, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.remove(byteArray6, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        java.lang.String[] strArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY;
        java.lang.String[] strArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray4 = org.apache.commons.lang3.ArrayUtils.add(strArray0, (-1), "false");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertArrayEquals(strArray0, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.lang.String str1 = org.apache.commons.lang3.BooleanUtils.toStringOnOff((java.lang.Boolean) true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "on" + "'", str1, "on");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        java.lang.Integer int1 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray1);
        int[] intArray8 = new int[] { (-1), 0, (short) 0, (byte) 0, (-1) };
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.clone(intArray8);
        java.lang.Integer[] intArray10 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray10);
        int[] intArray12 = org.apache.commons.lang3.ArrayUtils.removeElements(intArray9, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray13 = org.apache.commons.lang3.ArrayUtils.removeAll(booleanArray1, intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray1);
        assertBooleanArrayEquals(booleanArray1, new boolean[] { false });
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] {});
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { (-1), 0, 0, 0, (-1) });
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("true", "false", "-1", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        java.lang.annotation.Annotation annotation0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.AnnotationUtils.toString(annotation0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.annotation.Annotation.annotationType()\" because \"a\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 52, (java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.isTrue((java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.lang.String str0 = org.apache.commons.lang3.BooleanUtils.FALSE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "false" + "'", str0, "false");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object) (short) -1, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: array");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        int int1 = org.apache.commons.lang3.BooleanUtils.toInteger(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(byteArray6, (byte) 0);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) -1);
        int[] intArray11 = null;
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.removeAll(byteArray6, intArray11);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayFill.clear(byteArray6);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.contains(byteArray6, (byte) 100);
        byte[] byteArray16 = org.apache.commons.lang3.ArrayFill.clear(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray19 = org.apache.commons.lang3.ArrayUtils.add(byteArray16, (int) (byte) -1, (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.lang.reflect.Field[] fieldArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_FIELD_ARRAY;
        java.lang.String[] strArray1 = org.apache.commons.lang3.ArrayUtils.toStringArray((java.lang.Object[]) fieldArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray4 = org.apache.commons.lang3.ArrayUtils.add(strArray1, (int) ' ', "no");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new java.lang.reflect.Field[] {});
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.lang.String str1 = org.apache.commons.lang3.BooleanUtils.toStringYesNo(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.lang.Boolean[] booleanArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_OBJECT_ARRAY;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.and(booleanArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertArrayEquals(booleanArray0, new java.lang.Boolean[] {});
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.lang.Float[] floatArray6 = new java.lang.Float[] { 1.0f, 1.0f, 10.0f, (-1.0f), (-1.0f), 1.0f };
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6);
        org.apache.commons.lang3.ArrayUtils.shift(floatArray7, (int) (byte) 101);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertArrayEquals(floatArray6, new java.lang.Float[] { 1.0f, 1.0f, 10.0f, (-1.0f), (-1.0f), 1.0f });
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertArrayEquals(floatArray7, new float[] { 1.0f, 10.0f, (-1.0f), (-1.0f), 1.0f, 1.0f }, (float) 1.0E-15);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        char[] charArray0 = null;
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.removeAllOccurrences(charArray0, 'a');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "off", "hi!", "{1,1,-1}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        java.lang.String str0 = org.apache.commons.lang3.BooleanUtils.ON;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "on" + "'", str0, "on");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        byte[] byteArray0 = null;
        java.util.BitSet bitSet2 = org.apache.commons.lang3.ArrayUtils.indexesOf(byteArray0, (byte) 100);
        org.junit.Assert.assertNotNull(bitSet2);
        org.junit.Assert.assertEquals(bitSet2.toString(), "{}");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean(5);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        long[] longArray0 = null;
        org.apache.commons.lang3.ArrayUtils.swap(longArray0, (int) (short) 0, (int) (byte) -1, 5);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        java.lang.Character[] charArray3 = new java.lang.Character[] { '#', '4' };
        char[] charArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray3);
        char[] charArray5 = org.apache.commons.lang3.ArrayFill.clear(charArray4);
        char[] charArray11 = new char[] { ' ', '#', '#', '4', 'a' };
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.subarray(charArray11, 5, (int) (byte) 100);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray4, charArray11);
        char[] charArray17 = new char[] { '4' };
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray17, 'a');
        char[] charArray21 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray17, 'a');
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.removeAllOccurrences(charArray17, ' ');
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray24 = org.apache.commons.lang3.ArrayUtils.insert((int) (short) 10, charArray4, charArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new java.lang.Character[] { '#', '4' });
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '\000', '\000' });
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '\000', '\000' });
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { ' ', '#', '#', '4', 'a' });
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { '4' });
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        char[] charArray1 = new char[] { '4' };
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray1, 'a');
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray1, 'a');
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.addFirst(charArray1, 'a');
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray10 = org.apache.commons.lang3.ArrayUtils.add(charArray7, 100, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', '4' });
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        char[] charArray0 = null;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isSorted(charArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        boolean[] booleanArray0 = new boolean[] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray0);
        boolean[] booleanArray2 = new boolean[] {};
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray2);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray2, true);
        boolean[] booleanArray6 = new boolean[] {};
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray6);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray6, true);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray2, booleanArray6);
        boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.removeElements(booleanArray0, booleanArray6);
        boolean[] booleanArray12 = new boolean[] {};
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray12);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray12, true);
        boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = org.apache.commons.lang3.BooleanUtils.or(booleanArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        assertBooleanArrayEquals(booleanArray0, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(booleanArray2);
        assertBooleanArrayEquals(booleanArray2, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(booleanArray6);
        assertBooleanArrayEquals(booleanArray6, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(booleanArray11);
        assertBooleanArrayEquals(booleanArray11, new boolean[] {});
        org.junit.Assert.assertNotNull(booleanArray12);
        assertBooleanArrayEquals(booleanArray12, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(booleanArray16);
        assertBooleanArrayEquals(booleanArray16, new boolean[] {});
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        int[] intArray4 = new int[] { (short) -1, (short) 100, (short) 10, (byte) -1 };
        int[] intArray6 = org.apache.commons.lang3.ArrayFill.fill(intArray4, (int) (byte) 10);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray6);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray6, (int) (short) 0);
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray6, (int) (byte) 10);
        int[] intArray17 = new int[] { (-1), 0, (short) 0, (byte) 0, (-1) };
        int[] intArray18 = org.apache.commons.lang3.ArrayUtils.clone(intArray17);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.containsAny(intArray11, intArray17);
        org.apache.commons.lang3.ArrayUtils.shuffle(intArray11);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("false", "yes", "-1", "{1,1,-1}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        java.lang.Integer[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        java.lang.Integer[] intArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray1, 100);
        int[] intArray5 = org.apache.commons.lang3.ArrayFill.fill(intArray3, (int) ' ');
        org.apache.commons.lang3.ArrayUtils.shift(intArray5, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = org.apache.commons.lang3.ArrayUtils.remove(intArray5, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] {});
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 5, (java.lang.Integer) 10, (java.lang.Integer) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        double[] doubleArray6 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray6);
        double[] doubleArray8 = org.apache.commons.lang3.ArraySorter.sort(doubleArray6);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray8);
        org.apache.commons.lang3.ArrayUtils.swap(doubleArray8, 0, (int) (short) 1, (int) (short) 0);
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.addFirst(doubleArray8, (double) 0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray15, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 7");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.0d, (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.apache.commons.lang3.ArchUtils archUtils0 = new org.apache.commons.lang3.ArchUtils();
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        boolean boolean3 = bitField1.isAllSet((long) 0);
        int int5 = bitField1.clear((int) '4');
        short short7 = bitField1.clearShort((short) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        long[] longArray6 = new long[] { (short) -1, (byte) 10, 100L, (byte) 10, (short) 100, (byte) -1 };
        org.apache.commons.lang3.ArrayUtils.swap(longArray6, (int) (byte) 10, (int) (short) 10, (int) (short) 10);
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.removeAllOccurences(longArray6, (long) 100);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray12);
        org.apache.commons.lang3.ArrayUtils.swap(longArray12, (int) (short) 100, (int) (short) 1, (int) (byte) 1);
        int[] intArray22 = new int[] { (short) -1, (short) 100, (short) 10, (byte) -1 };
        int[] intArray24 = org.apache.commons.lang3.ArrayFill.fill(intArray22, (int) (byte) 10);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray24);
        int[] intArray27 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray24, (int) (short) 0);
        int[] intArray29 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray24, (int) (byte) 10);
        int[] intArray35 = new int[] { (-1), 0, (short) 0, (byte) 0, (-1) };
        int[] intArray36 = org.apache.commons.lang3.ArrayUtils.clone(intArray35);
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.containsAny(intArray29, intArray35);
        int[] intArray39 = org.apache.commons.lang3.ArrayUtils.removeAllOccurrences(intArray35, (int) (byte) 10);
        java.lang.Integer[] intArray40 = org.apache.commons.lang3.ArrayUtils.toObject(intArray39);
        java.lang.Integer[] intArray41 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray40);
        boolean boolean42 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) (short) 100, (java.lang.Object) intArray41);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { (-1L), 10L, 100L, 10L, 100L, (-1L) });
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertArrayEquals(longArray12, new long[] { (-1L), 10L, 10L, (-1L) });
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new java.lang.Integer[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new java.lang.Integer[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 0, (java.lang.Integer) 5, (java.lang.Integer) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        java.lang.String str1 = org.apache.commons.lang3.BooleanUtils.toStringTrueFalse(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "false" + "'", str1, "false");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.toBooleanDefaultIfNull((java.lang.Boolean) false, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        boolean[] booleanArray0 = new boolean[] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray0);
        boolean[] booleanArray2 = new boolean[] {};
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray2);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray2, true);
        boolean[] booleanArray6 = new boolean[] {};
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray6);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray6, true);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray2, booleanArray6);
        boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.removeElements(booleanArray0, booleanArray6);
        boolean[] booleanArray12 = new boolean[] {};
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray12);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray12, true);
        boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray12);
        boolean[] booleanArray17 = new boolean[] {};
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray17);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray17, true);
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray17, true, (int) '#');
        java.util.Random random24 = null;
        org.apache.commons.lang3.ArrayUtils.shuffle(booleanArray17, random24);
        boolean[] booleanArray26 = org.apache.commons.lang3.ArrayUtils.removeElements(booleanArray16, booleanArray17);
        boolean[] booleanArray31 = new boolean[] { true, true, false, true };
        boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.removeElements(booleanArray16, booleanArray31);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = org.apache.commons.lang3.BooleanUtils.or(booleanArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        assertBooleanArrayEquals(booleanArray0, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(booleanArray2);
        assertBooleanArrayEquals(booleanArray2, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(booleanArray6);
        assertBooleanArrayEquals(booleanArray6, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(booleanArray11);
        assertBooleanArrayEquals(booleanArray11, new boolean[] {});
        org.junit.Assert.assertNotNull(booleanArray12);
        assertBooleanArrayEquals(booleanArray12, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(booleanArray16);
        assertBooleanArrayEquals(booleanArray16, new boolean[] {});
        org.junit.Assert.assertNotNull(booleanArray17);
        assertBooleanArrayEquals(booleanArray17, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(booleanArray26);
        assertBooleanArrayEquals(booleanArray26, new boolean[] {});
        org.junit.Assert.assertNotNull(booleanArray31);
        assertBooleanArrayEquals(booleanArray31, new boolean[] { true, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray32);
        assertBooleanArrayEquals(booleanArray32, new boolean[] {});
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        boolean[] booleanArray0 = new boolean[] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray0);
        boolean[] booleanArray2 = new boolean[] {};
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray2);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray2, true);
        boolean[] booleanArray6 = new boolean[] {};
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray6);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray6, true);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray2, booleanArray6);
        boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.removeElements(booleanArray0, booleanArray6);
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray0);
        java.util.Random random13 = null;
        org.apache.commons.lang3.ArrayUtils.shuffle(booleanArray12, random13);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray12, 2, (int) '4');
        org.junit.Assert.assertNotNull(booleanArray0);
        assertBooleanArrayEquals(booleanArray0, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(booleanArray2);
        assertBooleanArrayEquals(booleanArray2, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(booleanArray6);
        assertBooleanArrayEquals(booleanArray6, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(booleanArray11);
        assertBooleanArrayEquals(booleanArray11, new boolean[] {});
        org.junit.Assert.assertNotNull(booleanArray12);
        assertBooleanArrayEquals(booleanArray12, new boolean[] {});
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        long[] longArray0 = new long[] {};
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray0, (long) ' ');
        org.apache.commons.lang3.ArrayUtils.shift(longArray0, (int) (short) -1);
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray0, (long) (-1));
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.removeElements(longArray0, longArray7);
        org.apache.commons.lang3.ArrayUtils.swap(longArray8, (int) (short) 1, (-1));
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.addFirst(longArray8, (long) (short) 1);
        int[] intArray19 = new int[] { (-1), 0, (short) 0, (byte) 0, (-1) };
        int[] intArray20 = org.apache.commons.lang3.ArrayUtils.clone(intArray19);
        java.lang.Integer[] intArray21 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        int[] intArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray21);
        int[] intArray23 = org.apache.commons.lang3.ArrayUtils.removeElements(intArray20, intArray22);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.removeAll(longArray8, intArray22);
        java.util.Random random25 = null;
        org.apache.commons.lang3.ArrayUtils.shuffle(longArray24, random25);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertArrayEquals(longArray0, new long[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertArrayEquals(longArray7, new long[] {});
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] {});
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] { 1L });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] {});
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertArrayEquals(longArray24, new long[] {});
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.lang.Character[] charArray2 = new java.lang.Character[] { '#', '4' };
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray2);
        org.apache.commons.lang3.ArrayUtils.shuffle(charArray3);
        org.apache.commons.lang3.ArrayUtils.shift(charArray3, (int) (short) 0, (int) (short) 1, (int) '4');
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new java.lang.Character[] { '#', '4' });
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] { '4', '#' });
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.lang3.BooleanUtils.or(booleanArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: array");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        java.lang.String str1 = org.apache.commons.lang3.BooleanUtils.toStringTrueFalse(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "true" + "'", str1, "true");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        int int2 = org.apache.commons.lang3.BooleanUtils.compare(false, false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        boolean boolean3 = bitField1.isAllSet((long) 0);
        int int5 = bitField1.clear(0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.apache.commons.lang3.arch.Processor processor1 = org.apache.commons.lang3.ArchUtils.getProcessor("");
        org.junit.Assert.assertNull(processor1);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        java.lang.AutoCloseable autoCloseable0 = null;
        java.util.function.Consumer<java.lang.Exception> exceptionConsumer1 = null;
        org.apache.commons.lang3.AutoCloseables.closeQuietly(autoCloseable0, exceptionConsumer1);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        double[] doubleArray6 = new double[] { (byte) -1, (byte) 1, 100L, (byte) 10, 1L };
        double[] doubleArray9 = new double[] { (byte) 10, 1 };
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.insert(0, doubleArray6, doubleArray9);
        double[] doubleArray11 = null;
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.removeElements(doubleArray9, doubleArray11);
        int[] intArray18 = new int[] { '#', (short) 1, (byte) 100, (short) 1, 10 };
        org.apache.commons.lang3.ArrayUtils.reverse(intArray18, (int) (short) 1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) doubleArray11, (java.lang.Object) intArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 1.0d, 100.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 1.0d, (-1.0d), 1.0d, 100.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 35, 10, 1, 100, 1 });
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.apache.commons.lang3.ArrayUtils.SOFT_MAX_ARRAY_LENGTH = 52;
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        long[] longArray1 = new long[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray1, (long) ' ');
        org.apache.commons.lang3.ArrayUtils.shift(longArray1, (int) (short) -1);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray1, (long) (-1));
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.removeElements(longArray1, longArray8);
        long[] longArray10 = new long[] {};
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray10, (long) ' ');
        org.apache.commons.lang3.ArrayUtils.shift(longArray10, (int) (short) -1);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray10, (long) (-1));
        long[] longArray17 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray18 = org.apache.commons.lang3.ArrayUtils.removeElements(longArray10, longArray17);
        org.apache.commons.lang3.ArrayUtils.shift(longArray18, (-1));
        long[] longArray21 = org.apache.commons.lang3.ArrayUtils.insert((int) (byte) 100, longArray9, longArray18);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.subarray(longArray21, (int) '#', 2147483639);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray24);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] {});
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertArrayEquals(longArray9, new long[] {});
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertArrayEquals(longArray10, new long[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] {});
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertArrayEquals(longArray18, new long[] {});
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertArrayEquals(longArray21, new long[] {});
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertArrayEquals(longArray24, new long[] {});
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(0, 10, (int) (byte) 11, (int) (short) 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        int[] intArray0 = null;
        org.apache.commons.lang3.ArrayUtils.swap(intArray0, (int) (short) 11, (-1));
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        char[] charArray0 = null;
        java.lang.Character[] charArray1 = org.apache.commons.lang3.ArrayUtils.toObject(charArray0);
        org.junit.Assert.assertNull(charArray1);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.lang.String str0 = org.apache.commons.lang3.BooleanUtils.TRUE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "true" + "'", str0, "true");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        long[] longArray2 = new long[] { (byte) 1, (short) 100 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray2, (long) (byte) 10);
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        org.apache.commons.lang3.ArrayUtils.reverse(longArray5, (int) (byte) 100, (int) (short) 100);
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.removeAllOccurrences(longArray5, (long) (short) 0);
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.addAll(longArray2, longArray5);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray13 = org.apache.commons.lang3.ArrayUtils.remove(longArray5, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertArrayEquals(longArray2, new long[] { 1L, 100L });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertArrayEquals(longArray5, new long[] {});
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertArrayEquals(longArray10, new long[] {});
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { 1L, 100L });
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        boolean[] booleanArray0 = new boolean[] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray0);
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray0, true);
        boolean[] booleanArray4 = new boolean[] {};
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray4);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray4, true);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray0, booleanArray4);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray0, false);
        int[] intArray15 = new int[] { (short) -1, (short) 100, (short) 10, (byte) -1 };
        int[] intArray17 = org.apache.commons.lang3.ArrayFill.fill(intArray15, (int) (byte) 10);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray17);
        int[] intArray21 = org.apache.commons.lang3.ArrayUtils.subarray(intArray17, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.removeAll(booleanArray0, intArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        assertBooleanArrayEquals(booleanArray0, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(booleanArray4);
        assertBooleanArrayEquals(booleanArray4, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(booleanArray10);
        assertBooleanArrayEquals(booleanArray10, new boolean[] {});
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 10 });
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(byteArray6, (byte) 0);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(byteArray6, (byte) -1);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.removeAllOccurrences(byteArray6, (byte) 10);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(byteArray19, (byte) 0);
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray19, (byte) -1);
        int[] intArray24 = null;
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.removeAll(byteArray19, intArray24);
        byte[] byteArray26 = null;
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray19, byteArray26);
        byte[] byteArray28 = org.apache.commons.lang3.ArraySorter.sort(byteArray19);
        byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.removeElements(byteArray12, byteArray28);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray29, (-1), 1);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 52, (java.lang.Integer) 0, (java.lang.Integer) 2147483639);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        boolean[] booleanArray0 = null;
        boolean[] booleanArray1 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray0);
        org.junit.Assert.assertNull(booleanArray1);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(byteArray6, (byte) 0);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(byteArray6, (byte) -1);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.removeAllOccurrences(byteArray6, (byte) 10);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(byteArray19, (byte) 0);
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray19, (byte) -1);
        int[] intArray24 = null;
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.removeAll(byteArray19, intArray24);
        byte[] byteArray26 = null;
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray19, byteArray26);
        byte[] byteArray28 = org.apache.commons.lang3.ArraySorter.sort(byteArray19);
        byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.removeElements(byteArray12, byteArray28);
        java.util.Random random30 = null;
        org.apache.commons.lang3.ArrayUtils.shuffle(byteArray12, random30);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        double[] doubleArray7 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray7);
        double[] doubleArray9 = org.apache.commons.lang3.ArraySorter.sort(doubleArray7);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray9);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.removeAllOccurences(doubleArray9, (double) (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray12, (int) (byte) -1, (int) (byte) -1);
        double[] doubleArray22 = new double[] { (byte) -1, (byte) 1, 100L, (byte) 10, 1L };
        double[] doubleArray25 = new double[] { (byte) 10, 1 };
        double[] doubleArray26 = org.apache.commons.lang3.ArrayUtils.insert(0, doubleArray22, doubleArray25);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray26, 10, 100);
        org.apache.commons.lang3.ArrayUtils.shift(doubleArray26, 0);
        int int35 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray26, (double) 1L, (int) ' ', 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray36 = org.apache.commons.lang3.ArrayUtils.insert((int) (short) 11, doubleArray12, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 11, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { (-1.0d), 1.0d, 100.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 10.0d, 1.0d, (-1.0d), 1.0d, 100.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        long[] longArray1 = new long[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray1, (long) ' ');
        org.apache.commons.lang3.ArrayUtils.reverse(longArray1);
        long[] longArray6 = new long[] {};
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, (long) ' ');
        org.apache.commons.lang3.ArrayUtils.shift(longArray6, (int) (short) -1);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray6, (long) (-1));
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.removeElements(longArray6, longArray13);
        long[] longArray15 = new long[] {};
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray15, (long) ' ');
        org.apache.commons.lang3.ArrayUtils.shift(longArray15, (int) (short) -1);
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray15, (long) (-1));
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.removeElements(longArray15, longArray22);
        org.apache.commons.lang3.ArrayUtils.shift(longArray23, (-1));
        long[] longArray26 = org.apache.commons.lang3.ArrayUtils.insert((int) (byte) 100, longArray14, longArray23);
        java.util.BitSet bitSet29 = org.apache.commons.lang3.ArrayUtils.indexesOf(longArray14, (long) (short) 1, 1);
        long[] longArray30 = org.apache.commons.lang3.ArrayUtils.insert((int) (byte) -1, longArray1, longArray14);
        org.apache.commons.lang3.ArrayUtils.shuffle(longArray30);
        long[] longArray33 = org.apache.commons.lang3.ArrayFill.fill(longArray30, (long) 100);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isSorted(longArray30);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] {});
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertArrayEquals(longArray14, new long[] {});
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertArrayEquals(longArray15, new long[] {});
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertArrayEquals(longArray22, new long[] {});
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertArrayEquals(longArray23, new long[] {});
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertArrayEquals(longArray26, new long[] {});
        org.junit.Assert.assertNotNull(bitSet29);
        org.junit.Assert.assertEquals(bitSet29.toString(), "{}");
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertArrayEquals(longArray30, new long[] {});
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertArrayEquals(longArray33, new long[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        int int0 = org.apache.commons.lang3.ArrayUtils.SOFT_MAX_ARRAY_LENGTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 52 + "'", int0 == 52);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        float[] floatArray3 = new float[] { 52, '4' };
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY;
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.insert(100, floatArray3, floatArray4);
        org.apache.commons.lang3.ArrayUtils.swap(floatArray4, 5, (int) (byte) 11, (int) (short) 10);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isSorted(floatArray4);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertArrayEquals(floatArray3, new float[] { 52.0f, 52.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertArrayEquals(floatArray5, new float[] { 52.0f, 52.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        int[] intArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray0, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        long[] longArray0 = new long[] {};
        long[] longArray1 = new long[] {};
        long[] longArray2 = new long[] {};
        long[] longArray3 = new long[] {};
        long[] longArray4 = new long[] {};
        long[][] longArray5 = new long[][] { longArray0, longArray1, longArray2, longArray3, longArray4 };
        long[] longArray10 = new long[] { (-1L), 'a', 0 };
        long[] longArray14 = new long[] { (-1L), 'a', 0 };
        long[] longArray18 = new long[] { (-1L), 'a', 0 };
        long[] longArray22 = new long[] { (-1L), 'a', 0 };
        long[] longArray26 = new long[] { (-1L), 'a', 0 };
        long[][] longArray27 = new long[][] { longArray10, longArray14, longArray18, longArray22, longArray26 };
        long[] longArray28 = org.apache.commons.lang3.ArrayUtils.concat(longArray27);
        // The following exception was thrown during execution in test generation
        try {
            long[][] longArray31 = org.apache.commons.lang3.ArrayUtils.arraycopy(longArray5, (int) (byte) 100, longArray27, 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertArrayEquals(longArray0, new long[] {});
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] {});
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertArrayEquals(longArray2, new long[] {});
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertArrayEquals(longArray3, new long[] {});
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertArrayEquals(longArray4, new long[] {});
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertArrayEquals(longArray10, new long[] { (-1L), 97L, 0L });
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertArrayEquals(longArray14, new long[] { (-1L), 97L, 0L });
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertArrayEquals(longArray18, new long[] { (-1L), 97L, 0L });
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertArrayEquals(longArray22, new long[] { (-1L), 97L, 0L });
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertArrayEquals(longArray26, new long[] { (-1L), 97L, 0L });
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertArrayEquals(longArray28, new long[] { (-1L), 97L, 0L, (-1L), 97L, 0L, (-1L), 97L, 0L, (-1L), 97L, 0L, (-1L), 97L, 0L });
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        int[] intArray4 = new int[] { (short) -1, (short) 100, (short) 10, (byte) -1 };
        int[] intArray6 = org.apache.commons.lang3.ArrayFill.fill(intArray4, (int) (byte) 10);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray4, (int) (byte) 0);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = org.apache.commons.lang3.ArrayUtils.remove(intArray4, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(1, (int) 'a', (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.apache.commons.lang3.arch.Processor processor1 = org.apache.commons.lang3.ArchUtils.getProcessor("yes");
        org.junit.Assert.assertNull(processor1);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(byteArray6, (byte) 0);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) -1);
        int[] intArray11 = null;
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.removeAll(byteArray6, intArray11);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayFill.clear(byteArray6);
        byte[] byteArray15 = org.apache.commons.lang3.ArrayFill.fill(byteArray6, (byte) 1);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray6);
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.addFirst(byteArray6, (byte) 101);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray18, 5, (int) (byte) 101);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 101, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        short[] shortArray2 = new short[] { (short) -1, (byte) 10 };
        short[] shortArray5 = new short[] { (short) 1, (short) 1 };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray2, shortArray5);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray2);
        short[] shortArray10 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray2, (int) (short) -1, (int) (byte) 1);
        java.util.BitSet bitSet13 = org.apache.commons.lang3.ArrayUtils.indexesOf(shortArray10, (short) 10, (int) '4');
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] { (short) 10, (short) -1 });
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 1, (short) 1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray10, new short[] { (short) 10 });
        org.junit.Assert.assertNotNull(bitSet13);
        org.junit.Assert.assertEquals(bitSet13.toString(), "{}");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        java.lang.String str0 = org.apache.commons.lang3.BooleanUtils.NO;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "no" + "'", str0, "no");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        double[] doubleArray7 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray7);
        double[] doubleArray9 = org.apache.commons.lang3.ArraySorter.sort(doubleArray7);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray9, 0);
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray9, (int) (byte) 100, 0);
        double[] doubleArray21 = new double[] { (byte) -1, (byte) 1, 100L, (byte) 10, 1L };
        double[] doubleArray24 = new double[] { (byte) 10, 1 };
        double[] doubleArray25 = org.apache.commons.lang3.ArrayUtils.insert(0, doubleArray21, doubleArray24);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray25, 10, 100);
        org.apache.commons.lang3.ArrayUtils.shift(doubleArray25, 0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray31 = org.apache.commons.lang3.ArrayUtils.insert((int) (short) 10, doubleArray14, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { (-1.0d), 1.0d, 100.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 10.0d, 1.0d, (-1.0d), 1.0d, 100.0d, 10.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        double[] doubleArray6 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray6);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray6, (double) 1L, (double) (short) -1);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray6, 1.0d, (int) (short) -1);
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.removeAllOccurrences(doubleArray6, (double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.add(doubleArray15, (-1), (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-1.0d), (-1.0d), (-1.0d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(byteArray6, (byte) 0);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) -1);
        int[] intArray11 = null;
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.removeAll(byteArray6, intArray11);
        byte[] byteArray13 = null;
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray6, byteArray13);
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.contains(byteArray21, (byte) 0);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray21, (byte) -1);
        int[] intArray26 = null;
        byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.removeAll(byteArray21, intArray26);
        byte[] byteArray28 = org.apache.commons.lang3.ArrayFill.clear(byteArray21);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.contains(byteArray21, (byte) 100);
        byte[] byteArray31 = org.apache.commons.lang3.ArrayFill.clear(byteArray21);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray13, byteArray31);
        org.apache.commons.lang3.ArrayUtils.shuffle(byteArray13);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 52, (java.lang.Integer) 100, (java.lang.Integer) 100, (java.lang.Integer) 2147483639);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        float[] floatArray4 = new float[] { (short) 10, (short) 1, 100.0f, 10.0f };
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.add(floatArray4, (float) 100);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray4, (float) 1L);
        org.apache.commons.lang3.ArrayUtils.shuffle(floatArray4);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.remove(floatArray4, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 100.0f, 1.0f, 10.0f, 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertArrayEquals(floatArray6, new float[] { 10.0f, 1.0f, 100.0f, 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        java.lang.Integer[] intArray0 = new java.lang.Integer[] {};
        java.lang.Integer[] intArray1 = new java.lang.Integer[] {};
        java.lang.Integer[] intArray2 = new java.lang.Integer[] {};
        java.lang.Integer[][] intArray3 = new java.lang.Integer[][] { intArray0, intArray1, intArray2 };
        java.lang.Integer[] intArray4 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        java.lang.Integer[] intArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray4);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray5, 100);
        int[] intArray13 = new int[] { '#', (short) 1, (byte) 100, (short) 1, 10 };
        org.apache.commons.lang3.ArrayUtils.reverse(intArray13, (int) (short) 1, (int) ' ');
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray7, intArray13);
        int[] intArray23 = new int[] { (-1), 0, (short) 0, (byte) 0, (-1) };
        int[] intArray24 = org.apache.commons.lang3.ArrayUtils.clone(intArray23);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.contains(intArray24, (int) (byte) 100);
        int[] intArray27 = org.apache.commons.lang3.ArrayUtils.addAll(intArray7, intArray24);
        java.lang.Integer[][] intArray28 = org.apache.commons.lang3.ArrayUtils.removeAll(intArray3, intArray7);
        java.lang.Integer[][] intArray29 = org.apache.commons.lang3.ArrayUtils.toArray(intArray3);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] {});
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 35, 10, 1, 100, 1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertNotNull(intArray29);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        long[] longArray0 = new long[] {};
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray0, (long) ' ');
        org.apache.commons.lang3.ArrayUtils.shift(longArray0, (int) (short) -1);
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray0, (long) (-1));
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.removeElements(longArray0, longArray7);
        org.apache.commons.lang3.ArrayUtils.shift(longArray8, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(longArray8);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertArrayEquals(longArray0, new long[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertArrayEquals(longArray7, new long[] {});
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] {});
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        boolean[] booleanArray0 = new boolean[] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray0);
        boolean[] booleanArray2 = new boolean[] {};
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray2);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray2, true);
        boolean[] booleanArray6 = new boolean[] {};
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray6);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray6, true);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray2, booleanArray6);
        boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.removeElements(booleanArray0, booleanArray6);
        boolean[] booleanArray12 = new boolean[] {};
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray12);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray12, true);
        boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray12);
        boolean[] booleanArray17 = new boolean[] {};
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray17);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray17, true);
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray17, true, (int) '#');
        java.util.Random random24 = null;
        org.apache.commons.lang3.ArrayUtils.shuffle(booleanArray17, random24);
        boolean[] booleanArray26 = org.apache.commons.lang3.ArrayUtils.removeElements(booleanArray16, booleanArray17);
        boolean[] booleanArray31 = new boolean[] { true, true, false, true };
        boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.removeElements(booleanArray16, booleanArray31);
        org.apache.commons.lang3.ArrayUtils.swap(booleanArray16, (int) (byte) 10, (int) (short) -1);
        org.junit.Assert.assertNotNull(booleanArray0);
        assertBooleanArrayEquals(booleanArray0, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(booleanArray2);
        assertBooleanArrayEquals(booleanArray2, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(booleanArray6);
        assertBooleanArrayEquals(booleanArray6, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(booleanArray11);
        assertBooleanArrayEquals(booleanArray11, new boolean[] {});
        org.junit.Assert.assertNotNull(booleanArray12);
        assertBooleanArrayEquals(booleanArray12, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(booleanArray16);
        assertBooleanArrayEquals(booleanArray16, new boolean[] {});
        org.junit.Assert.assertNotNull(booleanArray17);
        assertBooleanArrayEquals(booleanArray17, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(booleanArray26);
        assertBooleanArrayEquals(booleanArray26, new boolean[] {});
        org.junit.Assert.assertNotNull(booleanArray31);
        assertBooleanArrayEquals(booleanArray31, new boolean[] { true, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray32);
        assertBooleanArrayEquals(booleanArray32, new boolean[] {});
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        long[] longArray6 = new long[] { (short) -1, (byte) 10, 100L, (byte) 10, (short) 100, (byte) -1 };
        org.apache.commons.lang3.ArrayUtils.swap(longArray6, (int) (byte) 10, (int) (short) 10, (int) (short) 10);
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.removeAllOccurences(longArray6, (long) 100);
        long[] longArray19 = new long[] { 'a', '4', (byte) -1, (byte) 1, (short) 10, 1L };
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray19, 0L, (int) 'a');
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray19);
        java.util.BitSet bitSet26 = org.apache.commons.lang3.ArrayUtils.indexesOf(longArray19, (long) '4', (int) '#');
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray6, longArray19);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray29 = org.apache.commons.lang3.ArrayUtils.remove(longArray19, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { (-1L), 10L, 100L, 10L, 100L, (-1L) });
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertArrayEquals(longArray12, new long[] { (-1L), 10L, 10L, (-1L) });
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertArrayEquals(longArray19, new long[] { 97L, 52L, (-1L), 1L, 10L, 1L });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(bitSet26);
        org.junit.Assert.assertEquals(bitSet26.toString(), "{}");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(byteArray7, (byte) 0);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray7, (byte) -1);
        int[] intArray12 = null;
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.removeAll(byteArray7, intArray12);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray7);
        org.apache.commons.lang3.ArrayUtils.shift(byteArray14, (int) (short) -1);
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.contains(byteArray23, (byte) 0);
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray23, (byte) -1);
        int[] intArray28 = null;
        byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.removeAll(byteArray23, intArray28);
        org.apache.commons.lang3.ArrayUtils.swap(byteArray29, (int) '4', (int) ' ', (int) (short) 0);
        byte[] byteArray34 = org.apache.commons.lang3.ArrayUtils.clone(byteArray29);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray35 = org.apache.commons.lang3.ArrayUtils.insert((int) (byte) 10, byteArray14, byteArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        long[] longArray0 = new long[] {};
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray0, (long) ' ');
        org.apache.commons.lang3.ArrayUtils.shift(longArray0, (int) (short) -1);
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray0, (long) (-1));
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.removeElements(longArray0, longArray7);
        org.apache.commons.lang3.ArrayUtils.swap(longArray8, (int) (short) 1, (-1));
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.addFirst(longArray8, (long) (short) 1);
        int[] intArray19 = new int[] { (-1), 0, (short) 0, (byte) 0, (-1) };
        int[] intArray20 = org.apache.commons.lang3.ArrayUtils.clone(intArray19);
        java.lang.Integer[] intArray21 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        int[] intArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray21);
        int[] intArray23 = org.apache.commons.lang3.ArrayUtils.removeElements(intArray20, intArray22);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.removeAll(longArray8, intArray22);
        java.util.BitSet bitSet27 = org.apache.commons.lang3.ArrayUtils.indexesOf(longArray24, (long) (byte) 0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertArrayEquals(longArray0, new long[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertArrayEquals(longArray7, new long[] {});
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] {});
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] { 1L });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] {});
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertArrayEquals(longArray24, new long[] {});
        org.junit.Assert.assertNotNull(bitSet27);
        org.junit.Assert.assertEquals(bitSet27.toString(), "{}");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        boolean[][] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray1 = org.apache.commons.lang3.ArrayUtils.concat(booleanArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"<local2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        java.lang.reflect.Field field0 = null;
        java.lang.reflect.Field[] fieldArray1 = new java.lang.reflect.Field[] { field0 };
        java.lang.reflect.Field field2 = null;
        java.lang.reflect.Field[] fieldArray3 = new java.lang.reflect.Field[] { field2 };
        java.lang.reflect.Field field4 = null;
        java.lang.reflect.Field[] fieldArray5 = new java.lang.reflect.Field[] { field4 };
        java.lang.reflect.Field field6 = null;
        java.lang.reflect.Field[] fieldArray7 = new java.lang.reflect.Field[] { field6 };
        java.lang.reflect.Field field8 = null;
        java.lang.reflect.Field[] fieldArray9 = new java.lang.reflect.Field[] { field8 };
        java.lang.reflect.Field[][] fieldArray10 = new java.lang.reflect.Field[][] { fieldArray1, fieldArray3, fieldArray5, fieldArray7, fieldArray9 };
        short[] shortArray13 = new short[] { (short) -1, (byte) 10 };
        short[] shortArray16 = new short[] { (short) 1, (short) 1 };
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray13, shortArray16);
        java.lang.reflect.Field[][] fieldArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(fieldArray10, (java.lang.Object) boolean17);
        java.lang.String[] strArray20 = org.apache.commons.lang3.ArrayUtils.toStringArray((java.lang.Object[]) fieldArray18, "{1,1,-1}");
        java.util.Random random21 = null;
        org.apache.commons.lang3.ArrayUtils.shuffle((java.lang.Object[]) fieldArray18, random21);
        org.junit.Assert.assertNotNull(fieldArray1);
        org.junit.Assert.assertArrayEquals(fieldArray1, new java.lang.reflect.Field[] { null });
        org.junit.Assert.assertNotNull(fieldArray3);
        org.junit.Assert.assertArrayEquals(fieldArray3, new java.lang.reflect.Field[] { null });
        org.junit.Assert.assertNotNull(fieldArray5);
        org.junit.Assert.assertArrayEquals(fieldArray5, new java.lang.reflect.Field[] { null });
        org.junit.Assert.assertNotNull(fieldArray7);
        org.junit.Assert.assertArrayEquals(fieldArray7, new java.lang.reflect.Field[] { null });
        org.junit.Assert.assertNotNull(fieldArray9);
        org.junit.Assert.assertArrayEquals(fieldArray9, new java.lang.reflect.Field[] { null });
        org.junit.Assert.assertNotNull(fieldArray10);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray13, new short[] { (short) -1, (short) 10 });
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray16, new short[] { (short) 1, (short) 1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(fieldArray18);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "[Ljava.lang.reflect.Field;@6b860fe3", "[Ljava.lang.reflect.Field;@68347544", "[Ljava.lang.reflect.Field;@4a66a5c2", "[Ljava.lang.reflect.Field;@399c1640", "[Ljava.lang.reflect.Field;@623eef87" });
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        java.lang.Boolean[][] booleanArray0 = new java.lang.Boolean[][] {};
        java.lang.Boolean[] booleanArray7 = new java.lang.Boolean[] { true, true, false, false, false, false };
        java.lang.Boolean[] booleanArray14 = new java.lang.Boolean[] { true, true, false, false, false, false };
        java.lang.Boolean[] booleanArray21 = new java.lang.Boolean[] { true, true, false, false, false, false };
        java.lang.Boolean[] booleanArray28 = new java.lang.Boolean[] { true, true, false, false, false, false };
        java.lang.Boolean[][] booleanArray29 = new java.lang.Boolean[][] { booleanArray7, booleanArray14, booleanArray21, booleanArray28 };
        java.lang.Boolean[][] booleanArray30 = org.apache.commons.lang3.ArrayUtils.nullTo(booleanArray0, booleanArray29);
        java.lang.Float[] floatArray32 = new java.lang.Float[] { 1.0f };
        java.lang.Float[] floatArray33 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray32);
        java.lang.Float[] floatArray34 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray33);
        java.lang.constant.Constable[][] constableArray35 = org.apache.commons.lang3.ArrayUtils.removeAllOccurences((java.lang.constant.Constable[][]) booleanArray30, (java.lang.constant.Constable[]) floatArray34);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.Constable[] constableArray37 = org.apache.commons.lang3.ArrayUtils.remove((java.lang.constant.Constable[]) floatArray34, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertArrayEquals(booleanArray0, new java.lang.Boolean[][] {});
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertArrayEquals(booleanArray7, new java.lang.Boolean[] { true, true, false, false, false, false });
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertArrayEquals(booleanArray14, new java.lang.Boolean[] { true, true, false, false, false, false });
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertArrayEquals(booleanArray21, new java.lang.Boolean[] { true, true, false, false, false, false });
        org.junit.Assert.assertNotNull(booleanArray28);
        org.junit.Assert.assertArrayEquals(booleanArray28, new java.lang.Boolean[] { true, true, false, false, false, false });
        org.junit.Assert.assertNotNull(booleanArray29);
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertArrayEquals(floatArray32, new java.lang.Float[] { 1.0f });
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertArrayEquals(floatArray33, new java.lang.Float[] { 1.0f });
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertArrayEquals(floatArray34, new java.lang.Float[] { 1.0f });
        org.junit.Assert.assertNotNull(constableArray35);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        java.util.BitSet[][] bitSetArray0 = null;
        double[] doubleArray8 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray8);
        java.util.BitSet bitSet12 = org.apache.commons.lang3.ArrayUtils.indexesOf(doubleArray9, 100.0d, 5);
        java.lang.Character[] charArray15 = new java.lang.Character[] { '#', '4' };
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray15);
        char[] charArray17 = org.apache.commons.lang3.ArrayFill.clear(charArray16);
        java.util.BitSet bitSet19 = org.apache.commons.lang3.ArrayUtils.indexesOf(charArray17, ' ');
        byte[] byteArray20 = null;
        java.util.BitSet bitSet22 = org.apache.commons.lang3.ArrayUtils.indexesOf(byteArray20, (byte) 100);
        byte[] byteArray23 = null;
        java.util.BitSet bitSet25 = org.apache.commons.lang3.ArrayUtils.indexesOf(byteArray23, (byte) 100);
        double[] doubleArray32 = new double[] { (byte) -1, (byte) 1, 100L, (byte) 10, 1L };
        double[] doubleArray35 = new double[] { (byte) 10, 1 };
        double[] doubleArray36 = org.apache.commons.lang3.ArrayUtils.insert(0, doubleArray32, doubleArray35);
        java.util.BitSet bitSet39 = org.apache.commons.lang3.ArrayUtils.indexesOf(doubleArray35, (double) (byte) 0, (double) 1);
        java.util.BitSet[] bitSetArray40 = new java.util.BitSet[] { bitSet12, bitSet19, bitSet22, bitSet25, bitSet39 };
        int[] intArray46 = new int[] { (-1), 0, (short) 0, (byte) 0, (-1) };
        int[] intArray47 = org.apache.commons.lang3.ArrayUtils.clone(intArray46);
        java.lang.Integer[] intArray48 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        int[] intArray49 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray48);
        int[] intArray50 = org.apache.commons.lang3.ArrayUtils.removeElements(intArray47, intArray49);
        java.util.BitSet bitSet53 = org.apache.commons.lang3.ArrayUtils.indexesOf(intArray49, 0, 100);
        java.util.BitSet[] bitSetArray54 = org.apache.commons.lang3.ArrayFill.fill(bitSetArray40, bitSet53);
        // The following exception was thrown during execution in test generation
        try {
            java.util.BitSet[][] bitSetArray55 = org.apache.commons.lang3.ArrayUtils.add(bitSetArray0, (int) (short) 10, bitSetArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(bitSet12);
        org.junit.Assert.assertEquals(bitSet12.toString(), "{}");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new java.lang.Character[] { '#', '4' });
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '\000', '\000' });
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '\000', '\000' });
        org.junit.Assert.assertNotNull(bitSet19);
        org.junit.Assert.assertEquals(bitSet19.toString(), "{}");
        org.junit.Assert.assertNotNull(bitSet22);
        org.junit.Assert.assertEquals(bitSet22.toString(), "{}");
        org.junit.Assert.assertNotNull(bitSet25);
        org.junit.Assert.assertEquals(bitSet25.toString(), "{}");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { (-1.0d), 1.0d, 100.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 10.0d, 1.0d, (-1.0d), 1.0d, 100.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(bitSet39);
        org.junit.Assert.assertEquals(bitSet39.toString(), "{1}");
        org.junit.Assert.assertNotNull(bitSetArray40);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] {});
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(bitSet53);
        org.junit.Assert.assertEquals(bitSet53.toString(), "{}");
        org.junit.Assert.assertNotNull(bitSetArray54);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        double[] doubleArray6 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray6);
        double[] doubleArray8 = org.apache.commons.lang3.ArraySorter.sort(doubleArray6);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray8);
        org.apache.commons.lang3.ArrayUtils.swap(doubleArray8, 0, (int) (short) 1, (int) (short) 0);
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.addFirst(doubleArray8, (double) 0);
        java.util.BitSet bitSet18 = org.apache.commons.lang3.ArrayUtils.indexesOf(doubleArray8, 0.0d, (double) '4');
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray8, 100.0d, (double) '4');
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.0d, (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(bitSet18);
        org.junit.Assert.assertEquals(bitSet18.toString(), "{0, 1, 2, 3, 4, 5}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        double[] doubleArray1 = new double[] { (-1.0f) };
        double[] doubleArray3 = new double[] { (-1.0f) };
        double[] doubleArray5 = new double[] { (-1.0f) };
        double[] doubleArray7 = new double[] { (-1.0f) };
        double[][] doubleArray8 = new double[][] { doubleArray1, doubleArray3, doubleArray5, doubleArray7 };
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.concat(doubleArray8);
        double[] doubleArray10 = null;
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.removeElements(doubleArray9, doubleArray10);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray10, (double) 100.0f, 10, (double) 10L);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d), (-1.0d), (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), (-1.0d), (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        long[] longArray0 = new long[] {};
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray0, (long) ' ');
        org.apache.commons.lang3.ArrayUtils.shift(longArray0, (int) (short) -1);
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray0, (long) (-1));
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.removeElements(longArray0, longArray7);
        org.apache.commons.lang3.ArrayUtils.swap(longArray8, (int) (short) 1, (-1));
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.addFirst(longArray8, (long) (short) 1);
        int[] intArray19 = new int[] { (-1), 0, (short) 0, (byte) 0, (-1) };
        int[] intArray20 = org.apache.commons.lang3.ArrayUtils.clone(intArray19);
        java.lang.Integer[] intArray21 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        int[] intArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray21);
        int[] intArray23 = org.apache.commons.lang3.ArrayUtils.removeElements(intArray20, intArray22);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.removeAll(longArray8, intArray22);
        org.apache.commons.lang3.ArrayUtils.swap(longArray8, 2, (int) (byte) 10);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertArrayEquals(longArray0, new long[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertArrayEquals(longArray7, new long[] {});
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] {});
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] { 1L });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] {});
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertArrayEquals(longArray24, new long[] {});
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.lang.Float[] floatArray0 = null;
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0, (float) (byte) 11);
        org.junit.Assert.assertNull(floatArray2);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.lang.AutoCloseable autoCloseable0 = null;
        org.apache.commons.lang3.AutoCloseables.closeQuietly(autoCloseable0);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.lang.Object obj0 = null;
        int int1 = org.apache.commons.lang3.ArrayUtils.getLength(obj0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.apache.commons.lang3.ArrayUtils arrayUtils0 = new org.apache.commons.lang3.ArrayUtils();
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(byteArray7, (byte) 0);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.contains(byteArray7, (byte) -1);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.removeAllOccurrences(byteArray7, (byte) 10);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.contains(byteArray20, (byte) 0);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray20, (byte) -1);
        int[] intArray25 = null;
        byte[] byteArray26 = org.apache.commons.lang3.ArrayUtils.removeAll(byteArray20, intArray25);
        byte[] byteArray27 = null;
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray20, byteArray27);
        byte[] byteArray29 = org.apache.commons.lang3.ArraySorter.sort(byteArray20);
        byte[] byteArray30 = org.apache.commons.lang3.ArrayUtils.removeElements(byteArray13, byteArray29);
        byte[] byteArray37 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.contains(byteArray37, (byte) 0);
        int int41 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray37, (byte) -1);
        int[] intArray42 = null;
        byte[] byteArray43 = org.apache.commons.lang3.ArrayUtils.removeAll(byteArray37, intArray42);
        byte[] byteArray44 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray37);
        int int47 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray37, (byte) -1, 100);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray48 = org.apache.commons.lang3.ArrayUtils.insert((int) (byte) 11, byteArray13, byteArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 11, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.lang.Integer[] intArray1 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        java.lang.Integer[] intArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray1);
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray1, (int) '4');
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray1, (int) (short) 10);
        int[] intArray12 = new int[] { (-1), 0, (short) 0, (byte) 0, (-1) };
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.clone(intArray12);
        java.lang.Integer[] intArray14 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        int[] intArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray14);
        int[] intArray16 = org.apache.commons.lang3.ArrayUtils.removeElements(intArray13, intArray15);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = org.apache.commons.lang3.ArrayUtils.insert((int) (short) 1, intArray6, intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] {});
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] {});
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] {});
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-1), 0, 0, 0, (-1) });
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        short[] shortArray2 = new short[] { (short) -1, (byte) 10 };
        short[] shortArray5 = new short[] { (short) 1, (short) 1 };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray2, shortArray5);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.removeAllOccurences(shortArray5, (short) (byte) 100);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray5);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] { (short) -1, (short) 10 });
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 1, (short) 1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertArrayEquals(shortArray8, new short[] { (short) 1, (short) 1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        java.lang.String str1 = org.apache.commons.lang3.BooleanUtils.toStringOnOff(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "off" + "'", str1, "off");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        java.lang.Float[] floatArray2 = new java.lang.Float[] { 1.0f };
        java.lang.Float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray2);
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray3, (float) 5);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray5, (float) (short) 1);
        java.lang.Float[] floatArray14 = new java.lang.Float[] { 1.0f, 1.0f, 10.0f, (-1.0f), (-1.0f), 1.0f };
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray14);
        java.lang.Float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray15);
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.clone(floatArray15);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.insert(2147483639, floatArray7, floatArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2147483639, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertArrayEquals(floatArray2, new java.lang.Float[] { 1.0f });
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertArrayEquals(floatArray3, new java.lang.Float[] { 1.0f });
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertArrayEquals(floatArray5, new float[] { 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertArrayEquals(floatArray7, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertArrayEquals(floatArray14, new java.lang.Float[] { 1.0f, 1.0f, 10.0f, (-1.0f), (-1.0f), 1.0f });
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertArrayEquals(floatArray15, new float[] { 1.0f, 1.0f, 10.0f, (-1.0f), (-1.0f), 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertArrayEquals(floatArray16, new java.lang.Float[] { 1.0f, 1.0f, 10.0f, (-1.0f), (-1.0f), 1.0f });
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertArrayEquals(floatArray17, new float[] { 1.0f, 1.0f, 10.0f, (-1.0f), (-1.0f), 1.0f }, (float) 1.0E-15);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(byteArray6, (byte) 0);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(byteArray6, (byte) -1);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) 100);
        boolean[] booleanArray13 = new boolean[] {};
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray13);
        boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray13, true);
        org.apache.commons.lang3.ArrayUtils.shift(booleanArray13, (int) (byte) 1);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) int12, (java.lang.Object) (byte) 1);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(booleanArray13);
        assertBooleanArrayEquals(booleanArray13, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(booleanArray16);
        assertBooleanArrayEquals(booleanArray16, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        java.lang.Integer int1 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        long[] longArray0 = new long[] {};
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray0, (long) ' ');
        org.apache.commons.lang3.ArrayUtils.shift(longArray0, (int) (short) -1);
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray0, (long) (-1));
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.removeElements(longArray0, longArray7);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray0, 10L);
        java.lang.Object obj11 = org.apache.commons.lang3.ArrayUtils.toPrimitive((java.lang.Object) int10);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertArrayEquals(longArray0, new long[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertArrayEquals(longArray7, new long[] {});
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1) + "'", obj11, (-1));
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        java.lang.Object[] objArray0 = null;
        java.lang.String[] strArray2 = org.apache.commons.lang3.ArrayUtils.toStringArray(objArray0, "on");
        org.junit.Assert.assertNull(strArray2);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.apache.commons.lang3.arch.Processor processor1 = org.apache.commons.lang3.ArchUtils.getProcessor("on");
        org.junit.Assert.assertNull(processor1);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        double[] doubleArray6 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray6);
        double[] doubleArray8 = org.apache.commons.lang3.ArraySorter.sort(doubleArray6);
        java.lang.Double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray6);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray6, (double) 100);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new java.lang.Double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        boolean[] booleanArray0 = new boolean[] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray0);
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray0, true);
        org.apache.commons.lang3.ArrayUtils.shuffle(booleanArray0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        assertBooleanArrayEquals(booleanArray0, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        long[] longArray6 = new long[] { 'a', '4', (byte) -1, (byte) 1, (short) 10, 1L };
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray6, 0L, (int) 'a');
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray6);
        java.util.BitSet bitSet12 = org.apache.commons.lang3.ArrayUtils.indexesOf(longArray6, (long) 2147483639);
        int[] intArray17 = new int[] { (short) -1, (short) 100, (short) 10, (byte) -1 };
        int[] intArray19 = org.apache.commons.lang3.ArrayFill.fill(intArray17, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray20 = org.apache.commons.lang3.ArrayUtils.removeAll(longArray6, intArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { 97L, 52L, (-1L), 1L, 10L, 1L });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(bitSet12);
        org.junit.Assert.assertEquals(bitSet12.toString(), "{}");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 10, 10, 10, 10 });
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        double[] doubleArray1 = null;
        double[] doubleArray8 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray8);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.insert(2147483639, doubleArray1, doubleArray9);
        org.apache.commons.lang3.ArrayUtils.swap(doubleArray1, (int) '4', (int) '4', (int) '4');
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        short[] shortArray0 = null;
        short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray0, (short) (byte) 1);
        org.junit.Assert.assertNull(shortArray2);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(byteArray6, (byte) 0);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) -1);
        int[] intArray11 = null;
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.removeAll(byteArray6, intArray11);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayFill.clear(byteArray6);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.contains(byteArray6, (byte) 100);
        byte[] byteArray16 = org.apache.commons.lang3.ArrayFill.clear(byteArray6);
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.contains(byteArray23, (byte) 0);
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray23, (byte) -1);
        int[] intArray28 = null;
        byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.removeAll(byteArray23, intArray28);
        byte[] byteArray30 = org.apache.commons.lang3.ArrayFill.clear(byteArray23);
        byte[] byteArray32 = org.apache.commons.lang3.ArrayUtils.remove(byteArray23, (int) (short) 1);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.startsWith(byteArray16, byteArray23);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray35 = org.apache.commons.lang3.ArrayUtils.remove(byteArray23, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        java.lang.Character[] charArray2 = new java.lang.Character[] { '#', '4' };
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray2);
        char[] charArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray3);
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.addFirst(charArray4, '#');
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.removeAllOccurrences(charArray4, '#');
        char[] charArray10 = new char[] { '4' };
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray10, 'a');
        org.apache.commons.lang3.ArrayUtils.swap(charArray10, (int) (short) -1, (int) (short) 1, 0);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray10);
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.addAll(charArray4, charArray10);
        char[] charArray19 = null;
        char[] charArray20 = org.apache.commons.lang3.ArrayUtils.removeElements(charArray18, charArray19);
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray19, ' ', (int) (short) 100);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new java.lang.Character[] { '#', '4' });
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] { '#', '4' });
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '#', '4' });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '#', '#', '4' });
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '#', '4', '4' });
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.isNotFalse((java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        short[] shortArray0 = null;
        short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray0, (short) 11);
        org.junit.Assert.assertNull(shortArray2);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.apache.commons.lang3.arch.Processor processor1 = org.apache.commons.lang3.ArchUtils.getProcessor("false");
        org.junit.Assert.assertNull(processor1);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        long[] longArray0 = null;
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.subarray(longArray0, (int) (byte) 11, (int) (short) 1);
        org.junit.Assert.assertNull(longArray3);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 2147483639, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        int[] intArray0 = null;
        org.apache.commons.lang3.ArrayUtils.shift(intArray0, (int) (short) 11, (int) (byte) 101, 0);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean("on");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        java.lang.Integer[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        java.lang.Integer[] intArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray1, 100);
        int[] intArray9 = new int[] { '#', (short) 1, (byte) 100, (short) 1, 10 };
        org.apache.commons.lang3.ArrayUtils.reverse(intArray9, (int) (short) 1, (int) ' ');
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray3, intArray9);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray3);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] {});
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 35, 10, 1, 100, 1 });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        java.lang.Integer int1 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 0 };
        java.lang.Short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray2);
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3, (short) (byte) -1);
        org.apache.commons.lang3.ArrayUtils.shift(shortArray5, (int) (short) 0);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray5);
        short[] shortArray9 = org.apache.commons.lang3.ArraySorter.sort(shortArray5);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.contains(shortArray5, (short) (byte) 101);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new java.lang.Short[] { (short) -1, (short) 0 });
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertArrayEquals(shortArray3, new java.lang.Short[] { (short) -1, (short) 0 });
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) -1, (short) 0 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertArrayEquals(shortArray9, new short[] { (short) -1, (short) 0 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        double[] doubleArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        long[] longArray0 = new long[] {};
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray0, (long) ' ');
        org.apache.commons.lang3.ArrayUtils.shift(longArray0, (int) (short) -1);
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray0, (long) (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(longArray0);
        short[] shortArray8 = null;
        short[] shortArray10 = org.apache.commons.lang3.ArrayUtils.add(shortArray8, (short) (byte) 100);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) longArray0, (java.lang.Object) (byte) 100);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertArrayEquals(longArray0, new long[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray10, new short[] { (short) 100 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        float[] floatArray3 = new float[] { 1.0f, (-1), 1.0f };
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.clone(floatArray3);
        float[] floatArray6 = org.apache.commons.lang3.ArrayFill.fill(floatArray3, (float) ' ');
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.removeAllOccurrences(floatArray6, (float) 2147483639);
        java.util.BitSet bitSet10 = org.apache.commons.lang3.ArrayUtils.indexesOf(floatArray6, (float) (short) 100);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertArrayEquals(floatArray3, new float[] { 32.0f, 32.0f, 32.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 1.0f, (-1.0f), 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertArrayEquals(floatArray6, new float[] { 32.0f, 32.0f, 32.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertArrayEquals(floatArray8, new float[] { 32.0f, 32.0f, 32.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(bitSet10);
        org.junit.Assert.assertEquals(bitSet10.toString(), "{}");
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        short[] shortArray2 = new short[] { (short) -1, (byte) 10 };
        short[] shortArray5 = new short[] { (short) 1, (short) 1 };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray2, shortArray5);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray2, (short) (byte) 100);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray2, (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.remove(shortArray2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] { (short) -1, (short) 10 });
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 1, (short) 1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "hi!", "yes", "on");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "yes" + "'", str4, "yes");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        boolean[] booleanArray0 = new boolean[] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray0);
        boolean[] booleanArray2 = new boolean[] {};
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray2);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray2, true);
        boolean[] booleanArray6 = new boolean[] {};
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray6);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray6, true);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray2, booleanArray6);
        boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.removeElements(booleanArray0, booleanArray6);
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray0);
        boolean[] booleanArray13 = null;
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray12, booleanArray13);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray14, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        assertBooleanArrayEquals(booleanArray0, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(booleanArray2);
        assertBooleanArrayEquals(booleanArray2, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(booleanArray6);
        assertBooleanArrayEquals(booleanArray6, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(booleanArray11);
        assertBooleanArrayEquals(booleanArray11, new boolean[] {});
        org.junit.Assert.assertNotNull(booleanArray12);
        assertBooleanArrayEquals(booleanArray12, new boolean[] {});
        org.junit.Assert.assertNotNull(booleanArray14);
        assertBooleanArrayEquals(booleanArray14, new boolean[] {});
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 10, (java.lang.Integer) 2, (java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        long[] longArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.subarray(longArray0, (int) '#', (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray5 = org.apache.commons.lang3.ArrayUtils.remove(longArray3, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertArrayEquals(longArray0, new long[] {});
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertArrayEquals(longArray3, new long[] {});
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        java.lang.Character[] charArray2 = new java.lang.Character[] { '#', '4' };
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray2);
        org.apache.commons.lang3.ArrayUtils.shuffle(charArray3);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray3);
        org.apache.commons.lang3.ArrayUtils.shuffle(charArray5);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new java.lang.Character[] { '#', '4' });
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] { '#', '4' });
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', '4' });
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        java.lang.String str1 = org.apache.commons.lang3.BooleanUtils.toStringYesNo((java.lang.Boolean) true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        double[] doubleArray1 = new double[] { (-1.0f) };
        double[] doubleArray3 = new double[] { (-1.0f) };
        double[] doubleArray5 = new double[] { (-1.0f) };
        double[] doubleArray7 = new double[] { (-1.0f) };
        double[][] doubleArray8 = new double[][] { doubleArray1, doubleArray3, doubleArray5, doubleArray7 };
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.concat(doubleArray8);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.concat(doubleArray8);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.concat(doubleArray8);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray11, (double) 1L);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d), (-1.0d), (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), (-1.0d), (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), (-1.0d), (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray1);
        org.apache.commons.lang3.ArrayUtils.shift(booleanArray1, (int) (byte) 0, 100, 100);
        java.util.BitSet bitSet9 = org.apache.commons.lang3.ArrayUtils.indexesOf(booleanArray1, false, (int) (byte) 0);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray1);
        boolean boolean11 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        org.junit.Assert.assertNotNull(booleanArray1);
        assertBooleanArrayEquals(booleanArray1, new boolean[] { false });
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(bitSet9);
        org.junit.Assert.assertEquals(bitSet9.toString(), "{0}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (byte) 101, (int) (byte) 11, (int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        java.lang.Integer[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        java.lang.Integer[] intArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        java.lang.Integer[] intArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, (int) (byte) 11);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] {});
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        short[] shortArray2 = new short[] { (short) -1, (byte) 10 };
        short[] shortArray5 = new short[] { (short) 1, (short) 1 };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray2, shortArray5);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray5);
        short[] shortArray10 = new short[] { (short) -1, (byte) 10 };
        short[] shortArray13 = new short[] { (short) 1, (short) 1 };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray10, shortArray13);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray10);
        short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray10, (int) (short) -1, (int) (byte) 1);
        java.util.Random random19 = null;
        org.apache.commons.lang3.ArrayUtils.shuffle(shortArray18, random19);
        short[] shortArray21 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray5, shortArray18);
        java.lang.Integer[] intArray22 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        java.lang.Integer[] intArray23 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray22);
        int[] intArray25 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray23, 100);
        int[] intArray31 = new int[] { '#', (short) 1, (byte) 100, (short) 1, 10 };
        org.apache.commons.lang3.ArrayUtils.reverse(intArray31, (int) (short) 1, (int) ' ');
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray25, intArray31);
        int[] intArray41 = new int[] { (-1), 0, (short) 0, (byte) 0, (-1) };
        int[] intArray42 = org.apache.commons.lang3.ArrayUtils.clone(intArray41);
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.contains(intArray42, (int) (byte) 100);
        int[] intArray45 = org.apache.commons.lang3.ArrayUtils.addAll(intArray25, intArray42);
        short[] shortArray46 = org.apache.commons.lang3.ArrayUtils.removeAll(shortArray21, intArray25);
        int int48 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray21, (short) 0);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] { (short) -1, (short) 10 });
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 1, (short) 1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray10, new short[] { (short) 10, (short) -1 });
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray13, new short[] { (short) 1, (short) 1 });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray18, new short[] { (short) 10 });
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertArrayEquals(shortArray21, new short[] { (short) 1, (short) 1, (short) 10 });
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] {});
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { 35, 10, 1, 100, 1 });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertArrayEquals(shortArray46, new short[] { (short) 1, (short) 1, (short) 10 });
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(byteArray6, (byte) 0);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) -1);
        int[] intArray11 = null;
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.removeAll(byteArray6, intArray11);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayFill.clear(byteArray6);
        byte[] byteArray15 = org.apache.commons.lang3.ArrayFill.fill(byteArray6, (byte) 1);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray6);
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.contains(byteArray23, (byte) 0);
        org.apache.commons.lang3.ArrayUtils.swap(byteArray23, (-1), (int) ' ');
        byte[] byteArray30 = org.apache.commons.lang3.ArrayUtils.addFirst(byteArray23, (byte) 0);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.startsWith(byteArray6, byteArray30);
        int[] intArray36 = new int[] { (short) -1, (short) 100, (short) 10, (byte) -1 };
        int[] intArray38 = org.apache.commons.lang3.ArrayFill.fill(intArray36, (int) (byte) 10);
        java.util.Random random39 = null;
        org.apache.commons.lang3.ArrayUtils.shuffle(intArray36, random39);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray41 = org.apache.commons.lang3.ArrayUtils.removeAll(byteArray6, intArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 10, 10, 10, 10 });
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        boolean[] booleanArray0 = new boolean[] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray0);
        java.util.BitSet bitSet4 = org.apache.commons.lang3.ArrayUtils.indexesOf(booleanArray0, true, 100);
        java.util.Random random5 = null;
        org.apache.commons.lang3.ArrayUtils.shuffle(booleanArray0, random5);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.addFirst(booleanArray0, true);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.add(booleanArray8, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        assertBooleanArrayEquals(booleanArray0, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(bitSet4);
        org.junit.Assert.assertEquals(bitSet4.toString(), "{}");
        org.junit.Assert.assertNotNull(booleanArray8);
        assertBooleanArrayEquals(booleanArray8, new boolean[] { true });
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        byte[] byteArray1 = new byte[] {};
        byte[][] byteArray2 = new byte[][] { byteArray1 };
        byte[] byteArray3 = new byte[] {};
        byte[][] byteArray4 = new byte[][] { byteArray3 };
        byte[] byteArray5 = new byte[] {};
        byte[][] byteArray6 = new byte[][] { byteArray5 };
        byte[] byteArray7 = new byte[] {};
        byte[][] byteArray8 = new byte[][] { byteArray7 };
        byte[][][] byteArray9 = new byte[][][] { byteArray2, byteArray4, byteArray6, byteArray8 };
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray11 = new byte[] {};
        byte[][] byteArray12 = new byte[][] { byteArray10, byteArray11 };
        byte[] byteArray13 = new byte[] {};
        byte[] byteArray14 = new byte[] {};
        byte[][] byteArray15 = new byte[][] { byteArray13, byteArray14 };
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray17 = new byte[] {};
        byte[][] byteArray18 = new byte[][] { byteArray16, byteArray17 };
        byte[][][] byteArray19 = new byte[][][] { byteArray12, byteArray15, byteArray18 };
        // The following exception was thrown during execution in test generation
        try {
            byte[][][] byteArray20 = org.apache.commons.lang3.ArrayUtils.insert((int) (short) 11, byteArray9, byteArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 11, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertNotNull(byteArray19);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        float[] floatArray4 = new float[] { (short) 10, (short) 1, 100.0f, 10.0f };
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.add(floatArray4, (float) 100);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray4, (float) 10, 5);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.remove(floatArray4, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 10.0f, 1.0f, 100.0f, 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertArrayEquals(floatArray6, new float[] { 10.0f, 1.0f, 100.0f, 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        short[] shortArray3 = new short[] { (short) -1, (byte) 10 };
        short[] shortArray6 = new short[] { (short) 1, (short) 1 };
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray3, shortArray6);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.removeAllOccurences(shortArray6, (short) (byte) 100);
        java.lang.Short[] shortArray12 = new java.lang.Short[] { (short) -1, (short) 0 };
        java.lang.Short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray12);
        short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray13);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray13, (short) (byte) 0);
        org.apache.commons.lang3.ArrayUtils.swap(shortArray16, (int) (short) 0, 100, (int) ' ');
        short[] shortArray23 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray16, (int) (byte) 11, 2147483639);
        short[] shortArray24 = org.apache.commons.lang3.ArrayUtils.insert(2, shortArray9, shortArray23);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertArrayEquals(shortArray3, new short[] { (short) -1, (short) 10 });
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] { (short) 1, (short) 1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertArrayEquals(shortArray9, new short[] { (short) 1, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray12, new java.lang.Short[] { (short) -1, (short) 0 });
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray13, new java.lang.Short[] { (short) -1, (short) 0 });
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray14, new short[] { (short) -1, (short) 0 });
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray16, new short[] { (short) -1, (short) 0 });
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertArrayEquals(shortArray23, new short[] {});
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertArrayEquals(shortArray24, new short[] { (short) 1, (short) 1 });
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.lang.reflect.Field[] fieldArray1 = org.apache.commons.lang3.ArrayUtils.EMPTY_FIELD_ARRAY;
        java.lang.String[] strArray2 = org.apache.commons.lang3.ArrayUtils.toStringArray((java.lang.Object[]) fieldArray1);
        java.lang.Comparable[][] comparableArray4 = new java.lang.Comparable[0][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray5 = (java.lang.Comparable<java.lang.String>[][]) comparableArray4;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        int[] intArray12 = null;
        java.lang.Comparable<java.lang.String>[] strComparableArray13 = org.apache.commons.lang3.ArrayUtils.removeAll((java.lang.Comparable<java.lang.String>[]) strArray11, intArray12);
        java.lang.Comparable<java.lang.String>[][] strComparableArray14 = org.apache.commons.lang3.ArrayUtils.removeAllOccurrences(strComparableArray5, (java.lang.Comparable<java.lang.String>[]) strArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence[] charSequenceArray15 = org.apache.commons.lang3.ArrayUtils.insert((int) (byte) 100, (java.lang.CharSequence[]) strArray2, (java.lang.CharSequence[]) strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldArray1);
        org.junit.Assert.assertArrayEquals(fieldArray1, new java.lang.reflect.Field[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(comparableArray4);
        org.junit.Assert.assertArrayEquals(comparableArray4, new java.lang.Comparable[][] {});
        org.junit.Assert.assertNotNull(strComparableArray5);
        org.junit.Assert.assertArrayEquals(strComparableArray5, new java.lang.Comparable[][] {});
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray13);
        org.junit.Assert.assertArrayEquals(strComparableArray13, new java.lang.String[] { null, null, null, null, null });
        org.junit.Assert.assertNotNull(strComparableArray14);
        org.junit.Assert.assertArrayEquals(strComparableArray14, new java.lang.Comparable[][] {});
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        long[] longArray0 = new long[] {};
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray0, (long) ' ');
        org.apache.commons.lang3.ArrayUtils.shift(longArray0, (int) (short) -1);
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray0, (long) (-1));
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.removeElements(longArray0, longArray7);
        org.apache.commons.lang3.ArrayUtils.swap(longArray8, (int) (short) 1, (-1));
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray8, (long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray15 = org.apache.commons.lang3.ArrayUtils.remove(longArray8, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertArrayEquals(longArray0, new long[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertArrayEquals(longArray7, new long[] {});
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(byteArray7, (byte) 0);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray7, (byte) -1);
        int[] intArray12 = null;
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.removeAll(byteArray7, intArray12);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray7);
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.contains(byteArray21, (byte) 0);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray21, (byte) -1);
        int[] intArray26 = null;
        byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.removeAll(byteArray21, intArray26);
        byte[] byteArray28 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray21);
        byte[] byteArray31 = org.apache.commons.lang3.ArrayUtils.add(byteArray21, 1, (byte) 10);
        org.apache.commons.lang3.ArrayUtils.shift(byteArray31, 10);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray34 = org.apache.commons.lang3.ArrayUtils.insert(2147483639, byteArray7, byteArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2147483639, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 0 });
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = org.apache.commons.lang3.ArrayUtils.add(intArray0, 2147483639, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2147483639, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        double[] doubleArray1 = new double[] { (-1.0f) };
        double[] doubleArray3 = new double[] { (-1.0f) };
        double[] doubleArray5 = new double[] { (-1.0f) };
        double[] doubleArray7 = new double[] { (-1.0f) };
        double[][] doubleArray8 = new double[][] { doubleArray1, doubleArray3, doubleArray5, doubleArray7 };
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.concat(doubleArray8);
        double[] doubleArray10 = null;
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.removeElements(doubleArray9, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d), (-1.0d), (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), (-1.0d), (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "on", "-1", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "on" + "'", str4, "on");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        java.lang.Float[] floatArray6 = new java.lang.Float[] { 1.0f, 1.0f, 10.0f, (-1.0f), (-1.0f), 1.0f };
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6);
        java.util.BitSet bitSet10 = org.apache.commons.lang3.ArrayUtils.indexesOf(floatArray7, (float) 10L, (int) '4');
        float[] floatArray12 = org.apache.commons.lang3.ArrayFill.fill(floatArray7, (float) (short) 10);
        org.apache.commons.lang3.ArrayUtils.shuffle(floatArray7);
        java.util.BitSet bitSet15 = org.apache.commons.lang3.ArrayUtils.indexesOf(floatArray7, (float) 3);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertArrayEquals(floatArray6, new java.lang.Float[] { 1.0f, 1.0f, 10.0f, (-1.0f), (-1.0f), 1.0f });
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertArrayEquals(floatArray7, new float[] { 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(bitSet10);
        org.junit.Assert.assertEquals(bitSet10.toString(), "{}");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertArrayEquals(floatArray12, new float[] { 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(bitSet15);
        org.junit.Assert.assertEquals(bitSet15.toString(), "{}");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (byte) 0, (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        boolean[] booleanArray0 = org.apache.commons.lang3.BooleanUtils.primitiveValues();
        boolean[] booleanArray2 = org.apache.commons.lang3.ArrayFill.fill(booleanArray0, true);
        org.apache.commons.lang3.ArrayUtils.shift(booleanArray2, (int) (short) 16);
        java.util.BitSet bitSet6 = org.apache.commons.lang3.ArrayUtils.indexesOf(booleanArray2, false);
        org.junit.Assert.assertNotNull(booleanArray0);
        assertBooleanArrayEquals(booleanArray0, new boolean[] { true, true });
        org.junit.Assert.assertNotNull(booleanArray2);
        assertBooleanArrayEquals(booleanArray2, new boolean[] { true, true });
        org.junit.Assert.assertNotNull(bitSet6);
        org.junit.Assert.assertEquals(bitSet6.toString(), "{}");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        short[] shortArray2 = new short[] { (short) -1, (byte) 10 };
        short[] shortArray5 = new short[] { (short) 1, (short) 1 };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray2, shortArray5);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray2);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.remove(shortArray2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] { (short) 10, (short) -1 });
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 1, (short) 1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(2147483639, (int) (short) 1, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("hi!", "-1", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        java.lang.Character[] charArray2 = new java.lang.Character[] { '#', '4' };
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray2);
        char[] charArray9 = new char[] { 'a', '4', '#', ' ', '4' };
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.removeElements(charArray3, charArray9);
        java.util.BitSet bitSet13 = org.apache.commons.lang3.ArrayUtils.indexesOf(charArray9, ' ', 100);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray17 = org.apache.commons.lang3.ArrayFill.fill(charArray9, (int) '#', (int) (short) 16, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(35) > toIndex(16)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new java.lang.Character[] { '#', '4' });
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] { '#', '4' });
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '4', '#', ' ', '4' });
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(bitSet13);
        org.junit.Assert.assertEquals(bitSet13.toString(), "{}");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        char[] charArray1 = new char[] { '4' };
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray1, 'a');
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray1, 'a');
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.addFirst(charArray1, 'a');
        char[] charArray8 = org.apache.commons.lang3.ArrayFill.clear(charArray7);
        java.lang.String str9 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) charArray8);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '\000', '\000' });
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '\000', '\000' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{\000,\000}" + "'", str9, "{\000,\000}");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.lang.Character[] charArray2 = new java.lang.Character[] { '#', '4' };
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray2);
        char[] charArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray3);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray6 = org.apache.commons.lang3.ArrayUtils.remove(charArray4, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new java.lang.Character[] { '#', '4' });
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] { '#', '4' });
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '#', '4' });
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        short[] shortArray2 = new short[] { (short) -1, (byte) 10 };
        short[] shortArray5 = new short[] { (short) 1, (short) 1 };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray2, shortArray5);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.removeAllOccurences(shortArray5, (short) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.add(shortArray5, (int) (byte) 11, (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 11, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] { (short) -1, (short) 10 });
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 1, (short) 1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertArrayEquals(shortArray8, new short[] { (short) 1, (short) 1 });
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        int[] intArray4 = new int[] { (short) -1, (short) 100, (short) 10, (byte) -1 };
        int[] intArray6 = org.apache.commons.lang3.ArrayFill.fill(intArray4, (int) (byte) 10);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray4, (int) (byte) 0);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray4, (int) (short) 1);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray4, (int) (byte) 1);
        int[] intArray18 = new int[] { '#', (short) 1, (byte) 100, (short) 1, 10 };
        org.apache.commons.lang3.ArrayUtils.reverse(intArray18, (int) (short) 1, (int) ' ');
        int[] intArray23 = org.apache.commons.lang3.ArrayUtils.add(intArray18, (int) (byte) 0);
        int[] intArray26 = org.apache.commons.lang3.ArrayUtils.subarray(intArray23, (int) '#', 2);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray23);
        int[] intArray33 = new int[] { (-1), 0, (short) 0, (byte) 0, (-1) };
        int[] intArray34 = org.apache.commons.lang3.ArrayUtils.clone(intArray33);
        int[] intArray35 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray34);
        int[] intArray37 = org.apache.commons.lang3.ArrayUtils.removeAllOccurences(intArray34, (int) (byte) -1);
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.containsAny(intArray23, intArray37);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray39 = org.apache.commons.lang3.ArrayUtils.removeAll(intArray4, intArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 35, 10, 1, 100, 1 });
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 35, 10, 1, 100, 1, 0 });
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 0, 0, 0 });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        float[] floatArray5 = new float[] { (short) 10, (short) 1, 100.0f, 10.0f };
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray5, (float) 100);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray7, 10.0f);
        org.apache.commons.lang3.ArrayUtils.swap(floatArray7, (int) ' ', (int) 'a');
        float[] floatArray16 = new float[] { 1.0f, (-1), 1.0f };
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.clone(floatArray16);
        float[] floatArray19 = org.apache.commons.lang3.ArrayFill.fill(floatArray16, (float) ' ');
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.removeAllOccurrences(floatArray19, (float) 2147483639);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.insert((int) (byte) 11, floatArray7, floatArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 11, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertArrayEquals(floatArray5, new float[] { 10.0f, 1.0f, 100.0f, 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertArrayEquals(floatArray7, new float[] { 10.0f, 1.0f, 100.0f, 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertArrayEquals(floatArray16, new float[] { 32.0f, 32.0f, 32.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertArrayEquals(floatArray17, new float[] { 1.0f, (-1.0f), 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertArrayEquals(floatArray19, new float[] { 32.0f, 32.0f, 32.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertArrayEquals(floatArray21, new float[] { 32.0f, 32.0f, 32.0f }, (float) 1.0E-15);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.apache.commons.lang3.ArrayUtils.SOFT_MAX_ARRAY_LENGTH = 10;
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(byteArray6, (byte) 0);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(byteArray6, (byte) -1);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.removeAllOccurrences(byteArray6, (byte) 10);
        org.apache.commons.lang3.ArrayUtils.shift(byteArray12, 0, (int) (byte) 1, (int) 'a');
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 1, (byte) 0 });
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        java.lang.annotation.Annotation annotation0 = null;
        java.lang.annotation.Annotation annotation1 = null;
        boolean boolean2 = org.apache.commons.lang3.AnnotationUtils.equals(annotation0, annotation1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        boolean[] booleanArray0 = new boolean[] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray0);
        boolean[] booleanArray2 = new boolean[] {};
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray2);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray2, true);
        boolean[] booleanArray6 = new boolean[] {};
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray6);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray6, true);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray2, booleanArray6);
        boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.removeElements(booleanArray0, booleanArray6);
        boolean[] booleanArray12 = new boolean[] {};
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray12);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray12, true);
        boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray12);
        boolean[] booleanArray17 = new boolean[] {};
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray17);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray17, true);
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray17, true, (int) '#');
        java.util.Random random24 = null;
        org.apache.commons.lang3.ArrayUtils.shuffle(booleanArray17, random24);
        boolean[] booleanArray26 = org.apache.commons.lang3.ArrayUtils.removeElements(booleanArray16, booleanArray17);
        java.util.Random random27 = null;
        org.apache.commons.lang3.ArrayUtils.shuffle(booleanArray17, random27);
        java.lang.Integer[] intArray29 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        java.lang.Integer[] intArray30 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray29);
        int[] intArray32 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray30, 100);
        int[] intArray38 = new int[] { '#', (short) 1, (byte) 100, (short) 1, 10 };
        org.apache.commons.lang3.ArrayUtils.reverse(intArray38, (int) (short) 1, (int) ' ');
        boolean boolean42 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray32, intArray38);
        boolean[] booleanArray43 = org.apache.commons.lang3.ArrayUtils.removeAll(booleanArray17, intArray32);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray46 = org.apache.commons.lang3.ArrayUtils.add(intArray32, (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        assertBooleanArrayEquals(booleanArray0, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(booleanArray2);
        assertBooleanArrayEquals(booleanArray2, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(booleanArray6);
        assertBooleanArrayEquals(booleanArray6, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(booleanArray11);
        assertBooleanArrayEquals(booleanArray11, new boolean[] {});
        org.junit.Assert.assertNotNull(booleanArray12);
        assertBooleanArrayEquals(booleanArray12, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(booleanArray16);
        assertBooleanArrayEquals(booleanArray16, new boolean[] {});
        org.junit.Assert.assertNotNull(booleanArray17);
        assertBooleanArrayEquals(booleanArray17, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(booleanArray26);
        assertBooleanArrayEquals(booleanArray26, new boolean[] {});
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] {});
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 35, 10, 1, 100, 1 });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(booleanArray43);
        assertBooleanArrayEquals(booleanArray43, new boolean[] {});
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.apache.commons.lang3.arch.Processor processor0 = org.apache.commons.lang3.ArchUtils.getProcessor();
        org.junit.Assert.assertNotNull(processor0);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "off", "-1", "no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "off" + "'", str4, "off");
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        int[] intArray5 = new int[] { (-1), 0, (short) 0, (byte) 0, (-1) };
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.clone(intArray5);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray5, 3);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray5, (int) '4', 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = org.apache.commons.lang3.ArrayUtils.remove(intArray5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        char[] charArray1 = new char[] { '4' };
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray1, 'a');
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray1, 'a');
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray5, 'a', 52);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        byte[] byteArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray0, (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        java.lang.reflect.Field field0 = null;
        java.lang.reflect.Field[] fieldArray1 = new java.lang.reflect.Field[] { field0 };
        java.lang.reflect.Field field2 = null;
        java.lang.reflect.Field[] fieldArray3 = new java.lang.reflect.Field[] { field2 };
        java.lang.reflect.Field field4 = null;
        java.lang.reflect.Field[] fieldArray5 = new java.lang.reflect.Field[] { field4 };
        java.lang.reflect.Field field6 = null;
        java.lang.reflect.Field[] fieldArray7 = new java.lang.reflect.Field[] { field6 };
        java.lang.reflect.Field field8 = null;
        java.lang.reflect.Field[] fieldArray9 = new java.lang.reflect.Field[] { field8 };
        java.lang.reflect.Field[][] fieldArray10 = new java.lang.reflect.Field[][] { fieldArray1, fieldArray3, fieldArray5, fieldArray7, fieldArray9 };
        short[] shortArray13 = new short[] { (short) -1, (byte) 10 };
        short[] shortArray16 = new short[] { (short) 1, (short) 1 };
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray13, shortArray16);
        java.lang.reflect.Field[][] fieldArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(fieldArray10, (java.lang.Object) boolean17);
        short[] shortArray21 = new short[] { (short) -1, (byte) 10 };
        short[] shortArray24 = new short[] { (short) 1, (short) 1 };
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray21, shortArray24);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray21);
        org.apache.commons.lang3.ArrayUtils.shift(shortArray21, (int) (short) 10);
        int int30 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) fieldArray18, (java.lang.Object) (short) 10, (int) '4');
        org.junit.Assert.assertNotNull(fieldArray1);
        org.junit.Assert.assertArrayEquals(fieldArray1, new java.lang.reflect.Field[] { null });
        org.junit.Assert.assertNotNull(fieldArray3);
        org.junit.Assert.assertArrayEquals(fieldArray3, new java.lang.reflect.Field[] { null });
        org.junit.Assert.assertNotNull(fieldArray5);
        org.junit.Assert.assertArrayEquals(fieldArray5, new java.lang.reflect.Field[] { null });
        org.junit.Assert.assertNotNull(fieldArray7);
        org.junit.Assert.assertArrayEquals(fieldArray7, new java.lang.reflect.Field[] { null });
        org.junit.Assert.assertNotNull(fieldArray9);
        org.junit.Assert.assertArrayEquals(fieldArray9, new java.lang.reflect.Field[] { null });
        org.junit.Assert.assertNotNull(fieldArray10);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray13, new short[] { (short) -1, (short) 10 });
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray16, new short[] { (short) 1, (short) 1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(fieldArray18);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertArrayEquals(shortArray21, new short[] { (short) 10, (short) -1 });
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertArrayEquals(shortArray24, new short[] { (short) 1, (short) 1 });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        boolean[] booleanArray0 = new boolean[] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray0);
        boolean[] booleanArray2 = new boolean[] {};
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray2);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray2, true);
        boolean[] booleanArray6 = new boolean[] {};
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray6);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray6, true);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray2, booleanArray6);
        boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.removeElements(booleanArray0, booleanArray6);
        short[] shortArray14 = new short[] { (short) -1, (byte) 10 };
        short[] shortArray17 = new short[] { (short) 1, (short) 1 };
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray14, shortArray17);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray17);
        short[] shortArray22 = new short[] { (short) -1, (byte) 10 };
        short[] shortArray25 = new short[] { (short) 1, (short) 1 };
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray22, shortArray25);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray22);
        short[] shortArray30 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray22, (int) (short) -1, (int) (byte) 1);
        java.util.Random random31 = null;
        org.apache.commons.lang3.ArrayUtils.shuffle(shortArray30, random31);
        short[] shortArray33 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray17, shortArray30);
        java.lang.Integer[] intArray34 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        java.lang.Integer[] intArray35 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray34);
        int[] intArray37 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray35, 100);
        int[] intArray43 = new int[] { '#', (short) 1, (byte) 100, (short) 1, 10 };
        org.apache.commons.lang3.ArrayUtils.reverse(intArray43, (int) (short) 1, (int) ' ');
        boolean boolean47 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray37, intArray43);
        int[] intArray53 = new int[] { (-1), 0, (short) 0, (byte) 0, (-1) };
        int[] intArray54 = org.apache.commons.lang3.ArrayUtils.clone(intArray53);
        boolean boolean56 = org.apache.commons.lang3.ArrayUtils.contains(intArray54, (int) (byte) 100);
        int[] intArray57 = org.apache.commons.lang3.ArrayUtils.addAll(intArray37, intArray54);
        short[] shortArray58 = org.apache.commons.lang3.ArrayUtils.removeAll(shortArray33, intArray37);
        boolean[] booleanArray59 = org.apache.commons.lang3.ArrayUtils.removeAll(booleanArray11, intArray37);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean60 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        assertBooleanArrayEquals(booleanArray0, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(booleanArray2);
        assertBooleanArrayEquals(booleanArray2, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(booleanArray6);
        assertBooleanArrayEquals(booleanArray6, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(booleanArray11);
        assertBooleanArrayEquals(booleanArray11, new boolean[] {});
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray14, new short[] { (short) -1, (short) 10 });
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray17, new short[] { (short) 1, (short) 1 });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertArrayEquals(shortArray22, new short[] { (short) 10, (short) -1 });
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertArrayEquals(shortArray25, new short[] { (short) 1, (short) 1 });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertArrayEquals(shortArray30, new short[] { (short) 10 });
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertArrayEquals(shortArray33, new short[] { (short) 1, (short) 1, (short) 10 });
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] {});
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { 35, 10, 1, 100, 1 });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertArrayEquals(intArray53, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertArrayEquals(intArray54, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(shortArray58);
        org.junit.Assert.assertArrayEquals(shortArray58, new short[] { (short) 1, (short) 1, (short) 10 });
        org.junit.Assert.assertNotNull(booleanArray59);
        assertBooleanArrayEquals(booleanArray59, new boolean[] {});
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.lang.Integer[] intArray0 = new java.lang.Integer[] {};
        java.lang.Integer[] intArray1 = new java.lang.Integer[] {};
        java.lang.Integer[] intArray2 = new java.lang.Integer[] {};
        java.lang.Integer[][] intArray3 = new java.lang.Integer[][] { intArray0, intArray1, intArray2 };
        java.lang.Integer[] intArray4 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        java.lang.Integer[] intArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray4);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray5, 100);
        int[] intArray13 = new int[] { '#', (short) 1, (byte) 100, (short) 1, 10 };
        org.apache.commons.lang3.ArrayUtils.reverse(intArray13, (int) (short) 1, (int) ' ');
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray7, intArray13);
        int[] intArray23 = new int[] { (-1), 0, (short) 0, (byte) 0, (-1) };
        int[] intArray24 = org.apache.commons.lang3.ArrayUtils.clone(intArray23);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.contains(intArray24, (int) (byte) 100);
        int[] intArray27 = org.apache.commons.lang3.ArrayUtils.addAll(intArray7, intArray24);
        java.lang.Integer[][] intArray28 = org.apache.commons.lang3.ArrayUtils.removeAll(intArray3, intArray7);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray7);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] {});
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 35, 10, 1, 100, 1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        double[] doubleArray6 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray6);
        double[] doubleArray8 = org.apache.commons.lang3.ArraySorter.sort(doubleArray6);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray8, (int) (short) 0, (-1));
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray8);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        long[] longArray6 = new long[] { (short) -1, (byte) 10, 100L, (byte) 10, (short) 100, (byte) -1 };
        org.apache.commons.lang3.ArrayUtils.swap(longArray6, (int) (byte) 10, (int) (short) 10, (int) (short) 10);
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.removeAllOccurences(longArray6, (long) 100);
        long[] longArray19 = new long[] { 'a', '4', (byte) -1, (byte) 1, (short) 10, 1L };
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray19, 0L, (int) 'a');
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray19);
        java.util.BitSet bitSet26 = org.apache.commons.lang3.ArrayUtils.indexesOf(longArray19, (long) '4', (int) '#');
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray6, longArray19);
        long[] longArray29 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray6, 101L);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { (-1L), 10L, 100L, 10L, 100L, (-1L) });
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertArrayEquals(longArray12, new long[] { (-1L), 10L, 10L, (-1L) });
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertArrayEquals(longArray19, new long[] { 97L, 52L, (-1L), 1L, 10L, 1L });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(bitSet26);
        org.junit.Assert.assertEquals(bitSet26.toString(), "{}");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertArrayEquals(longArray29, new long[] { (-1L), 10L, 100L, 10L, 100L, (-1L) });
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        double[] doubleArray6 = new double[] { (byte) -1, (byte) 1, 100L, (byte) 10, 1L };
        double[] doubleArray9 = new double[] { (byte) 10, 1 };
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.insert(0, doubleArray6, doubleArray9);
        double[] doubleArray11 = null;
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.removeElements(doubleArray9, doubleArray11);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray12, (double) 100, 2147483639);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray12, (double) 'a', (double) 100);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 1.0d, 100.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 1.0d, (-1.0d), 1.0d, 100.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.lang.reflect.Field[] fieldArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_FIELD_ARRAY;
        java.lang.String[] strArray1 = org.apache.commons.lang3.ArrayUtils.toStringArray((java.lang.Object[]) fieldArray0);
        org.apache.commons.lang3.ArrayUtils.swap((java.lang.Object[]) fieldArray0, (int) '4', (-1), 0);
        java.lang.reflect.Field[] fieldArray7 = org.apache.commons.lang3.ArrayUtils.EMPTY_FIELD_ARRAY;
        java.lang.String[] strArray8 = org.apache.commons.lang3.ArrayUtils.toStringArray((java.lang.Object[]) fieldArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Field[] fieldArray11 = org.apache.commons.lang3.ArrayUtils.arraycopy(fieldArray0, (int) (byte) -1, fieldArray7, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for object array[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldArray0);
        org.junit.Assert.assertArrayEquals(fieldArray0, new java.lang.reflect.Field[] {});
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(fieldArray7);
        org.junit.Assert.assertArrayEquals(fieldArray7, new java.lang.reflect.Field[] {});
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        java.lang.Throwable[] throwableArray0 = new java.lang.Throwable[] {};
        java.lang.Throwable[] throwableArray1 = new java.lang.Throwable[] {};
        java.lang.Throwable[][] throwableArray2 = new java.lang.Throwable[][] { throwableArray0, throwableArray1 };
        java.lang.Throwable[] throwableArray3 = new java.lang.Throwable[] {};
        java.lang.Throwable[] throwableArray4 = new java.lang.Throwable[] {};
        java.lang.Throwable[][] throwableArray5 = new java.lang.Throwable[][] { throwableArray3, throwableArray4 };
        java.lang.Throwable[] throwableArray6 = new java.lang.Throwable[] {};
        java.lang.Throwable[] throwableArray7 = new java.lang.Throwable[] {};
        java.lang.Throwable[][] throwableArray8 = new java.lang.Throwable[][] { throwableArray6, throwableArray7 };
        java.lang.Throwable[] throwableArray9 = new java.lang.Throwable[] {};
        java.lang.Throwable[] throwableArray10 = new java.lang.Throwable[] {};
        java.lang.Throwable[][] throwableArray11 = new java.lang.Throwable[][] { throwableArray9, throwableArray10 };
        java.lang.Throwable[][][] throwableArray12 = new java.lang.Throwable[][][] { throwableArray2, throwableArray5, throwableArray8, throwableArray11 };
        java.lang.Throwable[][][] throwableArray13 = org.apache.commons.lang3.ArrayUtils.toArray(throwableArray12);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) throwableArray13, (int) (short) 10, 0);
        org.junit.Assert.assertNotNull(throwableArray0);
        org.junit.Assert.assertArrayEquals(throwableArray0, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertArrayEquals(throwableArray1, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertArrayEquals(throwableArray7, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertArrayEquals(throwableArray9, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertArrayEquals(throwableArray10, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(byteArray6, (byte) 0);
        org.apache.commons.lang3.ArrayUtils.swap(byteArray6, (-1), (int) ' ');
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.addFirst(byteArray6, (byte) 0);
        java.util.Random random14 = null;
        org.apache.commons.lang3.ArrayUtils.shuffle(byteArray6, random14);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 });
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        int[] intArray5 = new int[] { '#', (short) 1, (byte) 100, (short) 1, 10 };
        org.apache.commons.lang3.ArrayUtils.reverse(intArray5, (int) (short) 1, (int) ' ');
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.add(intArray5, (int) (byte) 0);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.subarray(intArray10, (int) '#', 2);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray10);
        int[] intArray20 = new int[] { (-1), 0, (short) 0, (byte) 0, (-1) };
        int[] intArray21 = org.apache.commons.lang3.ArrayUtils.clone(intArray20);
        int[] intArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray21);
        int[] intArray24 = org.apache.commons.lang3.ArrayUtils.removeAllOccurences(intArray21, (int) (byte) -1);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.containsAny(intArray10, intArray24);
        org.apache.commons.lang3.ArrayUtils.shift(intArray10, (int) (byte) 0, (int) '#', (int) ' ');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 10, 1, 100, 1 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 1, 0, 35, 10, 1, 100 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 0, 0, 0 });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "", "{0,0,0,0,0,0}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{0,0,0,0,0,0}" + "'", str3, "{0,0,0,0,0,0}");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        byte[] byteArray0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(byteArray7, (byte) 0);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray7, (byte) -1);
        int[] intArray12 = null;
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.removeAll(byteArray7, intArray12);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray7);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.add(byteArray7, 1, (byte) 10);
        org.apache.commons.lang3.ArrayUtils.shift(byteArray17, 10);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray0, byteArray17);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(byteArray6, (byte) 0);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(byteArray6, (byte) -1);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) 100);
        org.apache.commons.lang3.ArrayUtils.shift(byteArray6, (int) (byte) 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        long[] longArray6 = new long[] { (short) -1, (byte) 10, 100L, (byte) 10, (short) 100, (byte) -1 };
        org.apache.commons.lang3.ArrayUtils.swap(longArray6, (int) (byte) 10, (int) (short) 10, (int) (short) 10);
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.removeAllOccurences(longArray6, (long) 100);
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.subarray(longArray6, (int) (byte) 0, 3);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray15);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { (-1L), 10L, 100L, 10L, 100L, (-1L) });
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertArrayEquals(longArray12, new long[] { (-1L), 10L, 10L, (-1L) });
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertArrayEquals(longArray15, new long[] { (-1L), 10L, 100L });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        boolean[] booleanArray0 = new boolean[] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray0);
        boolean[] booleanArray2 = new boolean[] {};
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray2);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray2, true);
        boolean[] booleanArray6 = new boolean[] {};
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray6);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray6, true);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray2, booleanArray6);
        boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.removeElements(booleanArray0, booleanArray6);
        boolean[] booleanArray12 = new boolean[] {};
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray12);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray12, true);
        boolean[] booleanArray16 = new boolean[] {};
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray16);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray16, true);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray12, booleanArray16);
        boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray16);
        boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray21);
        org.apache.commons.lang3.ArrayUtils.swap(booleanArray21, (int) (short) 10, 3, 100);
        org.junit.Assert.assertNotNull(booleanArray0);
        assertBooleanArrayEquals(booleanArray0, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(booleanArray2);
        assertBooleanArrayEquals(booleanArray2, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(booleanArray6);
        assertBooleanArrayEquals(booleanArray6, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(booleanArray11);
        assertBooleanArrayEquals(booleanArray11, new boolean[] {});
        org.junit.Assert.assertNotNull(booleanArray12);
        assertBooleanArrayEquals(booleanArray12, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(booleanArray16);
        assertBooleanArrayEquals(booleanArray16, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(booleanArray21);
        assertBooleanArrayEquals(booleanArray21, new boolean[] {});
        org.junit.Assert.assertNotNull(booleanArray22);
        assertBooleanArrayEquals(booleanArray22, new boolean[] {});
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        boolean[] booleanArray0 = new boolean[] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray0);
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray0, true);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, true, (int) '#');
        java.util.Random random7 = null;
        org.apache.commons.lang3.ArrayUtils.shuffle(booleanArray0, random7);
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains(byteArray15, (byte) 0);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray15, (byte) -1);
        int[] intArray20 = null;
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.removeAll(byteArray15, intArray20);
        byte[] byteArray22 = org.apache.commons.lang3.ArrayFill.clear(byteArray15);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.contains(byteArray15, (byte) 100);
        byte[] byteArray25 = org.apache.commons.lang3.ArrayFill.clear(byteArray15);
        byte[] byteArray32 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.contains(byteArray32, (byte) 0);
        int int36 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray32, (byte) -1);
        int[] intArray37 = null;
        byte[] byteArray38 = org.apache.commons.lang3.ArrayUtils.removeAll(byteArray32, intArray37);
        byte[] byteArray39 = org.apache.commons.lang3.ArrayFill.clear(byteArray32);
        byte[] byteArray41 = org.apache.commons.lang3.ArrayUtils.remove(byteArray32, (int) (short) 1);
        boolean boolean42 = org.apache.commons.lang3.ArrayUtils.startsWith(byteArray25, byteArray32);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray25, (-1), (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean46 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object) random7, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        assertBooleanArrayEquals(booleanArray0, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.lang.Long[] longArray6 = new java.lang.Long[] { 1L, 1L, 1L, 100L, 100L, 100L };
        java.lang.Long[] longArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray6);
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray7, 0L);
        java.util.BitSet bitSet11 = org.apache.commons.lang3.ArrayUtils.indexesOf(longArray9, (long) 2147483639);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new java.lang.Long[] { 1L, 1L, 1L, 100L, 100L, 100L });
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertArrayEquals(longArray7, new java.lang.Long[] { 1L, 1L, 1L, 100L, 100L, 100L });
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertArrayEquals(longArray9, new long[] { 1L, 1L, 1L, 100L, 100L, 100L });
        org.junit.Assert.assertNotNull(bitSet11);
        org.junit.Assert.assertEquals(bitSet11.toString(), "{}");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        boolean[] booleanArray0 = new boolean[] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray0);
        boolean[] booleanArray2 = new boolean[] {};
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray2);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray2, true);
        boolean[] booleanArray6 = new boolean[] {};
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray6);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray6, true);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray2, booleanArray6);
        boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.removeElements(booleanArray0, booleanArray6);
        boolean[] booleanArray12 = new boolean[] {};
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray12);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray12, true);
        boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray12);
        boolean[] booleanArray17 = new boolean[] {};
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray17);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray17, true);
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray17, true, (int) '#');
        java.util.Random random24 = null;
        org.apache.commons.lang3.ArrayUtils.shuffle(booleanArray17, random24);
        boolean[] booleanArray26 = org.apache.commons.lang3.ArrayUtils.removeElements(booleanArray16, booleanArray17);
        boolean[] booleanArray31 = new boolean[] { true, true, false, true };
        boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.removeElements(booleanArray16, booleanArray31);
        boolean[] booleanArray34 = org.apache.commons.lang3.ArrayFill.fill(booleanArray16, false);
        org.junit.Assert.assertNotNull(booleanArray0);
        assertBooleanArrayEquals(booleanArray0, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(booleanArray2);
        assertBooleanArrayEquals(booleanArray2, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(booleanArray6);
        assertBooleanArrayEquals(booleanArray6, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(booleanArray11);
        assertBooleanArrayEquals(booleanArray11, new boolean[] {});
        org.junit.Assert.assertNotNull(booleanArray12);
        assertBooleanArrayEquals(booleanArray12, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(booleanArray16);
        assertBooleanArrayEquals(booleanArray16, new boolean[] {});
        org.junit.Assert.assertNotNull(booleanArray17);
        assertBooleanArrayEquals(booleanArray17, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(booleanArray26);
        assertBooleanArrayEquals(booleanArray26, new boolean[] {});
        org.junit.Assert.assertNotNull(booleanArray31);
        assertBooleanArrayEquals(booleanArray31, new boolean[] { true, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray32);
        assertBooleanArrayEquals(booleanArray32, new boolean[] {});
        org.junit.Assert.assertNotNull(booleanArray34);
        assertBooleanArrayEquals(booleanArray34, new boolean[] {});
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        int[] intArray4 = new int[] { (short) -1, (short) 100, (short) 10, (byte) -1 };
        int[] intArray6 = org.apache.commons.lang3.ArrayFill.fill(intArray4, (int) (byte) 10);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray4, (int) (byte) 0);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray4, (int) (short) 1);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray4, (int) (byte) 1);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray4, (int) (short) 16, (int) (short) 11);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        int[] intArray5 = new int[] { (-1), 0, (short) 0, (byte) 0, (-1) };
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.clone(intArray5);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray6);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.removeAllOccurences(intArray6, (int) (byte) -1);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray6);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 0, 0, 0 });
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        double[] doubleArray1 = new double[] { (-1.0f) };
        double[] doubleArray3 = new double[] { (-1.0f) };
        double[] doubleArray5 = new double[] { (-1.0f) };
        double[] doubleArray7 = new double[] { (-1.0f) };
        double[][] doubleArray8 = new double[][] { doubleArray1, doubleArray3, doubleArray5, doubleArray7 };
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.concat(doubleArray8);
        java.util.Random random10 = null;
        org.apache.commons.lang3.ArrayUtils.shuffle(doubleArray9, random10);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d), (-1.0d), (-1.0d), (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        java.lang.Float[] floatArray1 = new java.lang.Float[] { 1.0f };
        java.lang.Float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray2, (float) 5);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray4, (float) (short) 1);
        float[] floatArray8 = org.apache.commons.lang3.ArrayFill.fill(floatArray4, (float) 10);
        org.apache.commons.lang3.ArrayUtils.shuffle(floatArray8);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertArrayEquals(floatArray1, new java.lang.Float[] { 1.0f });
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertArrayEquals(floatArray2, new java.lang.Float[] { 1.0f });
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertArrayEquals(floatArray6, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertArrayEquals(floatArray8, new float[] { 10.0f }, (float) 1.0E-15);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        double[] doubleArray6 = new double[] { (byte) -1, (byte) 1, 100L, (byte) 10, 1L };
        double[] doubleArray9 = new double[] { (byte) 10, 1 };
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.insert(0, doubleArray6, doubleArray9);
        double[] doubleArray11 = null;
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.removeElements(doubleArray9, doubleArray11);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray12, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 1.0d, 100.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 1.0d, (-1.0d), 1.0d, 100.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        double[] doubleArray6 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray6);
        double[] doubleArray8 = org.apache.commons.lang3.ArraySorter.sort(doubleArray6);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray8, 0);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.removeAllOccurences(doubleArray10, 0.0d);
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.removeAllOccurrences(doubleArray12, (double) (byte) 101);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray14);
        double[] doubleArray22 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        double[] doubleArray23 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray22);
        double[] doubleArray24 = org.apache.commons.lang3.ArraySorter.sort(doubleArray22);
        double[] doubleArray26 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray24, 0);
        double[] doubleArray28 = org.apache.commons.lang3.ArrayUtils.removeAllOccurences(doubleArray26, 0.0d);
        double[] doubleArray30 = org.apache.commons.lang3.ArrayUtils.removeAllOccurrences(doubleArray28, (double) (byte) 101);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray14, doubleArray30);
        org.apache.commons.lang3.ArrayUtils.swap(doubleArray14, 3, 10);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 10.0d, 1.0d, 1.0d, (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        double[] doubleArray0 = null;
        java.util.BitSet bitSet3 = org.apache.commons.lang3.ArrayUtils.indexesOf(doubleArray0, (double) 10L, (int) '#');
        org.junit.Assert.assertNotNull(bitSet3);
        org.junit.Assert.assertEquals(bitSet3.toString(), "{}");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("{\000,\000}", "{\000,\000}", "yes");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        double[] doubleArray6 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray6);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray7);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray7);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray7, (double) 52);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray7, (double) (byte) 101);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray7, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d, 1.0d, 1.0d, (-1.0d), (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        int[] intArray5 = new int[] { (short) -1, (short) 100, (short) 10, (byte) -1 };
        int[] intArray7 = org.apache.commons.lang3.ArrayFill.fill(intArray5, (int) (byte) 10);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray5, (int) (byte) 0);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray5, (int) (short) 1);
        int[] intArray17 = new int[] { 5, (short) 10, 5, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = org.apache.commons.lang3.ArrayUtils.insert(100, intArray5, intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 5, 10, 5, 1, 10 });
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        long[] longArray0 = new long[] {};
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray0, (long) ' ');
        org.apache.commons.lang3.ArrayUtils.shift(longArray0, (int) (short) -1);
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray0, (long) (-1));
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.removeElements(longArray0, longArray7);
        org.apache.commons.lang3.ArrayUtils.swap(longArray8, (int) (short) 1, (-1));
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.addFirst(longArray8, (long) (short) 1);
        int[] intArray19 = new int[] { (-1), 0, (short) 0, (byte) 0, (-1) };
        int[] intArray20 = org.apache.commons.lang3.ArrayUtils.clone(intArray19);
        java.lang.Integer[] intArray21 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        int[] intArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray21);
        int[] intArray23 = org.apache.commons.lang3.ArrayUtils.removeElements(intArray20, intArray22);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.removeAll(longArray8, intArray22);
        int[] intArray25 = org.apache.commons.lang3.ArrayUtils.clone(intArray22);
        org.apache.commons.lang3.ArrayUtils.shift(intArray22, (int) (byte) 100, (int) '#', 10);
        int[] intArray30 = org.apache.commons.lang3.ArrayUtils.clone(intArray22);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray30);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertArrayEquals(longArray0, new long[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertArrayEquals(longArray7, new long[] {});
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] {});
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] { 1L });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] {});
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertArrayEquals(longArray24, new long[] {});
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] {});
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] {});
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        short[] shortArray2 = new short[] { (short) -1, (byte) 10 };
        short[] shortArray5 = new short[] { (short) 1, (short) 1 };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray2, shortArray5);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray2);
        short[] shortArray10 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray2, (int) (short) -1, (int) (byte) 1);
        org.apache.commons.lang3.ArrayUtils.shuffle(shortArray10);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray10);
        java.lang.Short[] shortArray15 = new java.lang.Short[] { (short) -1, (short) 0 };
        java.lang.Short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray15);
        short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray16, (short) (byte) -1);
        short[] shortArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray16, (short) (byte) 10);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray10, shortArray20);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] { (short) 10, (short) -1 });
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 1, (short) 1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray10, new short[] { (short) 10 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray15, new java.lang.Short[] { (short) -1, (short) 0 });
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray16, new java.lang.Short[] { (short) -1, (short) 0 });
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray18, new short[] { (short) -1, (short) 0 });
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray20, new short[] { (short) -1, (short) 0 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        float[] floatArray0 = null;
        java.util.Random random1 = null;
        org.apache.commons.lang3.ArrayUtils.shuffle(floatArray0, random1);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        int[] intArray4 = new int[] { (short) -1, (short) 100, (short) 10, (byte) -1 };
        int[] intArray6 = org.apache.commons.lang3.ArrayFill.fill(intArray4, (int) (byte) 10);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray6);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray6);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("", "", "false");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        float[] floatArray3 = new float[] { 52, '4' };
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY;
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.insert(100, floatArray3, floatArray4);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY;
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray5, floatArray6);
        java.util.Random random8 = null;
        org.apache.commons.lang3.ArrayUtils.shuffle(floatArray6, random8);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertArrayEquals(floatArray3, new float[] { 52.0f, 52.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertArrayEquals(floatArray5, new float[] { 52.0f, 52.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertArrayEquals(floatArray6, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertArrayEquals(floatArray7, new float[] { 52.0f, 52.0f }, (float) 1.0E-15);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        short[] shortArray0 = null;
        short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.add(shortArray0, (short) (byte) 100);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray0);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] { (short) 100 });
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 0, (java.lang.Integer) 2147483639);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483639 + "'", int3 == 2147483639);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        double[] doubleArray6 = new double[] { (byte) -1, (byte) 1, 100L, (byte) 10, 1L };
        double[] doubleArray9 = new double[] { (byte) 10, 1 };
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.insert(0, doubleArray6, doubleArray9);
        java.util.BitSet bitSet13 = org.apache.commons.lang3.ArrayUtils.indexesOf(doubleArray9, (double) (byte) 0, (double) 1);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray9, 100.0d, 5, (double) (byte) 10);
        double[] doubleArray24 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        double[] doubleArray25 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray24);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray25, (double) 100.0f);
        double[] doubleArray28 = org.apache.commons.lang3.ArrayUtils.removeElements(doubleArray9, doubleArray25);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray30 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray9, (int) (byte) 101);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 101, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 1.0d, 100.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 1.0d, (-1.0d), 1.0d, 100.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(bitSet13);
        org.junit.Assert.assertEquals(bitSet13.toString(), "{1}");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] {}, 1.0E-15);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        boolean[] booleanArray0 = new boolean[] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray0);
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.add(booleanArray0, false);
        java.util.BitSet bitSet6 = org.apache.commons.lang3.ArrayUtils.indexesOf(booleanArray0, false, (int) (byte) 0);
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray0);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        assertBooleanArrayEquals(booleanArray0, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(booleanArray3);
        assertBooleanArrayEquals(booleanArray3, new boolean[] { false });
        org.junit.Assert.assertNotNull(bitSet6);
        org.junit.Assert.assertEquals(bitSet6.toString(), "{}");
        org.junit.Assert.assertNotNull(booleanArray7);
        assertBooleanArrayEquals(booleanArray7, new boolean[] {});
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        float[] floatArray3 = new float[] { 52, '4' };
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY;
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.insert(100, floatArray3, floatArray4);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.clone(floatArray3);
        org.apache.commons.lang3.ArrayUtils.shuffle(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertArrayEquals(floatArray3, new float[] { 52.0f, 52.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertArrayEquals(floatArray5, new float[] { 52.0f, 52.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertArrayEquals(floatArray6, new float[] { 52.0f, 52.0f }, (float) 1.0E-15);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray1);
        org.apache.commons.lang3.ArrayUtils.shift(booleanArray1, (int) (byte) 0, 100, 100);
        java.util.BitSet bitSet9 = org.apache.commons.lang3.ArrayUtils.indexesOf(booleanArray1, false, (int) (byte) 0);
        java.util.BitSet bitSet12 = org.apache.commons.lang3.ArrayUtils.indexesOf(booleanArray1, true, 3);
        org.junit.Assert.assertNotNull(booleanArray1);
        assertBooleanArrayEquals(booleanArray1, new boolean[] { false });
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(bitSet9);
        org.junit.Assert.assertEquals(bitSet9.toString(), "{0}");
        org.junit.Assert.assertNotNull(bitSet12);
        org.junit.Assert.assertEquals(bitSet12.toString(), "{}");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        byte[] byteArray0 = null;
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.removeAllOccurrences(byteArray0, (byte) 10);
        org.junit.Assert.assertNull(byteArray2);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        float[] floatArray3 = new float[] { 52, '4' };
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY;
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.insert(100, floatArray3, floatArray4);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.remove(floatArray3, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertArrayEquals(floatArray3, new float[] { 52.0f, 52.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertArrayEquals(floatArray5, new float[] { 52.0f, 52.0f }, (float) 1.0E-15);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        float[] floatArray0 = null;
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray0, 52, (int) (short) 1);
        org.junit.Assert.assertNull(floatArray3);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        boolean[] booleanArray0 = new boolean[] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray0);
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray0, true);
        boolean[] booleanArray4 = new boolean[] {};
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray4);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray4, true);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray0, booleanArray4);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray0, false);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, false, (int) (byte) 10);
        org.junit.Assert.assertNotNull(booleanArray0);
        assertBooleanArrayEquals(booleanArray0, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(booleanArray4);
        assertBooleanArrayEquals(booleanArray4, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(booleanArray10);
        assertBooleanArrayEquals(booleanArray10, new boolean[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        int int2 = org.apache.commons.lang3.BooleanUtils.compare(false, true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        java.lang.Float[] floatArray1 = new java.lang.Float[] { 1.0f };
        java.lang.Float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray2);
        org.apache.commons.lang3.ArrayUtils.shift(floatArray3, 2147483639);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertArrayEquals(floatArray1, new java.lang.Float[] { 1.0f });
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertArrayEquals(floatArray2, new java.lang.Float[] { 1.0f });
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertArrayEquals(floatArray3, new float[] { 1.0f }, (float) 1.0E-15);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 0 };
        java.lang.Short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray2);
        java.lang.Short[] shortArray6 = new java.lang.Short[] { (short) -1, (short) 0 };
        java.lang.Short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray6);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray7, (short) (byte) -1);
        java.util.BitSet bitSet11 = org.apache.commons.lang3.ArrayUtils.indexesOf((java.lang.Object[]) shortArray2, (java.lang.Object) shortArray7, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) bitSet11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new java.lang.Short[] { (short) -1, (short) 0 });
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertArrayEquals(shortArray3, new java.lang.Short[] { (short) -1, (short) 0 });
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new java.lang.Short[] { (short) -1, (short) 0 });
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertArrayEquals(shortArray7, new java.lang.Short[] { (short) -1, (short) 0 });
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertArrayEquals(shortArray9, new short[] { (short) -1, (short) 0 });
        org.junit.Assert.assertNotNull(bitSet11);
        org.junit.Assert.assertEquals(bitSet11.toString(), "{}");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        long[] longArray0 = new long[] {};
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray0, (long) ' ');
        long[] longArray3 = new long[] {};
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray3, (long) ' ');
        org.apache.commons.lang3.ArrayUtils.shift(longArray3, (int) (short) -1);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray3, (long) (-1));
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.removeElements(longArray3, longArray10);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray0, longArray11);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray0, (int) (byte) 0, (int) (short) 10);
        long[] longArray17 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray0, (long) 100);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray0);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertArrayEquals(longArray0, new long[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertArrayEquals(longArray3, new long[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertArrayEquals(longArray10, new long[] {});
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        java.lang.Character[][][] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character[][][] charArray2 = org.apache.commons.lang3.ArrayUtils.remove(charArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        long[] longArray0 = new long[] {};
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray0, (long) ' ');
        org.apache.commons.lang3.ArrayUtils.shift(longArray0, (int) (short) -1);
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray0, (long) (-1));
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.removeElements(longArray0, longArray7);
        org.apache.commons.lang3.ArrayUtils.swap(longArray8, (int) (short) 1, (-1));
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.subarray(longArray8, (int) (byte) 100, (int) (short) 11);
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.clone(longArray14);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray18 = org.apache.commons.lang3.ArrayUtils.add(longArray15, (int) (byte) 10, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertArrayEquals(longArray0, new long[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertArrayEquals(longArray7, new long[] {});
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] {});
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertArrayEquals(longArray14, new long[] {});
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertArrayEquals(longArray15, new long[] {});
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        short[] shortArray2 = new short[] { (short) -1, (byte) 10 };
        short[] shortArray5 = new short[] { (short) 1, (short) 1 };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray2, shortArray5);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray2);
        short[] shortArray10 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray2, (int) (short) -1, (int) (byte) 1);
        org.apache.commons.lang3.ArrayUtils.shuffle(shortArray10);
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.addFirst(shortArray10, (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.add(shortArray10, (int) (byte) 10, (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] { (short) 10, (short) -1 });
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 1, (short) 1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray10, new short[] { (short) 10 });
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray13, new short[] { (short) 0, (short) 10 });
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        int[] intArray0 = null;
        org.apache.commons.lang3.ArrayUtils.shift(intArray0, 0, (int) (byte) 101, (int) (byte) -1);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        double[] doubleArray6 = new double[] { (byte) -1, (byte) 1, 100L, (byte) 10, 1L };
        double[] doubleArray9 = new double[] { (byte) 10, 1 };
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.insert(0, doubleArray6, doubleArray9);
        double[] doubleArray11 = null;
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.removeElements(doubleArray9, doubleArray11);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray12, (double) 100, 2147483639);
        double[] doubleArray22 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        double[] doubleArray23 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray22);
        double[] doubleArray24 = org.apache.commons.lang3.ArraySorter.sort(doubleArray22);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isSorted(doubleArray22);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray12, doubleArray22);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray12, (int) 'a', (int) (byte) 100);
        int int33 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray12, (double) (short) 100, (int) '4', (double) 1);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 1.0d, 100.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 1.0d, (-1.0d), 1.0d, 100.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        java.lang.Long[] longArray6 = new java.lang.Long[] { 1L, 1L, 1L, 100L, 100L, 100L };
        java.lang.Long[] longArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray6);
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray7, 0L);
        java.lang.String str10 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) 0L);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new java.lang.Long[] { 1L, 1L, 1L, 100L, 100L, 100L });
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertArrayEquals(longArray7, new java.lang.Long[] { 1L, 1L, 1L, 100L, 100L, 100L });
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertArrayEquals(longArray9, new long[] { 1L, 1L, 1L, 100L, 100L, 100L });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "{0,0,0,0,0,0}", "on", "-1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{0,0,0,0,0,0}" + "'", str4, "{0,0,0,0,0,0}");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        long[] longArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.subarray(longArray0, (int) '#', (int) ' ');
        org.apache.commons.lang3.ArrayUtils.swap(longArray3, (int) '#', 10, (-1));
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertArrayEquals(longArray0, new long[] {});
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertArrayEquals(longArray3, new long[] {});
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(0, 0, (int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        double[] doubleArray6 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray6);
        double[] doubleArray8 = org.apache.commons.lang3.ArraySorter.sort(doubleArray6);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray8);
        org.apache.commons.lang3.ArrayUtils.swap(doubleArray8, 0, (int) (short) 1, (int) (short) 0);
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.addFirst(doubleArray8, (double) 0);
        java.util.Random random16 = null;
        org.apache.commons.lang3.ArrayUtils.shuffle(doubleArray8, random16);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.0d, (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.apache.commons.lang3.arch.Processor processor1 = org.apache.commons.lang3.ArchUtils.getProcessor("{1,1,-1}");
        org.junit.Assert.assertNull(processor1);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        java.lang.Object[] objArray0 = null;
        org.apache.commons.lang3.ArrayUtils.shift(objArray0, 10);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean("off");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        java.lang.Boolean[] booleanArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_OBJECT_ARRAY;
        org.apache.commons.lang3.ArrayUtils.shuffle((java.lang.Object[]) booleanArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertArrayEquals(booleanArray0, new java.lang.Boolean[] {});
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "{\000,\000}", "no", "{0,0,0,0,0,0}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{\000,\000}" + "'", str4, "{\000,\000}");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.lang.Float[] floatArray1 = new java.lang.Float[] { 1.0f };
        java.lang.Float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        org.apache.commons.lang3.ArrayUtils.shift((java.lang.Object[]) floatArray1, (int) (byte) 100);
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray1);
        int int6 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) floatArray5);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertArrayEquals(floatArray1, new java.lang.Float[] { 1.0f });
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertArrayEquals(floatArray2, new java.lang.Float[] { 1.0f });
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertArrayEquals(floatArray5, new float[] { 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        boolean boolean3 = bitField1.isAllSet((long) (short) 100);
        int int5 = bitField1.getRawValue((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { false, true, false, true };
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray4);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.oneHot(booleanArray4);
        java.lang.Boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray4);
        java.lang.constant.Constable[] constableArray8 = org.apache.commons.lang3.ArrayUtils.toArray((java.lang.constant.Constable[]) booleanArray7);
        java.lang.Boolean boolean9 = org.apache.commons.lang3.BooleanUtils.oneHot(booleanArray7);
        java.lang.Boolean boolean10 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray7);
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray7, true);
        boolean[] booleanArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray7);
        java.lang.Boolean boolean14 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray7);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertArrayEquals(booleanArray4, new java.lang.Boolean[] { false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertArrayEquals(booleanArray7, new java.lang.Boolean[] { false, true, false, true });
        org.junit.Assert.assertNotNull(constableArray8);
        org.junit.Assert.assertArrayEquals(constableArray8, new java.lang.Boolean[] { false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(booleanArray12);
        assertBooleanArrayEquals(booleanArray12, new boolean[] { false, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray13);
        assertBooleanArrayEquals(booleanArray13, new boolean[] { false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        double[] doubleArray6 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray6);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray7);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray7, (double) 100, (int) (short) 10);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        char[] charArray1 = new char[] { '4' };
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray1, 'a');
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray1, 'a');
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.addFirst(charArray1, 'a');
        char[] charArray8 = org.apache.commons.lang3.ArrayFill.clear(charArray7);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray11 = org.apache.commons.lang3.ArrayUtils.add(charArray7, (int) (short) 10, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '\000', '\000' });
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '\000', '\000' });
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.lang.String str1 = org.apache.commons.lang3.BooleanUtils.toStringOnOff((java.lang.Boolean) false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "off" + "'", str1, "off");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        boolean[] booleanArray0 = new boolean[] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray0);
        java.util.BitSet bitSet4 = org.apache.commons.lang3.ArrayUtils.indexesOf(booleanArray0, true, 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        assertBooleanArrayEquals(booleanArray0, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(bitSet4);
        org.junit.Assert.assertEquals(bitSet4.toString(), "{}");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        java.lang.Integer[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        java.lang.Integer[] intArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray1, 100);
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray1);
        int int5 = org.apache.commons.lang3.ArrayUtils.getDimensions((java.lang.Object) intArray4);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        boolean[] booleanArray0 = new boolean[] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray0);
        boolean[] booleanArray2 = new boolean[] {};
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray2);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray2, true);
        boolean[] booleanArray6 = new boolean[] {};
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray6);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray6, true);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray2, booleanArray6);
        boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.removeElements(booleanArray0, booleanArray6);
        boolean[] booleanArray12 = new boolean[] {};
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray12);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray12, true);
        boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray12);
        boolean[] booleanArray17 = new boolean[] {};
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray17);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray17, true);
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray17, true, (int) '#');
        java.util.Random random24 = null;
        org.apache.commons.lang3.ArrayUtils.shuffle(booleanArray17, random24);
        boolean[] booleanArray26 = org.apache.commons.lang3.ArrayUtils.removeElements(booleanArray16, booleanArray17);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray17);
        boolean[] booleanArray28 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray17);
        org.junit.Assert.assertNotNull(booleanArray0);
        assertBooleanArrayEquals(booleanArray0, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(booleanArray2);
        assertBooleanArrayEquals(booleanArray2, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(booleanArray6);
        assertBooleanArrayEquals(booleanArray6, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(booleanArray11);
        assertBooleanArrayEquals(booleanArray11, new boolean[] {});
        org.junit.Assert.assertNotNull(booleanArray12);
        assertBooleanArrayEquals(booleanArray12, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(booleanArray16);
        assertBooleanArrayEquals(booleanArray16, new boolean[] {});
        org.junit.Assert.assertNotNull(booleanArray17);
        assertBooleanArrayEquals(booleanArray17, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(booleanArray26);
        assertBooleanArrayEquals(booleanArray26, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(booleanArray28);
        assertBooleanArrayEquals(booleanArray28, new boolean[] {});
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        long[] longArray0 = new long[] {};
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray0, (long) ' ');
        org.apache.commons.lang3.ArrayUtils.shift(longArray0, (int) (short) -1);
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray0, (long) (-1));
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.removeElements(longArray0, longArray7);
        org.apache.commons.lang3.ArrayUtils.swap(longArray8, (int) (short) 1, (-1));
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray8, (long) (short) -1);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray13, (long) 4, (int) (short) 0);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertArrayEquals(longArray0, new long[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertArrayEquals(longArray7, new long[] {});
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] {});
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(byteArray6, (byte) 0);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) -1);
        int[] intArray11 = null;
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.removeAll(byteArray6, intArray11);
        byte[] byteArray13 = null;
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray6, byteArray13);
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.contains(byteArray21, (byte) 0);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray21, (byte) -1);
        byte[] byteArray26 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray13, byteArray21);
        org.apache.commons.lang3.ArrayUtils.shuffle(byteArray21);
        byte[] byteArray34 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.contains(byteArray34, (byte) 0);
        int int38 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray34, (byte) -1);
        int[] intArray39 = null;
        byte[] byteArray40 = org.apache.commons.lang3.ArrayUtils.removeAll(byteArray34, intArray39);
        byte[] byteArray41 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray21, byteArray40);
        byte[] byteArray44 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray41, (int) (short) -1, 2);
        org.apache.commons.lang3.ArrayUtils.swap(byteArray41, 5, (int) (byte) 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 10, (byte) 10, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 10, (byte) 0 });
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        java.lang.Integer[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        java.lang.Integer[] intArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray1, 100);
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray1);
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.removeAllOccurrences(intArray4, 10);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray6, (int) ' ');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] {});
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        boolean[] booleanArray0 = null;
        org.apache.commons.lang3.ArrayUtils.shift(booleanArray0, (int) ' ', 5, (int) (byte) 0);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        short[] shortArray0 = null;
        short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.add(shortArray0, (short) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.remove(shortArray2, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] { (short) 100 });
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        char[] charArray0 = null;
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.contains(charArray0, '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 0 };
        java.lang.Short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray2);
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3, (short) (byte) -1);
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.contains(byteArray12, (byte) 0);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray12, (byte) -1);
        int[] intArray17 = null;
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.removeAll(byteArray12, intArray17);
        byte[] byteArray19 = org.apache.commons.lang3.ArrayFill.clear(byteArray12);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayFill.fill(byteArray12, (byte) 1);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) shortArray5, (java.lang.Object) (byte) 1);
        short[] shortArray24 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray5, (short) 10);
        int[] intArray29 = new int[] { (short) -1, (short) 100, (short) 10, (byte) -1 };
        int[] intArray31 = org.apache.commons.lang3.ArrayFill.fill(intArray29, (int) (byte) 10);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray31);
        int[] intArray34 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray31, (int) (short) 0);
        int[] intArray36 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray31, (int) (byte) 10);
        int[] intArray42 = new int[] { (-1), 0, (short) 0, (byte) 0, (-1) };
        int[] intArray43 = org.apache.commons.lang3.ArrayUtils.clone(intArray42);
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.containsAny(intArray36, intArray42);
        int[] intArray46 = org.apache.commons.lang3.ArrayUtils.removeAllOccurrences(intArray42, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray47 = org.apache.commons.lang3.ArrayUtils.removeAll(shortArray5, intArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new java.lang.Short[] { (short) -1, (short) 0 });
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertArrayEquals(shortArray3, new java.lang.Short[] { (short) -1, (short) 0 });
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) -1, (short) 0 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertArrayEquals(shortArray24, new short[] { (short) -1, (short) 0 });
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { (-1), 0, 0, 0, (-1) });
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 1 };
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1 };
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 1 };
        byte[][] byteArray9 = new byte[][] { byteArray2, byteArray5, byteArray8 };
        byte[][][] byteArray10 = new byte[][][] { byteArray9 };
        byte[][][][] byteArray11 = new byte[][][][] { byteArray10 };
        byte[][] byteArray13 = new byte[][] {};
        byte[][] byteArray14 = new byte[][] {};
        byte[][] byteArray15 = new byte[][] {};
        byte[][] byteArray16 = new byte[][] {};
        byte[][] byteArray17 = new byte[][] {};
        byte[][][] byteArray18 = new byte[][][] { byteArray13, byteArray14, byteArray15, byteArray16, byteArray17 };
        byte[] byteArray21 = new byte[] { (byte) 1 };
        byte[] byteArray23 = new byte[] { (byte) 1 };
        byte[] byteArray25 = new byte[] { (byte) 1 };
        byte[] byteArray27 = new byte[] { (byte) 1 };
        byte[] byteArray29 = new byte[] { (byte) 1 };
        byte[] byteArray31 = new byte[] { (byte) 1 };
        byte[][] byteArray32 = new byte[][] { byteArray21, byteArray23, byteArray25, byteArray27, byteArray29, byteArray31 };
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.contains(byteArray39, (byte) 0);
        int int43 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray39, (byte) -1);
        int[] intArray44 = null;
        byte[] byteArray45 = org.apache.commons.lang3.ArrayUtils.removeAll(byteArray39, intArray44);
        byte[] byteArray47 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray45, (byte) 0);
        byte[][] byteArray48 = org.apache.commons.lang3.ArrayUtils.removeAllOccurences(byteArray32, byteArray45);
        byte[][][] byteArray49 = org.apache.commons.lang3.ArrayUtils.add(byteArray18, (int) (byte) 1, byteArray32);
        // The following exception was thrown during execution in test generation
        try {
            byte[][][][] byteArray50 = org.apache.commons.lang3.ArrayUtils.add(byteArray11, (int) (byte) 101, byteArray49);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 101, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[][] {});
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[][] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[][] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[][] {});
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[][] {});
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertNotNull(byteArray49);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        float[] floatArray0 = new float[] {};
        org.apache.commons.lang3.ArrayUtils.shift(floatArray0, 100, (int) '4', 100);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray0, (int) (short) 10, (int) '#');
        java.util.BitSet bitSet9 = org.apache.commons.lang3.ArrayUtils.indexesOf(floatArray0, (float) 2147483639);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, (int) (short) 100, (float) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertArrayEquals(floatArray0, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(bitSet9);
        org.junit.Assert.assertEquals(bitSet9.toString(), "{}");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        double[] doubleArray6 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray6);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray6, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        boolean[] booleanArray0 = new boolean[] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray0);
        boolean[] booleanArray2 = new boolean[] {};
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray2);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray2, true);
        boolean[] booleanArray6 = new boolean[] {};
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray6);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray6, true);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray2, booleanArray6);
        boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.removeElements(booleanArray0, booleanArray6);
        boolean[] booleanArray13 = org.apache.commons.lang3.ArrayUtils.add(booleanArray0, false);
        boolean[] booleanArray14 = new boolean[] {};
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray14);
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.add(booleanArray14, false);
        java.util.BitSet bitSet20 = org.apache.commons.lang3.ArrayUtils.indexesOf(booleanArray14, false, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object) booleanArray13, (java.lang.Object) bitSet20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        assertBooleanArrayEquals(booleanArray0, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(booleanArray2);
        assertBooleanArrayEquals(booleanArray2, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(booleanArray6);
        assertBooleanArrayEquals(booleanArray6, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(booleanArray11);
        assertBooleanArrayEquals(booleanArray11, new boolean[] {});
        org.junit.Assert.assertNotNull(booleanArray13);
        assertBooleanArrayEquals(booleanArray13, new boolean[] { false });
        org.junit.Assert.assertNotNull(booleanArray14);
        assertBooleanArrayEquals(booleanArray14, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(booleanArray17);
        assertBooleanArrayEquals(booleanArray17, new boolean[] { false });
        org.junit.Assert.assertNotNull(bitSet20);
        org.junit.Assert.assertEquals(bitSet20.toString(), "{}");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        boolean[] booleanArray0 = null;
        java.lang.Boolean[] booleanArray1 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray0);
        org.junit.Assert.assertNull(booleanArray1);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        boolean[] booleanArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray0, false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(byteArray6, (byte) 0);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) -1);
        int[] intArray11 = null;
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.removeAll(byteArray6, intArray11);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray6);
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, 1, (byte) 10);
        java.lang.Byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray6);
        org.apache.commons.lang3.ArrayUtils.shift((java.lang.Object[]) byteArray17, 10);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray17, (byte) 10);
        long[] longArray22 = new long[] {};
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray22, (long) ' ');
        long[] longArray25 = new long[] {};
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray25, (long) ' ');
        org.apache.commons.lang3.ArrayUtils.shift(longArray25, (int) (short) -1);
        int int31 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray25, (long) (-1));
        long[] longArray32 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray33 = org.apache.commons.lang3.ArrayUtils.removeElements(longArray25, longArray32);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray22, longArray33);
        int int37 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray33, 0L, 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object) byteArray17, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new java.lang.Byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertArrayEquals(longArray22, new long[] {});
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertArrayEquals(longArray25, new long[] {});
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertArrayEquals(longArray32, new long[] {});
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertArrayEquals(longArray33, new long[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        char[] charArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY;
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new char[] {});
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        double[] doubleArray0 = null;
        double[] doubleArray7 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray7);
        double[] doubleArray9 = org.apache.commons.lang3.ArraySorter.sort(doubleArray7);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray9);
        org.apache.commons.lang3.ArrayUtils.swap(doubleArray9, 0, (int) (short) 1, (int) (short) 0);
        double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.addFirst(doubleArray9, (double) 0);
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray0, doubleArray16);
        java.lang.Double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 0.0d, (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 0.0d, (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNull(doubleArray18);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        long[] longArray6 = new long[] { 'a', '4', (byte) -1, (byte) 1, (short) 10, 1L };
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray6, 0L, (int) 'a');
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray6);
        java.util.BitSet bitSet13 = org.apache.commons.lang3.ArrayUtils.indexesOf(longArray6, (long) '4', (int) '#');
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.removeAllOccurrences(longArray6, (long) (byte) 1);
        int[] intArray20 = new int[] { (short) -1, (short) 100, (short) 10, (byte) -1 };
        int[] intArray22 = org.apache.commons.lang3.ArrayFill.fill(intArray20, (int) (byte) 10);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray22);
        int[] intArray25 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray22, (int) (short) 0);
        int[] intArray27 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray22, (int) (byte) 10);
        int[] intArray33 = new int[] { (-1), 0, (short) 0, (byte) 0, (-1) };
        int[] intArray34 = org.apache.commons.lang3.ArrayUtils.clone(intArray33);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.containsAny(intArray27, intArray33);
        int[] intArray37 = org.apache.commons.lang3.ArrayUtils.removeAllOccurrences(intArray33, (int) (byte) 10);
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isSorted(intArray33);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray39 = org.apache.commons.lang3.ArrayUtils.removeAll(longArray6, intArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { 97L, 52L, (-1L), 1L, 10L, 1L });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(bitSet13);
        org.junit.Assert.assertEquals(bitSet13.toString(), "{}");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertArrayEquals(longArray15, new long[] { 97L, 52L, (-1L), 10L });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        boolean[] booleanArray0 = new boolean[] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray0);
        boolean[] booleanArray2 = new boolean[] {};
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray2);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray2, true);
        boolean[] booleanArray6 = new boolean[] {};
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray6);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray6, true);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray2, booleanArray6);
        boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.removeElements(booleanArray0, booleanArray6);
        boolean[] booleanArray12 = new boolean[] {};
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray12);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray12, true);
        boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray12);
        boolean[] booleanArray17 = new boolean[] {};
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray17);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray17, true);
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray17, true, (int) '#');
        java.util.Random random24 = null;
        org.apache.commons.lang3.ArrayUtils.shuffle(booleanArray17, random24);
        boolean[] booleanArray26 = org.apache.commons.lang3.ArrayUtils.removeElements(booleanArray16, booleanArray17);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray16);
        int[] intArray32 = new int[] { (short) -1, (short) 100, (short) 10, (byte) -1 };
        int[] intArray34 = org.apache.commons.lang3.ArrayFill.fill(intArray32, (int) (byte) 10);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray34);
        int[] intArray37 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray34, (int) (short) 0);
        int[] intArray39 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray34, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray40 = org.apache.commons.lang3.ArrayUtils.removeAll(booleanArray16, intArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        assertBooleanArrayEquals(booleanArray0, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(booleanArray2);
        assertBooleanArrayEquals(booleanArray2, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(booleanArray6);
        assertBooleanArrayEquals(booleanArray6, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(booleanArray11);
        assertBooleanArrayEquals(booleanArray11, new boolean[] {});
        org.junit.Assert.assertNotNull(booleanArray12);
        assertBooleanArrayEquals(booleanArray12, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(booleanArray16);
        assertBooleanArrayEquals(booleanArray16, new boolean[] {});
        org.junit.Assert.assertNotNull(booleanArray17);
        assertBooleanArrayEquals(booleanArray17, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(booleanArray26);
        assertBooleanArrayEquals(booleanArray26, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 10, 10, 10 });
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        float[] floatArray0 = null;
        org.apache.commons.lang3.ArrayUtils.shuffle(floatArray0);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(byteArray6, (byte) 0);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) -1);
        int[] intArray11 = null;
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.removeAll(byteArray6, intArray11);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayFill.clear(byteArray6);
        byte[] byteArray15 = org.apache.commons.lang3.ArrayFill.fill(byteArray6, (byte) 1);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray6);
        byte[] byteArray17 = org.apache.commons.lang3.ArraySorter.sort(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (int) 'a', (byte) 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.isFalse((java.lang.Boolean) true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        long[] longArray0 = new long[] {};
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray0, (long) ' ');
        org.apache.commons.lang3.ArrayUtils.shift(longArray0, (int) (short) -1);
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray0, (long) (-1));
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.removeElements(longArray0, longArray7);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray7, 100L);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray7, (long) (byte) 1, (int) (byte) 1);
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.addFirst(longArray7, 0L);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray7, 100, (int) (short) 100);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertArrayEquals(longArray0, new long[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertArrayEquals(longArray7, new long[] {});
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertArrayEquals(longArray15, new long[] { 0L });
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        double[] doubleArray6 = new double[] { (byte) -1, (byte) 1, 100L, (byte) 10, 1L };
        double[] doubleArray9 = new double[] { (byte) 10, 1 };
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.insert(0, doubleArray6, doubleArray9);
        double[] doubleArray11 = null;
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.removeElements(doubleArray9, doubleArray11);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray12, (double) 100, 2147483639);
        double[] doubleArray22 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        double[] doubleArray23 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray22);
        double[] doubleArray24 = org.apache.commons.lang3.ArraySorter.sort(doubleArray22);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isSorted(doubleArray22);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray12, doubleArray22);
        org.apache.commons.lang3.ArrayUtils.swap(doubleArray12, (-1), 4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 1.0d, 100.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 1.0d, (-1.0d), 1.0d, 100.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        byte byte3 = bitField1.clearByte((byte) 1);
        short short5 = bitField1.getShortRawValue((short) 11);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        java.lang.Character[] charArray2 = new java.lang.Character[] { '#', '4' };
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray2);
        char[] charArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray3);
        org.apache.commons.lang3.ArrayUtils.shift(charArray4, (int) (byte) 10);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new java.lang.Character[] { '#', '4' });
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] { '#', '4' });
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '#', '4' });
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        long[] longArray2 = new long[] { (byte) 1, (short) 100 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray2, (long) (byte) 10);
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        org.apache.commons.lang3.ArrayUtils.reverse(longArray5, (int) (byte) 100, (int) (short) 100);
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.removeAllOccurrences(longArray5, (long) (short) 0);
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.addAll(longArray2, longArray5);
        java.util.BitSet bitSet14 = org.apache.commons.lang3.ArrayUtils.indexesOf(longArray2, (long) 4, (int) (byte) 10);
        org.apache.commons.lang3.ArrayUtils.shift(longArray2, 2, (int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertArrayEquals(longArray2, new long[] { 1L, 100L });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertArrayEquals(longArray5, new long[] {});
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertArrayEquals(longArray10, new long[] {});
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { 1L, 100L });
        org.junit.Assert.assertNotNull(bitSet14);
        org.junit.Assert.assertEquals(bitSet14.toString(), "{}");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (byte) 0, (int) (byte) 101, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        java.lang.reflect.Field field0 = null;
        java.lang.reflect.Field[] fieldArray1 = new java.lang.reflect.Field[] { field0 };
        java.lang.reflect.Field field2 = null;
        java.lang.reflect.Field[] fieldArray3 = new java.lang.reflect.Field[] { field2 };
        java.lang.reflect.Field field4 = null;
        java.lang.reflect.Field[] fieldArray5 = new java.lang.reflect.Field[] { field4 };
        java.lang.reflect.Field field6 = null;
        java.lang.reflect.Field[] fieldArray7 = new java.lang.reflect.Field[] { field6 };
        java.lang.reflect.Field field8 = null;
        java.lang.reflect.Field[] fieldArray9 = new java.lang.reflect.Field[] { field8 };
        java.lang.reflect.Field[][] fieldArray10 = new java.lang.reflect.Field[][] { fieldArray1, fieldArray3, fieldArray5, fieldArray7, fieldArray9 };
        short[] shortArray13 = new short[] { (short) -1, (byte) 10 };
        short[] shortArray16 = new short[] { (short) 1, (short) 1 };
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray13, shortArray16);
        java.lang.reflect.Field[][] fieldArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(fieldArray10, (java.lang.Object) boolean17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Field[][] fieldArray19 = org.apache.commons.lang3.ArraySorter.sort(fieldArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [Ljava.lang.reflect.Field; cannot be cast to class java.lang.Comparable ([Ljava.lang.reflect.Field; and java.lang.Comparable are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldArray1);
        org.junit.Assert.assertArrayEquals(fieldArray1, new java.lang.reflect.Field[] { null });
        org.junit.Assert.assertNotNull(fieldArray3);
        org.junit.Assert.assertArrayEquals(fieldArray3, new java.lang.reflect.Field[] { null });
        org.junit.Assert.assertNotNull(fieldArray5);
        org.junit.Assert.assertArrayEquals(fieldArray5, new java.lang.reflect.Field[] { null });
        org.junit.Assert.assertNotNull(fieldArray7);
        org.junit.Assert.assertArrayEquals(fieldArray7, new java.lang.reflect.Field[] { null });
        org.junit.Assert.assertNotNull(fieldArray9);
        org.junit.Assert.assertArrayEquals(fieldArray9, new java.lang.reflect.Field[] { null });
        org.junit.Assert.assertNotNull(fieldArray10);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray13, new short[] { (short) -1, (short) 10 });
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray16, new short[] { (short) 1, (short) 1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(fieldArray18);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(byteArray7, (byte) 0);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray7, (byte) -1);
        int[] intArray12 = null;
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.removeAll(byteArray7, intArray12);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayFill.clear(byteArray7);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.contains(byteArray7, (byte) 100);
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.add(byteArray7, (byte) 10);
        byte[] byteArray19 = org.apache.commons.lang3.ArrayUtils.clone(byteArray18);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.contains(byteArray26, (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.insert(100, byteArray18, byteArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 7");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        float[] floatArray3 = new float[] { 52, '4' };
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY;
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.insert(100, floatArray3, floatArray4);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray4);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isSorted(floatArray4);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertArrayEquals(floatArray3, new float[] { 52.0f, 52.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertArrayEquals(floatArray5, new float[] { 52.0f, 52.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertArrayEquals(floatArray6, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        double[] doubleArray1 = null;
        double[] doubleArray8 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray8);
        double[] doubleArray10 = org.apache.commons.lang3.ArraySorter.sort(doubleArray8);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray10);
        org.apache.commons.lang3.ArrayUtils.swap(doubleArray10, 0, (int) (short) 1, (int) (short) 0);
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.addFirst(doubleArray10, (double) 0);
        double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray1, doubleArray17);
        double[] doubleArray25 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        double[] doubleArray26 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray25);
        int int29 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray25, (double) 1L, (double) (short) -1);
        double[] doubleArray30 = org.apache.commons.lang3.ArrayUtils.insert((int) (short) 0, doubleArray1, doubleArray25);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray30, (double) 0, (double) 100L);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 0.0d, (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 0.0d, (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        float[] floatArray4 = new float[] { (short) 10, (short) 1, 100.0f, 10.0f };
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.add(floatArray4, (float) 100);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray4, (float) 1L);
        java.util.BitSet bitSet11 = org.apache.commons.lang3.ArrayUtils.indexesOf(floatArray4, (float) 5, (int) (byte) 100);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 10.0f, 1.0f, 100.0f, 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertArrayEquals(floatArray6, new float[] { 10.0f, 1.0f, 100.0f, 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(bitSet11);
        org.junit.Assert.assertEquals(bitSet11.toString(), "{}");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        java.lang.Throwable throwable0 = null;
        java.lang.Throwable[] throwableArray1 = new java.lang.Throwable[] { throwable0 };
        java.lang.Throwable throwable2 = null;
        java.lang.Throwable[] throwableArray3 = new java.lang.Throwable[] { throwable2 };
        java.lang.Throwable throwable4 = null;
        java.lang.Throwable[] throwableArray5 = new java.lang.Throwable[] { throwable4 };
        java.lang.Throwable throwable6 = null;
        java.lang.Throwable[] throwableArray7 = new java.lang.Throwable[] { throwable6 };
        java.lang.Throwable throwable8 = null;
        java.lang.Throwable[] throwableArray9 = new java.lang.Throwable[] { throwable8 };
        java.lang.Throwable[][] throwableArray10 = new java.lang.Throwable[][] { throwableArray1, throwableArray3, throwableArray5, throwableArray7, throwableArray9 };
        java.lang.Throwable[][][] throwableArray11 = new java.lang.Throwable[][][] { throwableArray10 };
        java.lang.Throwable throwable13 = null;
        java.lang.Throwable[] throwableArray14 = new java.lang.Throwable[] { throwable13 };
        java.lang.Throwable throwable15 = null;
        java.lang.Throwable[] throwableArray16 = new java.lang.Throwable[] { throwable15 };
        java.lang.Throwable throwable17 = null;
        java.lang.Throwable[] throwableArray18 = new java.lang.Throwable[] { throwable17 };
        java.lang.Throwable throwable19 = null;
        java.lang.Throwable[] throwableArray20 = new java.lang.Throwable[] { throwable19 };
        java.lang.Throwable throwable21 = null;
        java.lang.Throwable[] throwableArray22 = new java.lang.Throwable[] { throwable21 };
        java.lang.Throwable throwable23 = null;
        java.lang.Throwable[] throwableArray24 = new java.lang.Throwable[] { throwable23 };
        java.lang.Throwable[][] throwableArray25 = new java.lang.Throwable[][] { throwableArray14, throwableArray16, throwableArray18, throwableArray20, throwableArray22, throwableArray24 };
        java.lang.Throwable[] throwableArray26 = org.apache.commons.lang3.ArrayUtils.EMPTY_THROWABLE_ARRAY;
        java.lang.Throwable[][] throwableArray27 = org.apache.commons.lang3.ArrayUtils.addFirst(throwableArray25, throwableArray26);
        java.lang.Throwable[][] throwableArray28 = org.apache.commons.lang3.ArrayUtils.get(throwableArray11, 0, throwableArray25);
        java.lang.Class<java.lang.Cloneable> cloneableClass29 = org.apache.commons.lang3.ArrayUtils.getComponentType((java.lang.Cloneable[]) throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertArrayEquals(throwableArray1, new java.lang.Throwable[] { null });
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] { null });
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] { null });
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertArrayEquals(throwableArray7, new java.lang.Throwable[] { null });
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertArrayEquals(throwableArray9, new java.lang.Throwable[] { null });
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertArrayEquals(throwableArray14, new java.lang.Throwable[] { null });
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertArrayEquals(throwableArray16, new java.lang.Throwable[] { null });
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertArrayEquals(throwableArray18, new java.lang.Throwable[] { null });
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertArrayEquals(throwableArray20, new java.lang.Throwable[] { null });
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertArrayEquals(throwableArray22, new java.lang.Throwable[] { null });
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertArrayEquals(throwableArray24, new java.lang.Throwable[] { null });
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertArrayEquals(throwableArray26, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(cloneableClass29);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        double[] doubleArray6 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray6);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.add(doubleArray7, (int) (byte) 10, (double) 2147483639);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        int[] intArray4 = new int[] { (short) -1, (short) 100, (short) 10, (byte) -1 };
        int[] intArray6 = org.apache.commons.lang3.ArrayFill.fill(intArray4, (int) (byte) 10);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray6);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray6, (int) (short) 0);
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.removeAllOccurences(intArray9, 3);
        java.lang.Integer[] intArray12 = new java.lang.Integer[] {};
        java.lang.Integer[] intArray13 = new java.lang.Integer[] {};
        java.lang.Integer[] intArray14 = new java.lang.Integer[] {};
        java.lang.Integer[][] intArray15 = new java.lang.Integer[][] { intArray12, intArray13, intArray14 };
        java.lang.Integer[] intArray16 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        java.lang.Integer[] intArray17 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray16);
        int[] intArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray17, 100);
        int[] intArray25 = new int[] { '#', (short) 1, (byte) 100, (short) 1, 10 };
        org.apache.commons.lang3.ArrayUtils.reverse(intArray25, (int) (short) 1, (int) ' ');
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray19, intArray25);
        int[] intArray35 = new int[] { (-1), 0, (short) 0, (byte) 0, (-1) };
        int[] intArray36 = org.apache.commons.lang3.ArrayUtils.clone(intArray35);
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.contains(intArray36, (int) (byte) 100);
        int[] intArray39 = org.apache.commons.lang3.ArrayUtils.addAll(intArray19, intArray36);
        java.lang.Integer[][] intArray40 = org.apache.commons.lang3.ArrayUtils.removeAll(intArray15, intArray19);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] {};
        int[] intArray42 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray41);
        boolean boolean43 = org.apache.commons.lang3.ArrayUtils.isSorted(intArray42);
        int[] intArray45 = org.apache.commons.lang3.ArrayUtils.removeAllOccurences(intArray42, 100);
        int[] intArray46 = org.apache.commons.lang3.ArrayUtils.removeAll(intArray19, intArray45);
        int[] intArray47 = org.apache.commons.lang3.ArrayUtils.removeElements(intArray11, intArray46);
        org.apache.commons.lang3.ArrayUtils.shift(intArray47, 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] {});
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 35, 10, 1, 100, 1 });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new int[] {});
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] {});
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { 10, 10, 10, 10 });
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        float[] floatArray5 = new float[] { (short) 10, (short) 1, 100.0f, 10.0f };
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray5, (float) 100);
        java.util.Random random8 = null;
        org.apache.commons.lang3.ArrayUtils.shuffle(floatArray5, random8);
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.clone(floatArray5);
        float[] floatArray11 = null;
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.insert((int) (byte) 11, floatArray10, floatArray11);
        java.util.BitSet bitSet15 = org.apache.commons.lang3.ArrayUtils.indexesOf(floatArray11, (float) 3, (int) (byte) 11);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertArrayEquals(floatArray5, new float[] { 10.0f, 1.0f, 100.0f, 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertArrayEquals(floatArray7, new float[] { 10.0f, 1.0f, 100.0f, 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertArrayEquals(floatArray10, new float[] { 10.0f, 1.0f, 100.0f, 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertArrayEquals(floatArray12, new float[] { 10.0f, 1.0f, 100.0f, 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(bitSet15);
        org.junit.Assert.assertEquals(bitSet15.toString(), "{}");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        int[] intArray4 = new int[] { (short) -1, (short) 100, (short) 10, (byte) -1 };
        int[] intArray6 = org.apache.commons.lang3.ArrayFill.fill(intArray4, (int) (byte) 10);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray6);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray6, (int) (short) 0);
        int[] intArray14 = new int[] { (short) -1, (short) 100, (short) 10, (byte) -1 };
        int[] intArray16 = org.apache.commons.lang3.ArrayFill.fill(intArray14, (int) (byte) 10);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray16);
        int[] intArray19 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray16, (int) (short) 0);
        int[] intArray21 = org.apache.commons.lang3.ArrayUtils.removeAllOccurences(intArray19, 3);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] {};
        java.lang.Integer[] intArray23 = new java.lang.Integer[] {};
        java.lang.Integer[] intArray24 = new java.lang.Integer[] {};
        java.lang.Integer[][] intArray25 = new java.lang.Integer[][] { intArray22, intArray23, intArray24 };
        java.lang.Integer[] intArray26 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        java.lang.Integer[] intArray27 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray26);
        int[] intArray29 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray27, 100);
        int[] intArray35 = new int[] { '#', (short) 1, (byte) 100, (short) 1, 10 };
        org.apache.commons.lang3.ArrayUtils.reverse(intArray35, (int) (short) 1, (int) ' ');
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray29, intArray35);
        int[] intArray45 = new int[] { (-1), 0, (short) 0, (byte) 0, (-1) };
        int[] intArray46 = org.apache.commons.lang3.ArrayUtils.clone(intArray45);
        boolean boolean48 = org.apache.commons.lang3.ArrayUtils.contains(intArray46, (int) (byte) 100);
        int[] intArray49 = org.apache.commons.lang3.ArrayUtils.addAll(intArray29, intArray46);
        java.lang.Integer[][] intArray50 = org.apache.commons.lang3.ArrayUtils.removeAll(intArray25, intArray29);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] {};
        int[] intArray52 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray51);
        boolean boolean53 = org.apache.commons.lang3.ArrayUtils.isSorted(intArray52);
        int[] intArray55 = org.apache.commons.lang3.ArrayUtils.removeAllOccurences(intArray52, 100);
        int[] intArray56 = org.apache.commons.lang3.ArrayUtils.removeAll(intArray29, intArray55);
        int[] intArray57 = org.apache.commons.lang3.ArrayUtils.removeElements(intArray21, intArray56);
        int[] intArray64 = new int[] { (-1), 0, (short) 0, (byte) 0, (-1) };
        int[] intArray65 = org.apache.commons.lang3.ArrayUtils.clone(intArray64);
        java.lang.Integer[] intArray66 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        int[] intArray67 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray66);
        int[] intArray68 = org.apache.commons.lang3.ArrayUtils.removeElements(intArray65, intArray67);
        java.lang.Comparable[][] comparableArray70 = new java.lang.Comparable[0][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray71 = (java.lang.Comparable<java.lang.String>[][]) comparableArray70;
        java.lang.String[] strArray77 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        int[] intArray78 = null;
        java.lang.Comparable<java.lang.String>[] strComparableArray79 = org.apache.commons.lang3.ArrayUtils.removeAll((java.lang.Comparable<java.lang.String>[]) strArray77, intArray78);
        java.lang.Comparable<java.lang.String>[][] strComparableArray80 = org.apache.commons.lang3.ArrayUtils.removeAllOccurrences(strComparableArray71, (java.lang.Comparable<java.lang.String>[]) strArray77);
        boolean boolean81 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object) intArray65, (java.lang.Object) strArray77);
        int[] intArray82 = org.apache.commons.lang3.ArraySorter.sort(intArray65);
        int[] intArray88 = new int[] { '#', (short) 1, (byte) 100, (short) 1, 10 };
        org.apache.commons.lang3.ArrayUtils.reverse(intArray88, (int) (short) 1, (int) ' ');
        int[] intArray93 = org.apache.commons.lang3.ArrayUtils.add(intArray88, (int) (byte) 0);
        int[] intArray96 = org.apache.commons.lang3.ArrayUtils.subarray(intArray93, (int) '#', 2);
        int[] intArray97 = org.apache.commons.lang3.ArrayUtils.insert(100, intArray82, intArray96);
        int[] intArray98 = org.apache.commons.lang3.ArrayUtils.removeElements(intArray21, intArray82);
        int[] intArray99 = org.apache.commons.lang3.ArrayUtils.removeElements(intArray6, intArray21);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] {});
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 35, 10, 1, 100, 1 });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] {});
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertArrayEquals(intArray55, new int[] {});
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertArrayEquals(intArray56, new int[] {});
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertArrayEquals(intArray64, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertArrayEquals(intArray65, new int[] { (-1), (-1), 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertArrayEquals(intArray66, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertArrayEquals(intArray67, new int[] {});
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertArrayEquals(intArray68, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(comparableArray70);
        org.junit.Assert.assertArrayEquals(comparableArray70, new java.lang.Comparable[][] {});
        org.junit.Assert.assertNotNull(strComparableArray71);
        org.junit.Assert.assertArrayEquals(strComparableArray71, new java.lang.Comparable[][] {});
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray79);
        org.junit.Assert.assertArrayEquals(strComparableArray79, new java.lang.String[] { null, null, null, null, null });
        org.junit.Assert.assertNotNull(strComparableArray80);
        org.junit.Assert.assertArrayEquals(strComparableArray80, new java.lang.Comparable[][] {});
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertArrayEquals(intArray82, new int[] { (-1), (-1), 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertArrayEquals(intArray88, new int[] { 35, 10, 1, 100, 1 });
        org.junit.Assert.assertNotNull(intArray93);
        org.junit.Assert.assertArrayEquals(intArray93, new int[] { 35, 10, 1, 100, 1, 0 });
        org.junit.Assert.assertNotNull(intArray96);
        org.junit.Assert.assertArrayEquals(intArray96, new int[] {});
        org.junit.Assert.assertNotNull(intArray97);
        org.junit.Assert.assertArrayEquals(intArray97, new int[] { (-1), (-1), 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray98);
        org.junit.Assert.assertArrayEquals(intArray98, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray99);
        org.junit.Assert.assertArrayEquals(intArray99, new int[] {});
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        float[] floatArray0 = null;
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray0, (float) (-1));
        org.junit.Assert.assertNull(floatArray2);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        char[] charArray2 = new char[] { '4' };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray2, 'a');
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray2, 'a');
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.addFirst(charArray2, 'a');
        char[] charArray10 = new char[] { '4' };
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray10, 'a');
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray10, 'a');
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray14, ' ', (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray18 = org.apache.commons.lang3.ArrayUtils.insert((int) (byte) 11, charArray2, charArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 11, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'a', '4' });
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        long[] longArray1 = new long[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray1, (long) ' ');
        org.apache.commons.lang3.ArrayUtils.shift(longArray1, (int) (short) -1);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray1, (long) (-1));
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.removeElements(longArray1, longArray8);
        long[] longArray10 = new long[] {};
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray10, (long) ' ');
        org.apache.commons.lang3.ArrayUtils.shift(longArray10, (int) (short) -1);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray10, (long) (-1));
        long[] longArray17 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray18 = org.apache.commons.lang3.ArrayUtils.removeElements(longArray10, longArray17);
        org.apache.commons.lang3.ArrayUtils.shift(longArray18, (-1));
        long[] longArray21 = org.apache.commons.lang3.ArrayUtils.insert((int) (byte) 100, longArray9, longArray18);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.subarray(longArray21, (int) '#', 2147483639);
        org.apache.commons.lang3.ArrayUtils.shift(longArray24, 0);
        org.apache.commons.lang3.ArrayUtils.swap(longArray24, 52, (int) (short) 11);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.contains(longArray24, (long) 10);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] {});
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertArrayEquals(longArray9, new long[] {});
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertArrayEquals(longArray10, new long[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] {});
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertArrayEquals(longArray18, new long[] {});
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertArrayEquals(longArray21, new long[] {});
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertArrayEquals(longArray24, new long[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray1 = org.apache.commons.lang3.ArrayUtils.concat(intArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"<local2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray1);
        org.apache.commons.lang3.ArrayUtils.shift(booleanArray1, (int) (byte) 0, 100, 100);
        java.util.BitSet bitSet9 = org.apache.commons.lang3.ArrayUtils.indexesOf(booleanArray1, false, (int) (byte) 0);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray1);
        java.util.Random random11 = null;
        org.apache.commons.lang3.ArrayUtils.shuffle(booleanArray1, random11);
        org.junit.Assert.assertNotNull(booleanArray1);
        assertBooleanArrayEquals(booleanArray1, new boolean[] { false });
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(bitSet9);
        org.junit.Assert.assertEquals(bitSet9.toString(), "{0}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 0 };
        java.lang.Short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray2);
        java.lang.Short[] shortArray6 = new java.lang.Short[] { (short) -1, (short) 0 };
        java.lang.Short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray6);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray7, (short) (byte) -1);
        java.util.BitSet bitSet11 = org.apache.commons.lang3.ArrayUtils.indexesOf((java.lang.Object[]) shortArray2, (java.lang.Object) shortArray7, (int) ' ');
        org.apache.commons.lang3.ArrayUtils.shuffle((java.lang.Object[]) shortArray7);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new java.lang.Short[] { (short) -1, (short) 0 });
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertArrayEquals(shortArray3, new java.lang.Short[] { (short) -1, (short) 0 });
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new java.lang.Short[] { (short) -1, (short) 0 });
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertArrayEquals(shortArray7, new java.lang.Short[] { (short) -1, (short) 0 });
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertArrayEquals(shortArray9, new short[] { (short) -1, (short) 0 });
        org.junit.Assert.assertNotNull(bitSet11);
        org.junit.Assert.assertEquals(bitSet11.toString(), "{}");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        boolean[] booleanArray0 = new boolean[] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray0);
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.add(booleanArray0, false);
        java.util.BitSet bitSet6 = org.apache.commons.lang3.ArrayUtils.indexesOf(booleanArray0, false, (int) (byte) 0);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.add(booleanArray0, true);
        boolean[] booleanArray9 = new boolean[] {};
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray9);
        java.util.BitSet bitSet13 = org.apache.commons.lang3.ArrayUtils.indexesOf(booleanArray9, true, 100);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.removeElements(booleanArray8, booleanArray9);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray8, false);
        java.util.Random random17 = null;
        org.apache.commons.lang3.ArrayUtils.shuffle(booleanArray8, random17);
        org.junit.Assert.assertNotNull(booleanArray0);
        assertBooleanArrayEquals(booleanArray0, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(booleanArray3);
        assertBooleanArrayEquals(booleanArray3, new boolean[] { false });
        org.junit.Assert.assertNotNull(bitSet6);
        org.junit.Assert.assertEquals(bitSet6.toString(), "{}");
        org.junit.Assert.assertNotNull(booleanArray8);
        assertBooleanArrayEquals(booleanArray8, new boolean[] { true });
        org.junit.Assert.assertNotNull(booleanArray9);
        assertBooleanArrayEquals(booleanArray9, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(bitSet13);
        org.junit.Assert.assertEquals(bitSet13.toString(), "{}");
        org.junit.Assert.assertNotNull(booleanArray14);
        assertBooleanArrayEquals(booleanArray14, new boolean[] { true });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 1, (java.lang.Integer) 1, (java.lang.Integer) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        java.lang.Boolean[][][] booleanArray1 = new java.lang.Boolean[][][] {};
        java.lang.Boolean[] booleanArray8 = new java.lang.Boolean[] { true, true, true, true, true, true };
        java.lang.Boolean[][] booleanArray9 = new java.lang.Boolean[][] { booleanArray8 };
        java.lang.Boolean[] booleanArray16 = new java.lang.Boolean[] { true, true, true, true, true, true };
        java.lang.Boolean[][] booleanArray17 = new java.lang.Boolean[][] { booleanArray16 };
        java.lang.Boolean[][][] booleanArray18 = new java.lang.Boolean[][][] { booleanArray9, booleanArray17 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean[][][] booleanArray19 = org.apache.commons.lang3.ArrayUtils.insert((int) (byte) 101, booleanArray1, booleanArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 101, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertArrayEquals(booleanArray1, new java.lang.Boolean[][][] {});
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertArrayEquals(booleanArray8, new java.lang.Boolean[] { true, true, true, true, true, true });
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertArrayEquals(booleanArray16, new java.lang.Boolean[] { true, true, true, true, true, true });
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertNotNull(booleanArray18);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        java.lang.Object[] objArray0 = null;
        org.apache.commons.lang3.ArrayUtils.reverse(objArray0, (int) (short) 10, (int) (byte) -1);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        boolean[] booleanArray0 = new boolean[] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray0);
        boolean[] booleanArray2 = new boolean[] {};
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray2);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray2, true);
        boolean[] booleanArray6 = new boolean[] {};
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray6);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray6, true);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray2, booleanArray6);
        boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.removeElements(booleanArray0, booleanArray6);
        boolean[] booleanArray12 = new boolean[] {};
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray12);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray12, true);
        boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray12);
        boolean[] booleanArray17 = new boolean[] {};
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray17);
        boolean[] booleanArray19 = new boolean[] {};
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray19);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray19, true);
        boolean[] booleanArray23 = new boolean[] {};
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray23);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray23, true);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray19, booleanArray23);
        boolean[] booleanArray28 = org.apache.commons.lang3.ArrayUtils.removeElements(booleanArray17, booleanArray23);
        boolean[] booleanArray29 = new boolean[] {};
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray29);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray29, true);
        boolean[] booleanArray33 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray17, booleanArray29);
        boolean[] booleanArray34 = new boolean[] {};
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray34);
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray34, true);
        int int40 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray34, true, (int) '#');
        java.util.Random random41 = null;
        org.apache.commons.lang3.ArrayUtils.shuffle(booleanArray34, random41);
        boolean[] booleanArray43 = org.apache.commons.lang3.ArrayUtils.removeElements(booleanArray33, booleanArray34);
        boolean[] booleanArray48 = new boolean[] { true, true, false, true };
        boolean[] booleanArray49 = org.apache.commons.lang3.ArrayUtils.removeElements(booleanArray33, booleanArray48);
        boolean boolean50 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray48);
        boolean boolean51 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray48);
        boolean[] booleanArray52 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray12, booleanArray48);
        org.apache.commons.lang3.ArrayUtils.shuffle(booleanArray12);
        org.junit.Assert.assertNotNull(booleanArray0);
        assertBooleanArrayEquals(booleanArray0, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(booleanArray2);
        assertBooleanArrayEquals(booleanArray2, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(booleanArray6);
        assertBooleanArrayEquals(booleanArray6, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(booleanArray11);
        assertBooleanArrayEquals(booleanArray11, new boolean[] {});
        org.junit.Assert.assertNotNull(booleanArray12);
        assertBooleanArrayEquals(booleanArray12, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(booleanArray16);
        assertBooleanArrayEquals(booleanArray16, new boolean[] {});
        org.junit.Assert.assertNotNull(booleanArray17);
        assertBooleanArrayEquals(booleanArray17, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(booleanArray19);
        assertBooleanArrayEquals(booleanArray19, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(booleanArray23);
        assertBooleanArrayEquals(booleanArray23, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(booleanArray28);
        assertBooleanArrayEquals(booleanArray28, new boolean[] {});
        org.junit.Assert.assertNotNull(booleanArray29);
        assertBooleanArrayEquals(booleanArray29, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(booleanArray33);
        assertBooleanArrayEquals(booleanArray33, new boolean[] {});
        org.junit.Assert.assertNotNull(booleanArray34);
        assertBooleanArrayEquals(booleanArray34, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(booleanArray43);
        assertBooleanArrayEquals(booleanArray43, new boolean[] {});
        org.junit.Assert.assertNotNull(booleanArray48);
        assertBooleanArrayEquals(booleanArray48, new boolean[] { true, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray49);
        assertBooleanArrayEquals(booleanArray49, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(booleanArray52);
        assertBooleanArrayEquals(booleanArray52, new boolean[] { true, true, false, true });
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.lang.Character[] charArray2 = new java.lang.Character[] { '#', '4' };
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray2);
        char[] charArray9 = new char[] { 'a', '4', '#', ' ', '4' };
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.removeElements(charArray3, charArray9);
        char[] charArray11 = org.apache.commons.lang3.ArrayFill.clear(charArray10);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new java.lang.Character[] { '#', '4' });
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] { '#', '4' });
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '4', '#', ' ', '4' });
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        long[] longArray1 = new long[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray1, (long) ' ');
        org.apache.commons.lang3.ArrayUtils.reverse(longArray1);
        long[] longArray6 = new long[] {};
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, (long) ' ');
        org.apache.commons.lang3.ArrayUtils.shift(longArray6, (int) (short) -1);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray6, (long) (-1));
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.removeElements(longArray6, longArray13);
        long[] longArray15 = new long[] {};
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray15, (long) ' ');
        org.apache.commons.lang3.ArrayUtils.shift(longArray15, (int) (short) -1);
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray15, (long) (-1));
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.removeElements(longArray15, longArray22);
        org.apache.commons.lang3.ArrayUtils.shift(longArray23, (-1));
        long[] longArray26 = org.apache.commons.lang3.ArrayUtils.insert((int) (byte) 100, longArray14, longArray23);
        java.util.BitSet bitSet29 = org.apache.commons.lang3.ArrayUtils.indexesOf(longArray14, (long) (short) 1, 1);
        long[] longArray30 = org.apache.commons.lang3.ArrayUtils.insert((int) (byte) -1, longArray1, longArray14);
        long[] longArray31 = org.apache.commons.lang3.ArrayUtils.clone(longArray1);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray33 = org.apache.commons.lang3.ArrayUtils.remove(longArray31, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] {});
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertArrayEquals(longArray14, new long[] {});
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertArrayEquals(longArray15, new long[] {});
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertArrayEquals(longArray22, new long[] {});
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertArrayEquals(longArray23, new long[] {});
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertArrayEquals(longArray26, new long[] {});
        org.junit.Assert.assertNotNull(bitSet29);
        org.junit.Assert.assertEquals(bitSet29.toString(), "{}");
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertArrayEquals(longArray30, new long[] {});
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertArrayEquals(longArray31, new long[] {});
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        long[] longArray6 = new long[] { (short) -1, (byte) 10, 100L, (byte) 10, (short) 100, (byte) -1 };
        org.apache.commons.lang3.ArrayUtils.swap(longArray6, (int) (byte) 10, (int) (short) 10, (int) (short) 10);
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.removeAllOccurences(longArray6, (long) 100);
        long[] longArray19 = new long[] { 'a', '4', (byte) -1, (byte) 1, (short) 10, 1L };
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray19, 0L, (int) 'a');
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray19);
        java.util.BitSet bitSet26 = org.apache.commons.lang3.ArrayUtils.indexesOf(longArray19, (long) '4', (int) '#');
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray6, longArray19);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isSorted(longArray19);
        org.apache.commons.lang3.ArrayUtils.shift(longArray19, 2, 3, (int) (short) 1);
        org.apache.commons.lang3.ArrayUtils.shift(longArray19, 3, (int) (short) 1, (int) (byte) 100);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { (-1L), 10L, 100L, 10L, 100L, (-1L) });
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertArrayEquals(longArray12, new long[] { (-1L), 10L, 10L, (-1L) });
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertArrayEquals(longArray19, new long[] { 97L, 52L, (-1L), 1L, 10L, 1L });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(bitSet26);
        org.junit.Assert.assertEquals(bitSet26.toString(), "{}");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        double[] doubleArray8 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray8);
        double[] doubleArray10 = org.apache.commons.lang3.ArraySorter.sort(doubleArray8);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray10);
        org.apache.commons.lang3.ArrayUtils.swap(doubleArray10, 0, (int) (short) 1, (int) (short) 0);
        double[] doubleArray22 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        double[] doubleArray23 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray22);
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray22, (double) 1L, (double) (short) -1);
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray22, (double) 10L, (int) (byte) 1);
        double[] doubleArray30 = org.apache.commons.lang3.ArrayUtils.insert(0, doubleArray10, doubleArray22);
        double[] doubleArray37 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        double[] doubleArray38 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray37);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray38);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray38);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray41 = org.apache.commons.lang3.ArrayUtils.insert((int) (short) 10, doubleArray10, doubleArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 5 + "'", int29 == 5);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d, (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 10.0d, 1.0d, 1.0d, (-1.0d), (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        java.lang.Object[] objArray0 = null;
        org.apache.commons.lang3.ArrayUtils.reverse(objArray0, (int) (byte) 1, (int) (byte) 0);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        float[] floatArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray0, (-1.0f));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        short[] shortArray2 = new short[] { (short) -1, (byte) 10 };
        short[] shortArray5 = new short[] { (short) 1, (short) 1 };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray2, shortArray5);
        org.apache.commons.lang3.ArrayUtils.shift(shortArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        short[] shortArray12 = new short[] { (short) -1 };
        short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.add(shortArray12, 0, (short) (byte) 10);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray5, shortArray12);
        org.apache.commons.lang3.ArrayUtils.swap(shortArray16, (int) ' ', (int) (short) 0, 5);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray16, (int) (short) 0, (int) '#');
        java.lang.Short[] shortArray24 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray16);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] { (short) -1, (short) 10 });
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 1, (short) 1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray12, new short[] { (short) -1 });
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray15, new short[] { (short) 10, (short) -1 });
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray16, new short[] { (short) -1, (short) 1, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertArrayEquals(shortArray24, new java.lang.Short[] { (short) -1, (short) 1, (short) 1 });
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        short[] shortArray2 = new short[] { (short) -1, (byte) 10 };
        short[] shortArray5 = new short[] { (short) 1, (short) 1 };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray2, shortArray5);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray5);
        short[] shortArray10 = new short[] { (short) -1, (byte) 10 };
        short[] shortArray13 = new short[] { (short) 1, (short) 1 };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray10, shortArray13);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray10);
        short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray10, (int) (short) -1, (int) (byte) 1);
        java.util.Random random19 = null;
        org.apache.commons.lang3.ArrayUtils.shuffle(shortArray18, random19);
        short[] shortArray21 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray5, shortArray18);
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray18, (short) (byte) 0, (int) '#');
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] { (short) -1, (short) 10 });
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 1, (short) 1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray10, new short[] { (short) 10, (short) -1 });
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray13, new short[] { (short) 1, (short) 1 });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray18, new short[] { (short) 10 });
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertArrayEquals(shortArray21, new short[] { (short) 1, (short) 1, (short) 10 });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        double[] doubleArray6 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray6);
        double[] doubleArray8 = org.apache.commons.lang3.ArraySorter.sort(doubleArray6);
        java.lang.Double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray6);
        java.lang.Double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray9);
        java.lang.Double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray10);
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray11, (double) (short) 10);
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new java.lang.Double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d });
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new java.lang.Double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d });
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new java.lang.Double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d });
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        float[] floatArray4 = new float[] { (short) 10, (short) 1, 100.0f, 10.0f };
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.add(floatArray4, (float) 100);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray6, 10.0f);
        org.apache.commons.lang3.ArrayUtils.swap(floatArray6, (int) ' ', (int) 'a');
        java.util.Random random12 = null;
        org.apache.commons.lang3.ArrayUtils.shuffle(floatArray6, random12);
        java.util.BitSet bitSet16 = org.apache.commons.lang3.ArrayUtils.indexesOf(floatArray6, (float) ' ', (int) (byte) 100);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 10.0f, 1.0f, 100.0f, 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertArrayEquals(floatArray6, new float[] { 10.0f, 1.0f, 100.0f, 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(bitSet16);
        org.junit.Assert.assertEquals(bitSet16.toString(), "{}");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 0 };
        java.lang.Short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray2);
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3, (short) (byte) -1);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.removeAllOccurrences(shortArray5, (short) (byte) 10);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray7, (int) (short) 1, 0);
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.add(shortArray7, (short) 100);
        java.util.BitSet bitSet14 = org.apache.commons.lang3.ArrayUtils.indexesOf(shortArray12, (short) (byte) 0);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new java.lang.Short[] { (short) -1, (short) 0 });
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertArrayEquals(shortArray3, new java.lang.Short[] { (short) -1, (short) 0 });
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) -1, (short) 0 });
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertArrayEquals(shortArray7, new short[] { (short) -1, (short) 0 });
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray12, new short[] { (short) -1, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(bitSet14);
        org.junit.Assert.assertEquals(bitSet14.toString(), "{1}");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (short) 11);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        char[] charArray5 = new char[] { ' ', '#', '#', '4', 'a' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.subarray(charArray5, 5, (int) (byte) 100);
        org.apache.commons.lang3.ArrayUtils.shuffle(charArray8);
        java.util.Random random10 = null;
        org.apache.commons.lang3.ArrayUtils.shuffle(charArray8, random10);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray8, (int) (short) 10, (int) (short) 100);
        org.apache.commons.lang3.ArrayUtils.shift(charArray8, (int) (short) 11, (int) (byte) 1, 10);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '#', '#', '4', 'a' });
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        long[] longArray6 = new long[] { (short) -1, (byte) 10, 100L, (byte) 10, (short) 100, (byte) -1 };
        org.apache.commons.lang3.ArrayUtils.swap(longArray6, (int) (byte) 10, (int) (short) 10, (int) (short) 10);
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.removeAllOccurences(longArray6, (long) 100);
        long[] longArray19 = new long[] { 'a', '4', (byte) -1, (byte) 1, (short) 10, 1L };
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray19, 0L, (int) 'a');
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray19);
        java.util.BitSet bitSet26 = org.apache.commons.lang3.ArrayUtils.indexesOf(longArray19, (long) '4', (int) '#');
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray6, longArray19);
        org.apache.commons.lang3.ArrayUtils.swap(longArray6, (int) (short) 10, 10);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { (-1L), 10L, 100L, 10L, 100L, (-1L) });
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertArrayEquals(longArray12, new long[] { (-1L), 10L, 10L, (-1L) });
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertArrayEquals(longArray19, new long[] { 97L, 52L, (-1L), 1L, 10L, 1L });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(bitSet26);
        org.junit.Assert.assertEquals(bitSet26.toString(), "{}");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        boolean[] booleanArray0 = new boolean[] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray0);
        boolean[] booleanArray2 = new boolean[] {};
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray2);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray2, true);
        boolean[] booleanArray6 = new boolean[] {};
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray6);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray6, true);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray2, booleanArray6);
        boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.removeElements(booleanArray0, booleanArray6);
        org.apache.commons.lang3.ArrayUtils.shift(booleanArray11, 5, (int) (short) 1, (int) (short) 0);
        java.lang.Boolean[] booleanArray20 = new java.lang.Boolean[] { false, true, false, true };
        java.lang.Boolean boolean21 = org.apache.commons.lang3.BooleanUtils.or(booleanArray20);
        boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray20, true);
        boolean[] booleanArray24 = org.apache.commons.lang3.ArrayUtils.removeElements(booleanArray11, booleanArray23);
        int[] intArray30 = new int[] { (-1), 0, (short) 0, (byte) 0, (-1) };
        int[] intArray31 = org.apache.commons.lang3.ArrayUtils.clone(intArray30);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.removeAll(booleanArray23, intArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        assertBooleanArrayEquals(booleanArray0, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(booleanArray2);
        assertBooleanArrayEquals(booleanArray2, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(booleanArray6);
        assertBooleanArrayEquals(booleanArray6, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(booleanArray11);
        assertBooleanArrayEquals(booleanArray11, new boolean[] {});
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertArrayEquals(booleanArray20, new java.lang.Boolean[] { false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(booleanArray23);
        assertBooleanArrayEquals(booleanArray23, new boolean[] { false, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray24);
        assertBooleanArrayEquals(booleanArray24, new boolean[] {});
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { (-1), 0, 0, 0, (-1) });
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("true", "{0,0,0,0,0,0}", "{1,1,-1}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        long[] longArray0 = new long[] {};
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray0, (long) ' ');
        long[] longArray3 = new long[] {};
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray3, (long) ' ');
        org.apache.commons.lang3.ArrayUtils.shift(longArray3, (int) (short) -1);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray3, (long) (-1));
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.removeElements(longArray3, longArray10);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray0, longArray11);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray11, 0L, 100);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray11, (long) (-1), (int) (short) -1);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertArrayEquals(longArray0, new long[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertArrayEquals(longArray3, new long[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertArrayEquals(longArray10, new long[] {});
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        boolean[] booleanArray0 = new boolean[] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray0);
        boolean[] booleanArray2 = new boolean[] {};
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray2);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray2, true);
        boolean[] booleanArray6 = new boolean[] {};
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray6);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray6, true);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray2, booleanArray6);
        boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.removeElements(booleanArray0, booleanArray6);
        boolean[] booleanArray12 = new boolean[] {};
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray12);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray12, true);
        boolean[] booleanArray16 = new boolean[] {};
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray16);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray16, true);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray12, booleanArray16);
        boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray16);
        boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray21);
        boolean[] booleanArray24 = org.apache.commons.lang3.ArrayFill.fill(booleanArray21, false);
        org.apache.commons.lang3.ArrayUtils.swap(booleanArray21, (int) (byte) 1, (int) (short) 100, 5);
        org.junit.Assert.assertNotNull(booleanArray0);
        assertBooleanArrayEquals(booleanArray0, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(booleanArray2);
        assertBooleanArrayEquals(booleanArray2, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(booleanArray6);
        assertBooleanArrayEquals(booleanArray6, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(booleanArray11);
        assertBooleanArrayEquals(booleanArray11, new boolean[] {});
        org.junit.Assert.assertNotNull(booleanArray12);
        assertBooleanArrayEquals(booleanArray12, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(booleanArray16);
        assertBooleanArrayEquals(booleanArray16, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(booleanArray21);
        assertBooleanArrayEquals(booleanArray21, new boolean[] {});
        org.junit.Assert.assertNotNull(booleanArray22);
        assertBooleanArrayEquals(booleanArray22, new boolean[] {});
        org.junit.Assert.assertNotNull(booleanArray24);
        assertBooleanArrayEquals(booleanArray24, new boolean[] {});
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        int[] intArray6 = new int[] { (-1), 0, (short) 0, (byte) 0, (-1) };
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.clone(intArray6);
        java.lang.Integer[] intArray8 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray8);
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.removeElements(intArray7, intArray9);
        java.lang.Comparable[][] comparableArray12 = new java.lang.Comparable[0][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray13 = (java.lang.Comparable<java.lang.String>[][]) comparableArray12;
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        int[] intArray20 = null;
        java.lang.Comparable<java.lang.String>[] strComparableArray21 = org.apache.commons.lang3.ArrayUtils.removeAll((java.lang.Comparable<java.lang.String>[]) strArray19, intArray20);
        java.lang.Comparable<java.lang.String>[][] strComparableArray22 = org.apache.commons.lang3.ArrayUtils.removeAllOccurrences(strComparableArray13, (java.lang.Comparable<java.lang.String>[]) strArray19);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object) intArray7, (java.lang.Object) strArray19);
        int[] intArray24 = org.apache.commons.lang3.ArraySorter.sort(intArray7);
        int[] intArray30 = new int[] { '#', (short) 1, (byte) 100, (short) 1, 10 };
        org.apache.commons.lang3.ArrayUtils.reverse(intArray30, (int) (short) 1, (int) ' ');
        int[] intArray35 = org.apache.commons.lang3.ArrayUtils.add(intArray30, (int) (byte) 0);
        int[] intArray38 = org.apache.commons.lang3.ArrayUtils.subarray(intArray35, (int) '#', 2);
        int[] intArray39 = org.apache.commons.lang3.ArrayUtils.insert(100, intArray24, intArray38);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray38, 100, (int) (byte) 100);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray38, (-1), (int) '4');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), (-1), 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] {});
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(comparableArray12);
        org.junit.Assert.assertArrayEquals(comparableArray12, new java.lang.Comparable[][] {});
        org.junit.Assert.assertNotNull(strComparableArray13);
        org.junit.Assert.assertArrayEquals(strComparableArray13, new java.lang.Comparable[][] {});
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray21);
        org.junit.Assert.assertArrayEquals(strComparableArray21, new java.lang.String[] { null, null, null, null, null });
        org.junit.Assert.assertNotNull(strComparableArray22);
        org.junit.Assert.assertArrayEquals(strComparableArray22, new java.lang.Comparable[][] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { (-1), (-1), 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 35, 10, 1, 100, 1 });
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 35, 10, 1, 100, 1, 0 });
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] {});
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { (-1), (-1), 0, 0, 0 });
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        long[] longArray3 = new long[] { (-1L), 'a', 0 };
        long[] longArray7 = new long[] { (-1L), 'a', 0 };
        long[] longArray11 = new long[] { (-1L), 'a', 0 };
        long[] longArray15 = new long[] { (-1L), 'a', 0 };
        long[] longArray19 = new long[] { (-1L), 'a', 0 };
        long[][] longArray20 = new long[][] { longArray3, longArray7, longArray11, longArray15, longArray19 };
        long[] longArray21 = org.apache.commons.lang3.ArrayUtils.concat(longArray20);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray21);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertArrayEquals(longArray3, new long[] { (-1L), 97L, 0L });
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertArrayEquals(longArray7, new long[] { (-1L), 97L, 0L });
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { (-1L), 97L, 0L });
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertArrayEquals(longArray15, new long[] { (-1L), 97L, 0L });
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertArrayEquals(longArray19, new long[] { (-1L), 97L, 0L });
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertArrayEquals(longArray21, new long[] { (-1L), 97L, 0L, (-1L), 97L, 0L, (-1L), 97L, 0L, (-1L), 97L, 0L, (-1L), 97L, 0L });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        short[] shortArray2 = new short[] { (short) -1, (byte) 10 };
        short[] shortArray5 = new short[] { (short) 1, (short) 1 };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray2, shortArray5);
        org.apache.commons.lang3.ArrayUtils.shift(shortArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        short[] shortArray12 = new short[] { (short) -1 };
        short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.add(shortArray12, 0, (short) (byte) 10);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray5, shortArray12);
        short[] shortArray19 = new short[] { (short) -1, (byte) 0 };
        org.apache.commons.lang3.ArrayUtils.swap(shortArray19, (int) (short) 100, (int) (byte) 100);
        org.apache.commons.lang3.ArrayUtils.swap(shortArray19, 0, (-1), 0);
        short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray12, shortArray19);
        short[] shortArray30 = new short[] { (short) -1, (byte) 10 };
        short[] shortArray33 = new short[] { (short) 1, (short) 1 };
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray30, shortArray33);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray33);
        short[] shortArray38 = new short[] { (short) -1, (byte) 10 };
        short[] shortArray41 = new short[] { (short) 1, (short) 1 };
        boolean boolean42 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray38, shortArray41);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray38);
        short[] shortArray46 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray38, (int) (short) -1, (int) (byte) 1);
        java.util.Random random47 = null;
        org.apache.commons.lang3.ArrayUtils.shuffle(shortArray46, random47);
        short[] shortArray49 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray33, shortArray46);
        short[] shortArray50 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray19, shortArray46);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray46, (int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] { (short) -1, (short) 10 });
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 1, (short) 1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray12, new short[] { (short) -1 });
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray15, new short[] { (short) 10, (short) -1 });
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray16, new short[] { (short) 1, (short) 1, (short) -1 });
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray19, new short[] { (short) -1, (short) 0 });
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertArrayEquals(shortArray27, new short[] { (short) -1, (short) -1, (short) 0 });
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertArrayEquals(shortArray30, new short[] { (short) -1, (short) 10 });
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertArrayEquals(shortArray33, new short[] { (short) 1, (short) 1 });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertArrayEquals(shortArray38, new short[] { (short) 10, (short) -1 });
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray41, new short[] { (short) 1, (short) 1 });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertArrayEquals(shortArray46, new short[] { (short) 10 });
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertArrayEquals(shortArray49, new short[] { (short) 1, (short) 1, (short) 10 });
        org.junit.Assert.assertNotNull(shortArray50);
        org.junit.Assert.assertArrayEquals(shortArray50, new short[] { (short) -1, (short) 0, (short) 10 });
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) '4', (int) (short) 1, 3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        java.lang.Byte[] byteArray0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray0);
        org.junit.Assert.assertNull(byteArray1);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        byte byte3 = bitField1.clearByte((byte) 1);
        byte byte5 = bitField1.setByte((byte) 100);
        short short7 = bitField1.getShortRawValue((short) -1);
        long long9 = bitField1.set(100L);
        long long12 = bitField1.setValue((long) (byte) 1, (long) '#');
        boolean boolean14 = bitField1.isSet((long) 2147483639);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 101 + "'", byte5 == (byte) 101);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 101L + "'", long9 == 101L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        double[] doubleArray1 = new double[] { (-1.0f) };
        double[] doubleArray3 = new double[] { (-1.0f) };
        double[] doubleArray5 = new double[] { (-1.0f) };
        double[] doubleArray7 = new double[] { (-1.0f) };
        double[][] doubleArray8 = new double[][] { doubleArray1, doubleArray3, doubleArray5, doubleArray7 };
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.concat(doubleArray8);
        double[] doubleArray10 = null;
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.removeElements(doubleArray9, doubleArray10);
        java.util.BitSet bitSet14 = org.apache.commons.lang3.ArrayUtils.indexesOf(doubleArray10, (double) (short) 0, 4);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d), (-1.0d), (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), (-1.0d), (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(bitSet14);
        org.junit.Assert.assertEquals(bitSet14.toString(), "{}");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        int[] intArray6 = null;
        java.lang.Comparable<java.lang.String>[] strComparableArray7 = org.apache.commons.lang3.ArrayUtils.removeAll((java.lang.Comparable<java.lang.String>[]) strArray5, intArray6);
        org.apache.commons.lang3.ArrayUtils.shift((java.lang.Object[]) strComparableArray7, (int) 'a', 5, 2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray7);
        org.junit.Assert.assertArrayEquals(strComparableArray7, new java.lang.String[] { null, null, null, null, null });
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "-1", "{1,1,-1}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{1,1,-1}" + "'", str3, "{1,1,-1}");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { false, true, false, true };
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray4);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.oneHot(booleanArray4);
        java.lang.Boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray4);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray7, false);
        java.util.BitSet bitSet12 = org.apache.commons.lang3.ArrayUtils.indexesOf(booleanArray9, false, 0);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.removeAllOccurrences(booleanArray9, true);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray14, true);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertArrayEquals(booleanArray4, new java.lang.Boolean[] { false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertArrayEquals(booleanArray7, new java.lang.Boolean[] { false, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray9);
        assertBooleanArrayEquals(booleanArray9, new boolean[] { false, true, false, true });
        org.junit.Assert.assertNotNull(bitSet12);
        org.junit.Assert.assertEquals(bitSet12.toString(), "{0, 2}");
        org.junit.Assert.assertNotNull(booleanArray14);
        assertBooleanArrayEquals(booleanArray14, new boolean[] { false, false });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        boolean[][] booleanArray1 = null;
        boolean[][] booleanArray2 = new boolean[][] {};
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.concat(booleanArray2);
        boolean[][] booleanArray4 = org.apache.commons.lang3.ArrayUtils.insert((int) (byte) 101, booleanArray1, booleanArray2);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.concat(booleanArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"<local2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertArrayEquals(booleanArray2, new boolean[][] {});
        org.junit.Assert.assertNotNull(booleanArray3);
        assertBooleanArrayEquals(booleanArray3, new boolean[] {});
        org.junit.Assert.assertNull(booleanArray4);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, 52, (-1), (int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        int[] intArray4 = new int[] { (short) -1, (short) 100, (short) 10, (byte) -1 };
        int[] intArray6 = org.apache.commons.lang3.ArrayFill.fill(intArray4, (int) (byte) 10);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray6);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray6, (int) (short) 0);
        int[] intArray10 = org.apache.commons.lang3.ArraySorter.sort(intArray6);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 10, 10, 10, 10 });
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        java.lang.Iterable[] iterableArray1 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Boolean>[] booleanIterableArray2 = (java.lang.Iterable<java.lang.Boolean>[]) iterableArray1;
        java.lang.Iterable<java.lang.Boolean>[] booleanIterableArray3 = org.apache.commons.lang3.ArrayUtils.toArray((java.lang.Iterable<java.lang.Boolean>[]) iterableArray1);
        short[] shortArray6 = new short[] { (short) -1, (byte) 10 };
        short[] shortArray9 = new short[] { (short) 1, (short) 1 };
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray6, shortArray9);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray6);
        short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray6, (int) (short) -1, (int) (byte) 1);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) booleanIterableArray3, (java.lang.Object) shortArray6, (int) (byte) 101);
        short[] shortArray17 = org.apache.commons.lang3.ArraySorter.sort(shortArray6);
        org.junit.Assert.assertNotNull(iterableArray1);
        org.junit.Assert.assertArrayEquals(iterableArray1, new java.lang.Iterable[] {});
        org.junit.Assert.assertNotNull(booleanIterableArray2);
        org.junit.Assert.assertArrayEquals(booleanIterableArray2, new java.lang.Iterable[] {});
        org.junit.Assert.assertNotNull(booleanIterableArray3);
        org.junit.Assert.assertArrayEquals(booleanIterableArray3, new java.lang.Iterable[] {});
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] { (short) -1, (short) 10 });
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertArrayEquals(shortArray9, new short[] { (short) 1, (short) 1 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray14, new short[] { (short) 10 });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray17, new short[] { (short) -1, (short) 10 });
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        java.lang.Byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5, (byte) 10);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(byteArray8, (byte) -1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new java.lang.Byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new java.lang.Byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 3);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        long[] longArray0 = new long[] {};
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray0, (long) ' ');
        org.apache.commons.lang3.ArrayUtils.reverse(longArray0);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray0);
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray0, (-1L));
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertArrayEquals(longArray0, new long[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] {});
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        java.lang.Float[] floatArray6 = new java.lang.Float[] { 1.0f, 1.0f, 10.0f, (-1.0f), (-1.0f), 1.0f };
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6);
        java.lang.Float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray7);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.clone(floatArray7);
        java.util.BitSet bitSet12 = org.apache.commons.lang3.ArrayUtils.indexesOf(floatArray9, (float) (short) 11, (int) (short) 100);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertArrayEquals(floatArray6, new java.lang.Float[] { 1.0f, 1.0f, 10.0f, (-1.0f), (-1.0f), 1.0f });
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertArrayEquals(floatArray7, new float[] { 1.0f, 1.0f, 10.0f, (-1.0f), (-1.0f), 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertArrayEquals(floatArray8, new java.lang.Float[] { 1.0f, 1.0f, 10.0f, (-1.0f), (-1.0f), 1.0f });
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertArrayEquals(floatArray9, new float[] { 1.0f, 1.0f, 10.0f, (-1.0f), (-1.0f), 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(bitSet12);
        org.junit.Assert.assertEquals(bitSet12.toString(), "{}");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 10, (java.lang.Integer) 2, (java.lang.Integer) 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true, (java.lang.Integer) (-1), (java.lang.Integer) 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        boolean[] booleanArray0 = new boolean[] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray0);
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray0, true);
        boolean[] booleanArray4 = new boolean[] {};
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray4);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray4, true);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray0, booleanArray4);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray4);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        assertBooleanArrayEquals(booleanArray0, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(booleanArray4);
        assertBooleanArrayEquals(booleanArray4, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(booleanArray9);
        assertBooleanArrayEquals(booleanArray9, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.Constable constable5 = org.apache.commons.lang3.ArrayUtils.arraycopy((java.lang.constant.Constable) (byte) -1, (int) (short) 0, (java.lang.constant.Constable) 53L, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: arraycopy: source type java.lang.Byte is not an array");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) 10, (short) 100 };
        java.lang.Short[] shortArray5 = new java.lang.Short[] { (short) 10, (short) 100 };
        java.lang.Short[] shortArray8 = new java.lang.Short[] { (short) 10, (short) 100 };
        java.lang.Short[] shortArray11 = new java.lang.Short[] { (short) 10, (short) 100 };
        java.lang.Short[] shortArray14 = new java.lang.Short[] { (short) 10, (short) 100 };
        java.lang.Short[] shortArray17 = new java.lang.Short[] { (short) 10, (short) 100 };
        java.lang.Short[][] shortArray18 = new java.lang.Short[][] { shortArray2, shortArray5, shortArray8, shortArray11, shortArray14, shortArray17 };
        java.lang.Short[] shortArray20 = org.apache.commons.lang3.ArrayUtils.get(shortArray18, 10);
        java.lang.Byte[] byteArray26 = new java.lang.Byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        java.lang.Byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray26);
        java.io.Serializable[] serializableArray28 = org.apache.commons.lang3.ArrayUtils.removeElements((java.io.Serializable[]) shortArray18, (java.io.Serializable[]) byteArray26);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) serializableArray28);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new java.lang.Short[] { (short) 10, (short) 100 });
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new java.lang.Short[] { (short) 10, (short) 100 });
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertArrayEquals(shortArray8, new java.lang.Short[] { (short) 10, (short) 100 });
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new java.lang.Short[] { (short) 10, (short) 100 });
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray14, new java.lang.Short[] { (short) 10, (short) 100 });
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray17, new java.lang.Short[] { (short) 10, (short) 100 });
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNull(shortArray20);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new java.lang.Byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new java.lang.Byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(serializableArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        long[] longArray0 = new long[] {};
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray0, (long) 5);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertArrayEquals(longArray0, new long[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        long[] longArray0 = null;
        org.apache.commons.lang3.ArrayUtils.swap(longArray0, (int) (byte) 1, (int) (short) 1);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        short[] shortArray2 = new short[] { (short) -1, (byte) 10 };
        short[] shortArray5 = new short[] { (short) 1, (short) 1 };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray2, shortArray5);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray5);
        org.apache.commons.lang3.ArrayUtils.shift(shortArray5, (int) (short) 0, (int) (short) 10, 100);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray5);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.remove(shortArray5, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] { (short) -1, (short) 10 });
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 1, (short) 1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 1, (java.lang.Integer) 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        java.lang.Throwable throwable0 = null;
        java.lang.Throwable[] throwableArray1 = new java.lang.Throwable[] { throwable0 };
        java.lang.Throwable throwable2 = null;
        java.lang.Throwable[] throwableArray3 = new java.lang.Throwable[] { throwable2 };
        java.lang.Throwable throwable4 = null;
        java.lang.Throwable[] throwableArray5 = new java.lang.Throwable[] { throwable4 };
        java.lang.Throwable[][] throwableArray6 = new java.lang.Throwable[][] { throwableArray1, throwableArray3, throwableArray5 };
        java.lang.Throwable[][][] throwableArray7 = new java.lang.Throwable[][][] { throwableArray6 };
        java.lang.Throwable throwable8 = null;
        java.lang.Throwable[] throwableArray9 = new java.lang.Throwable[] { throwable8 };
        java.lang.Throwable throwable10 = null;
        java.lang.Throwable[] throwableArray11 = new java.lang.Throwable[] { throwable10 };
        java.lang.Throwable throwable12 = null;
        java.lang.Throwable[] throwableArray13 = new java.lang.Throwable[] { throwable12 };
        java.lang.Throwable[][] throwableArray14 = new java.lang.Throwable[][] { throwableArray9, throwableArray11, throwableArray13 };
        java.lang.Throwable[][][] throwableArray15 = new java.lang.Throwable[][][] { throwableArray14 };
        java.lang.Throwable throwable16 = null;
        java.lang.Throwable[] throwableArray17 = new java.lang.Throwable[] { throwable16 };
        java.lang.Throwable throwable18 = null;
        java.lang.Throwable[] throwableArray19 = new java.lang.Throwable[] { throwable18 };
        java.lang.Throwable throwable20 = null;
        java.lang.Throwable[] throwableArray21 = new java.lang.Throwable[] { throwable20 };
        java.lang.Throwable[][] throwableArray22 = new java.lang.Throwable[][] { throwableArray17, throwableArray19, throwableArray21 };
        java.lang.Throwable[][][] throwableArray23 = new java.lang.Throwable[][][] { throwableArray22 };
        java.lang.Throwable throwable24 = null;
        java.lang.Throwable[] throwableArray25 = new java.lang.Throwable[] { throwable24 };
        java.lang.Throwable throwable26 = null;
        java.lang.Throwable[] throwableArray27 = new java.lang.Throwable[] { throwable26 };
        java.lang.Throwable throwable28 = null;
        java.lang.Throwable[] throwableArray29 = new java.lang.Throwable[] { throwable28 };
        java.lang.Throwable[][] throwableArray30 = new java.lang.Throwable[][] { throwableArray25, throwableArray27, throwableArray29 };
        java.lang.Throwable[][][] throwableArray31 = new java.lang.Throwable[][][] { throwableArray30 };
        java.lang.Throwable throwable32 = null;
        java.lang.Throwable[] throwableArray33 = new java.lang.Throwable[] { throwable32 };
        java.lang.Throwable throwable34 = null;
        java.lang.Throwable[] throwableArray35 = new java.lang.Throwable[] { throwable34 };
        java.lang.Throwable throwable36 = null;
        java.lang.Throwable[] throwableArray37 = new java.lang.Throwable[] { throwable36 };
        java.lang.Throwable[][] throwableArray38 = new java.lang.Throwable[][] { throwableArray33, throwableArray35, throwableArray37 };
        java.lang.Throwable[][][] throwableArray39 = new java.lang.Throwable[][][] { throwableArray38 };
        java.lang.Throwable[][][][] throwableArray40 = new java.lang.Throwable[][][][] { throwableArray7, throwableArray15, throwableArray23, throwableArray31, throwableArray39 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Throwable[][][][] throwableArray42 = org.apache.commons.lang3.ArrayUtils.remove(throwableArray40, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertArrayEquals(throwableArray1, new java.lang.Throwable[] { null });
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] { null });
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] { null });
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertArrayEquals(throwableArray9, new java.lang.Throwable[] { null });
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertArrayEquals(throwableArray11, new java.lang.Throwable[] { null });
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertArrayEquals(throwableArray13, new java.lang.Throwable[] { null });
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertArrayEquals(throwableArray17, new java.lang.Throwable[] { null });
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertArrayEquals(throwableArray19, new java.lang.Throwable[] { null });
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertArrayEquals(throwableArray21, new java.lang.Throwable[] { null });
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertArrayEquals(throwableArray25, new java.lang.Throwable[] { null });
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertArrayEquals(throwableArray27, new java.lang.Throwable[] { null });
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertArrayEquals(throwableArray29, new java.lang.Throwable[] { null });
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertArrayEquals(throwableArray33, new java.lang.Throwable[] { null });
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertArrayEquals(throwableArray35, new java.lang.Throwable[] { null });
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertArrayEquals(throwableArray37, new java.lang.Throwable[] { null });
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray40);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(byteArray6, (byte) 0);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) -1);
        int[] intArray11 = null;
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.removeAll(byteArray6, intArray11);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayFill.clear(byteArray6);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.contains(byteArray6, (byte) 100);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 10);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray6, (int) (short) 0, (int) '4');
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        java.lang.Character[] charArray2 = new java.lang.Character[] { '#', '4' };
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray2);
        char[] charArray9 = new char[] { 'a', '4', '#', ' ', '4' };
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.removeElements(charArray3, charArray9);
        java.lang.Character[] charArray11 = org.apache.commons.lang3.ArrayUtils.toObject(charArray9);
        java.lang.Character[] charArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray11);
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object> objMap14 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) charArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, 'a', is neither of type Map.Entry nor an Array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new java.lang.Character[] { '#', '4' });
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] { '#', '4' });
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '4', '#', ' ', '4' });
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new java.lang.Character[] { 'a', '4', '#', ' ', '4' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new java.lang.Character[] { 'a', '4', '#', ' ', '4' });
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { 'a', '4', '#', ' ', '4' });
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.apache.commons.lang3.arch.Processor processor0 = org.apache.commons.lang3.ArchUtils.getProcessor();
        org.apache.commons.lang3.arch.Processor processor1 = org.apache.commons.lang3.ArchUtils.getProcessor();
        org.apache.commons.lang3.arch.Processor processor2 = org.apache.commons.lang3.ArchUtils.getProcessor();
        org.apache.commons.lang3.arch.Processor processor3 = org.apache.commons.lang3.ArchUtils.getProcessor();
        org.apache.commons.lang3.arch.Processor[] processorArray4 = new org.apache.commons.lang3.arch.Processor[] { processor0, processor1, processor2, processor3 };
        int[] intArray10 = new int[] { (short) -1, (short) 100, (short) 10, (byte) -1 };
        int[] intArray12 = org.apache.commons.lang3.ArrayFill.fill(intArray10, (int) (byte) 10);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray12);
        int[] intArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray12, (int) (short) 0);
        int[] intArray17 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray12, (int) (byte) 10);
        java.util.Random random18 = null;
        org.apache.commons.lang3.ArrayUtils.shuffle(intArray12, random18);
        int[] intArray25 = new int[] { '#', (short) 1, (byte) 100, (short) 1, 10 };
        org.apache.commons.lang3.ArrayUtils.reverse(intArray25, (int) (short) 1, (int) ' ');
        int[] intArray30 = org.apache.commons.lang3.ArrayUtils.add(intArray25, (int) (byte) 0);
        int int33 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray30, 2147483639, 2147483639);
        java.lang.Integer[] intArray34 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        java.lang.Integer[] intArray35 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray34);
        int[] intArray37 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray35, 100);
        int[] intArray43 = new int[] { '#', (short) 1, (byte) 100, (short) 1, 10 };
        org.apache.commons.lang3.ArrayUtils.reverse(intArray43, (int) (short) 1, (int) ' ');
        boolean boolean47 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray37, intArray43);
        int[] intArray48 = org.apache.commons.lang3.ArrayUtils.addAll(intArray30, intArray37);
        int[] intArray49 = org.apache.commons.lang3.ArrayUtils.insert(0, intArray12, intArray48);
        int[] intArray51 = org.apache.commons.lang3.ArrayUtils.removeAllOccurrences(intArray49, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.arch.Processor[] processorArray52 = org.apache.commons.lang3.ArrayUtils.removeAll(processorArray4, intArray49);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(processor0);
        org.junit.Assert.assertNotNull(processor1);
        org.junit.Assert.assertNotNull(processor2);
        org.junit.Assert.assertNotNull(processor3);
        org.junit.Assert.assertNotNull(processorArray4);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 35, 10, 1, 100, 1 });
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 35, 10, 1, 100, 1, 0 });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] {});
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { 35, 10, 1, 100, 1 });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new int[] { 35, 10, 1, 100, 1, 0 });
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { 35, 10, 1, 100, 1, 0, 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { 35, 1, 100, 1, 0 });
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        java.lang.Boolean[] booleanArray0 = org.apache.commons.lang3.BooleanUtils.booleanValues();
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.and(booleanArray0);
        java.lang.Boolean[] booleanArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray0);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.oneHot(booleanArray0);
        double[] doubleArray5 = new double[] { (-1.0f) };
        double[] doubleArray7 = new double[] { (-1.0f) };
        double[] doubleArray9 = new double[] { (-1.0f) };
        double[] doubleArray11 = new double[] { (-1.0f) };
        double[][] doubleArray12 = new double[][] { doubleArray5, doubleArray7, doubleArray9, doubleArray11 };
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.concat(doubleArray12);
        double[] doubleArray20 = new double[] { (byte) -1, (byte) 1, 100L, (byte) 10, 1L };
        double[] doubleArray23 = new double[] { (byte) 10, 1 };
        double[] doubleArray24 = org.apache.commons.lang3.ArrayUtils.insert(0, doubleArray20, doubleArray23);
        double[] doubleArray25 = null;
        double[] doubleArray26 = org.apache.commons.lang3.ArrayUtils.removeElements(doubleArray23, doubleArray25);
        int int29 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray26, (double) 100, 2147483639);
        double[] doubleArray36 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        double[] doubleArray37 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray36);
        double[] doubleArray38 = org.apache.commons.lang3.ArraySorter.sort(doubleArray36);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isSorted(doubleArray36);
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray26, doubleArray36);
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) doubleArray12, (java.lang.Object) doubleArray26);
        int int42 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) booleanArray0, (java.lang.Object) doubleArray26);
        double[] doubleArray49 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        double[] doubleArray50 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray49);
        double[] doubleArray51 = org.apache.commons.lang3.ArraySorter.sort(doubleArray49);
        double[] doubleArray53 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray51, 0);
        double[] doubleArray55 = org.apache.commons.lang3.ArrayUtils.removeAllOccurences(doubleArray53, 0.0d);
        double[] doubleArray57 = org.apache.commons.lang3.ArrayUtils.removeAllOccurrences(doubleArray55, (double) (byte) 101);
        java.util.Random random58 = null;
        org.apache.commons.lang3.ArrayUtils.shuffle(doubleArray57, random58);
        int int61 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) booleanArray0, (java.lang.Object) random58, 1);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertArrayEquals(booleanArray0, new java.lang.Boolean[] { false, true });
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertArrayEquals(booleanArray2, new java.lang.Boolean[] { false, true });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d), (-1.0d), (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { (-1.0d), 1.0d, 100.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 10.0d, 1.0d, (-1.0d), 1.0d, 100.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        short[] shortArray2 = new short[] { (short) -1, (byte) 10 };
        short[] shortArray5 = new short[] { (short) 1, (short) 1 };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray2, shortArray5);
        org.apache.commons.lang3.ArrayUtils.shift(shortArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray5, 4, (int) (byte) 11);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray13, (short) (byte) 1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] { (short) -1, (short) 10 });
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 1, (short) 1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray13, new short[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        double[] doubleArray6 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray6);
        double[] doubleArray8 = org.apache.commons.lang3.ArraySorter.sort(doubleArray6);
        java.lang.Double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray6);
        java.lang.Double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray9);
        java.lang.Double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray10);
        java.lang.Object[] objArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[]) doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new java.lang.Double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d });
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new java.lang.Double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d });
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new java.lang.Double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d });
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d });
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        short[] shortArray2 = new short[] { (short) -1, (byte) 10 };
        short[] shortArray5 = new short[] { (short) 1, (short) 1 };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray2, shortArray5);
        java.lang.Short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray5);
        java.util.Random random8 = null;
        org.apache.commons.lang3.ArrayUtils.shuffle(shortArray5, random8);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] { (short) -1, (short) 10 });
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 1, (short) 1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertArrayEquals(shortArray7, new java.lang.Short[] { (short) 1, (short) 1 });
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        long[] longArray0 = null;
        long[] longArray2 = org.apache.commons.lang3.ArrayUtils.removeAllOccurrences(longArray0, (long) (byte) 0);
        org.junit.Assert.assertNull(longArray2);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        java.lang.Character[] charArray3 = new java.lang.Character[] { '#', '4', 'a' };
        java.lang.Character[] charArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new java.lang.Character[] { '#', '4', 'a' });
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new java.lang.Character[] { '#', '4', 'a' });
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        double[] doubleArray6 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray6);
        double[] doubleArray8 = org.apache.commons.lang3.ArraySorter.sort(doubleArray6);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSorted(doubleArray6);
        float[] floatArray16 = new float[] { 3, 5, (short) 100, 100, ' ' };
        float[] floatArray22 = new float[] { 3, 5, (short) 100, 100, ' ' };
        float[][] floatArray23 = new float[][] { floatArray16, floatArray22 };
        float[][] floatArray24 = new float[][] {};
        float[][] floatArray25 = org.apache.commons.lang3.ArrayUtils.insert((int) (short) 0, floatArray23, floatArray24);
        int[] intArray30 = new int[] { (short) -1, (short) 100, (short) 10, (byte) -1 };
        int[] intArray32 = org.apache.commons.lang3.ArrayFill.fill(intArray30, (int) (byte) 10);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray32);
        int[] intArray35 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray32, (int) (short) 0);
        int[] intArray37 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray32, (int) (byte) 10);
        int[] intArray43 = new int[] { (-1), 0, (short) 0, (byte) 0, (-1) };
        int[] intArray44 = org.apache.commons.lang3.ArrayUtils.clone(intArray43);
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.containsAny(intArray37, intArray43);
        int[] intArray47 = org.apache.commons.lang3.ArrayUtils.removeAllOccurrences(intArray43, (int) (byte) 10);
        java.util.BitSet bitSet50 = org.apache.commons.lang3.ArrayUtils.indexesOf(intArray47, (int) 'a', 5);
        float[][] floatArray51 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray25, (java.lang.Object) intArray47);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray52 = org.apache.commons.lang3.ArrayUtils.removeAll(doubleArray6, intArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertArrayEquals(floatArray16, new float[] { 3.0f, 5.0f, 100.0f, 100.0f, 32.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertArrayEquals(floatArray22, new float[] { 3.0f, 5.0f, 100.0f, 100.0f, 32.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertArrayEquals(floatArray24, new float[][] {});
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(bitSet50);
        org.junit.Assert.assertEquals(bitSet50.toString(), "{}");
        org.junit.Assert.assertNotNull(floatArray51);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        byte byte3 = bitField1.clearByte((byte) 1);
        boolean boolean5 = bitField1.isSet(2);
        int int8 = bitField1.setBoolean((int) (short) 0, false);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        float[] floatArray1 = new float[] {};
        org.apache.commons.lang3.ArrayUtils.shift(floatArray1, 100, (int) '4', 100);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.clone(floatArray1);
        java.lang.Float[] floatArray13 = new java.lang.Float[] { 1.0f, 1.0f, 10.0f, (-1.0f), (-1.0f), 1.0f };
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray13);
        java.util.BitSet bitSet17 = org.apache.commons.lang3.ArrayUtils.indexesOf(floatArray14, (float) 10L, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.insert(2147483639, floatArray1, floatArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2147483639, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertArrayEquals(floatArray1, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertArrayEquals(floatArray6, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertArrayEquals(floatArray13, new java.lang.Float[] { 1.0f, 1.0f, 10.0f, (-1.0f), (-1.0f), 1.0f });
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertArrayEquals(floatArray14, new float[] { 1.0f, 1.0f, 10.0f, (-1.0f), (-1.0f), 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(bitSet17);
        org.junit.Assert.assertEquals(bitSet17.toString(), "{}");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        float[] floatArray4 = new float[] { (short) 10, (short) 1, 100.0f, 10.0f };
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.add(floatArray4, (float) 100);
        org.apache.commons.lang3.ArrayUtils.swap(floatArray4, (int) (byte) 1, (int) 'a', 10);
        int[] intArray15 = new int[] { (short) -1, (short) 100, (short) 10, (byte) -1 };
        int[] intArray17 = org.apache.commons.lang3.ArrayFill.fill(intArray15, (int) (byte) 10);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray17);
        int[] intArray20 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray17, (int) (short) 0);
        int[] intArray22 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray17, (int) (byte) 10);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray22, 2147483639, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.removeAll(floatArray4, intArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 10.0f, 1.0f, 100.0f, 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertArrayEquals(floatArray6, new float[] { 10.0f, 1.0f, 100.0f, 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 10, 10, 10 });
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "yes", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        long[] longArray0 = new long[] {};
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray0, (long) ' ');
        org.apache.commons.lang3.ArrayUtils.shift(longArray0, (int) (short) -1);
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray0, (long) (-1));
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray9 = org.apache.commons.lang3.ArrayUtils.add(longArray0, 4, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertArrayEquals(longArray0, new long[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        java.lang.Character[] charArray2 = new java.lang.Character[] { '#', '4' };
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray2);
        char[] charArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray3);
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.add(charArray3, ' ');
        int[] intArray11 = new int[] { (short) -1, (short) 100, (short) 10, (byte) -1 };
        int[] intArray13 = org.apache.commons.lang3.ArrayFill.fill(intArray11, (int) (byte) 10);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray13);
        int[] intArray16 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray13, (int) (short) 0);
        int[] intArray18 = org.apache.commons.lang3.ArrayUtils.removeAllOccurences(intArray16, 3);
        java.lang.Integer[] intArray19 = new java.lang.Integer[] {};
        java.lang.Integer[] intArray20 = new java.lang.Integer[] {};
        java.lang.Integer[] intArray21 = new java.lang.Integer[] {};
        java.lang.Integer[][] intArray22 = new java.lang.Integer[][] { intArray19, intArray20, intArray21 };
        java.lang.Integer[] intArray23 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        java.lang.Integer[] intArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray23);
        int[] intArray26 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray24, 100);
        int[] intArray32 = new int[] { '#', (short) 1, (byte) 100, (short) 1, 10 };
        org.apache.commons.lang3.ArrayUtils.reverse(intArray32, (int) (short) 1, (int) ' ');
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray26, intArray32);
        int[] intArray42 = new int[] { (-1), 0, (short) 0, (byte) 0, (-1) };
        int[] intArray43 = org.apache.commons.lang3.ArrayUtils.clone(intArray42);
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.contains(intArray43, (int) (byte) 100);
        int[] intArray46 = org.apache.commons.lang3.ArrayUtils.addAll(intArray26, intArray43);
        java.lang.Integer[][] intArray47 = org.apache.commons.lang3.ArrayUtils.removeAll(intArray22, intArray26);
        java.lang.Integer[] intArray48 = new java.lang.Integer[] {};
        int[] intArray49 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray48);
        boolean boolean50 = org.apache.commons.lang3.ArrayUtils.isSorted(intArray49);
        int[] intArray52 = org.apache.commons.lang3.ArrayUtils.removeAllOccurences(intArray49, 100);
        int[] intArray53 = org.apache.commons.lang3.ArrayUtils.removeAll(intArray26, intArray52);
        int[] intArray54 = org.apache.commons.lang3.ArrayUtils.removeElements(intArray18, intArray53);
        int[] intArray61 = new int[] { (-1), 0, (short) 0, (byte) 0, (-1) };
        int[] intArray62 = org.apache.commons.lang3.ArrayUtils.clone(intArray61);
        java.lang.Integer[] intArray63 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        int[] intArray64 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray63);
        int[] intArray65 = org.apache.commons.lang3.ArrayUtils.removeElements(intArray62, intArray64);
        java.lang.Comparable[][] comparableArray67 = new java.lang.Comparable[0][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray68 = (java.lang.Comparable<java.lang.String>[][]) comparableArray67;
        java.lang.String[] strArray74 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        int[] intArray75 = null;
        java.lang.Comparable<java.lang.String>[] strComparableArray76 = org.apache.commons.lang3.ArrayUtils.removeAll((java.lang.Comparable<java.lang.String>[]) strArray74, intArray75);
        java.lang.Comparable<java.lang.String>[][] strComparableArray77 = org.apache.commons.lang3.ArrayUtils.removeAllOccurrences(strComparableArray68, (java.lang.Comparable<java.lang.String>[]) strArray74);
        boolean boolean78 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object) intArray62, (java.lang.Object) strArray74);
        int[] intArray79 = org.apache.commons.lang3.ArraySorter.sort(intArray62);
        int[] intArray85 = new int[] { '#', (short) 1, (byte) 100, (short) 1, 10 };
        org.apache.commons.lang3.ArrayUtils.reverse(intArray85, (int) (short) 1, (int) ' ');
        int[] intArray90 = org.apache.commons.lang3.ArrayUtils.add(intArray85, (int) (byte) 0);
        int[] intArray93 = org.apache.commons.lang3.ArrayUtils.subarray(intArray90, (int) '#', 2);
        int[] intArray94 = org.apache.commons.lang3.ArrayUtils.insert(100, intArray79, intArray93);
        int[] intArray95 = org.apache.commons.lang3.ArrayUtils.removeElements(intArray18, intArray79);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray96 = org.apache.commons.lang3.ArrayUtils.removeAll(charArray6, intArray95);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new java.lang.Character[] { '#', '4' });
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] { '#', '4' });
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '#', '4' });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '#', '4', ' ' });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] {});
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 35, 10, 1, 100, 1 });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] {});
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] {});
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertArrayEquals(intArray53, new int[] {});
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertArrayEquals(intArray54, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertArrayEquals(intArray62, new int[] { (-1), (-1), 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertArrayEquals(intArray63, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertArrayEquals(intArray64, new int[] {});
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertArrayEquals(intArray65, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(comparableArray67);
        org.junit.Assert.assertArrayEquals(comparableArray67, new java.lang.Comparable[][] {});
        org.junit.Assert.assertNotNull(strComparableArray68);
        org.junit.Assert.assertArrayEquals(strComparableArray68, new java.lang.Comparable[][] {});
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strComparableArray76);
        org.junit.Assert.assertArrayEquals(strComparableArray76, new java.lang.String[] { null, null, null, null, null });
        org.junit.Assert.assertNotNull(strComparableArray77);
        org.junit.Assert.assertArrayEquals(strComparableArray77, new java.lang.Comparable[][] {});
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertArrayEquals(intArray79, new int[] { (-1), (-1), 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertArrayEquals(intArray85, new int[] { 35, 10, 1, 100, 1 });
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertArrayEquals(intArray90, new int[] { 35, 10, 1, 100, 1, 0 });
        org.junit.Assert.assertNotNull(intArray93);
        org.junit.Assert.assertArrayEquals(intArray93, new int[] {});
        org.junit.Assert.assertNotNull(intArray94);
        org.junit.Assert.assertArrayEquals(intArray94, new int[] { (-1), (-1), 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray95);
        org.junit.Assert.assertArrayEquals(intArray95, new int[] { 10, 10, 10, 10 });
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.apache.commons.lang3.ArrayUtils arrayUtils0 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils1 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray2 = new org.apache.commons.lang3.ArrayUtils[] { arrayUtils0, arrayUtils1 };
        int[] intArray7 = new int[] { (short) -1, (short) 100, (short) 10, (byte) -1 };
        int[] intArray9 = org.apache.commons.lang3.ArrayFill.fill(intArray7, (int) (byte) 10);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray7, (int) (byte) 0);
        org.apache.commons.lang3.ArrayUtils.shift(intArray7, 100, 1, (-1));
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray7, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray18 = org.apache.commons.lang3.ArrayUtils.removeAll(arrayUtilsArray2, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayUtilsArray2);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        boolean[] booleanArray0 = new boolean[] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray0);
        boolean[] booleanArray2 = new boolean[] {};
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray2);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray2, true);
        boolean[] booleanArray6 = new boolean[] {};
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray6);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray6, true);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray2, booleanArray6);
        boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.removeElements(booleanArray0, booleanArray6);
        boolean[] booleanArray12 = new boolean[] {};
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray12);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray12, true);
        boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray12);
        boolean[] booleanArray17 = new boolean[] {};
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray17);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray17, true);
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray17, true, (int) '#');
        java.util.Random random24 = null;
        org.apache.commons.lang3.ArrayUtils.shuffle(booleanArray17, random24);
        boolean[] booleanArray26 = org.apache.commons.lang3.ArrayUtils.removeElements(booleanArray16, booleanArray17);
        boolean[] booleanArray31 = new boolean[] { true, true, false, true };
        boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.removeElements(booleanArray16, booleanArray31);
        int int34 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray32, false);
        boolean[] booleanArray36 = org.apache.commons.lang3.ArrayUtils.add(booleanArray32, false);
        boolean[] booleanArray39 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray32, (int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertNotNull(booleanArray0);
        assertBooleanArrayEquals(booleanArray0, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(booleanArray2);
        assertBooleanArrayEquals(booleanArray2, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(booleanArray6);
        assertBooleanArrayEquals(booleanArray6, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(booleanArray11);
        assertBooleanArrayEquals(booleanArray11, new boolean[] {});
        org.junit.Assert.assertNotNull(booleanArray12);
        assertBooleanArrayEquals(booleanArray12, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(booleanArray16);
        assertBooleanArrayEquals(booleanArray16, new boolean[] {});
        org.junit.Assert.assertNotNull(booleanArray17);
        assertBooleanArrayEquals(booleanArray17, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(booleanArray26);
        assertBooleanArrayEquals(booleanArray26, new boolean[] {});
        org.junit.Assert.assertNotNull(booleanArray31);
        assertBooleanArrayEquals(booleanArray31, new boolean[] { true, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray32);
        assertBooleanArrayEquals(booleanArray32, new boolean[] {});
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(booleanArray36);
        assertBooleanArrayEquals(booleanArray36, new boolean[] { false });
        org.junit.Assert.assertNotNull(booleanArray39);
        assertBooleanArrayEquals(booleanArray39, new boolean[] {});
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        float[] floatArray0 = null;
        float[] floatArray1 = org.apache.commons.lang3.ArrayUtils.clone(floatArray0);
        org.junit.Assert.assertNull(floatArray1);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 0 };
        java.lang.Short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray2);
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3, (short) (byte) -1);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.removeAllOccurrences(shortArray5, (short) (byte) 10);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray7, (int) (short) 1, 0);
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.add(shortArray7, (short) 100);
        java.util.Random random13 = null;
        org.apache.commons.lang3.ArrayUtils.shuffle(shortArray12, random13);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new java.lang.Short[] { (short) -1, (short) 0 });
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertArrayEquals(shortArray3, new java.lang.Short[] { (short) -1, (short) 0 });
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) -1, (short) 0 });
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertArrayEquals(shortArray7, new short[] { (short) -1, (short) 0 });
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray12, new short[] { (short) -1, (short) 0, (short) 100 });
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(byteArray6, (byte) 0);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) -1);
        int[] intArray11 = null;
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.removeAll(byteArray6, intArray11);
        byte[] byteArray13 = null;
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray6, byteArray13);
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.contains(byteArray21, (byte) 0);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray21, (byte) -1);
        byte[] byteArray26 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray13, byteArray21);
        java.lang.Boolean[] booleanArray31 = new java.lang.Boolean[] { false, true, false, true };
        java.lang.Boolean boolean32 = org.apache.commons.lang3.BooleanUtils.or(booleanArray31);
        java.lang.Boolean boolean33 = org.apache.commons.lang3.BooleanUtils.oneHot(booleanArray31);
        java.lang.Boolean[] booleanArray34 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray31);
        java.lang.Boolean[] booleanArray35 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray31);
        byte[] byteArray42 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.contains(byteArray42, (byte) 0);
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.contains(byteArray42, (byte) -1);
        byte[] byteArray48 = org.apache.commons.lang3.ArrayUtils.removeAllOccurrences(byteArray42, (byte) 10);
        byte[] byteArray55 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        boolean boolean57 = org.apache.commons.lang3.ArrayUtils.contains(byteArray55, (byte) 0);
        org.apache.commons.lang3.ArrayUtils.swap(byteArray55, (-1), (int) ' ');
        byte[] byteArray61 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray42, byteArray55);
        int int62 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) booleanArray31, (java.lang.Object) byteArray55);
        byte[] byteArray64 = org.apache.commons.lang3.ArrayUtils.removeAllOccurrences(byteArray55, (byte) 10);
        boolean boolean65 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray21, byteArray64);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(booleanArray31);
        org.junit.Assert.assertArrayEquals(booleanArray31, new java.lang.Boolean[] { false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(booleanArray34);
        org.junit.Assert.assertArrayEquals(booleanArray34, new java.lang.Boolean[] { false, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray35);
        org.junit.Assert.assertArrayEquals(booleanArray35, new java.lang.Boolean[] { false, true, false, true });
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("{1,1,-1}", "", "off", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (byte) 1, 2, (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { false, true, false, true };
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray4);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.oneHot(booleanArray4);
        java.lang.Boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray4);
        java.lang.Boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray4);
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains(byteArray15, (byte) 0);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.contains(byteArray15, (byte) -1);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.removeAllOccurrences(byteArray15, (byte) 10);
        byte[] byteArray28 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.contains(byteArray28, (byte) 0);
        org.apache.commons.lang3.ArrayUtils.swap(byteArray28, (-1), (int) ' ');
        byte[] byteArray34 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray15, byteArray28);
        int int35 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) booleanArray4, (java.lang.Object) byteArray28);
        byte[] byteArray37 = org.apache.commons.lang3.ArrayUtils.removeAllOccurrences(byteArray28, (byte) 10);
        java.util.BitSet bitSet40 = org.apache.commons.lang3.ArrayUtils.indexesOf(byteArray37, (byte) 1, 5);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertArrayEquals(booleanArray4, new java.lang.Boolean[] { false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertArrayEquals(booleanArray7, new java.lang.Boolean[] { false, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertArrayEquals(booleanArray8, new java.lang.Boolean[] { false, true, false, true });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 1, (byte) 0 });
        org.junit.Assert.assertNotNull(bitSet40);
        org.junit.Assert.assertEquals(bitSet40.toString(), "{}");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        short[] shortArray3 = new short[] { (short) -1, (byte) 10 };
        short[] shortArray6 = new short[] { (short) 1, (short) 1 };
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray3, shortArray6);
        short[] shortArray10 = new short[] { (short) -1, (byte) 10 };
        short[] shortArray13 = new short[] { (short) 1, (short) 1 };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray10, shortArray13);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray10);
        short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray10, (int) (short) -1, (int) (byte) 1);
        org.apache.commons.lang3.ArrayUtils.shuffle(shortArray18);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray18);
        short[] shortArray22 = org.apache.commons.lang3.ArrayUtils.removeAllOccurrences(shortArray18, (short) (byte) 100);
        short[] shortArray24 = org.apache.commons.lang3.ArrayUtils.add(shortArray18, (short) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray25 = org.apache.commons.lang3.ArrayUtils.insert((int) (short) 11, shortArray3, shortArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 11, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertArrayEquals(shortArray3, new short[] { (short) -1, (short) 10 });
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] { (short) 1, (short) 1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray10, new short[] { (short) 10, (short) -1 });
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray13, new short[] { (short) 1, (short) 1 });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray18, new short[] { (short) 10 });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertArrayEquals(shortArray22, new short[] { (short) 10 });
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertArrayEquals(shortArray24, new short[] { (short) 10, (short) 0 });
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        float[] floatArray5 = new float[] { (short) 10, (short) 1, 100.0f, 10.0f };
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray5, (float) 100);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray5, (float) 1L);
        org.apache.commons.lang3.ArrayUtils.shift(floatArray5, (int) '#', 2147483639, (int) '#');
        org.apache.commons.lang3.ArrayUtils.shift(floatArray5, (int) (byte) 0, 3, 2147483639);
        float[] floatArray19 = org.apache.commons.lang3.ArrayUtils.addFirst(floatArray5, (float) (-1));
        float[] floatArray24 = new float[] { (short) 10, (short) 1, 100.0f, 10.0f };
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.add(floatArray24, (float) 100);
        org.apache.commons.lang3.ArrayUtils.shuffle(floatArray26);
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray26, (float) '4');
        float[] floatArray32 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray26, 0, (int) (byte) 101);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray33 = org.apache.commons.lang3.ArrayUtils.insert((int) (byte) -1, floatArray5, floatArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertArrayEquals(floatArray5, new float[] { 1.0f, 100.0f, 10.0f, 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertArrayEquals(floatArray7, new float[] { 10.0f, 1.0f, 100.0f, 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertArrayEquals(floatArray19, new float[] { (-1.0f), 1.0f, 100.0f, 10.0f, 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertArrayEquals(floatArray24, new float[] { 10.0f, 1.0f, 100.0f, 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertArrayEquals(floatArray26, new float[] { 1.0f, 10.0f, 100.0f, 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertArrayEquals(floatArray32, new float[] { 1.0f, 10.0f, 100.0f, 10.0f, 100.0f }, (float) 1.0E-15);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        long[] longArray6 = new long[] { (short) -1, (byte) 10, 100L, (byte) 10, (short) 100, (byte) -1 };
        org.apache.commons.lang3.ArrayUtils.swap(longArray6, (int) (byte) 10, (int) (short) 10, (int) (short) 10);
        long[] longArray12 = org.apache.commons.lang3.ArrayFill.fill(longArray6, (long) (short) 0);
        org.apache.commons.lang3.ArrayUtils.shift(longArray12, 4);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { 0L, 0L, 0L, 0L, 0L, 0L });
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertArrayEquals(longArray12, new long[] { 0L, 0L, 0L, 0L, 0L, 0L });
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        int[] intArray4 = new int[] { (short) -1, (short) 100, (short) 10, (byte) -1 };
        int[] intArray6 = org.apache.commons.lang3.ArrayFill.fill(intArray4, (int) (byte) 10);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray6);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray6, (int) (short) 0);
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray6, (int) (byte) 10);
        int[] intArray17 = new int[] { (-1), 0, (short) 0, (byte) 0, (-1) };
        int[] intArray18 = org.apache.commons.lang3.ArrayUtils.clone(intArray17);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.containsAny(intArray11, intArray17);
        int[] intArray21 = org.apache.commons.lang3.ArrayUtils.removeAllOccurrences(intArray17, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = org.apache.commons.lang3.ArrayUtils.remove(intArray21, (int) (byte) 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 11, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 10, 10, 10 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { (-1), 0, 0, 0, (-1) });
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        boolean[] booleanArray0 = null;
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray0, 5, (-2));
        org.junit.Assert.assertNull(booleanArray3);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        short[] shortArray3 = new short[] { (short) -1, (byte) 10 };
        short[] shortArray6 = new short[] { (short) 1, (short) 1 };
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray3, shortArray6);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.removeAllOccurences(shortArray6, (short) (byte) 100);
        short[] shortArray10 = org.apache.commons.lang3.ArraySorter.sort(shortArray6);
        short[] shortArray13 = new short[] { (short) -1, (byte) 10 };
        short[] shortArray16 = new short[] { (short) 1, (short) 1 };
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray13, shortArray16);
        short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.removeAllOccurences(shortArray16, (short) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray20 = org.apache.commons.lang3.ArrayUtils.insert((int) (byte) 100, shortArray6, shortArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertArrayEquals(shortArray3, new short[] { (short) -1, (short) 10 });
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] { (short) 1, (short) 1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertArrayEquals(shortArray9, new short[] { (short) 1, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray10, new short[] { (short) 1, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray13, new short[] { (short) -1, (short) 10 });
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray16, new short[] { (short) 1, (short) 1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray19, new short[] { (short) 1, (short) 1 });
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        float[] floatArray3 = new float[] { 52, '4' };
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY;
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.insert(100, floatArray3, floatArray4);
        java.util.BitSet bitSet7 = org.apache.commons.lang3.ArrayUtils.indexesOf(floatArray5, 10.0f);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertArrayEquals(floatArray3, new float[] { 52.0f, 52.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertArrayEquals(floatArray5, new float[] { 52.0f, 52.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(bitSet7);
        org.junit.Assert.assertEquals(bitSet7.toString(), "{}");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        char[] charArray1 = new char[] { '4' };
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray1, 'a');
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray1, 'a');
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.addFirst(charArray1, 'a');
        char[] charArray8 = org.apache.commons.lang3.ArrayFill.clear(charArray7);
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.removeAllOccurrences(charArray7, 'a');
        float[] floatArray15 = new float[] { (short) 10, (short) 1, 100.0f, 10.0f };
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.add(floatArray15, (float) 100);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray15, (float) 1L);
        org.apache.commons.lang3.ArrayUtils.shuffle(floatArray15);
        java.lang.Float[] floatArray22 = new java.lang.Float[] { 1.0f };
        java.lang.Float[] floatArray23 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray22);
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray23, (float) 5);
        float[] floatArray27 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray25, (float) (short) 1);
        float[] floatArray28 = org.apache.commons.lang3.ArrayUtils.removeElements(floatArray15, floatArray25);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) charArray7, (java.lang.Object) floatArray15);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '\000', '\000' });
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '\000', '\000' });
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '\000', '\000' });
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertArrayEquals(floatArray15, new float[] { 10.0f, 10.0f, 1.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertArrayEquals(floatArray17, new float[] { 10.0f, 1.0f, 100.0f, 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertArrayEquals(floatArray22, new java.lang.Float[] { 1.0f });
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertArrayEquals(floatArray23, new java.lang.Float[] { 1.0f });
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertArrayEquals(floatArray25, new float[] { 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertArrayEquals(floatArray27, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertArrayEquals(floatArray28, new float[] { 10.0f, 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        java.lang.Float[] floatArray1 = new java.lang.Float[] { 1.0f };
        java.lang.Float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray2, (float) 5);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray4, (float) (short) 1);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray4, 2147483639, (int) (byte) 101);
        java.lang.Float[] floatArray16 = new java.lang.Float[] { 1.0f, 1.0f, 10.0f, (-1.0f), (-1.0f), 1.0f };
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray16);
        java.lang.Float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray17);
        float[] floatArray19 = org.apache.commons.lang3.ArrayUtils.removeElements(floatArray4, floatArray17);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.add(floatArray4, (int) '#', (float) 2147483639);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertArrayEquals(floatArray1, new java.lang.Float[] { 1.0f });
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertArrayEquals(floatArray2, new java.lang.Float[] { 1.0f });
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertArrayEquals(floatArray6, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertArrayEquals(floatArray16, new java.lang.Float[] { 1.0f, 1.0f, 10.0f, (-1.0f), (-1.0f), 1.0f });
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertArrayEquals(floatArray17, new float[] { 1.0f, 1.0f, 10.0f, (-1.0f), (-1.0f), 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertArrayEquals(floatArray18, new java.lang.Float[] { 1.0f, 1.0f, 10.0f, (-1.0f), (-1.0f), 1.0f });
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertArrayEquals(floatArray19, new float[] {}, (float) 1.0E-15);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        boolean[] booleanArray0 = new boolean[] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray0);
        boolean[] booleanArray2 = new boolean[] {};
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray2);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray2, true);
        boolean[] booleanArray6 = new boolean[] {};
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray6);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray6, true);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray2, booleanArray6);
        boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.removeElements(booleanArray0, booleanArray6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = org.apache.commons.lang3.BooleanUtils.oneHot(booleanArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        assertBooleanArrayEquals(booleanArray0, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(booleanArray2);
        assertBooleanArrayEquals(booleanArray2, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(booleanArray6);
        assertBooleanArrayEquals(booleanArray6, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(booleanArray11);
        assertBooleanArrayEquals(booleanArray11, new boolean[] {});
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        long[] longArray6 = new long[] { 'a', '4', (byte) -1, (byte) 1, (short) 10, 1L };
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray6, 0L, (int) 'a');
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray6);
        java.util.BitSet bitSet12 = org.apache.commons.lang3.ArrayUtils.indexesOf(longArray6, (long) 2147483639);
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.removeAllOccurrences(longArray6, (long) 52);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray17 = org.apache.commons.lang3.ArrayUtils.add(longArray14, (-1), 101L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { 97L, 52L, (-1L), 1L, 10L, 1L });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(bitSet12);
        org.junit.Assert.assertEquals(bitSet12.toString(), "{}");
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertArrayEquals(longArray14, new long[] { 97L, (-1L), 1L, 10L, 1L });
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(byteArray6, (byte) 0);
        org.apache.commons.lang3.ArrayUtils.swap(byteArray6, (-1), (int) ' ');
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.addFirst(byteArray6, (byte) 0);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray13, (byte) 0);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray13);
        org.apache.commons.lang3.ArrayUtils.shift(byteArray13, 52, 5, 0);
        java.lang.Byte[] byteArray26 = new java.lang.Byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        java.lang.Byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray26);
        byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray26, (byte) 10);
        byte[] byteArray30 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray26);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray13, byteArray30);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray33 = org.apache.commons.lang3.ArrayUtils.remove(byteArray13, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -2, Length: 7");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new java.lang.Byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new java.lang.Byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        short[] shortArray2 = new short[] { (short) -1, (byte) 10 };
        short[] shortArray5 = new short[] { (short) 1, (short) 1 };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray2, shortArray5);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray2);
        org.apache.commons.lang3.ArrayUtils.shift(shortArray2, (int) (short) 10);
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.removeAllOccurrences(shortArray2, (short) (byte) 101);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray11);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSorted(shortArray11);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] { (short) 10, (short) -1 });
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 1, (short) 1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] { (short) 10, (short) -1 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        short[] shortArray2 = new short[] { (short) -1, (byte) 10 };
        short[] shortArray5 = new short[] { (short) 1, (short) 1 };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray2, shortArray5);
        org.apache.commons.lang3.ArrayUtils.shift(shortArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        short[] shortArray12 = new short[] { (short) -1 };
        short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.add(shortArray12, 0, (short) (byte) 10);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray5, shortArray12);
        java.lang.Short[] shortArray19 = new java.lang.Short[] { (short) -1, (short) 0 };
        java.lang.Short[] shortArray20 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray19);
        short[] shortArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray20, (short) (byte) -1);
        org.apache.commons.lang3.ArrayUtils.shift(shortArray22, (int) (short) 0);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray5, shortArray22);
        java.util.Random random26 = null;
        org.apache.commons.lang3.ArrayUtils.shuffle(shortArray22, random26);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray30 = org.apache.commons.lang3.ArrayUtils.add(shortArray22, (int) ' ', (short) 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] { (short) -1, (short) 10 });
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 1, (short) 1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray12, new short[] { (short) -1 });
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray15, new short[] { (short) 10, (short) -1 });
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray16, new short[] { (short) 1, (short) 1, (short) -1 });
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray19, new java.lang.Short[] { (short) -1, (short) 0 });
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray20, new java.lang.Short[] { (short) -1, (short) 0 });
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertArrayEquals(shortArray22, new short[] { (short) -1, (short) 0 });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        float[] floatArray4 = new float[] { (short) 10, (short) 1, 100.0f, 10.0f };
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.add(floatArray4, (float) 100);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray4, (float) 1L);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray4, (float) 52, 100);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isSorted(floatArray4);
        org.apache.commons.lang3.ArrayUtils.shuffle(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 10.0f, 1.0f, 100.0f, 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertArrayEquals(floatArray6, new float[] { 10.0f, 1.0f, 100.0f, 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        long[] longArray6 = new long[] { (short) -1, (byte) 10, 100L, (byte) 10, (short) 100, (byte) -1 };
        org.apache.commons.lang3.ArrayUtils.swap(longArray6, (int) (byte) 10, (int) (short) 10, (int) (short) 10);
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.removeAllOccurences(longArray6, (long) 100);
        long[] longArray19 = new long[] { 'a', '4', (byte) -1, (byte) 1, (short) 10, 1L };
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray19, 0L, (int) 'a');
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray19);
        java.util.BitSet bitSet26 = org.apache.commons.lang3.ArrayUtils.indexesOf(longArray19, (long) '4', (int) '#');
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray6, longArray19);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isSorted(longArray19);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray19);
        long[] longArray31 = org.apache.commons.lang3.ArrayUtils.removeAllOccurrences(longArray19, (long) (short) 1);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { (-1L), 10L, 100L, 10L, 100L, (-1L) });
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertArrayEquals(longArray12, new long[] { (-1L), 10L, 10L, (-1L) });
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertArrayEquals(longArray19, new long[] { 1L, 10L, 1L, (-1L), 52L, 97L });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(bitSet26);
        org.junit.Assert.assertEquals(bitSet26.toString(), "{}");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertArrayEquals(longArray31, new long[] { 10L, (-1L), 52L, 97L });
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        boolean[] booleanArray0 = null;
        boolean[] booleanArray2 = org.apache.commons.lang3.ArrayUtils.removeAllOccurences(booleanArray0, true);
        org.junit.Assert.assertNull(booleanArray2);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { false, true, false, true };
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray4);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.oneHot(booleanArray4);
        java.lang.Boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray4);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray7, false);
        java.util.BitSet bitSet12 = org.apache.commons.lang3.ArrayUtils.indexesOf(booleanArray9, false, 0);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.removeAllOccurrences(booleanArray9, true);
        boolean[] booleanArray15 = org.apache.commons.lang3.BooleanUtils.primitiveValues();
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayFill.fill(booleanArray15, true);
        boolean boolean18 = org.apache.commons.lang3.BooleanUtils.oneHot(booleanArray15);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray14, booleanArray15);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertArrayEquals(booleanArray4, new java.lang.Boolean[] { false, true, false, true });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertArrayEquals(booleanArray7, new java.lang.Boolean[] { false, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray9);
        assertBooleanArrayEquals(booleanArray9, new boolean[] { false, true, false, true });
        org.junit.Assert.assertNotNull(bitSet12);
        org.junit.Assert.assertEquals(bitSet12.toString(), "{0, 2}");
        org.junit.Assert.assertNotNull(booleanArray14);
        assertBooleanArrayEquals(booleanArray14, new boolean[] { false, false });
        org.junit.Assert.assertNotNull(booleanArray15);
        assertBooleanArrayEquals(booleanArray15, new boolean[] { true, true });
        org.junit.Assert.assertNotNull(booleanArray17);
        assertBooleanArrayEquals(booleanArray17, new boolean[] { true, true });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        int[] intArray5 = new int[] { (-1), 0, (short) 0, (byte) 0, (-1) };
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.clone(intArray5);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray6);
        org.apache.commons.lang3.ArrayUtils.swap(intArray6, 1, 4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), (-1), 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), (-1), 0, 0, 0 });
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        boolean[] booleanArray0 = org.apache.commons.lang3.BooleanUtils.primitiveValues();
        boolean[] booleanArray2 = org.apache.commons.lang3.ArrayFill.fill(booleanArray0, true);
        int int5 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray0, false, (int) (short) 11);
        org.junit.Assert.assertNotNull(booleanArray0);
        assertBooleanArrayEquals(booleanArray0, new boolean[] { true, true });
        org.junit.Assert.assertNotNull(booleanArray2);
        assertBooleanArrayEquals(booleanArray2, new boolean[] { true, true });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        double[] doubleArray7 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray7);
        double[] doubleArray9 = org.apache.commons.lang3.ArraySorter.sort(doubleArray7);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray9);
        org.apache.commons.lang3.ArrayUtils.swap(doubleArray9, 0, (int) (short) 1, (int) (short) 0);
        double[] doubleArray21 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        double[] doubleArray22 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray21);
        int int25 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray21, (double) 1L, (double) (short) -1);
        int int28 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray21, (double) 10L, (int) (byte) 1);
        double[] doubleArray29 = org.apache.commons.lang3.ArrayUtils.insert(0, doubleArray9, doubleArray21);
        java.util.BitSet bitSet33 = org.apache.commons.lang3.ArrayUtils.indexesOf(doubleArray21, (double) (-2L), (int) (byte) 100, (double) (byte) 101);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d, (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(bitSet33);
        org.junit.Assert.assertEquals(bitSet33.toString(), "{}");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 0 };
        java.lang.Short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray2);
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3, (short) (byte) 0);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3);
        java.lang.Short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray3);
        long[] longArray10 = new long[] {};
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray10, (long) ' ');
        org.apache.commons.lang3.ArrayUtils.reverse(longArray10);
        long[] longArray15 = new long[] {};
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray15, (long) ' ');
        org.apache.commons.lang3.ArrayUtils.shift(longArray15, (int) (short) -1);
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray15, (long) (-1));
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.removeElements(longArray15, longArray22);
        long[] longArray24 = new long[] {};
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray24, (long) ' ');
        org.apache.commons.lang3.ArrayUtils.shift(longArray24, (int) (short) -1);
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray24, (long) (-1));
        long[] longArray31 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray32 = org.apache.commons.lang3.ArrayUtils.removeElements(longArray24, longArray31);
        org.apache.commons.lang3.ArrayUtils.shift(longArray32, (-1));
        long[] longArray35 = org.apache.commons.lang3.ArrayUtils.insert((int) (byte) 100, longArray23, longArray32);
        java.util.BitSet bitSet38 = org.apache.commons.lang3.ArrayUtils.indexesOf(longArray23, (long) (short) 1, 1);
        long[] longArray39 = org.apache.commons.lang3.ArrayUtils.insert((int) (byte) -1, longArray10, longArray23);
        org.apache.commons.lang3.ArrayUtils.shuffle(longArray39);
        org.apache.commons.lang3.ArrayUtils.swap(longArray39, 10, (int) (byte) 100);
        int int45 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) shortArray8, (java.lang.Object) 10, (int) (byte) 10);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new java.lang.Short[] { (short) -1, (short) 0 });
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertArrayEquals(shortArray3, new java.lang.Short[] { (short) -1, (short) 0 });
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray4, new short[] { (short) -1, (short) 0 });
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] { (short) -1, (short) 0 });
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertArrayEquals(shortArray7, new short[] { (short) -1, (short) 0 });
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertArrayEquals(shortArray8, new java.lang.Short[] { (short) -1, (short) 0 });
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertArrayEquals(longArray10, new long[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertArrayEquals(longArray15, new long[] {});
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertArrayEquals(longArray22, new long[] {});
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertArrayEquals(longArray23, new long[] {});
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertArrayEquals(longArray24, new long[] {});
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertArrayEquals(longArray31, new long[] {});
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertArrayEquals(longArray32, new long[] {});
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertArrayEquals(longArray35, new long[] {});
        org.junit.Assert.assertNotNull(bitSet38);
        org.junit.Assert.assertEquals(bitSet38.toString(), "{}");
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertArrayEquals(longArray39, new long[] {});
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(byteArray6, (byte) 0);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) -1);
        int[] intArray11 = null;
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.removeAll(byteArray6, intArray11);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray6);
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, 1, (byte) 10);
        java.lang.Byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray6);
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.clone(byteArray6);
        org.apache.commons.lang3.ArrayUtils.swap(byteArray18, (int) (short) 100, (int) (byte) 100, 10);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new java.lang.Byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 });
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        boolean[] booleanArray4 = new boolean[] { false, false, false, true };
        boolean[] booleanArray5 = new boolean[] {};
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        boolean[] booleanArray7 = new boolean[] {};
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray7);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray7, true);
        boolean[] booleanArray11 = new boolean[] {};
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray11);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray11, true);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray7, booleanArray11);
        boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.removeElements(booleanArray5, booleanArray11);
        boolean[] booleanArray17 = new boolean[] {};
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray17);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray17, true);
        boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray17);
        boolean[] booleanArray22 = new boolean[] {};
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray22);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray22, true);
        int int28 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray22, true, (int) '#');
        java.util.Random random29 = null;
        org.apache.commons.lang3.ArrayUtils.shuffle(booleanArray22, random29);
        boolean[] booleanArray31 = org.apache.commons.lang3.ArrayUtils.removeElements(booleanArray21, booleanArray22);
        java.util.Random random32 = null;
        org.apache.commons.lang3.ArrayUtils.shuffle(booleanArray22, random32);
        java.lang.Integer[] intArray34 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        java.lang.Integer[] intArray35 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray34);
        int[] intArray37 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray35, 100);
        int[] intArray43 = new int[] { '#', (short) 1, (byte) 100, (short) 1, 10 };
        org.apache.commons.lang3.ArrayUtils.reverse(intArray43, (int) (short) 1, (int) ' ');
        boolean boolean47 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray37, intArray43);
        boolean[] booleanArray48 = org.apache.commons.lang3.ArrayUtils.removeAll(booleanArray22, intArray37);
        boolean boolean49 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray4, booleanArray22);
        boolean[] booleanArray50 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray4);
        boolean boolean51 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray4);
        assertBooleanArrayEquals(booleanArray4, new boolean[] { false, false, false, true });
        org.junit.Assert.assertNotNull(booleanArray5);
        assertBooleanArrayEquals(booleanArray5, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(booleanArray7);
        assertBooleanArrayEquals(booleanArray7, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(booleanArray11);
        assertBooleanArrayEquals(booleanArray11, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(booleanArray16);
        assertBooleanArrayEquals(booleanArray16, new boolean[] {});
        org.junit.Assert.assertNotNull(booleanArray17);
        assertBooleanArrayEquals(booleanArray17, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(booleanArray21);
        assertBooleanArrayEquals(booleanArray21, new boolean[] {});
        org.junit.Assert.assertNotNull(booleanArray22);
        assertBooleanArrayEquals(booleanArray22, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(booleanArray31);
        assertBooleanArrayEquals(booleanArray31, new boolean[] {});
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new java.lang.Integer[] {});
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] {});
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { 35, 10, 1, 100, 1 });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(booleanArray48);
        assertBooleanArrayEquals(booleanArray48, new boolean[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(booleanArray50);
        assertBooleanArrayEquals(booleanArray50, new boolean[] { false, false, false, true });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(byteArray6, (byte) 0);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) -1);
        int[] intArray11 = null;
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.removeAll(byteArray6, intArray11);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray6);
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, 1, (byte) 10);
        java.lang.Byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray6);
        org.apache.commons.lang3.ArrayUtils.shift((java.lang.Object[]) byteArray17, 10);
        long[] longArray26 = new long[] { (short) -1, (byte) 10, 100L, (byte) 10, (short) 100, (byte) -1 };
        org.apache.commons.lang3.ArrayUtils.swap(longArray26, (int) (byte) 10, (int) (short) 10, (int) (short) 10);
        long[] longArray32 = org.apache.commons.lang3.ArrayUtils.removeAllOccurences(longArray26, (long) 100);
        java.util.BitSet bitSet34 = org.apache.commons.lang3.ArrayUtils.indexesOf((java.lang.Object[]) byteArray17, (java.lang.Object) longArray26, (int) (byte) 10);
        java.lang.Byte[] byteArray35 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray17);
        byte[] byteArray36 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray17);
        java.lang.Byte[] byteArray37 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray17);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new java.lang.Byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertArrayEquals(longArray26, new long[] { (-1L), 10L, 100L, 10L, 100L, (-1L) });
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertArrayEquals(longArray32, new long[] { (-1L), 10L, 10L, (-1L) });
        org.junit.Assert.assertNotNull(bitSet34);
        org.junit.Assert.assertEquals(bitSet34.toString(), "{}");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new java.lang.Byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new java.lang.Byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        java.lang.Character[] charArray2 = new java.lang.Character[] { '#', '4' };
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray2);
        char[] charArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray3);
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.addFirst(charArray4, '#');
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.removeAllOccurrences(charArray4, '#');
        char[] charArray10 = new char[] { '4' };
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray10, 'a');
        org.apache.commons.lang3.ArrayUtils.swap(charArray10, (int) (short) -1, (int) (short) 1, 0);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray10);
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.addAll(charArray4, charArray10);
        char[] charArray20 = new char[] { '4' };
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray20, 'a');
        org.apache.commons.lang3.ArrayUtils.swap(charArray20, (int) (short) -1, (int) (short) 1, 0);
        java.util.BitSet bitSet28 = org.apache.commons.lang3.ArrayUtils.indexesOf(charArray20, 'a');
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray10, charArray20);
        int[] intArray35 = new int[] { '#', (short) 1, (byte) 100, (short) 1, 10 };
        org.apache.commons.lang3.ArrayUtils.reverse(intArray35, (int) (short) 1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray39 = org.apache.commons.lang3.ArrayUtils.removeAll(charArray20, intArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new java.lang.Character[] { '#', '4' });
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] { '#', '4' });
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '#', '4' });
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '#', '#', '4' });
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '#', '4', '4' });
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(bitSet28);
        org.junit.Assert.assertEquals(bitSet28.toString(), "{}");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 35, 10, 1, 100, 1 });
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        short[] shortArray2 = new short[] { (short) -1, (byte) 10 };
        short[] shortArray5 = new short[] { (short) 1, (short) 1 };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray2, shortArray5);
        org.apache.commons.lang3.ArrayUtils.shift(shortArray5, (int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        short[] shortArray12 = new short[] { (short) -1 };
        short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.add(shortArray12, 0, (short) (byte) 10);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray5, shortArray12);
        java.lang.Short[] shortArray19 = new java.lang.Short[] { (short) -1, (short) 0 };
        java.lang.Short[] shortArray20 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray19);
        short[] shortArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray20, (short) (byte) -1);
        org.apache.commons.lang3.ArrayUtils.shift(shortArray22, (int) (short) 0);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray5, shortArray22);
        java.util.Random random26 = null;
        org.apache.commons.lang3.ArrayUtils.shuffle(shortArray22, random26);
        short[] shortArray29 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray22, (short) 101);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] { (short) -1, (short) 10 });
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 1, (short) 1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray12, new short[] { (short) -1 });
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray15, new short[] { (short) 10, (short) -1 });
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray16, new short[] { (short) 1, (short) 1, (short) -1 });
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray19, new java.lang.Short[] { (short) -1, (short) 0 });
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray20, new java.lang.Short[] { (short) -1, (short) 0 });
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertArrayEquals(shortArray22, new short[] { (short) -1, (short) 0 });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertArrayEquals(shortArray29, new short[] { (short) -1, (short) 0 });
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 0 };
        java.lang.Short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray2);
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.addFirst(shortArray4, (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.add(shortArray4, 52, (short) 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new java.lang.Short[] { (short) -1, (short) 0 });
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertArrayEquals(shortArray3, new java.lang.Short[] { (short) -1, (short) 0 });
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray4, new short[] { (short) -1, (short) 0 });
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] { (short) -1, (short) -1, (short) 0 });
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        double[] doubleArray6 = new double[] { (byte) -1, (byte) 1, 100L, (byte) 10, 1L };
        double[] doubleArray9 = new double[] { (byte) 10, 1 };
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.insert(0, doubleArray6, doubleArray9);
        java.util.BitSet bitSet13 = org.apache.commons.lang3.ArrayUtils.indexesOf(doubleArray9, (double) (byte) 0, (double) 1);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray9, 100.0d, 5, (double) (byte) 10);
        double[] doubleArray24 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        double[] doubleArray25 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray24);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray25, (double) 100.0f);
        double[] doubleArray28 = org.apache.commons.lang3.ArrayUtils.removeElements(doubleArray9, doubleArray25);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray30 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray9, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 1.0d, 100.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 1.0d, (-1.0d), 1.0d, 100.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(bitSet13);
        org.junit.Assert.assertEquals(bitSet13.toString(), "{1}");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] {}, 1.0E-15);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "", "off", "-1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "off" + "'", str4, "off");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        java.lang.Long[] longArray7 = new java.lang.Long[] { 10L, (-1L), 0L, 1L, 0L, 10L };
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray7);
        int[] intArray13 = new int[] { (short) -1, (short) 100, (short) 10, (byte) -1 };
        int[] intArray15 = org.apache.commons.lang3.ArrayFill.fill(intArray13, (int) (byte) 10);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray15);
        int[] intArray18 = org.apache.commons.lang3.ArrayFill.fill(intArray15, 0);
        long[] longArray19 = org.apache.commons.lang3.ArrayUtils.removeAll(longArray8, intArray18);
        long[] longArray20 = null;
        long[] longArray21 = org.apache.commons.lang3.ArrayUtils.insert((int) (short) 0, longArray8, longArray20);
        int[] intArray27 = new int[] { '#', (short) 1, (byte) 100, (short) 1, 10 };
        org.apache.commons.lang3.ArrayUtils.reverse(intArray27, (int) (short) 1, (int) ' ');
        int[] intArray32 = org.apache.commons.lang3.ArrayUtils.add(intArray27, (int) (byte) 0);
        int[] intArray35 = org.apache.commons.lang3.ArrayUtils.subarray(intArray32, (int) '#', 2);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray32);
        int[] intArray42 = new int[] { (-1), 0, (short) 0, (byte) 0, (-1) };
        int[] intArray43 = org.apache.commons.lang3.ArrayUtils.clone(intArray42);
        int[] intArray44 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray43);
        int[] intArray46 = org.apache.commons.lang3.ArrayUtils.removeAllOccurences(intArray43, (int) (byte) -1);
        boolean boolean47 = org.apache.commons.lang3.ArrayUtils.containsAny(intArray32, intArray46);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray48 = org.apache.commons.lang3.ArrayUtils.removeAll(longArray21, intArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertArrayEquals(longArray7, new java.lang.Long[] { 10L, (-1L), 0L, 1L, 0L, 10L });
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] { 10L, (-1L), 0L, 1L, 0L, 10L });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 0, 0, 0, 0 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertArrayEquals(longArray19, new long[] { (-1L), 0L, 1L, 0L, 10L });
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertArrayEquals(longArray21, new long[] { 10L, (-1L), 0L, 1L, 0L, 10L });
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 35, 10, 1, 100, 1 });
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 35, 10, 1, 100, 1, 0 });
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { (-1), 0, 0, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { 0, 0, 0 });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        byte[][] byteArray0 = new byte[][] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray0);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[][] {});
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        java.lang.Double[] doubleArray0 = null;
        java.lang.Double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray0);
        double[] doubleArray8 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray8);
        double[] doubleArray10 = org.apache.commons.lang3.ArraySorter.sort(doubleArray8);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray10, (int) (short) 0, (-1));
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) doubleArray1, (java.lang.Object) (-1));
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new java.lang.Double[] {});
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        double[] doubleArray6 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray6);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray6, (double) 1L, (double) (short) -1);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray6, (double) 10L, (int) (byte) 1);
        org.apache.commons.lang3.ArrayUtils.swap(doubleArray6, (int) (short) 0, 2147483639);
        org.apache.commons.lang3.ArrayUtils.shuffle(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), (-1.0d), 1.0d, 10.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        long[] longArray3 = new long[] { (-1L), 'a', 0 };
        long[] longArray7 = new long[] { (-1L), 'a', 0 };
        long[] longArray11 = new long[] { (-1L), 'a', 0 };
        long[] longArray15 = new long[] { (-1L), 'a', 0 };
        long[] longArray19 = new long[] { (-1L), 'a', 0 };
        long[][] longArray20 = new long[][] { longArray3, longArray7, longArray11, longArray15, longArray19 };
        long[] longArray21 = org.apache.commons.lang3.ArrayUtils.concat(longArray20);
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray21, 0L, (int) (byte) 0);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertArrayEquals(longArray3, new long[] { (-1L), 97L, 0L });
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertArrayEquals(longArray7, new long[] { (-1L), 97L, 0L });
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { (-1L), 97L, 0L });
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertArrayEquals(longArray15, new long[] { (-1L), 97L, 0L });
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertArrayEquals(longArray19, new long[] { (-1L), 97L, 0L });
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertArrayEquals(longArray21, new long[] { (-1L), 97L, 0L, (-1L), 97L, 0L, (-1L), 97L, 0L, (-1L), 97L, 0L, (-1L), 97L, 0L });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        java.lang.Throwable[][] throwableArray1 = null;
        java.lang.Throwable throwable2 = null;
        java.lang.Throwable[] throwableArray3 = new java.lang.Throwable[] { throwable2 };
        java.lang.Throwable throwable4 = null;
        java.lang.Throwable[] throwableArray5 = new java.lang.Throwable[] { throwable4 };
        java.lang.Throwable throwable6 = null;
        java.lang.Throwable[] throwableArray7 = new java.lang.Throwable[] { throwable6 };
        java.lang.Throwable throwable8 = null;
        java.lang.Throwable[] throwableArray9 = new java.lang.Throwable[] { throwable8 };
        java.lang.Throwable throwable10 = null;
        java.lang.Throwable[] throwableArray11 = new java.lang.Throwable[] { throwable10 };
        java.lang.Throwable[][] throwableArray12 = new java.lang.Throwable[][] { throwableArray3, throwableArray5, throwableArray7, throwableArray9, throwableArray11 };
        java.lang.Throwable[][][] throwableArray13 = new java.lang.Throwable[][][] { throwableArray12 };
        java.lang.Throwable throwable15 = null;
        java.lang.Throwable[] throwableArray16 = new java.lang.Throwable[] { throwable15 };
        java.lang.Throwable throwable17 = null;
        java.lang.Throwable[] throwableArray18 = new java.lang.Throwable[] { throwable17 };
        java.lang.Throwable throwable19 = null;
        java.lang.Throwable[] throwableArray20 = new java.lang.Throwable[] { throwable19 };
        java.lang.Throwable throwable21 = null;
        java.lang.Throwable[] throwableArray22 = new java.lang.Throwable[] { throwable21 };
        java.lang.Throwable throwable23 = null;
        java.lang.Throwable[] throwableArray24 = new java.lang.Throwable[] { throwable23 };
        java.lang.Throwable throwable25 = null;
        java.lang.Throwable[] throwableArray26 = new java.lang.Throwable[] { throwable25 };
        java.lang.Throwable[][] throwableArray27 = new java.lang.Throwable[][] { throwableArray16, throwableArray18, throwableArray20, throwableArray22, throwableArray24, throwableArray26 };
        java.lang.Throwable[] throwableArray28 = org.apache.commons.lang3.ArrayUtils.EMPTY_THROWABLE_ARRAY;
        java.lang.Throwable[][] throwableArray29 = org.apache.commons.lang3.ArrayUtils.addFirst(throwableArray27, throwableArray28);
        java.lang.Throwable[][] throwableArray30 = org.apache.commons.lang3.ArrayUtils.get(throwableArray13, 0, throwableArray27);
        java.lang.Throwable[][] throwableArray31 = org.apache.commons.lang3.ArrayUtils.insert(10, throwableArray1, throwableArray27);
        double[] doubleArray38 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        double[] doubleArray39 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray38);
        double[] doubleArray40 = org.apache.commons.lang3.ArraySorter.sort(doubleArray38);
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray40);
        org.apache.commons.lang3.ArrayUtils.swap(doubleArray40, 0, (int) (short) 1, (int) (short) 0);
        double[] doubleArray47 = org.apache.commons.lang3.ArrayUtils.addFirst(doubleArray40, (double) 0);
        double[] doubleArray49 = org.apache.commons.lang3.ArrayUtils.removeAllOccurrences(doubleArray47, (double) 100L);
        java.util.BitSet bitSet52 = org.apache.commons.lang3.ArrayUtils.indexesOf(doubleArray47, (double) 0.0f, (int) (short) 11);
        int int53 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) throwableArray1, (java.lang.Object) (short) 11);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] { null });
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] { null });
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertArrayEquals(throwableArray7, new java.lang.Throwable[] { null });
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertArrayEquals(throwableArray9, new java.lang.Throwable[] { null });
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertArrayEquals(throwableArray11, new java.lang.Throwable[] { null });
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertArrayEquals(throwableArray16, new java.lang.Throwable[] { null });
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertArrayEquals(throwableArray18, new java.lang.Throwable[] { null });
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertArrayEquals(throwableArray20, new java.lang.Throwable[] { null });
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertArrayEquals(throwableArray22, new java.lang.Throwable[] { null });
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertArrayEquals(throwableArray24, new java.lang.Throwable[] { null });
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertArrayEquals(throwableArray26, new java.lang.Throwable[] { null });
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertArrayEquals(throwableArray28, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNull(throwableArray31);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 0.0d, (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 0.0d, (-1.0d), (-1.0d), (-1.0d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(bitSet52);
        org.junit.Assert.assertEquals(bitSet52.toString(), "{}");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
    }
}

