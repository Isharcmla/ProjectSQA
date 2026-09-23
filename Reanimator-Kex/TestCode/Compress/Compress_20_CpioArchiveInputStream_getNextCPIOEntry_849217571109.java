package org.apache.commons.compress.archivers.cpio;

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
import static org.apache.commons.compress.archivers.cpio.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CpioArchiveInputStream_getNextCPIOEntry_849217571109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47526;

    public CpioArchiveInputStream_getNextCPIOEntry_849217571109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47526 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        Object term47650 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term47301 = (byte[]) newByteArray(8);
        byte[] term47323 = (byte[]) newByteArray(8);
        setBooleanField(term47526, term47526.getClass(), "closed", false);
        setLongField(term47650, term47650.getClass(), "filesize", 0L);
        setIntField(term47650, term47650.getClass(), "alignmentBoundary", 0);
        setShortField(term47650, term47650.getClass(), "fileFormat", (short) 0);
        setField(term47526, term47526.getClass(), "entry", term47650);
        setField(term47526, term47526.getClass(), "tmpbuf", term47301);
        setBooleanField(term47526, term47526.getClass(), "entryEOF", false);
        setLongField(term47526, term47526.getClass(), "entryBytesRead", 0L);
        setField(term47526, term47526.getClass(), "TWO_BYTES_BUF", term47323);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNextCPIOEntry", argTypes, term47526, args);
    }

};


