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

public class ArArchiveInputStream_matches_91988851132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4092;
     Object term5422;

    public ArArchiveInputStream_matches_91988851132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4092 = (byte[]) newByteArray(8);
        setByteElement(term4092, 0, (byte) 33);
        setByteElement(term4092, 1, (byte) 33);
        setByteElement(term4092, 2, (byte) 33);
        setByteElement(term4092, 3, (byte) 33);
        setByteElement(term4092, 4, (byte) 33);
        setByteElement(term4092, 5, (byte) 33);
        setByteElement(term4092, 6, (byte) 33);
        setByteElement(term4092, 7, (byte) 33);
        term5422 = (byte[]) newByteArray(8);
        setByteElement(term5422, 0, (byte) 33);
        setByteElement(term5422, 1, (byte) 33);
        setByteElement(term5422, 2, (byte) 33);
        setByteElement(term5422, 3, (byte) 33);
        setByteElement(term5422, 4, (byte) 33);
        setByteElement(term5422, 5, (byte) 33);
        setByteElement(term5422, 6, (byte) 33);
        setByteElement(term5422, 7, (byte) 33);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term4092;
        args[1] = 8;
        Object retValue = callMethod(klass, "matches", argTypes, null, args);
        assertTrue(recursiveEquals(term4092, term5422));
        assertTrue(recursiveEquals(retValue, false));
    }

};


