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

public class BigMatrixImpl_init_1505302127334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110023;
     Object term110209;
     Object term110216;

    public BigMatrixImpl_init_1505302127334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term110178 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        Object[] term110030 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 0);
        int[] term110031 = (int[]) newIntArray(0);
        setField(term110178, term110178.getClass(), "data", null);
        setField(term110178, term110178.getClass(), "lu", term110030);
        setField(term110178, term110178.getClass(), "permutation", term110031);
        setIntField(term110178, term110178.getClass(), "parity", 0);
        setIntField(term110178, term110178.getClass(), "roundingMode", 0);
        setIntField(term110178, term110178.getClass(), "scale", 0);
        term110023 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 5);
        Object[] term110024 = (Object[]) newArray("java.math.BigDecimal", 2);
        Object[] term110025 = (Object[]) newArray("java.math.BigDecimal", 2);
        Object[] term110026 = (Object[]) newArray("java.math.BigDecimal", 2);
        Object[] term110027 = (Object[]) newArray("java.math.BigDecimal", 2);
        Object[] term110028 = (Object[]) newArray("java.math.BigDecimal", 2);
        setElement(term110023, 0, term110024);
        setElement(term110023, 1, term110025);
        setElement(term110023, 2, term110026);
        setElement(term110023, 3, term110027);
        setElement(term110023, 4, term110028);
        term110209 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        Object[] term110210 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 5);
        Object[] term110211 = (Object[]) newArray("java.math.BigDecimal", 2);
        Object[] term110212 = (Object[]) newArray("java.math.BigDecimal", 2);
        Object[] term110213 = (Object[]) newArray("java.math.BigDecimal", 2);
        Object[] term110214 = (Object[]) newArray("java.math.BigDecimal", 2);
        Object[] term110215 = (Object[]) newArray("java.math.BigDecimal", 2);
        setElement(term110210, 0, term110211);
        setElement(term110210, 1, term110212);
        setElement(term110210, 2, term110213);
        setElement(term110210, 3, term110214);
        setElement(term110210, 4, term110215);
        setField(term110209, term110209.getClass(), "data", term110210);
        setField(term110209, term110209.getClass(), "lu", null);
        setField(term110209, term110209.getClass(), "permutation", null);
        setIntField(term110209, term110209.getClass(), "parity", 1);
        setIntField(term110209, term110209.getClass(), "roundingMode", 4);
        setIntField(term110209, term110209.getClass(), "scale", 64);
        term110216 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 5);
        Object[] term110217 = (Object[]) newArray("java.math.BigDecimal", 2);
        Object[] term110218 = (Object[]) newArray("java.math.BigDecimal", 2);
        Object[] term110219 = (Object[]) newArray("java.math.BigDecimal", 2);
        Object[] term110220 = (Object[]) newArray("java.math.BigDecimal", 2);
        Object[] term110221 = (Object[]) newArray("java.math.BigDecimal", 2);
        setElement(term110216, 0, term110217);
        setElement(term110216, 1, term110218);
        setElement(term110216, 2, term110219);
        setElement(term110216, 3, term110220);
        setElement(term110216, 4, term110221);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 0).getClass();
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term110023;
        args[1] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term110209));
        assertTrue(recursiveEquals(term110023, term110216));
    }

};


