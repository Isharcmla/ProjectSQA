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

public class ArrayUtils_removeElement_1094543927338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1880;
     Object term1882;
     Object term25248;
     Object term25246;

    public ArrayUtils_removeElement_1094543927338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1880 = (double[]) newDoubleArray(1);
        setDoubleElement(term1880, 0, 0.1245258965512791);
        term1882 = new Double(0.9511861072660375);
        term25248 = (double[]) newDoubleArray(1);
        setDoubleElement(term25248, 0, 0.1245258965512791);
        term25246 = (double[]) newDoubleArray(1);
        setDoubleElement(term25246, 0, 0.1245258965512791);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term1880;
        args[1] = term1882;
        Object retValue = callMethod(klass, "removeElement", argTypes, null, args);
        assertTrue(recursiveEquals(term1880, term25248));
        assertTrue(recursiveEquals(term1882, 0.9511861072660375));
        assertTrue(recursiveEquals(retValue, term25246));
    }

};


