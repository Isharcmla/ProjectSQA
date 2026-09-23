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

public class BigMatrixImpl_init_1394893403244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92271;

    public BigMatrixImpl_init_1394893403244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term92385 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        setField(term92385, term92385.getClass(), "data", null);
        setField(term92385, term92385.getClass(), "lu", null);
        setField(term92385, term92385.getClass(), "permutation", null);
        setIntField(term92385, term92385.getClass(), "parity", 0);
        setIntField(term92385, term92385.getClass(), "roundingMode", 0);
        setIntField(term92385, term92385.getClass(), "scale", 0);
        term92271 = (Object[]) newArray("java.math.BigDecimal", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term92271;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(term92271, (byte) 32));
    }

};


