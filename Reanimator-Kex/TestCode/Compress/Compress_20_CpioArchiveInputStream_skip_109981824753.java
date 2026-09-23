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

public class CpioArchiveInputStream_skip_109981824753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25209;
     Object term25746;

    public CpioArchiveInputStream_skip_109981824753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25209 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        term25746 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        setBooleanField(term25746, term25746.getClass(), "closed", false);
        setField(term25746, term25746.getClass(), "entry", null);
        setLongField(term25746, term25746.getClass(), "entryBytesRead", 0L);
        setBooleanField(term25746, term25746.getClass(), "entryEOF", false);
        setField(term25746, term25746.getClass(), "tmpbuf", null);
        setLongField(term25746, term25746.getClass(), "crc", 0L);
        setField(term25746, term25746.getClass(), "in", null);
        setField(term25746, term25746.getClass(), "TWO_BYTES_BUF", null);
        setField(term25746, term25746.getClass(), "FOUR_BYTES_BUF", null);
        setField(term25746, term25746.getClass(), "SIX_BYTES_BUF", null);
        setIntField(term25746, term25746.getClass(), "blockSize", 0);
        setField(term25746, term25746.getClass(), "SINGLE", null);
        setLongField(term25746, term25746.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        callMethod(klass, "skip", argTypes, term25209, args);
        assertTrue(recursiveEquals(term25209, term25746));
    }

};


