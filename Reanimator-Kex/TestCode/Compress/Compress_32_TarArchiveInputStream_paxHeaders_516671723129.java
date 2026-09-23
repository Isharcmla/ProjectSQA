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

public class TarArchiveInputStream_paxHeaders_516671723129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52159;

    public TarArchiveInputStream_paxHeaders_516671723129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52159 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term51677 = (byte[]) newByteArray(44);
        setByteElement(term51677, 0, (byte) 1);
        setByteElement(term51677, 1, (byte) 1);
        setByteElement(term51677, 2, (byte) 1);
        setByteElement(term51677, 3, (byte) 1);
        setByteElement(term51677, 4, (byte) 1);
        setByteElement(term51677, 5, (byte) 1);
        setByteElement(term51677, 6, (byte) 1);
        setByteElement(term51677, 7, (byte) 1);
        setByteElement(term51677, 8, (byte) 1);
        setByteElement(term51677, 9, (byte) 1);
        setByteElement(term51677, 10, (byte) 1);
        setByteElement(term51677, 11, (byte) 1);
        setByteElement(term51677, 12, (byte) 1);
        setByteElement(term51677, 13, (byte) 1);
        setByteElement(term51677, 14, (byte) 1);
        setByteElement(term51677, 15, (byte) 1);
        setByteElement(term51677, 16, (byte) 1);
        setByteElement(term51677, 17, (byte) 1);
        setByteElement(term51677, 18, (byte) 1);
        setByteElement(term51677, 19, (byte) 1);
        setByteElement(term51677, 20, (byte) 1);
        setByteElement(term51677, 21, (byte) 1);
        setByteElement(term51677, 22, (byte) 1);
        setByteElement(term51677, 23, (byte) 1);
        setByteElement(term51677, 24, (byte) 1);
        setByteElement(term51677, 25, (byte) 1);
        setByteElement(term51677, 26, (byte) 1);
        setByteElement(term51677, 27, (byte) 1);
        setByteElement(term51677, 28, (byte) 1);
        setByteElement(term51677, 29, (byte) 1);
        setByteElement(term51677, 30, (byte) 1);
        setByteElement(term51677, 31, (byte) 1);
        setByteElement(term51677, 32, (byte) 1);
        setByteElement(term51677, 33, (byte) 1);
        setByteElement(term51677, 34, (byte) 1);
        setByteElement(term51677, 35, (byte) 1);
        setByteElement(term51677, 36, (byte) 1);
        setByteElement(term51677, 37, (byte) 1);
        setByteElement(term51677, 38, (byte) 1);
        setByteElement(term51677, 39, (byte) 1);
        setByteElement(term51677, 40, (byte) 1);
        setByteElement(term51677, 41, (byte) 1);
        setByteElement(term51677, 42, (byte) 1);
        setByteElement(term51677, 43, (byte) 1);
        setField(term52159, term52159.getClass(), "SINGLE", term51677);
        setBooleanField(term52159, term52159.getClass(), "hasHitEOF", false);
        setLongField(term52159, term52159.getClass(), "entryOffset", 0L);
        setLongField(term52159, term52159.getClass(), "entrySize", -9223372036854775807L);
        setField(term52159, term52159.getClass(), "currEntry", null);
        setIntField(term52159, term52159.getClass(), "recordSize", 240);
        setField(term52159, term52159.getClass(), "is", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "paxHeaders", argTypes, term52159, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


