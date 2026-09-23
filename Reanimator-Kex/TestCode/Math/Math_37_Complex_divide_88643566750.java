package org.apache.commons.math.complex;

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
import static org.apache.commons.math.complex.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.complex.EqualityUtils.*;

public class Complex_divide_88643566750 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34;
     Object term39;
     Object term426;
     Object term427;
     Object term421;

    public Complex_divide_88643566750() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term34, term34.getClass(), "imaginary", 0.7031006357544823);
        setDoubleField(term34, term34.getClass(), "real", 0.9527281779865117);
        setBooleanField(term34, term34.getClass(), "isNaN", false);
        setBooleanField(term34, term34.getClass(), "isInfinite", true);
        term39 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term39, term39.getClass(), "imaginary", 0.9828442029246764);
        setDoubleField(term39, term39.getClass(), "real", 0.2779719046761513);
        setBooleanField(term39, term39.getClass(), "isNaN", false);
        setBooleanField(term39, term39.getClass(), "isInfinite", true);
        term426 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term426, term426.getClass(), "imaginary", 0.7031006357544823);
        setDoubleField(term426, term426.getClass(), "real", 0.9527281779865117);
        setBooleanField(term426, term426.getClass(), "isNaN", false);
        setBooleanField(term426, term426.getClass(), "isInfinite", true);
        term427 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term427, term427.getClass(), "imaginary", 0.9828442029246764);
        setDoubleField(term427, term427.getClass(), "real", 0.2779719046761513);
        setBooleanField(term427, term427.getClass(), "isNaN", false);
        setBooleanField(term427, term427.getClass(), "isInfinite", true);
        term421 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term421, term421.getClass(), "imaginary", -0.7102232039988365);
        setDoubleField(term421, term421.getClass(), "real", 0.9162415872582119);
        setBooleanField(term421, term421.getClass(), "isNaN", false);
        setBooleanField(term421, term421.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term39;
        Object retValue = callMethod(klass, "divide", argTypes, term34, args);
        assertTrue(recursiveEquals(term34, term426));
        assertTrue(recursiveEquals(term39, term427));
        assertTrue(recursiveEquals(retValue, term421));
    }

};


