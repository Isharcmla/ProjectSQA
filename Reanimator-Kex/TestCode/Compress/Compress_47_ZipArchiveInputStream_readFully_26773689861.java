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

public class ZipArchiveInputStream_readFully_26773689861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62963;

    public ZipArchiveInputStream_readFully_26773689861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62963 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term62963, term62963.getClass(), "zipEncoding", null);
        setField(term62963, term62963.getClass(), "encoding", null);
        setBooleanField(term62963, term62963.getClass(), "useUnicodeExtraFields", false);
        setField(term62963, term62963.getClass(), "in", null);
        setField(term62963, term62963.getClass(), "inf", null);
        setField(term62963, term62963.getClass(), "buf", null);
        setField(term62963, term62963.getClass(), "current", null);
        setBooleanField(term62963, term62963.getClass(), "closed", false);
        setBooleanField(term62963, term62963.getClass(), "hitCentralDirectory", false);
        setField(term62963, term62963.getClass(), "lastStoredEntry", null);
        setBooleanField(term62963, term62963.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term62963, term62963.getClass(), "lfhBuf", null);
        setField(term62963, term62963.getClass(), "skipBuf", null);
        setField(term62963, term62963.getClass(), "shortBuf", null);
        setField(term62963, term62963.getClass(), "wordBuf", null);
        setField(term62963, term62963.getClass(), "twoDwordBuf", null);
        setIntField(term62963, term62963.getClass(), "entriesRead", 0);
        setField(term62963, term62963.getClass(), "single", null);
        setLongField(term62963, term62963.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "readFully", argTypes, term62963, args);
    }

};


