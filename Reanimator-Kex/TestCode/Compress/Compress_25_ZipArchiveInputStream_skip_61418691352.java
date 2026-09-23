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
import java.lang.Long;

public class ZipArchiveInputStream_skip_61418691352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36082;
     Object term36089;

    public ZipArchiveInputStream_skip_61418691352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36082 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term36082, term36082.getClass(), "zipEncoding", null);
        setBooleanField(term36082, term36082.getClass(), "useUnicodeExtraFields", false);
        setField(term36082, term36082.getClass(), "in", null);
        setField(term36082, term36082.getClass(), "inf", null);
        setField(term36082, term36082.getClass(), "buf", null);
        setField(term36082, term36082.getClass(), "current", null);
        setBooleanField(term36082, term36082.getClass(), "closed", false);
        setBooleanField(term36082, term36082.getClass(), "hitCentralDirectory", false);
        setField(term36082, term36082.getClass(), "lastStoredEntry", null);
        setBooleanField(term36082, term36082.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term36082, term36082.getClass(), "LFH_BUF", null);
        setField(term36082, term36082.getClass(), "SKIP_BUF", null);
        setField(term36082, term36082.getClass(), "SHORT_BUF", null);
        setField(term36082, term36082.getClass(), "WORD_BUF", null);
        setField(term36082, term36082.getClass(), "TWO_DWORD_BUF", null);
        setIntField(term36082, term36082.getClass(), "entriesRead", 0);
        setField(term36082, term36082.getClass(), "SINGLE", null);
        setLongField(term36082, term36082.getClass(), "bytesRead", 0L);
        term36089 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term36089;
        callMethod(klass, "skip", argTypes, term36082, args);
    }

};


