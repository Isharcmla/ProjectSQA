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

public class BigMatrixImpl_init_1505302127264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95284;

    public BigMatrixImpl_init_1505302127264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term95409 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        Object[] term95288 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 0);
        int[] term95289 = (int[]) newIntArray(0);
        setField(term95409, term95409.getClass(), "data", term95288);
        setField(term95409, term95409.getClass(), "lu", null);
        setField(term95409, term95409.getClass(), "permutation", term95289);
        setIntField(term95409, term95409.getClass(), "parity", 0);
        setIntField(term95409, term95409.getClass(), "roundingMode", 0);
        setIntField(term95409, term95409.getClass(), "scale", 0);
        term95284 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 1);
        Object[] term95285 = (Object[]) newArray("java.math.BigDecimal", 2);
        Object term95455 = newInstance(Class.forName("java.math.BigDecimal"));
        setElement(term95285, 0, term95455);
        setElement(term95285, 1, term95455);
        setElement(term95284, 0, term95285);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 0).getClass();
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term95284;
        args[1] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(term95284, -9223372036854775808L));
    }

};


