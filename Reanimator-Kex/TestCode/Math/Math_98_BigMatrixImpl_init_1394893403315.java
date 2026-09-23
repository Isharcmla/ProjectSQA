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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BigMatrixImpl_init_1394893403315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106242;

    public BigMatrixImpl_init_1394893403315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term106424 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        int[] term106256 = (int[]) newIntArray(0);
        setField(term106424, term106424.getClass(), "data", null);
        setField(term106424, term106424.getClass(), "lu", null);
        setField(term106424, term106424.getClass(), "permutation", term106256);
        setIntField(term106424, term106424.getClass(), "parity", 0);
        setIntField(term106424, term106424.getClass(), "roundingMode", 0);
        setIntField(term106424, term106424.getClass(), "scale", 0);
        term106242 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 8);
        Object[] term106243 = (Object[]) newArray("java.math.BigDecimal", 1);
        Object term106470 = newInstance(Class.forName("java.math.BigDecimal"));
        Object[] term106245 = (Object[]) newArray("java.math.BigDecimal", 1);
        Object term106516 = newInstance(Class.forName("java.math.BigDecimal"));
        Object[] term106247 = (Object[]) newArray("java.math.BigDecimal", 1);
        Object term106562 = newInstance(Class.forName("java.math.BigDecimal"));
        Object[] term106249 = (Object[]) newArray("java.math.BigDecimal", 1);
        Object term106608 = newInstance(Class.forName("java.math.BigDecimal"));
        Object[] term106251 = (Object[]) newArray("java.math.BigDecimal", 1);
        Object term106654 = newInstance(Class.forName("java.math.BigDecimal"));
        Object[] term106253 = (Object[]) newArray("java.math.BigDecimal", 1);
        Object[] term106254 = (Object[]) newArray("java.math.BigDecimal", 1);
        Object term106700 = newInstance(Class.forName("java.math.BigDecimal"));
        setElement(term106243, 0, term106470);
        setElement(term106242, 0, term106243);
        setElement(term106245, 0, term106516);
        setElement(term106242, 1, term106245);
        setElement(term106247, 0, term106562);
        setElement(term106242, 2, term106247);
        setElement(term106249, 0, term106608);
        setElement(term106242, 3, term106249);
        setElement(term106242, 4, term106247);
        setElement(term106251, 0, term106654);
        setElement(term106242, 5, term106251);
        setElement(term106253, 0, term106516);
        setElement(term106242, 6, term106253);
        setElement(term106254, 0, term106700);
        setElement(term106242, 7, term106254);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term106242;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


