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

public class ZipArchiveInputStream_checksig_101460020154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36100;

    public ZipArchiveInputStream_checksig_101460020154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36100 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term36100, term36100.getClass(), "zipEncoding", null);
        setBooleanField(term36100, term36100.getClass(), "useUnicodeExtraFields", false);
        setField(term36100, term36100.getClass(), "in", null);
        setField(term36100, term36100.getClass(), "inf", null);
        setField(term36100, term36100.getClass(), "buf", null);
        setField(term36100, term36100.getClass(), "current", null);
        setBooleanField(term36100, term36100.getClass(), "closed", false);
        setBooleanField(term36100, term36100.getClass(), "hitCentralDirectory", false);
        setField(term36100, term36100.getClass(), "lastStoredEntry", null);
        setBooleanField(term36100, term36100.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term36100, term36100.getClass(), "LFH_BUF", null);
        setField(term36100, term36100.getClass(), "SKIP_BUF", null);
        setField(term36100, term36100.getClass(), "SHORT_BUF", null);
        setField(term36100, term36100.getClass(), "WORD_BUF", null);
        setField(term36100, term36100.getClass(), "TWO_DWORD_BUF", null);
        setIntField(term36100, term36100.getClass(), "entriesRead", 0);
        setField(term36100, term36100.getClass(), "SINGLE", null);
        setLongField(term36100, term36100.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "checksig", argTypes, term36100, args);
    }

};


