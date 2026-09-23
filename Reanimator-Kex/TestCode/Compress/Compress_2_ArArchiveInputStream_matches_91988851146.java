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
import static org.apache.commons.compress.archivers.ar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.ar.EqualityUtils.*;

public class ArArchiveInputStream_matches_91988851146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8954;
     Object term9283;

    public ArArchiveInputStream_matches_91988851146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8954 = (byte[]) newByteArray(8);
        setByteElement(term8954, 0, (byte) 33);
        setByteElement(term8954, 1, (byte) 60);
        setByteElement(term8954, 2, (byte) 60);
        setByteElement(term8954, 3, (byte) 60);
        setByteElement(term8954, 4, (byte) 60);
        setByteElement(term8954, 5, (byte) 60);
        setByteElement(term8954, 6, (byte) 60);
        setByteElement(term8954, 7, (byte) 60);
        term9283 = (byte[]) newByteArray(8);
        setByteElement(term9283, 0, (byte) 33);
        setByteElement(term9283, 1, (byte) 60);
        setByteElement(term9283, 2, (byte) 60);
        setByteElement(term9283, 3, (byte) 60);
        setByteElement(term9283, 4, (byte) 60);
        setByteElement(term9283, 5, (byte) 60);
        setByteElement(term9283, 6, (byte) 60);
        setByteElement(term9283, 7, (byte) 60);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term8954;
        args[1] = 8;
        Object retValue = callMethod(klass, "matches", argTypes, null, args);
        assertTrue(recursiveEquals(term8954, term9283));
        assertTrue(recursiveEquals(retValue, false));
    }

};


