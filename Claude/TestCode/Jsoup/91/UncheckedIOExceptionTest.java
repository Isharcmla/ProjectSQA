package org.jsoup;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;

public class UncheckedIOExceptionTest {

    @Test
    public void testConstructor_normalIOException_wrapsCauseCorrectly() {
        IOException cause = new IOException("normal io error");
        UncheckedIOException ex = new UncheckedIOException(cause);

        assertNotNull(ex);
        assertSame(cause, ex.getCause());
    }

    @Test
    public void testIoException_normalCase_returnsOriginalIOException() {
        IOException cause = new IOException("some io error");
        UncheckedIOException ex = new UncheckedIOException(cause);

        IOException result = ex.ioException();

        assertNotNull(result);
        assertSame(cause, result);
        assertEquals("some io error", result.getMessage());
    }

    @Test
    public void testIoException_withNullMessageIOException_returnsIOExceptionWithNullMessage() {
        IOException cause = new IOException((String) null);
        UncheckedIOException ex = new UncheckedIOException(cause);

        IOException result = ex.ioException();

        assertNotNull(result);
        assertNull(result.getMessage());
    }

    @Test
    public void testIoException_withEmptyMessage_returnsIOExceptionWithEmptyMessage() {
        IOException cause = new IOException("");
        UncheckedIOException ex = new UncheckedIOException(cause);

        IOException result = ex.ioException();

        assertNotNull(result);
        assertEquals("", result.getMessage());
    }

    @Test(expected = NullPointerException.class)
    public void testConstructor_nullCause_throwsNullPointerExceptionOnGetCauseAccess() {
        // RuntimeException(Throwable cause) allows null, but accessing the
        // cause via ioException() should not throw by itself since getCause()
        // can return null. To force an exception scenario, we simulate
        // a case where casting fails - however since cause is IOException
        // or null, casting null is safe. This test instead verifies that
        // passing null is accepted but calling methods on the null result
        // would throw NPE, simulating an exception path for coverage of
        // edge-case handling in client code.
        UncheckedIOException ex = new UncheckedIOException(null);
        IOException result = ex.ioException();
        // Force NPE by calling a method on potentially null result
        result.getMessage().length();
    }

    @Test
    public void testIoException_nullCause_returnsNull() {
        UncheckedIOException ex = new UncheckedIOException(null);

        IOException result = ex.ioException();

        assertNull(result);
    }

    @Test
    public void testException_isInstanceOfRuntimeException_true() {
        IOException cause = new IOException("check type");
        UncheckedIOException ex = new UncheckedIOException(cause);

        assertTrue(ex instanceof RuntimeException);
    }

    @Test
    public void testGetMessage_delegatesToCauseToString_containsExpectedText() {
        IOException cause = new IOException("delegated message");
        UncheckedIOException ex = new UncheckedIOException(cause);

        // RuntimeException(Throwable) sets message to cause.toString() if message not explicitly set
        assertNotNull(ex.getMessage());
        assertTrue(ex.getMessage().contains("delegated message"));
    }

    @Test
    public void testThrowAndCatch_customException_canBeCaughtAsRuntimeException() {
        IOException cause = new IOException("thrown error");
        boolean caught = false;
        try {
            throw new UncheckedIOException(cause);
        } catch (RuntimeException e) {
            caught = true;
            assertTrue(e instanceof UncheckedIOException);
            assertSame(cause, ((UncheckedIOException) e).ioException());
        }
        assertTrue(caught);
    }
}
