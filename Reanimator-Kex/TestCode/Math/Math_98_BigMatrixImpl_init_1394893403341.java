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
import java.lang.Object;

public class BigMatrixImpl_init_1394893403341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111723;

    public BigMatrixImpl_init_1394893403341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term111897 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        setField(term111897, term111897.getClass(), "data", null);
        setField(term111897, term111897.getClass(), "lu", null);
        setField(term111897, term111897.getClass(), "permutation", null);
        setIntField(term111897, term111897.getClass(), "parity", 0);
        setIntField(term111897, term111897.getClass(), "roundingMode", 0);
        setIntField(term111897, term111897.getClass(), "scale", 0);
        term111723 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 8);
        Object[] term111724 = (Object[]) newArray("java.math.BigDecimal", 64);
        Object[] term111725 = (Object[]) newArray("java.math.BigDecimal", 64);
        Object[] term111726 = (Object[]) newArray("java.math.BigDecimal", 64);
        Object[] term111727 = (Object[]) newArray("java.math.BigDecimal", 64);
        Object[] term111728 = (Object[]) newArray("java.math.BigDecimal", 64);
        Object[] term111729 = (Object[]) newArray("java.math.BigDecimal", 64);
        Object[] term111730 = (Object[]) newArray("java.math.BigDecimal", 1);
        setElement(term111723, 0, term111724);
        setElement(term111723, 1, term111725);
        setElement(term111723, 2, term111726);
        setElement(term111723, 3, term111727);
        setElement(term111723, 4, term111728);
        setElement(term111723, 5, term111729);
        setElement(term111723, 6, term111728);
        setElement(term111723, 7, term111730);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term111723;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


