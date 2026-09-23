package org.apache.commons.compress.archivers.ar;

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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.compress.archivers.ar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ArArchiveInputStream_matches_91988851163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12159;

    public ArArchiveInputStream_matches_91988851163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12159 = (byte[]) newByteArray(3);
        setByteElement(term12159, 0, (byte) 33);
        setByteElement(term12159, 1, (byte) 60);
        setByteElement(term12159, 2, (byte) 97);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term12159;
        args[1] = 8;
        try {
            callMethod(klass, "matches", argTypes, null, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


