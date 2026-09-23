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
import java.lang.Double;

public class Complex_divide_88643566748 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39;
     Object term45;
     Object term445;
     Object term446;
     Object term433;

    public Complex_divide_88643566748() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term39, term39.getClass(), "imaginary", 0.7031006357544823);
        setDoubleField(term39, term39.getClass(), "real", 0.9527281779865117);
        setBooleanField(term39, term39.getClass(), "isNaN", false);
        setBooleanField(term39, term39.getClass(), "isInfinite", true);
        setBooleanField(term39, term39.getClass(), "isZero", true);
        term45 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term45, term45.getClass(), "imaginary", 0.9828442029246764);
        setDoubleField(term45, term45.getClass(), "real", 0.2779719046761513);
        setBooleanField(term45, term45.getClass(), "isNaN", false);
        setBooleanField(term45, term45.getClass(), "isInfinite", false);
        setBooleanField(term45, term45.getClass(), "isZero", true);
        term445 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term445, term445.getClass(), "imaginary", 0.7031006357544823);
        setDoubleField(term445, term445.getClass(), "real", 0.9527281779865117);
        setBooleanField(term445, term445.getClass(), "isNaN", false);
        setBooleanField(term445, term445.getClass(), "isInfinite", true);
        setBooleanField(term445, term445.getClass(), "isZero", true);
        term446 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term446, term446.getClass(), "imaginary", 0.9828442029246764);
        setDoubleField(term446, term446.getClass(), "real", 0.2779719046761513);
        setBooleanField(term446, term446.getClass(), "isNaN", false);
        setBooleanField(term446, term446.getClass(), "isInfinite", false);
        setBooleanField(term446, term446.getClass(), "isZero", true);
        term433 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term433, term433.getClass(), "imaginary", Double.NaN);
        setDoubleField(term433, term433.getClass(), "real", Double.NaN);
        setBooleanField(term433, term433.getClass(), "isNaN", true);
        setBooleanField(term433, term433.getClass(), "isInfinite", false);
        setBooleanField(term433, term433.getClass(), "isZero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term45;
        Object retValue = callMethod(klass, "divide", argTypes, term39, args);
        assertTrue(recursiveEquals(term39, term445));
        assertTrue(recursiveEquals(term45, term446));
        assertTrue(recursiveEquals(retValue, term433));
    }

};


