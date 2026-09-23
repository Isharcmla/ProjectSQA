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

public class ZipArchiveInputStream_cacheBytesRead_164802635765 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38421;
     Object term38428;
     Object term38430;
     Object term38432;

    public ZipArchiveInputStream_cacheBytesRead_164802635765() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38421 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term38421, term38421.getClass(), "zipEncoding", null);
        setBooleanField(term38421, term38421.getClass(), "useUnicodeExtraFields", false);
        setField(term38421, term38421.getClass(), "in", null);
        setField(term38421, term38421.getClass(), "inf", null);
        setField(term38421, term38421.getClass(), "buf", null);
        setField(term38421, term38421.getClass(), "current", null);
        setBooleanField(term38421, term38421.getClass(), "closed", false);
        setBooleanField(term38421, term38421.getClass(), "hitCentralDirectory", false);
        setField(term38421, term38421.getClass(), "lastStoredEntry", null);
        setBooleanField(term38421, term38421.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term38421, term38421.getClass(), "LFH_BUF", null);
        setField(term38421, term38421.getClass(), "SKIP_BUF", null);
        setField(term38421, term38421.getClass(), "SHORT_BUF", null);
        setField(term38421, term38421.getClass(), "WORD_BUF", null);
        setField(term38421, term38421.getClass(), "TWO_DWORD_BUF", null);
        setIntField(term38421, term38421.getClass(), "entriesRead", 0);
        setField(term38421, term38421.getClass(), "SINGLE", null);
        setLongField(term38421, term38421.getClass(), "bytesRead", 0L);
        term38428 = new Integer(0);
        term38430 = new Integer(0);
        term38432 = new Integer(0);
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
        args[1] = term38428;
        args[2] = term38430;
        args[3] = term38432;
        callMethod(klass, "cacheBytesRead", argTypes, term38421, args);
    }

};


