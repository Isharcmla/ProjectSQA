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

public class ZipArchiveInputStream_bufferContainsSignature_130563224148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38276;
     Object term38283;
     Object term38285;
     Object term38287;

    public ZipArchiveInputStream_bufferContainsSignature_130563224148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38276 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term38276, term38276.getClass(), "zipEncoding", null);
        setBooleanField(term38276, term38276.getClass(), "useUnicodeExtraFields", false);
        setField(term38276, term38276.getClass(), "in", null);
        setField(term38276, term38276.getClass(), "inf", null);
        setField(term38276, term38276.getClass(), "buf", null);
        setField(term38276, term38276.getClass(), "current", null);
        setBooleanField(term38276, term38276.getClass(), "closed", false);
        setBooleanField(term38276, term38276.getClass(), "hitCentralDirectory", false);
        setField(term38276, term38276.getClass(), "lastStoredEntry", null);
        setBooleanField(term38276, term38276.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term38276, term38276.getClass(), "LFH_BUF", null);
        setField(term38276, term38276.getClass(), "SKIP_BUF", null);
        setField(term38276, term38276.getClass(), "SHORT_BUF", null);
        setField(term38276, term38276.getClass(), "WORD_BUF", null);
        setField(term38276, term38276.getClass(), "TWO_DWORD_BUF", null);
        setIntField(term38276, term38276.getClass(), "entriesRead", 0);
        setField(term38276, term38276.getClass(), "SINGLE", null);
        setLongField(term38276, term38276.getClass(), "bytesRead", 0L);
        term38283 = new Integer(0);
        term38285 = new Integer(0);
        term38287 = new Integer(0);
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
        args[1] = term38283;
        args[2] = term38285;
        args[3] = term38287;
        callMethod(klass, "bufferContainsSignature", argTypes, term38276, args);
    }

};


