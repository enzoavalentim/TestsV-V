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
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        java.lang.Iterable<java.lang.AutoCloseable> autoCloseableIterable0 = null;
        org.apache.commons.lang3.AutoCloseables.closeQuietly(autoCloseableIterable0);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        java.lang.AutoCloseable autoCloseable0 = null;
        org.apache.commons.lang3.AutoCloseables.closeQuietly(autoCloseable0);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        java.lang.AutoCloseable autoCloseable0 = null;
        java.util.function.Consumer<java.lang.Exception> exceptionConsumer1 = null;
        org.apache.commons.lang3.AutoCloseables.closeQuietly(autoCloseable0, exceptionConsumer1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        java.lang.AutoCloseable autoCloseable0 = null;
        org.apache.commons.lang3.function.FailableConsumer<java.lang.Exception, java.lang.Exception> exceptionFailableConsumer1 = null;
        org.apache.commons.lang3.AutoCloseables.close(autoCloseable0, exceptionFailableConsumer1);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test6");
        java.lang.AutoCloseable autoCloseable0 = null;
        org.apache.commons.lang3.AutoCloseables.close(autoCloseable0);
    }
}

