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

public class ArArchiveInputStream_matches_91988851199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118036;
     Object term118111;

    public ArArchiveInputStream_matches_91988851199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118036 = (byte[]) newByteArray(7);
        setByteElement(term118036, 0, (byte) 33);
        setByteElement(term118036, 1, (byte) 60);
        setByteElement(term118036, 2, (byte) 97);
        setByteElement(term118036, 3, (byte) 114);
        setByteElement(term118036, 4, (byte) 99);
        setByteElement(term118036, 5, (byte) 104);
        setByteElement(term118036, 6, (byte) 104);
        term118111 = (byte[]) newByteArray(7);
        setByteElement(term118111, 0, (byte) 33);
        setByteElement(term118111, 1, (byte) 60);
        setByteElement(term118111, 2, (byte) 97);
        setByteElement(term118111, 3, (byte) 114);
        setByteElement(term118111, 4, (byte) 99);
        setByteElement(term118111, 5, (byte) 104);
        setByteElement(term118111, 6, (byte) 104);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term118036;
        args[1] = 8;
        Object retValue = callMethod(klass, "matches", argTypes, null, args);
        assertTrue(recursiveEquals(term118036, term118111));
        assertTrue(recursiveEquals(retValue, false));
    }

};


