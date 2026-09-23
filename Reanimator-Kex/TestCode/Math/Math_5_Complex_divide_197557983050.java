package org.apache.commons.math3.complex;

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
import static org.apache.commons.math3.complex.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.complex.EqualityUtils.*;

public class Complex_divide_197557983050 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34;
     Object term39;
     Object term683;
     Object term684;
     Object term678;

    public Complex_divide_197557983050() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term34, term34.getClass(), "imaginary", 0.7031006357544823);
        setDoubleField(term34, term34.getClass(), "real", 0.9527281779865117);
        setBooleanField(term34, term34.getClass(), "isNaN", false);
        setBooleanField(term34, term34.getClass(), "isInfinite", true);
        term39 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term39, term39.getClass(), "imaginary", 0.9828442029246764);
        setDoubleField(term39, term39.getClass(), "real", 0.2779719046761513);
        setBooleanField(term39, term39.getClass(), "isNaN", false);
        setBooleanField(term39, term39.getClass(), "isInfinite", true);
        term683 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term683, term683.getClass(), "imaginary", 0.7031006357544823);
        setDoubleField(term683, term683.getClass(), "real", 0.9527281779865117);
        setBooleanField(term683, term683.getClass(), "isNaN", false);
        setBooleanField(term683, term683.getClass(), "isInfinite", true);
        term684 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term684, term684.getClass(), "imaginary", 0.9828442029246764);
        setDoubleField(term684, term684.getClass(), "real", 0.2779719046761513);
        setBooleanField(term684, term684.getClass(), "isNaN", false);
        setBooleanField(term684, term684.getClass(), "isInfinite", true);
        term678 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term678, term678.getClass(), "imaginary", -0.7102232039988365);
        setDoubleField(term678, term678.getClass(), "real", 0.9162415872582119);
        setBooleanField(term678, term678.getClass(), "isNaN", false);
        setBooleanField(term678, term678.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term39;
        Object retValue = callMethod(klass, "divide", argTypes, term34, args);
        assertTrue(recursiveEquals(term34, term683));
        assertTrue(recursiveEquals(term39, term684));
        assertTrue(recursiveEquals(retValue, term678));
    }

};


