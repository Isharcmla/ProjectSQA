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

public class ZipArchiveInputStream_matches_212931810754 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62912;
     Object term62919;

    public ZipArchiveInputStream_matches_212931810754() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62912 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term62912, term62912.getClass(), "zipEncoding", null);
        setField(term62912, term62912.getClass(), "encoding", null);
        setBooleanField(term62912, term62912.getClass(), "useUnicodeExtraFields", false);
        setField(term62912, term62912.getClass(), "in", null);
        setField(term62912, term62912.getClass(), "inf", null);
        setField(term62912, term62912.getClass(), "buf", null);
        setField(term62912, term62912.getClass(), "current", null);
        setBooleanField(term62912, term62912.getClass(), "closed", false);
        setBooleanField(term62912, term62912.getClass(), "hitCentralDirectory", false);
        setField(term62912, term62912.getClass(), "lastStoredEntry", null);
        setBooleanField(term62912, term62912.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term62912, term62912.getClass(), "lfhBuf", null);
        setField(term62912, term62912.getClass(), "skipBuf", null);
        setField(term62912, term62912.getClass(), "shortBuf", null);
        setField(term62912, term62912.getClass(), "wordBuf", null);
        setField(term62912, term62912.getClass(), "twoDwordBuf", null);
        setIntField(term62912, term62912.getClass(), "entriesRead", 0);
        setField(term62912, term62912.getClass(), "single", null);
        setLongField(term62912, term62912.getClass(), "bytesRead", 0L);
        term62919 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term62919;
        callMethod(klass, "matches", argTypes, term62912, args);
    }

};


