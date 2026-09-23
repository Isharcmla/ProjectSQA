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

public class TarArchiveInputStream_paxHeaders_516671723182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78039;

    public TarArchiveInputStream_paxHeaders_516671723182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78039 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term77800 = (byte[]) newByteArray(16);
        Object term78163 = newInstance(Class.forName("org.apache.commons.compress.utils.CRC32VerifyingInputStream"));
        setField(term78039, term78039.getClass(), "SINGLE", term77800);
        setBooleanField(term78039, term78039.getClass(), "hasHitEOF", false);
        setLongField(term78039, term78039.getClass(), "entryOffset", 412316860416L);
        setLongField(term78039, term78039.getClass(), "entrySize", 274877906945L);
        setField(term78039, term78039.getClass(), "currEntry", null);
        setIntField(term78039, term78039.getClass(), "recordSize", 0);
        setField(term78039, term78039.getClass(), "is", term78163);
        setLongField(term78039, term78039.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "paxHeaders", argTypes, term78039, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


