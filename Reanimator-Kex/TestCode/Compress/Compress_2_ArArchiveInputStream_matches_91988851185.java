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

public class ArArchiveInputStream_matches_91988851185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75346;
     Object term77145;

    public ArArchiveInputStream_matches_91988851185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75346 = (byte[]) newByteArray(6);
        setByteElement(term75346, 0, (byte) 33);
        setByteElement(term75346, 1, (byte) 60);
        setByteElement(term75346, 2, (byte) 97);
        setByteElement(term75346, 3, (byte) 114);
        setByteElement(term75346, 4, (byte) 60);
        setByteElement(term75346, 5, (byte) 60);
        term77145 = (byte[]) newByteArray(6);
        setByteElement(term77145, 0, (byte) 33);
        setByteElement(term77145, 1, (byte) 60);
        setByteElement(term77145, 2, (byte) 97);
        setByteElement(term77145, 3, (byte) 114);
        setByteElement(term77145, 4, (byte) 60);
        setByteElement(term77145, 5, (byte) 60);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term75346;
        args[1] = 8;
        Object retValue = callMethod(klass, "matches", argTypes, null, args);
        assertTrue(recursiveEquals(term75346, term77145));
        assertTrue(recursiveEquals(retValue, false));
    }

};


