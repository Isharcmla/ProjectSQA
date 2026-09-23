package org.apache.commons.math.linear;

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
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.linear.EqualityUtils.*;
import java.lang.Object;

public class BigMatrixImpl_init_1505302127263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95151;
     Object term98320;

    public BigMatrixImpl_init_1505302127263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term95282 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        Object[] term95155 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 0);
        int[] term95156 = (int[]) newIntArray(0);
        setField(term95282, term95282.getClass(), "data", null);
        setField(term95282, term95282.getClass(), "lu", term95155);
        setField(term95282, term95282.getClass(), "permutation", term95156);
        setIntField(term95282, term95282.getClass(), "parity", 0);
        setIntField(term95282, term95282.getClass(), "roundingMode", 0);
        setIntField(term95282, term95282.getClass(), "scale", 0);
        term95151 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 10);
        Object[] term95152 = (Object[]) newArray("java.math.BigDecimal", 2);
        Object[] term95153 = (Object[]) newArray("java.math.BigDecimal", 2);
        setElement(term95151, 0, term95152);
        setElement(term95151, 1, term95153);
        setElement(term95151, 2, term95152);
        setElement(term95151, 3, term95152);
        setElement(term95151, 4, term95152);
        setElement(term95151, 5, term95152);
        setElement(term95151, 6, term95152);
        setElement(term95151, 7, term95152);
        setElement(term95151, 8, term95152);
        setElement(term95151, 9, term95152);
        term98320 = newInstance(Class.forName("java.math.BigInteger"));
        setIntField(term98320, term98320.getClass(), "signum", 1);
        setField(term98320, term98320.getClass(), "mag", null);
        setIntField(term98320, term98320.getClass(), "bitCountPlusOne", 0);
        setIntField(term98320, term98320.getClass(), "bitLengthPlusOne", 0);
        setIntField(term98320, term98320.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term98320, term98320.getClass(), "firstNonzeroIntNumPlusTwo", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 0).getClass();
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term95151;
        args[1] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term98320));
        assertTrue(recursiveEquals(term95151, 0));
    }

};


