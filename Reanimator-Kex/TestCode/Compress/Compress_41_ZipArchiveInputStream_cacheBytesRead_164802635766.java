package org.apache.commons.compress.archivers.zip;

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
import static org.apache.commons.compress.archivers.zip.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ZipArchiveInputStream_cacheBytesRead_164802635766 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39459;
     Object term39466;
     Object term39468;
     Object term39470;

    public ZipArchiveInputStream_cacheBytesRead_164802635766() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39459 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term39459, term39459.getClass(), "zipEncoding", null);
        setField(term39459, term39459.getClass(), "encoding", null);
        setBooleanField(term39459, term39459.getClass(), "useUnicodeExtraFields", false);
        setField(term39459, term39459.getClass(), "in", null);
        setField(term39459, term39459.getClass(), "inf", null);
        setField(term39459, term39459.getClass(), "buf", null);
        setField(term39459, term39459.getClass(), "current", null);
        setBooleanField(term39459, term39459.getClass(), "closed", false);
        setBooleanField(term39459, term39459.getClass(), "hitCentralDirectory", false);
        setField(term39459, term39459.getClass(), "lastStoredEntry", null);
        setBooleanField(term39459, term39459.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term39459, term39459.getClass(), "LFH_BUF", null);
        setField(term39459, term39459.getClass(), "SKIP_BUF", null);
        setField(term39459, term39459.getClass(), "SHORT_BUF", null);
        setField(term39459, term39459.getClass(), "WORD_BUF", null);
        setField(term39459, term39459.getClass(), "TWO_DWORD_BUF", null);
        setIntField(term39459, term39459.getClass(), "entriesRead", 0);
        setField(term39459, term39459.getClass(), "SINGLE", null);
        setLongField(term39459, term39459.getClass(), "bytesRead", 0L);
        term39466 = new Integer(0);
        term39468 = new Integer(0);
        term39470 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.io.ByteArrayOutputStream");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term39466;
        args[2] = term39468;
        args[3] = term39470;
        callMethod(klass, "cacheBytesRead", argTypes, term39459, args);
    }

};


