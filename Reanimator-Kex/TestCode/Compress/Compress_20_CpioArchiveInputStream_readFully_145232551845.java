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

public class CpioArchiveInputStream_readFully_145232551845 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23592;
     Object term24211;

    public CpioArchiveInputStream_readFully_145232551845() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23592 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        term24211 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        setBooleanField(term24211, term24211.getClass(), "closed", false);
        setField(term24211, term24211.getClass(), "entry", null);
        setLongField(term24211, term24211.getClass(), "entryBytesRead", 0L);
        setBooleanField(term24211, term24211.getClass(), "entryEOF", false);
        setField(term24211, term24211.getClass(), "tmpbuf", null);
        setLongField(term24211, term24211.getClass(), "crc", 0L);
        setField(term24211, term24211.getClass(), "in", null);
        setField(term24211, term24211.getClass(), "TWO_BYTES_BUF", null);
        setField(term24211, term24211.getClass(), "FOUR_BYTES_BUF", null);
        setField(term24211, term24211.getClass(), "SIX_BYTES_BUF", null);
        setIntField(term24211, term24211.getClass(), "blockSize", 0);
        setField(term24211, term24211.getClass(), "SINGLE", null);
        setLongField(term24211, term24211.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = 0;
        args[2] = 0;
        Object retValue = callMethod(klass, "readFully", argTypes, term23592, args);
        assertTrue(recursiveEquals(term23592, term24211));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


