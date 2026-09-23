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

public class ZipArchiveInputStream_readDeflated_53837355950 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39329;
     Object term39336;
     Object term39338;

    public ZipArchiveInputStream_readDeflated_53837355950() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39329 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term39329, term39329.getClass(), "zipEncoding", null);
        setField(term39329, term39329.getClass(), "encoding", null);
        setBooleanField(term39329, term39329.getClass(), "useUnicodeExtraFields", false);
        setField(term39329, term39329.getClass(), "in", null);
        setField(term39329, term39329.getClass(), "inf", null);
        setField(term39329, term39329.getClass(), "buf", null);
        setField(term39329, term39329.getClass(), "current", null);
        setBooleanField(term39329, term39329.getClass(), "closed", false);
        setBooleanField(term39329, term39329.getClass(), "hitCentralDirectory", false);
        setField(term39329, term39329.getClass(), "lastStoredEntry", null);
        setBooleanField(term39329, term39329.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term39329, term39329.getClass(), "LFH_BUF", null);
        setField(term39329, term39329.getClass(), "SKIP_BUF", null);
        setField(term39329, term39329.getClass(), "SHORT_BUF", null);
        setField(term39329, term39329.getClass(), "WORD_BUF", null);
        setField(term39329, term39329.getClass(), "TWO_DWORD_BUF", null);
        setIntField(term39329, term39329.getClass(), "entriesRead", 0);
        setField(term39329, term39329.getClass(), "SINGLE", null);
        setLongField(term39329, term39329.getClass(), "bytesRead", 0L);
        term39336 = new Integer(0);
        term39338 = new Integer(0);
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
        args[1] = term39336;
        args[2] = term39338;
        callMethod(klass, "readDeflated", argTypes, term39329, args);
    }

};


