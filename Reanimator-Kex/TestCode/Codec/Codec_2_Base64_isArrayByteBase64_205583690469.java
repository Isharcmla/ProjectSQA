package org.apache.commons.codec.binary;

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
import static org.apache.commons.codec.binary.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.codec.binary.EqualityUtils.*;

public class Base64_isArrayByteBase64_205583690469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12633;
     Object term12718;

    public Base64_isArrayByteBase64_205583690469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12633 = (byte[]) newByteArray(8);
        setByteElement(term12633, 0, (byte) 61);
        setByteElement(term12633, 1, (byte) 61);
        setByteElement(term12633, 2, (byte) 61);
        setByteElement(term12633, 3, (byte) 61);
        setByteElement(term12633, 4, (byte) 61);
        setByteElement(term12633, 5, (byte) 61);
        setByteElement(term12633, 6, (byte) 61);
        setByteElement(term12633, 7, (byte) 61);
        term12718 = (byte[]) newByteArray(8);
        setByteElement(term12718, 0, (byte) 61);
        setByteElement(term12718, 1, (byte) 61);
        setByteElement(term12718, 2, (byte) 61);
        setByteElement(term12718, 3, (byte) 61);
        setByteElement(term12718, 4, (byte) 61);
        setByteElement(term12718, 5, (byte) 61);
        setByteElement(term12718, 6, (byte) 61);
        setByteElement(term12718, 7, (byte) 61);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term12633;
        Object retValue = callMethod(klass, "isArrayByteBase64", argTypes, null, args);
        assertTrue(recursiveEquals(term12633, term12718));
        assertTrue(recursiveEquals(retValue, true));
    }

};


