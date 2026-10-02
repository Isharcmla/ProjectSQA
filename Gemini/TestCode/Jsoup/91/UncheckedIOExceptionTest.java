package org.jsoup;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class UncheckedIOExceptionTest {

    @Test
    public void constructor_withValidIOException_setsCauseCorrectly() {
        IOException cause = new IOException("Disk read error");
        UncheckedIOException exception = new UncheckedIOException(cause);

        assertEquals("java.io.IOException: Disk read error", exception.getMessage());
        assertSame(cause, exception.getCause());
    }

    @Test
    public void ioException_withValidIOException_returnsSameInstance() {
        IOException cause = new IOException("Network connection error");
        UncheckedIOException exception = new UncheckedIOException(cause);

        IOException result = exception.ioException();

        assertNotNull(result);
        assertSame(cause, result);
        assertEquals("Network connection error", result.getMessage());
    }

    @Test
    public void ioException_withIOExceptionSubclass_returnsSameSubclassInstance() {
        FileNotFoundException cause = new FileNotFoundException("config.xml not found");
        UncheckedIOException exception = new UncheckedIOException(cause);

        IOException result = exception.ioException();

        assertNotNull(result);
        assertTrue(result instanceof FileNotFoundException);
        assertSame(cause, result);
        assertEquals("config.xml not found", result.getMessage());
    }

    @Test
    public void constructor_withNullCause_setsCauseToNull() {
        UncheckedIOException exception = new UncheckedIOException(null);

        assertNull(exception.getCause());
    }

    @Test
    public void ioException_withNullCause_returnsNull() {
        UncheckedIOException exception = new UncheckedIOException(null);

        IOException result = exception.ioException();

        assertNull(result);
    }

    @Test(expected = UncheckedIOException.class)
    public void uncheckedIOException_throwAsRuntimeException_caughtAsUncheckedIOException() {
        throw new UncheckedIOException(new EOFException("Unexpected end of stream"));
    }

    @Test
    public void uncheckedIOException_isInstanceOfRuntimeException() {
        UncheckedIOException exception = new UncheckedIOException(new IOException());

        assertTrue(exception instanceof RuntimeException);
    }
}
