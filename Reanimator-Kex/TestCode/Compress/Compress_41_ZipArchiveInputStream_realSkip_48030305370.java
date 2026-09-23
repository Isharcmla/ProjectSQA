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

public class ZipArchiveInputStream_realSkip_48030305370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39497;
     Object term39504;

    public ZipArchiveInputStream_realSkip_48030305370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39497 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term39497, term39497.getClass(), "zipEncoding", null);
        setField(term39497, term39497.getClass(), "encoding", null);
        setBooleanField(term39497, term39497.getClass(), "useUnicodeExtraFields", false);
        setField(term39497, term39497.getClass(), "in", null);
        setField(term39497, term39497.getClass(), "inf", null);
        setField(term39497, term39497.getClass(), "buf", null);
        setField(term39497, term39497.getClass(), "current", null);
        setBooleanField(term39497, term39497.getClass(), "closed", false);
        setBooleanField(term39497, term39497.getClass(), "hitCentralDirectory", false);
        setField(term39497, term39497.getClass(), "lastStoredEntry", null);
        setBooleanField(term39497, term39497.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term39497, term39497.getClass(), "LFH_BUF", null);
        setField(term39497, term39497.getClass(), "SKIP_BUF", null);
        setField(term39497, term39497.getClass(), "SHORT_BUF", null);
        setField(term39497, term39497.getClass(), "WORD_BUF", null);
        setField(term39497, term39497.getClass(), "TWO_DWORD_BUF", null);
        setIntField(term39497, term39497.getClass(), "entriesRead", 0);
        setField(term39497, term39497.getClass(), "SINGLE", null);
        setLongField(term39497, term39497.getClass(), "bytesRead", 0L);
        term39504 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term39504;
        callMethod(klass, "realSkip", argTypes, term39497, args);
    }

};


