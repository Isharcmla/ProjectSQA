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

public class ZipArchiveInputStream_pushback_76476699367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39472;
     Object term39479;
     Object term39481;

    public ZipArchiveInputStream_pushback_76476699367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39472 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term39472, term39472.getClass(), "zipEncoding", null);
        setField(term39472, term39472.getClass(), "encoding", null);
        setBooleanField(term39472, term39472.getClass(), "useUnicodeExtraFields", false);
        setField(term39472, term39472.getClass(), "in", null);
        setField(term39472, term39472.getClass(), "inf", null);
        setField(term39472, term39472.getClass(), "buf", null);
        setField(term39472, term39472.getClass(), "current", null);
        setBooleanField(term39472, term39472.getClass(), "closed", false);
        setBooleanField(term39472, term39472.getClass(), "hitCentralDirectory", false);
        setField(term39472, term39472.getClass(), "lastStoredEntry", null);
        setBooleanField(term39472, term39472.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term39472, term39472.getClass(), "LFH_BUF", null);
        setField(term39472, term39472.getClass(), "SKIP_BUF", null);
        setField(term39472, term39472.getClass(), "SHORT_BUF", null);
        setField(term39472, term39472.getClass(), "WORD_BUF", null);
        setField(term39472, term39472.getClass(), "TWO_DWORD_BUF", null);
        setIntField(term39472, term39472.getClass(), "entriesRead", 0);
        setField(term39472, term39472.getClass(), "SINGLE", null);
        setLongField(term39472, term39472.getClass(), "bytesRead", 0L);
        term39479 = new Integer(0);
        term39481 = new Integer(0);
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
        args[1] = term39479;
        args[2] = term39481;
        callMethod(klass, "pushback", argTypes, term39472, args);
    }

};


