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

public class ArArchiveInputStream_matches_91988851177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54788;

    public ArArchiveInputStream_matches_91988851177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54788 = (byte[]) newByteArray(4);
        setByteElement(term54788, 0, (byte) 33);
        setByteElement(term54788, 1, (byte) 60);
        setByteElement(term54788, 2, (byte) 97);
        setByteElement(term54788, 3, (byte) 114);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term54788;
        args[1] = 8;
        try {
            callMethod(klass, "matches", argTypes, null, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


