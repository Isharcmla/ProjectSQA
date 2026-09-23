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
import static org.apache.commons.compress.archivers.cpio.EqualityUtils.*;

public class CpioArchiveInputStream_close_66727569660 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26568;
     Object term26577;

    public CpioArchiveInputStream_close_66727569660() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26568 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        setBooleanField(term26568, term26568.getClass(), "closed", true);
        term26577 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        setBooleanField(term26577, term26577.getClass(), "closed", true);
        setField(term26577, term26577.getClass(), "entry", null);
        setLongField(term26577, term26577.getClass(), "entryBytesRead", 0L);
        setBooleanField(term26577, term26577.getClass(), "entryEOF", false);
        setField(term26577, term26577.getClass(), "tmpbuf", null);
        setLongField(term26577, term26577.getClass(), "crc", 0L);
        setField(term26577, term26577.getClass(), "in", null);
        setField(term26577, term26577.getClass(), "TWO_BYTES_BUF", null);
        setField(term26577, term26577.getClass(), "FOUR_BYTES_BUF", null);
        setField(term26577, term26577.getClass(), "SIX_BYTES_BUF", null);
        setIntField(term26577, term26577.getClass(), "blockSize", 0);
        setField(term26577, term26577.getClass(), "SINGLE", null);
        setLongField(term26577, term26577.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term26568, args);
        assertTrue(recursiveEquals(term26568, term26577));
    }

};


