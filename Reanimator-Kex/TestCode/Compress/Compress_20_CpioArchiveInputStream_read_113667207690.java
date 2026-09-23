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

public class CpioArchiveInputStream_read_113667207690 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41447;
     Object term41294;
     Object term41732;
     Object term41733;

    public CpioArchiveInputStream_read_113667207690() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41447 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        setBooleanField(term41447, term41447.getClass(), "closed", false);
        term41294 = (byte[]) newByteArray(0);
        term41732 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        setBooleanField(term41732, term41732.getClass(), "closed", false);
        setField(term41732, term41732.getClass(), "entry", null);
        setLongField(term41732, term41732.getClass(), "entryBytesRead", 0L);
        setBooleanField(term41732, term41732.getClass(), "entryEOF", false);
        setField(term41732, term41732.getClass(), "tmpbuf", null);
        setLongField(term41732, term41732.getClass(), "crc", 0L);
        setField(term41732, term41732.getClass(), "in", null);
        setField(term41732, term41732.getClass(), "TWO_BYTES_BUF", null);
        setField(term41732, term41732.getClass(), "FOUR_BYTES_BUF", null);
        setField(term41732, term41732.getClass(), "SIX_BYTES_BUF", null);
        setIntField(term41732, term41732.getClass(), "blockSize", 0);
        setField(term41732, term41732.getClass(), "SINGLE", null);
        setLongField(term41732, term41732.getClass(), "bytesRead", 0L);
        term41733 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term41294;
        args[1] = 0;
        args[2] = 0;
        Object retValue = callMethod(klass, "read", argTypes, term41447, args);
        assertTrue(recursiveEquals(term41447, term41732));
        assertTrue(recursiveEquals(term41294, term41733));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


