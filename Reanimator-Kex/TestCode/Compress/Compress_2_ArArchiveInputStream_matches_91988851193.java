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

public class ArArchiveInputStream_matches_91988851193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111030;
     Object term111475;

    public ArArchiveInputStream_matches_91988851193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111030 = (byte[]) newByteArray(6);
        setByteElement(term111030, 0, (byte) 33);
        setByteElement(term111030, 1, (byte) 60);
        setByteElement(term111030, 2, (byte) 97);
        setByteElement(term111030, 3, (byte) 114);
        setByteElement(term111030, 4, (byte) 99);
        setByteElement(term111030, 5, (byte) 114);
        term111475 = (byte[]) newByteArray(6);
        setByteElement(term111475, 0, (byte) 33);
        setByteElement(term111475, 1, (byte) 60);
        setByteElement(term111475, 2, (byte) 97);
        setByteElement(term111475, 3, (byte) 114);
        setByteElement(term111475, 4, (byte) 99);
        setByteElement(term111475, 5, (byte) 114);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term111030;
        args[1] = 8;
        Object retValue = callMethod(klass, "matches", argTypes, null, args);
        assertTrue(recursiveEquals(term111030, term111475));
        assertTrue(recursiveEquals(retValue, false));
    }

};


