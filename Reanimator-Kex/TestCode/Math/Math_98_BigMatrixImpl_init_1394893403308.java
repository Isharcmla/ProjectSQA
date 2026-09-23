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

public class BigMatrixImpl_init_1394893403308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105122;

    public BigMatrixImpl_init_1394893403308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term105279 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        setField(term105279, term105279.getClass(), "data", null);
        setField(term105279, term105279.getClass(), "lu", null);
        setField(term105279, term105279.getClass(), "permutation", null);
        setIntField(term105279, term105279.getClass(), "parity", 0);
        setIntField(term105279, term105279.getClass(), "roundingMode", 0);
        setIntField(term105279, term105279.getClass(), "scale", 0);
        term105122 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 5);
        Object[] term105123 = (Object[]) newArray("java.math.BigDecimal", 1);
        Object term105325 = newInstance(Class.forName("java.math.BigDecimal"));
        Object[] term105125 = (Object[]) newArray("java.math.BigDecimal", 1);
        Object term105371 = newInstance(Class.forName("java.math.BigDecimal"));
        Object[] term105127 = (Object[]) newArray("java.math.BigDecimal", 1);
        Object[] term105128 = (Object[]) newArray("java.math.BigDecimal", 1);
        Object term105417 = newInstance(Class.forName("java.math.BigDecimal"));
        Object[] term105130 = (Object[]) newArray("java.math.BigDecimal", 1);
        Object term105463 = newInstance(Class.forName("java.math.BigDecimal"));
        setElement(term105123, 0, term105325);
        setElement(term105122, 0, term105123);
        setElement(term105125, 0, term105371);
        setElement(term105122, 1, term105125);
        setElement(term105127, 0, term105371);
        setElement(term105122, 2, term105127);
        setElement(term105128, 0, term105417);
        setElement(term105122, 3, term105128);
        setElement(term105130, 0, term105463);
        setElement(term105122, 4, term105130);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term105122;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


