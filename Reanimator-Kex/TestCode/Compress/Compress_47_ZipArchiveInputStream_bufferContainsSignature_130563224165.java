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

public class ZipArchiveInputStream_bufferContainsSignature_130563224165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62991;
     Object term62998;
     Object term63000;
     Object term63002;

    public ZipArchiveInputStream_bufferContainsSignature_130563224165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62991 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term62991, term62991.getClass(), "zipEncoding", null);
        setField(term62991, term62991.getClass(), "encoding", null);
        setBooleanField(term62991, term62991.getClass(), "useUnicodeExtraFields", false);
        setField(term62991, term62991.getClass(), "in", null);
        setField(term62991, term62991.getClass(), "inf", null);
        setField(term62991, term62991.getClass(), "buf", null);
        setField(term62991, term62991.getClass(), "current", null);
        setBooleanField(term62991, term62991.getClass(), "closed", false);
        setBooleanField(term62991, term62991.getClass(), "hitCentralDirectory", false);
        setField(term62991, term62991.getClass(), "lastStoredEntry", null);
        setBooleanField(term62991, term62991.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term62991, term62991.getClass(), "lfhBuf", null);
        setField(term62991, term62991.getClass(), "skipBuf", null);
        setField(term62991, term62991.getClass(), "shortBuf", null);
        setField(term62991, term62991.getClass(), "wordBuf", null);
        setField(term62991, term62991.getClass(), "twoDwordBuf", null);
        setIntField(term62991, term62991.getClass(), "entriesRead", 0);
        setField(term62991, term62991.getClass(), "single", null);
        setLongField(term62991, term62991.getClass(), "bytesRead", 0L);
        term62998 = new Integer(0);
        term63000 = new Integer(0);
        term63002 = new Integer(0);
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
        args[1] = term62998;
        args[2] = term63000;
        args[3] = term63002;
        callMethod(klass, "bufferContainsSignature", argTypes, term62991, args);
    }

};


