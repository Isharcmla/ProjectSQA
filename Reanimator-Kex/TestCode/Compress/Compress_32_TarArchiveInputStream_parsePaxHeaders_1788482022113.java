package org.apache.commons.compress.archivers.tar;

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
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.tar.EqualityUtils.*;
import java.util.HashMap;

public class TarArchiveInputStream_parsePaxHeaders_1788482022113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37084;
     Object term37216;
     Object term37246;
     Object term37247;
     Object term37234;

    public TarArchiveInputStream_parsePaxHeaders_1788482022113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37084 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        term37216 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term36921 = (byte[]) newByteArray(0);
        setField(term37216, term37216.getClass(), "SINGLE", term36921);
        setBooleanField(term37216, term37216.getClass(), "hasHitEOF", true);
        term37246 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term37246, term37246.getClass(), "SMALL_BUF", null);
        setIntField(term37246, term37246.getClass(), "recordSize", 0);
        setIntField(term37246, term37246.getClass(), "blockSize", 0);
        setBooleanField(term37246, term37246.getClass(), "hasHitEOF", false);
        setLongField(term37246, term37246.getClass(), "entrySize", 0L);
        setLongField(term37246, term37246.getClass(), "entryOffset", 0L);
        setField(term37246, term37246.getClass(), "is", null);
        setField(term37246, term37246.getClass(), "currEntry", null);
        setField(term37246, term37246.getClass(), "zipEncoding", null);
        setField(term37246, term37246.getClass(), "encoding", null);
        setField(term37246, term37246.getClass(), "SINGLE", null);
        setLongField(term37246, term37246.getClass(), "bytesRead", 0L);
        term37247 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term37248 = (byte[]) newByteArray(0);
        setField(term37247, term37247.getClass(), "SMALL_BUF", null);
        setIntField(term37247, term37247.getClass(), "recordSize", 0);
        setIntField(term37247, term37247.getClass(), "blockSize", 0);
        setBooleanField(term37247, term37247.getClass(), "hasHitEOF", true);
        setLongField(term37247, term37247.getClass(), "entrySize", 0L);
        setLongField(term37247, term37247.getClass(), "entryOffset", 0L);
        setField(term37247, term37247.getClass(), "is", null);
        setField(term37247, term37247.getClass(), "currEntry", null);
        setField(term37247, term37247.getClass(), "zipEncoding", null);
        setField(term37247, term37247.getClass(), "encoding", null);
        setField(term37247, term37247.getClass(), "SINGLE", term37248);
        setLongField(term37247, term37247.getClass(), "bytesRead", 0L);
        term37234 = new HashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.InputStream");
        Object[] args = new Object[1];
        args[0] = term37216;
        Object retValue = callMethod(klass, "parsePaxHeaders", argTypes, term37084, args);
        assertTrue(recursiveEquals(term37084, term37246));
        assertTrue(recursiveEquals(term37216, term37247));
        assertTrue(recursiveEquals(retValue, term37234));
    }

};


