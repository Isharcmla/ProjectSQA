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

public class TarArchiveInputStream_paxHeaders_516671723201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85449;
     Object term85653;

    public TarArchiveInputStream_paxHeaders_516671723201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85449 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term85581 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term85449, term85449.getClass(), "SINGLE", null);
        setBooleanField(term85449, term85449.getClass(), "hasHitEOF", false);
        setLongField(term85449, term85449.getClass(), "entryOffset", 0L);
        setLongField(term85449, term85449.getClass(), "entrySize", -9223372036854775807L);
        setField(term85449, term85449.getClass(), "currEntry", null);
        setIntField(term85449, term85449.getClass(), "recordSize", 1);
        setBooleanField(term85581, term85581.getClass(), "hasHitEOF", false);
        setLongField(term85581, term85581.getClass(), "entryOffset", 0L);
        setLongField(term85581, term85581.getClass(), "entrySize", -9223372036854775807L);
        setField(term85449, term85449.getClass(), "is", term85581);
        setLongField(term85449, term85449.getClass(), "bytesRead", 0L);
        term85653 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term85654 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term85653, term85653.getClass(), "SMALL_BUF", null);
        setIntField(term85653, term85653.getClass(), "recordSize", 1);
        setIntField(term85653, term85653.getClass(), "blockSize", 0);
        setBooleanField(term85653, term85653.getClass(), "hasHitEOF", true);
        setLongField(term85653, term85653.getClass(), "entrySize", -9223372036854775807L);
        setLongField(term85653, term85653.getClass(), "entryOffset", 0L);
        setField(term85654, term85654.getClass(), "SMALL_BUF", null);
        setIntField(term85654, term85654.getClass(), "recordSize", 0);
        setIntField(term85654, term85654.getClass(), "blockSize", 0);
        setBooleanField(term85654, term85654.getClass(), "hasHitEOF", false);
        setLongField(term85654, term85654.getClass(), "entrySize", -9223372036854775807L);
        setLongField(term85654, term85654.getClass(), "entryOffset", 0L);
        setField(term85654, term85654.getClass(), "is", null);
        setField(term85654, term85654.getClass(), "currEntry", null);
        setField(term85654, term85654.getClass(), "zipEncoding", null);
        setField(term85654, term85654.getClass(), "encoding", null);
        setField(term85654, term85654.getClass(), "SINGLE", null);
        setLongField(term85654, term85654.getClass(), "bytesRead", 0L);
        setField(term85653, term85653.getClass(), "is", term85654);
        setField(term85653, term85653.getClass(), "currEntry", null);
        setField(term85653, term85653.getClass(), "zipEncoding", null);
        setField(term85653, term85653.getClass(), "encoding", null);
        setField(term85653, term85653.getClass(), "SINGLE", null);
        setLongField(term85653, term85653.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "paxHeaders", argTypes, term85449, args);
        assertTrue(recursiveEquals(term85449, term85653));
    }

};


