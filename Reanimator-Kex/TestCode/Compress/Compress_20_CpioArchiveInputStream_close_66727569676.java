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
import java.lang.Object;

public class CpioArchiveInputStream_close_66727569676 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34946;
     Object term35106;

    public CpioArchiveInputStream_close_66727569676() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34946 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        Object term35082 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        setBooleanField(term34946, term34946.getClass(), "closed", false);
        setBooleanField(term35082, term35082.getClass(), "closed", true);
        setField(term34946, term34946.getClass(), "in", term35082);
        term35106 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        Object term35107 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        setBooleanField(term35106, term35106.getClass(), "closed", true);
        setField(term35106, term35106.getClass(), "entry", null);
        setLongField(term35106, term35106.getClass(), "entryBytesRead", 0L);
        setBooleanField(term35106, term35106.getClass(), "entryEOF", false);
        setField(term35106, term35106.getClass(), "tmpbuf", null);
        setLongField(term35106, term35106.getClass(), "crc", 0L);
        setBooleanField(term35107, term35107.getClass(), "closed", true);
        setField(term35107, term35107.getClass(), "entry", null);
        setLongField(term35107, term35107.getClass(), "entryBytesRead", 0L);
        setBooleanField(term35107, term35107.getClass(), "entryEOF", false);
        setField(term35107, term35107.getClass(), "tmpbuf", null);
        setLongField(term35107, term35107.getClass(), "crc", 0L);
        setField(term35107, term35107.getClass(), "in", null);
        setField(term35107, term35107.getClass(), "TWO_BYTES_BUF", null);
        setField(term35107, term35107.getClass(), "FOUR_BYTES_BUF", null);
        setField(term35107, term35107.getClass(), "SIX_BYTES_BUF", null);
        setIntField(term35107, term35107.getClass(), "blockSize", 0);
        setField(term35107, term35107.getClass(), "SINGLE", null);
        setLongField(term35107, term35107.getClass(), "bytesRead", 0L);
        setField(term35106, term35106.getClass(), "in", term35107);
        setField(term35106, term35106.getClass(), "TWO_BYTES_BUF", null);
        setField(term35106, term35106.getClass(), "FOUR_BYTES_BUF", null);
        setField(term35106, term35106.getClass(), "SIX_BYTES_BUF", null);
        setIntField(term35106, term35106.getClass(), "blockSize", 0);
        setField(term35106, term35106.getClass(), "SINGLE", null);
        setLongField(term35106, term35106.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term34946, args);
        assertTrue(recursiveEquals(term34946, term35106));
    }

};


