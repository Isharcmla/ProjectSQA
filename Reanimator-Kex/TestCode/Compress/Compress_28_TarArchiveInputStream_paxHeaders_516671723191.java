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
import java.lang.ArithmeticException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TarArchiveInputStream_paxHeaders_516671723191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91302;

    public TarArchiveInputStream_paxHeaders_516671723191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91302 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term91063 = (byte[]) newByteArray(16);
        Object term91396 = newInstance(Class.forName("java.lang.ProcessImpl$ProcessPipeInputStream"));
        setField(term91302, term91302.getClass(), "SINGLE", term91063);
        setBooleanField(term91302, term91302.getClass(), "hasHitEOF", false);
        setLongField(term91302, term91302.getClass(), "entryOffset", 412316860416L);
        setLongField(term91302, term91302.getClass(), "entrySize", 274877906945L);
        setField(term91302, term91302.getClass(), "currEntry", null);
        setIntField(term91302, term91302.getClass(), "recordSize", 0);
        setField(term91302, term91302.getClass(), "is", term91396);
        setLongField(term91302, term91302.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "paxHeaders", argTypes, term91302, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


