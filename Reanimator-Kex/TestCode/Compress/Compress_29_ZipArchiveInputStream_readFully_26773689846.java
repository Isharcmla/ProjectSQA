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

public class ZipArchiveInputStream_readFully_26773689846 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38262;

    public ZipArchiveInputStream_readFully_26773689846() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38262 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term38262, term38262.getClass(), "zipEncoding", null);
        setBooleanField(term38262, term38262.getClass(), "useUnicodeExtraFields", false);
        setField(term38262, term38262.getClass(), "in", null);
        setField(term38262, term38262.getClass(), "inf", null);
        setField(term38262, term38262.getClass(), "buf", null);
        setField(term38262, term38262.getClass(), "current", null);
        setBooleanField(term38262, term38262.getClass(), "closed", false);
        setBooleanField(term38262, term38262.getClass(), "hitCentralDirectory", false);
        setField(term38262, term38262.getClass(), "lastStoredEntry", null);
        setBooleanField(term38262, term38262.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term38262, term38262.getClass(), "LFH_BUF", null);
        setField(term38262, term38262.getClass(), "SKIP_BUF", null);
        setField(term38262, term38262.getClass(), "SHORT_BUF", null);
        setField(term38262, term38262.getClass(), "WORD_BUF", null);
        setField(term38262, term38262.getClass(), "TWO_DWORD_BUF", null);
        setIntField(term38262, term38262.getClass(), "entriesRead", 0);
        setField(term38262, term38262.getClass(), "SINGLE", null);
        setLongField(term38262, term38262.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "readFully", argTypes, term38262, args);
    }

};


