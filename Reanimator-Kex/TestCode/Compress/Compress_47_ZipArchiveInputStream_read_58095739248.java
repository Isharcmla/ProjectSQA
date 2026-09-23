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

public class ZipArchiveInputStream_read_58095739248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62852;
     Object term62859;
     Object term62861;

    public ZipArchiveInputStream_read_58095739248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62852 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term62852, term62852.getClass(), "zipEncoding", null);
        setField(term62852, term62852.getClass(), "encoding", null);
        setBooleanField(term62852, term62852.getClass(), "useUnicodeExtraFields", false);
        setField(term62852, term62852.getClass(), "in", null);
        setField(term62852, term62852.getClass(), "inf", null);
        setField(term62852, term62852.getClass(), "buf", null);
        setField(term62852, term62852.getClass(), "current", null);
        setBooleanField(term62852, term62852.getClass(), "closed", false);
        setBooleanField(term62852, term62852.getClass(), "hitCentralDirectory", false);
        setField(term62852, term62852.getClass(), "lastStoredEntry", null);
        setBooleanField(term62852, term62852.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term62852, term62852.getClass(), "lfhBuf", null);
        setField(term62852, term62852.getClass(), "skipBuf", null);
        setField(term62852, term62852.getClass(), "shortBuf", null);
        setField(term62852, term62852.getClass(), "wordBuf", null);
        setField(term62852, term62852.getClass(), "twoDwordBuf", null);
        setIntField(term62852, term62852.getClass(), "entriesRead", 0);
        setField(term62852, term62852.getClass(), "single", null);
        setLongField(term62852, term62852.getClass(), "bytesRead", 0L);
        term62859 = new Integer(0);
        term62861 = new Integer(0);
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
        args[1] = term62859;
        args[2] = term62861;
        callMethod(klass, "read", argTypes, term62852, args);
    }

};


