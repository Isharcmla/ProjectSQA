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

public class BigMatrixImpl_init_1394893403303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104160;

    public BigMatrixImpl_init_1394893403303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term104299 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        Object[] term104164 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 0);
        Object[] term104165 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 0);
        int[] term104166 = (int[]) newIntArray(0);
        setField(term104299, term104299.getClass(), "data", term104164);
        setField(term104299, term104299.getClass(), "lu", term104165);
        setField(term104299, term104299.getClass(), "permutation", term104166);
        setIntField(term104299, term104299.getClass(), "parity", 0);
        setIntField(term104299, term104299.getClass(), "roundingMode", 0);
        setIntField(term104299, term104299.getClass(), "scale", 0);
        term104160 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 3);
        Object[] term104161 = (Object[]) newArray("java.math.BigDecimal", 1);
        Object[] term104162 = (Object[]) newArray("java.math.BigDecimal", 1);
        Object[] term104163 = (Object[]) newArray("java.math.BigDecimal", 1);
        setElement(term104160, 0, term104161);
        setElement(term104160, 1, term104162);
        setElement(term104160, 2, term104163);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term104160;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


