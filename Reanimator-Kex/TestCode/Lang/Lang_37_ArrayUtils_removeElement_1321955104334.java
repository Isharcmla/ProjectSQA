package org.apache.commons.lang3;

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
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.EqualityUtils.*;
import java.lang.Byte;

public class ArrayUtils_removeElement_1321955104334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1836;
     Object term1840;
     Object term24578;
     Object term24574;

    public ArrayUtils_removeElement_1321955104334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1836 = (byte[]) newByteArray(3);
        setByteElement(term1836, 0, (byte) -89);
        setByteElement(term1836, 1, (byte) 13);
        setByteElement(term1836, 2, (byte) 44);
        term1840 = new Byte((byte) -63);
        term24578 = (byte[]) newByteArray(3);
        setByteElement(term24578, 0, (byte) -89);
        setByteElement(term24578, 1, (byte) 13);
        setByteElement(term24578, 2, (byte) 44);
        term24574 = (byte[]) newByteArray(3);
        setByteElement(term24574, 0, (byte) -89);
        setByteElement(term24574, 1, (byte) 13);
        setByteElement(term24574, 2, (byte) 44);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = byte.class;
        Object[] args = new Object[2];
        args[0] = term1836;
        args[1] = term1840;
        Object retValue = callMethod(klass, "removeElement", argTypes, null, args);
        assertTrue(recursiveEquals(term1836, term24578));
        assertTrue(recursiveEquals(term1840, (byte) -63));
        assertTrue(recursiveEquals(retValue, term24574));
    }

};


