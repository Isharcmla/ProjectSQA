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

public class ZipArchiveInputStream_readDeflated_53837355949 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36053;
     Object term36060;
     Object term36062;

    public ZipArchiveInputStream_readDeflated_53837355949() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36053 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term36053, term36053.getClass(), "zipEncoding", null);
        setBooleanField(term36053, term36053.getClass(), "useUnicodeExtraFields", false);
        setField(term36053, term36053.getClass(), "in", null);
        setField(term36053, term36053.getClass(), "inf", null);
        setField(term36053, term36053.getClass(), "buf", null);
        setField(term36053, term36053.getClass(), "current", null);
        setBooleanField(term36053, term36053.getClass(), "closed", false);
        setBooleanField(term36053, term36053.getClass(), "hitCentralDirectory", false);
        setField(term36053, term36053.getClass(), "lastStoredEntry", null);
        setBooleanField(term36053, term36053.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term36053, term36053.getClass(), "LFH_BUF", null);
        setField(term36053, term36053.getClass(), "SKIP_BUF", null);
        setField(term36053, term36053.getClass(), "SHORT_BUF", null);
        setField(term36053, term36053.getClass(), "WORD_BUF", null);
        setField(term36053, term36053.getClass(), "TWO_DWORD_BUF", null);
        setIntField(term36053, term36053.getClass(), "entriesRead", 0);
        setField(term36053, term36053.getClass(), "SINGLE", null);
        setLongField(term36053, term36053.getClass(), "bytesRead", 0L);
        term36060 = new Integer(0);
        term36062 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term36060;
        args[2] = term36062;
        callMethod(klass, "readDeflated", argTypes, term36053, args);
    }

};


