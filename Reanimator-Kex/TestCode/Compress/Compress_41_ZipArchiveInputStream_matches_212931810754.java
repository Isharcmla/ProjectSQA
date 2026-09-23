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

public class ZipArchiveInputStream_matches_212931810754 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39367;
     Object term39374;

    public ZipArchiveInputStream_matches_212931810754() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39367 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term39367, term39367.getClass(), "zipEncoding", null);
        setField(term39367, term39367.getClass(), "encoding", null);
        setBooleanField(term39367, term39367.getClass(), "useUnicodeExtraFields", false);
        setField(term39367, term39367.getClass(), "in", null);
        setField(term39367, term39367.getClass(), "inf", null);
        setField(term39367, term39367.getClass(), "buf", null);
        setField(term39367, term39367.getClass(), "current", null);
        setBooleanField(term39367, term39367.getClass(), "closed", false);
        setBooleanField(term39367, term39367.getClass(), "hitCentralDirectory", false);
        setField(term39367, term39367.getClass(), "lastStoredEntry", null);
        setBooleanField(term39367, term39367.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term39367, term39367.getClass(), "LFH_BUF", null);
        setField(term39367, term39367.getClass(), "SKIP_BUF", null);
        setField(term39367, term39367.getClass(), "SHORT_BUF", null);
        setField(term39367, term39367.getClass(), "WORD_BUF", null);
        setField(term39367, term39367.getClass(), "TWO_DWORD_BUF", null);
        setIntField(term39367, term39367.getClass(), "entriesRead", 0);
        setField(term39367, term39367.getClass(), "SINGLE", null);
        setLongField(term39367, term39367.getClass(), "bytesRead", 0L);
        term39374 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term39374;
        callMethod(klass, "matches", argTypes, term39367, args);
    }

};


