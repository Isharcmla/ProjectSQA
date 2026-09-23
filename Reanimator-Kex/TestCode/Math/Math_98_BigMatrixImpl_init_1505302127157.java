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

public class BigMatrixImpl_init_1505302127157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public BigMatrixImpl_init_1505302127157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term83253 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        Object[] term83144 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 0);
        setField(term83253, term83253.getClass(), "data", term83144);
        setField(term83253, term83253.getClass(), "lu", null);
        setField(term83253, term83253.getClass(), "permutation", null);
        setIntField(term83253, term83253.getClass(), "parity", 0);
        setIntField(term83253, term83253.getClass(), "roundingMode", 0);
        setIntField(term83253, term83253.getClass(), "scale", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 0).getClass();
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = false;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


