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

public class BigMatrixImpl_getSubMatrix_1108007786320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107547;
     Object term107355;
     Object term107372;

    public BigMatrixImpl_getSubMatrix_1108007786320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107547 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        Object[] term107406 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 1);
        Object[] term107408 = (Object[]) newArray("java.math.BigDecimal", 0);
        setElement(term107406, -2147483648, term107408);
        setField(term107547, term107547.getClass(), "data", term107406);
        term107355 = (int[]) newIntArray(16);
        setIntElement(term107355, 0, -2147483648);
        term107372 = (int[]) newIntArray(32);
        setIntElement(term107372, 0, -2147483648);
        setIntElement(term107372, 1, 1);
        setIntElement(term107372, 2, 1);
        setIntElement(term107372, 3, 1);
        setIntElement(term107372, 4, 1);
        setIntElement(term107372, 5, 1);
        setIntElement(term107372, 6, 1);
        setIntElement(term107372, 7, 1);
        setIntElement(term107372, 8, 1);
        setIntElement(term107372, 9, 1);
        setIntElement(term107372, 10, 1);
        setIntElement(term107372, 11, 1);
        setIntElement(term107372, 12, 1);
        setIntElement(term107372, 13, 1);
        setIntElement(term107372, 14, 1);
        setIntElement(term107372, 15, 1);
        setIntElement(term107372, 16, 1);
        setIntElement(term107372, 17, 1);
        setIntElement(term107372, 18, 1);
        setIntElement(term107372, 19, 1);
        setIntElement(term107372, 20, 1);
        setIntElement(term107372, 21, 1);
        setIntElement(term107372, 22, 1);
        setIntElement(term107372, 23, 1);
        setIntElement(term107372, 24, 1);
        setIntElement(term107372, 25, 1);
        setIntElement(term107372, 26, 1);
        setIntElement(term107372, 27, 1);
        setIntElement(term107372, 28, 1);
        setIntElement(term107372, 29, 1);
        setIntElement(term107372, 30, 1);
        setIntElement(term107372, 31, 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term107355;
        args[1] = term107372;
        callMethod(klass, "getSubMatrix", argTypes, term107547, args);
    }

};


