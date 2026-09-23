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

public class TarArchiveInputStream_parsePaxHeaders_1788482022111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45424;
     Object term45556;
     Object term45586;
     Object term45587;
     Object term45574;

    public TarArchiveInputStream_parsePaxHeaders_1788482022111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45424 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        term45556 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term45261 = (byte[]) newByteArray(0);
        setField(term45556, term45556.getClass(), "SINGLE", term45261);
        setBooleanField(term45556, term45556.getClass(), "hasHitEOF", true);
        term45586 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term45586, term45586.getClass(), "SMALL_BUF", null);
        setIntField(term45586, term45586.getClass(), "recordSize", 0);
        setIntField(term45586, term45586.getClass(), "blockSize", 0);
        setBooleanField(term45586, term45586.getClass(), "hasHitEOF", false);
        setLongField(term45586, term45586.getClass(), "entrySize", 0L);
        setLongField(term45586, term45586.getClass(), "entryOffset", 0L);
        setField(term45586, term45586.getClass(), "is", null);
        setField(term45586, term45586.getClass(), "currEntry", null);
        setField(term45586, term45586.getClass(), "encoding", null);
        setField(term45586, term45586.getClass(), "SINGLE", null);
        setLongField(term45586, term45586.getClass(), "bytesRead", 0L);
        term45587 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term45588 = (byte[]) newByteArray(0);
        setField(term45587, term45587.getClass(), "SMALL_BUF", null);
        setIntField(term45587, term45587.getClass(), "recordSize", 0);
        setIntField(term45587, term45587.getClass(), "blockSize", 0);
        setBooleanField(term45587, term45587.getClass(), "hasHitEOF", true);
        setLongField(term45587, term45587.getClass(), "entrySize", 0L);
        setLongField(term45587, term45587.getClass(), "entryOffset", 0L);
        setField(term45587, term45587.getClass(), "is", null);
        setField(term45587, term45587.getClass(), "currEntry", null);
        setField(term45587, term45587.getClass(), "encoding", null);
        setField(term45587, term45587.getClass(), "SINGLE", term45588);
        setLongField(term45587, term45587.getClass(), "bytesRead", 0L);
        term45574 = new HashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.InputStream");
        Object[] args = new Object[1];
        args[0] = term45556;
        Object retValue = callMethod(klass, "parsePaxHeaders", argTypes, term45424, args);
        assertTrue(recursiveEquals(term45424, term45586));
        assertTrue(recursiveEquals(term45556, term45587));
        assertTrue(recursiveEquals(retValue, term45574));
    }

};


