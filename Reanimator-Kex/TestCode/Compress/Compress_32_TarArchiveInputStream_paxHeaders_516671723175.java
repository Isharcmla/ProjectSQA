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
import java.lang.NullPointerException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TarArchiveInputStream_paxHeaders_516671723175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75445;

    public TarArchiveInputStream_paxHeaders_516671723175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75445 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term75206 = (byte[]) newByteArray(16);
        Object term75527 = newInstance(Class.forName("java.util.jar.Manifest$FastInputStream"));
        setField(term75445, term75445.getClass(), "SINGLE", term75206);
        setBooleanField(term75445, term75445.getClass(), "hasHitEOF", false);
        setLongField(term75445, term75445.getClass(), "entryOffset", 412316860416L);
        setLongField(term75445, term75445.getClass(), "entrySize", 274877906945L);
        setField(term75445, term75445.getClass(), "currEntry", null);
        setIntField(term75445, term75445.getClass(), "recordSize", 0);
        setField(term75445, term75445.getClass(), "is", term75527);
        setLongField(term75445, term75445.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "paxHeaders", argTypes, term75445, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


