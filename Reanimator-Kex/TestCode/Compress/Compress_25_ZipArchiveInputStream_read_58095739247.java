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

public class ZipArchiveInputStream_read_58095739247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36031;
     Object term36038;
     Object term36040;

    public ZipArchiveInputStream_read_58095739247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36031 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term36031, term36031.getClass(), "zipEncoding", null);
        setBooleanField(term36031, term36031.getClass(), "useUnicodeExtraFields", false);
        setField(term36031, term36031.getClass(), "in", null);
        setField(term36031, term36031.getClass(), "inf", null);
        setField(term36031, term36031.getClass(), "buf", null);
        setField(term36031, term36031.getClass(), "current", null);
        setBooleanField(term36031, term36031.getClass(), "closed", false);
        setBooleanField(term36031, term36031.getClass(), "hitCentralDirectory", false);
        setField(term36031, term36031.getClass(), "lastStoredEntry", null);
        setBooleanField(term36031, term36031.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term36031, term36031.getClass(), "LFH_BUF", null);
        setField(term36031, term36031.getClass(), "SKIP_BUF", null);
        setField(term36031, term36031.getClass(), "SHORT_BUF", null);
        setField(term36031, term36031.getClass(), "WORD_BUF", null);
        setField(term36031, term36031.getClass(), "TWO_DWORD_BUF", null);
        setIntField(term36031, term36031.getClass(), "entriesRead", 0);
        setField(term36031, term36031.getClass(), "SINGLE", null);
        setLongField(term36031, term36031.getClass(), "bytesRead", 0L);
        term36038 = new Integer(0);
        term36040 = new Integer(0);
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
        args[1] = term36038;
        args[2] = term36040;
        callMethod(klass, "read", argTypes, term36031, args);
    }

};


