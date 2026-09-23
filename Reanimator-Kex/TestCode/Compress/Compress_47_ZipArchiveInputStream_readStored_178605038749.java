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

public class ZipArchiveInputStream_readStored_178605038749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62863;
     Object term62870;
     Object term62872;

    public ZipArchiveInputStream_readStored_178605038749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62863 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term62863, term62863.getClass(), "zipEncoding", null);
        setField(term62863, term62863.getClass(), "encoding", null);
        setBooleanField(term62863, term62863.getClass(), "useUnicodeExtraFields", false);
        setField(term62863, term62863.getClass(), "in", null);
        setField(term62863, term62863.getClass(), "inf", null);
        setField(term62863, term62863.getClass(), "buf", null);
        setField(term62863, term62863.getClass(), "current", null);
        setBooleanField(term62863, term62863.getClass(), "closed", false);
        setBooleanField(term62863, term62863.getClass(), "hitCentralDirectory", false);
        setField(term62863, term62863.getClass(), "lastStoredEntry", null);
        setBooleanField(term62863, term62863.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term62863, term62863.getClass(), "lfhBuf", null);
        setField(term62863, term62863.getClass(), "skipBuf", null);
        setField(term62863, term62863.getClass(), "shortBuf", null);
        setField(term62863, term62863.getClass(), "wordBuf", null);
        setField(term62863, term62863.getClass(), "twoDwordBuf", null);
        setIntField(term62863, term62863.getClass(), "entriesRead", 0);
        setField(term62863, term62863.getClass(), "single", null);
        setLongField(term62863, term62863.getClass(), "bytesRead", 0L);
        term62870 = new Integer(0);
        term62872 = new Integer(0);
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
        args[1] = term62870;
        args[2] = term62872;
        callMethod(klass, "readStored", argTypes, term62863, args);
    }

};


