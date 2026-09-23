package org.apache.commons.compress.archivers.tar;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.io.IOException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TarArchiveOutputStream_close_191405504746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term445;

    public TarArchiveOutputStream_close_191405504746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term445 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term460 = (byte[]) newByteArray(8);
        byte[] term470 = (byte[]) newByteArray(6);
        byte[] term486 = (byte[]) newByteArray(2);
        setLongField(term445, term445.getClass(), "currSize", -6573104506744284592L);
        setField(term445, term445.getClass(), "currName", "RMFIsYGgne");
        setLongField(term445, term445.getClass(), "currBytes", -4920224193275732920L);
        setByteElement(term460, 0, (byte) -118);
        setByteElement(term460, 1, (byte) -126);
        setByteElement(term460, 2, (byte) -91);
        setByteElement(term460, 3, (byte) -104);
        setByteElement(term460, 4, (byte) -89);
        setByteElement(term460, 5, (byte) 13);
        setByteElement(term460, 6, (byte) 44);
        setByteElement(term460, 7, (byte) -63);
        setField(term445, term445.getClass(), "recordBuf", term460);
        setIntField(term445, term445.getClass(), "assemLen", 493620644);
        setByteElement(term470, 0, (byte) 15);
        setByteElement(term470, 1, (byte) 45);
        setByteElement(term470, 2, (byte) -39);
        setByteElement(term470, 3, (byte) -20);
        setByteElement(term470, 4, (byte) 10);
        setByteElement(term470, 5, (byte) 77);
        setField(term445, term445.getClass(), "assemBuf", term470);
        setIntField(term445, term445.getClass(), "longFileMode", 1328271830);
        setIntField(term445, term445.getClass(), "bigNumberMode", 1596070772);
        setIntField(term445, term445.getClass(), "recordsWritten", 97029295);
        setIntField(term445, term445.getClass(), "recordsPerBlock", -1371869594);
        setIntField(term445, term445.getClass(), "recordSize", -2095575670);
        setBooleanField(term445, term445.getClass(), "closed", false);
        setBooleanField(term445, term445.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term445, term445.getClass(), "finished", false);
        setField(term445, term445.getClass(), "out", null);
        setField(term445, term445.getClass(), "zipEncoding", null);
        setBooleanField(term445, term445.getClass(), "addPaxHeadersForNonAsciiNames", true);
        setByteElement(term486, 0, (byte) 14);
        setByteElement(term486, 1, (byte) -101);
        setField(term445, term445.getClass(), "oneByte", term486);
        setLongField(term445, term445.getClass(), "bytesWritten", 8428634514691209827L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term445, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


