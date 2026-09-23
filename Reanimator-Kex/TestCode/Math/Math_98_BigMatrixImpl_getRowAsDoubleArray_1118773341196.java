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

public class BigMatrixImpl_getRowAsDoubleArray_1118773341196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89464;

    public BigMatrixImpl_getRowAsDoubleArray_1118773341196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89464 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        Object[] term89352 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 1);
        Object[] term89353 = (Object[]) newArray("java.math.BigDecimal", 0);
        setElement(term89352, 0, term89353);
        setField(term89464, term89464.getClass(), "data", term89352);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        callMethod(klass, "getRowAsDoubleArray", argTypes, term89464, args);
    }

};


