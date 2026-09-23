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

public class BigMatrixImpl_getSubMatrix_1108007786223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94416;
     Object term94208;
     Object term94211;

    public BigMatrixImpl_getSubMatrix_1108007786223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94416 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        Object[] term94276 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 33);
        Object[] term94277 = (Object[]) newArray("java.math.BigDecimal", 0);
        setElement(term94276, 0, term94277);
        setField(term94416, term94416.getClass(), "data", term94276);
        term94208 = (int[]) newIntArray(2);
        term94211 = (int[]) newIntArray(63);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term94208;
        args[1] = term94211;
        callMethod(klass, "getSubMatrix", argTypes, term94416, args);
    }

};


