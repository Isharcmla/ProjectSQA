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

public class ZipArchiveInputStream_bufferContainsSignature_130563224163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36163;
     Object term36170;
     Object term36172;
     Object term36174;

    public ZipArchiveInputStream_bufferContainsSignature_130563224163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36163 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term36163, term36163.getClass(), "zipEncoding", null);
        setBooleanField(term36163, term36163.getClass(), "useUnicodeExtraFields", false);
        setField(term36163, term36163.getClass(), "in", null);
        setField(term36163, term36163.getClass(), "inf", null);
        setField(term36163, term36163.getClass(), "buf", null);
        setField(term36163, term36163.getClass(), "current", null);
        setBooleanField(term36163, term36163.getClass(), "closed", false);
        setBooleanField(term36163, term36163.getClass(), "hitCentralDirectory", false);
        setField(term36163, term36163.getClass(), "lastStoredEntry", null);
        setBooleanField(term36163, term36163.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term36163, term36163.getClass(), "LFH_BUF", null);
        setField(term36163, term36163.getClass(), "SKIP_BUF", null);
        setField(term36163, term36163.getClass(), "SHORT_BUF", null);
        setField(term36163, term36163.getClass(), "WORD_BUF", null);
        setField(term36163, term36163.getClass(), "TWO_DWORD_BUF", null);
        setIntField(term36163, term36163.getClass(), "entriesRead", 0);
        setField(term36163, term36163.getClass(), "SINGLE", null);
        setLongField(term36163, term36163.getClass(), "bytesRead", 0L);
        term36170 = new Integer(0);
        term36172 = new Integer(0);
        term36174 = new Integer(0);
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
        args[1] = term36170;
        args[2] = term36172;
        args[3] = term36174;
        callMethod(klass, "bufferContainsSignature", argTypes, term36163, args);
    }

};


