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

public class ZipArchiveInputStream_cacheBytesRead_164802635766 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63004;
     Object term63011;
     Object term63013;
     Object term63015;

    public ZipArchiveInputStream_cacheBytesRead_164802635766() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63004 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term63004, term63004.getClass(), "zipEncoding", null);
        setField(term63004, term63004.getClass(), "encoding", null);
        setBooleanField(term63004, term63004.getClass(), "useUnicodeExtraFields", false);
        setField(term63004, term63004.getClass(), "in", null);
        setField(term63004, term63004.getClass(), "inf", null);
        setField(term63004, term63004.getClass(), "buf", null);
        setField(term63004, term63004.getClass(), "current", null);
        setBooleanField(term63004, term63004.getClass(), "closed", false);
        setBooleanField(term63004, term63004.getClass(), "hitCentralDirectory", false);
        setField(term63004, term63004.getClass(), "lastStoredEntry", null);
        setBooleanField(term63004, term63004.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term63004, term63004.getClass(), "lfhBuf", null);
        setField(term63004, term63004.getClass(), "skipBuf", null);
        setField(term63004, term63004.getClass(), "shortBuf", null);
        setField(term63004, term63004.getClass(), "wordBuf", null);
        setField(term63004, term63004.getClass(), "twoDwordBuf", null);
        setIntField(term63004, term63004.getClass(), "entriesRead", 0);
        setField(term63004, term63004.getClass(), "single", null);
        setLongField(term63004, term63004.getClass(), "bytesRead", 0L);
        term63011 = new Integer(0);
        term63013 = new Integer(0);
        term63015 = new Integer(0);
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
        args[1] = term63011;
        args[2] = term63013;
        args[3] = term63015;
        callMethod(klass, "cacheBytesRead", argTypes, term63004, args);
    }

};


