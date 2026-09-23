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

public class TarArchiveInputStream_paxHeaders_516671723127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62115;

    public TarArchiveInputStream_paxHeaders_516671723127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62115 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term61633 = (byte[]) newByteArray(44);
        setByteElement(term61633, 0, (byte) 1);
        setByteElement(term61633, 1, (byte) 1);
        setByteElement(term61633, 2, (byte) 1);
        setByteElement(term61633, 3, (byte) 1);
        setByteElement(term61633, 4, (byte) 1);
        setByteElement(term61633, 5, (byte) 1);
        setByteElement(term61633, 6, (byte) 1);
        setByteElement(term61633, 7, (byte) 1);
        setByteElement(term61633, 8, (byte) 1);
        setByteElement(term61633, 9, (byte) 1);
        setByteElement(term61633, 10, (byte) 1);
        setByteElement(term61633, 11, (byte) 1);
        setByteElement(term61633, 12, (byte) 1);
        setByteElement(term61633, 13, (byte) 1);
        setByteElement(term61633, 14, (byte) 1);
        setByteElement(term61633, 15, (byte) 1);
        setByteElement(term61633, 16, (byte) 1);
        setByteElement(term61633, 17, (byte) 1);
        setByteElement(term61633, 18, (byte) 1);
        setByteElement(term61633, 19, (byte) 1);
        setByteElement(term61633, 20, (byte) 1);
        setByteElement(term61633, 21, (byte) 1);
        setByteElement(term61633, 22, (byte) 1);
        setByteElement(term61633, 23, (byte) 1);
        setByteElement(term61633, 24, (byte) 1);
        setByteElement(term61633, 25, (byte) 1);
        setByteElement(term61633, 26, (byte) 1);
        setByteElement(term61633, 27, (byte) 1);
        setByteElement(term61633, 28, (byte) 1);
        setByteElement(term61633, 29, (byte) 1);
        setByteElement(term61633, 30, (byte) 1);
        setByteElement(term61633, 31, (byte) 1);
        setByteElement(term61633, 32, (byte) 1);
        setByteElement(term61633, 33, (byte) 1);
        setByteElement(term61633, 34, (byte) 1);
        setByteElement(term61633, 35, (byte) 1);
        setByteElement(term61633, 36, (byte) 1);
        setByteElement(term61633, 37, (byte) 1);
        setByteElement(term61633, 38, (byte) 1);
        setByteElement(term61633, 39, (byte) 1);
        setByteElement(term61633, 40, (byte) 1);
        setByteElement(term61633, 41, (byte) 1);
        setByteElement(term61633, 42, (byte) 1);
        setByteElement(term61633, 43, (byte) 1);
        setField(term62115, term62115.getClass(), "SINGLE", term61633);
        setBooleanField(term62115, term62115.getClass(), "hasHitEOF", false);
        setLongField(term62115, term62115.getClass(), "entryOffset", 0L);
        setLongField(term62115, term62115.getClass(), "entrySize", -9223372036854775807L);
        setField(term62115, term62115.getClass(), "currEntry", null);
        setIntField(term62115, term62115.getClass(), "recordSize", 240);
        setField(term62115, term62115.getClass(), "is", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "paxHeaders", argTypes, term62115, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


