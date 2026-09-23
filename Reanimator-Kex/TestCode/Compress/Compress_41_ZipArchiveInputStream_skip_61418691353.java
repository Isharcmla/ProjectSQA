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

public class ZipArchiveInputStream_skip_61418691353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39358;
     Object term39365;

    public ZipArchiveInputStream_skip_61418691353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39358 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term39358, term39358.getClass(), "zipEncoding", null);
        setField(term39358, term39358.getClass(), "encoding", null);
        setBooleanField(term39358, term39358.getClass(), "useUnicodeExtraFields", false);
        setField(term39358, term39358.getClass(), "in", null);
        setField(term39358, term39358.getClass(), "inf", null);
        setField(term39358, term39358.getClass(), "buf", null);
        setField(term39358, term39358.getClass(), "current", null);
        setBooleanField(term39358, term39358.getClass(), "closed", false);
        setBooleanField(term39358, term39358.getClass(), "hitCentralDirectory", false);
        setField(term39358, term39358.getClass(), "lastStoredEntry", null);
        setBooleanField(term39358, term39358.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term39358, term39358.getClass(), "LFH_BUF", null);
        setField(term39358, term39358.getClass(), "SKIP_BUF", null);
        setField(term39358, term39358.getClass(), "SHORT_BUF", null);
        setField(term39358, term39358.getClass(), "WORD_BUF", null);
        setField(term39358, term39358.getClass(), "TWO_DWORD_BUF", null);
        setIntField(term39358, term39358.getClass(), "entriesRead", 0);
        setField(term39358, term39358.getClass(), "SINGLE", null);
        setLongField(term39358, term39358.getClass(), "bytesRead", 0L);
        term39365 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term39365;
        callMethod(klass, "skip", argTypes, term39358, args);
    }

};


