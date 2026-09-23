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

public class ZipArchiveInputStream_readFromInflater_114083436351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62885;
     Object term62892;
     Object term62894;

    public ZipArchiveInputStream_readFromInflater_114083436351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62885 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term62885, term62885.getClass(), "zipEncoding", null);
        setField(term62885, term62885.getClass(), "encoding", null);
        setBooleanField(term62885, term62885.getClass(), "useUnicodeExtraFields", false);
        setField(term62885, term62885.getClass(), "in", null);
        setField(term62885, term62885.getClass(), "inf", null);
        setField(term62885, term62885.getClass(), "buf", null);
        setField(term62885, term62885.getClass(), "current", null);
        setBooleanField(term62885, term62885.getClass(), "closed", false);
        setBooleanField(term62885, term62885.getClass(), "hitCentralDirectory", false);
        setField(term62885, term62885.getClass(), "lastStoredEntry", null);
        setBooleanField(term62885, term62885.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term62885, term62885.getClass(), "lfhBuf", null);
        setField(term62885, term62885.getClass(), "skipBuf", null);
        setField(term62885, term62885.getClass(), "shortBuf", null);
        setField(term62885, term62885.getClass(), "wordBuf", null);
        setField(term62885, term62885.getClass(), "twoDwordBuf", null);
        setIntField(term62885, term62885.getClass(), "entriesRead", 0);
        setField(term62885, term62885.getClass(), "single", null);
        setLongField(term62885, term62885.getClass(), "bytesRead", 0L);
        term62892 = new Integer(0);
        term62894 = new Integer(0);
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
        args[1] = term62892;
        args[2] = term62894;
        callMethod(klass, "readFromInflater", argTypes, term62885, args);
    }

};


