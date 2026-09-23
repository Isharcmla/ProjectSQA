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

public class BigMatrixImpl_getRowMatrix_487175238182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87046;

    public BigMatrixImpl_getRowMatrix_487175238182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87046 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        Object[] term86932 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 1);
        Object[] term86933 = (Object[]) newArray("java.math.BigDecimal", 0);
        setElement(term86932, 0, term86933);
        setField(term87046, term87046.getClass(), "data", term86932);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        callMethod(klass, "getRowMatrix", argTypes, term87046, args);
    }

};


