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
import java.lang.Double;

public class ArrayUtils_removeElement_1094543927340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1896;
     Object term1898;
     Object term25305;
     Object term25303;

    public ArrayUtils_removeElement_1094543927340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1896 = (double[]) newDoubleArray(1);
        setDoubleElement(term1896, 0, 0.1245258965512791);
        term1898 = new Double(0.9511861072660375);
        term25305 = (double[]) newDoubleArray(1);
        setDoubleElement(term25305, 0, 0.1245258965512791);
        term25303 = (double[]) newDoubleArray(1);
        setDoubleElement(term25303, 0, 0.1245258965512791);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term1896;
        args[1] = term1898;
        Object retValue = callMethod(klass, "removeElement", argTypes, null, args);
        assertTrue(recursiveEquals(term1896, term25305));
        assertTrue(recursiveEquals(term1898, 0.9511861072660375));
        assertTrue(recursiveEquals(retValue, term25303));
    }

};


