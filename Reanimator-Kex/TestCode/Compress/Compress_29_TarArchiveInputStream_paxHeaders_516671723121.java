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

public class TarArchiveInputStream_paxHeaders_516671723121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36518;

    public TarArchiveInputStream_paxHeaders_516671723121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36518 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term36036 = (byte[]) newByteArray(44);
        setByteElement(term36036, 0, (byte) 1);
        setByteElement(term36036, 1, (byte) 1);
        setByteElement(term36036, 2, (byte) 1);
        setByteElement(term36036, 3, (byte) 1);
        setByteElement(term36036, 4, (byte) 1);
        setByteElement(term36036, 5, (byte) 1);
        setByteElement(term36036, 6, (byte) 1);
        setByteElement(term36036, 7, (byte) 1);
        setByteElement(term36036, 8, (byte) 1);
        setByteElement(term36036, 9, (byte) 1);
        setByteElement(term36036, 10, (byte) 1);
        setByteElement(term36036, 11, (byte) 1);
        setByteElement(term36036, 12, (byte) 1);
        setByteElement(term36036, 13, (byte) 1);
        setByteElement(term36036, 14, (byte) 1);
        setByteElement(term36036, 15, (byte) 1);
        setByteElement(term36036, 16, (byte) 1);
        setByteElement(term36036, 17, (byte) 1);
        setByteElement(term36036, 18, (byte) 1);
        setByteElement(term36036, 19, (byte) 1);
        setByteElement(term36036, 20, (byte) 1);
        setByteElement(term36036, 21, (byte) 1);
        setByteElement(term36036, 22, (byte) 1);
        setByteElement(term36036, 23, (byte) 1);
        setByteElement(term36036, 24, (byte) 1);
        setByteElement(term36036, 25, (byte) 1);
        setByteElement(term36036, 26, (byte) 1);
        setByteElement(term36036, 27, (byte) 1);
        setByteElement(term36036, 28, (byte) 1);
        setByteElement(term36036, 29, (byte) 1);
        setByteElement(term36036, 30, (byte) 1);
        setByteElement(term36036, 31, (byte) 1);
        setByteElement(term36036, 32, (byte) 1);
        setByteElement(term36036, 33, (byte) 1);
        setByteElement(term36036, 34, (byte) 1);
        setByteElement(term36036, 35, (byte) 1);
        setByteElement(term36036, 36, (byte) 1);
        setByteElement(term36036, 37, (byte) 1);
        setByteElement(term36036, 38, (byte) 1);
        setByteElement(term36036, 39, (byte) 1);
        setByteElement(term36036, 40, (byte) 1);
        setByteElement(term36036, 41, (byte) 1);
        setByteElement(term36036, 42, (byte) 1);
        setByteElement(term36036, 43, (byte) 1);
        setField(term36518, term36518.getClass(), "SINGLE", term36036);
        setBooleanField(term36518, term36518.getClass(), "hasHitEOF", false);
        setLongField(term36518, term36518.getClass(), "entryOffset", 0L);
        setLongField(term36518, term36518.getClass(), "entrySize", -9223372036854775807L);
        setField(term36518, term36518.getClass(), "currEntry", null);
        setIntField(term36518, term36518.getClass(), "recordSize", 240);
        setField(term36518, term36518.getClass(), "is", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "paxHeaders", argTypes, term36518, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


