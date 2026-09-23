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
import java.lang.Object;

public class TarArchiveInputStream_paxHeaders_516671723195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93538;
     Object term95887;

    public TarArchiveInputStream_paxHeaders_516671723195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93538 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term93670 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term93538, term93538.getClass(), "SINGLE", null);
        setBooleanField(term93538, term93538.getClass(), "hasHitEOF", false);
        setLongField(term93538, term93538.getClass(), "entryOffset", 0L);
        setLongField(term93538, term93538.getClass(), "entrySize", -9223372036854775807L);
        setField(term93538, term93538.getClass(), "currEntry", null);
        setIntField(term93538, term93538.getClass(), "recordSize", 1);
        setBooleanField(term93670, term93670.getClass(), "hasHitEOF", false);
        setLongField(term93670, term93670.getClass(), "entryOffset", 0L);
        setLongField(term93670, term93670.getClass(), "entrySize", -9223372036854775807L);
        setField(term93538, term93538.getClass(), "is", term93670);
        setLongField(term93538, term93538.getClass(), "bytesRead", 0L);
        term95887 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term95888 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term95887, term95887.getClass(), "SMALL_BUF", null);
        setIntField(term95887, term95887.getClass(), "recordSize", 1);
        setIntField(term95887, term95887.getClass(), "blockSize", 0);
        setBooleanField(term95887, term95887.getClass(), "hasHitEOF", true);
        setLongField(term95887, term95887.getClass(), "entrySize", -9223372036854775807L);
        setLongField(term95887, term95887.getClass(), "entryOffset", 0L);
        setField(term95888, term95888.getClass(), "SMALL_BUF", null);
        setIntField(term95888, term95888.getClass(), "recordSize", 0);
        setIntField(term95888, term95888.getClass(), "blockSize", 0);
        setBooleanField(term95888, term95888.getClass(), "hasHitEOF", false);
        setLongField(term95888, term95888.getClass(), "entrySize", -9223372036854775807L);
        setLongField(term95888, term95888.getClass(), "entryOffset", 0L);
        setField(term95888, term95888.getClass(), "is", null);
        setField(term95888, term95888.getClass(), "currEntry", null);
        setField(term95888, term95888.getClass(), "encoding", null);
        setField(term95888, term95888.getClass(), "SINGLE", null);
        setLongField(term95888, term95888.getClass(), "bytesRead", 0L);
        setField(term95887, term95887.getClass(), "is", term95888);
        setField(term95887, term95887.getClass(), "currEntry", null);
        setField(term95887, term95887.getClass(), "encoding", null);
        setField(term95887, term95887.getClass(), "SINGLE", null);
        setLongField(term95887, term95887.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "paxHeaders", argTypes, term93538, args);
        assertTrue(recursiveEquals(term93538, term95887));
    }

};


