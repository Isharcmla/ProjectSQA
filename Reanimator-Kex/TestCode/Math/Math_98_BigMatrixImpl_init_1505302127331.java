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

public class BigMatrixImpl_init_1505302127331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109791;

    public BigMatrixImpl_init_1505302127331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term109929 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        Object[] term109798 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 0);
        setField(term109929, term109929.getClass(), "data", term109798);
        setField(term109929, term109929.getClass(), "lu", null);
        setField(term109929, term109929.getClass(), "permutation", null);
        setIntField(term109929, term109929.getClass(), "parity", 0);
        setIntField(term109929, term109929.getClass(), "roundingMode", 0);
        setIntField(term109929, term109929.getClass(), "scale", 0);
        term109791 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 3);
        Object[] term109792 = (Object[]) newArray("java.math.BigDecimal", 1);
        Object term109975 = newInstance(Class.forName("java.math.BigDecimal"));
        Object[] term109794 = (Object[]) newArray("java.math.BigDecimal", 1);
        Object term110021 = newInstance(Class.forName("java.math.BigDecimal"));
        Object[] term109796 = (Object[]) newArray("java.math.BigDecimal", 0);
        setElement(term109792, 0, term109975);
        setElement(term109791, 0, term109792);
        setElement(term109794, 0, term110021);
        setElement(term109791, 1, term109794);
        setElement(term109791, 2, term109796);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 0).getClass();
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term109791;
        args[1] = false;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


