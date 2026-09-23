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

public class ZipArchiveInputStream_cacheBytesRead_164802635764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36176;
     Object term36183;
     Object term36185;
     Object term36187;

    public ZipArchiveInputStream_cacheBytesRead_164802635764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36176 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term36176, term36176.getClass(), "zipEncoding", null);
        setBooleanField(term36176, term36176.getClass(), "useUnicodeExtraFields", false);
        setField(term36176, term36176.getClass(), "in", null);
        setField(term36176, term36176.getClass(), "inf", null);
        setField(term36176, term36176.getClass(), "buf", null);
        setField(term36176, term36176.getClass(), "current", null);
        setBooleanField(term36176, term36176.getClass(), "closed", false);
        setBooleanField(term36176, term36176.getClass(), "hitCentralDirectory", false);
        setField(term36176, term36176.getClass(), "lastStoredEntry", null);
        setBooleanField(term36176, term36176.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term36176, term36176.getClass(), "LFH_BUF", null);
        setField(term36176, term36176.getClass(), "SKIP_BUF", null);
        setField(term36176, term36176.getClass(), "SHORT_BUF", null);
        setField(term36176, term36176.getClass(), "WORD_BUF", null);
        setField(term36176, term36176.getClass(), "TWO_DWORD_BUF", null);
        setIntField(term36176, term36176.getClass(), "entriesRead", 0);
        setField(term36176, term36176.getClass(), "SINGLE", null);
        setLongField(term36176, term36176.getClass(), "bytesRead", 0L);
        term36183 = new Integer(0);
        term36185 = new Integer(0);
        term36187 = new Integer(0);
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
        args[1] = term36183;
        args[2] = term36185;
        args[3] = term36187;
        callMethod(klass, "cacheBytesRead", argTypes, term36176, args);
    }

};


