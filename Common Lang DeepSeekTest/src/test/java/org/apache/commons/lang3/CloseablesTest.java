package org.apache.commons.lang3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

import org.junit.jupiter.api.Test;

class CodexGeneratedAutoCloseablesTest {

    @Test
    void closeIsNullSafeAndPropagatesExceptions() throws Exception {
        final AtomicInteger calls = new AtomicInteger();
        AutoCloseables.close((AutoCloseable) null);
        AutoCloseables.close(calls::incrementAndGet);
        assertEquals(1, calls.get());

        final IOException thrown = assertThrows(IOException.class, () -> AutoCloseables.close(() -> {
            throw new IOException("boom");
        }));
        assertEquals("boom", thrown.getMessage());
    }

    @Test
    void closeWithConsumerReceivesThrownException() throws Exception {
        final AtomicReference<Exception> captured = new AtomicReference<>();
        AutoCloseables.close(() -> {
            throw new Exception("handled");
        }, captured::set);

        assertEquals("handled", captured.get().getMessage());
    }

    @Test
    void quietCloseIgnoresOrConsumesExceptionsAndCanSuppressCloseableFailure() {
        final AtomicInteger calls = new AtomicInteger();
        AutoCloseables.closeQuietly((AutoCloseable) null);
        AutoCloseables.closeQuietly((AutoCloseable) calls::incrementAndGet);
        AutoCloseables.closeQuietly(Arrays.asList((AutoCloseable) calls::incrementAndGet, null));
        assertEquals(2, calls.get());

        final AtomicReference<Exception> captured = new AtomicReference<>();
        AutoCloseables.closeQuietly((AutoCloseable) () -> {
            throw new Exception("quiet");
        }, captured::set);
        assertEquals("quiet", captured.get().getMessage());

        final IllegalStateException original = new IllegalStateException("original");
        final Closeable failing = () -> {
            throw new IOException("suppressed");
        };
        assertSame(original, AutoCloseables.closeQuietlySuppress(failing, original));
        assertEquals(1, original.getSuppressed().length);
    }
}
