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

public class Complex_divide_197557983091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2373;
     Object term2459;
     Object term10830;
     Object term10831;
     Object term10825;

    public Complex_divide_197557983091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2373 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setBooleanField(term2373, term2373.getClass(), "isNaN", false);
        setBooleanField(term2373, term2373.getClass(), "isInfinite", false);
        term2459 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setBooleanField(term2459, term2459.getClass(), "isNaN", false);
        setDoubleField(term2459, term2459.getClass(), "real", 4.503599627370497E15);
        setDoubleField(term2459, term2459.getClass(), "imaginary", 0.0);
        setBooleanField(term2459, term2459.getClass(), "isInfinite", true);
        term10830 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term10830, term10830.getClass(), "imaginary", 0.0);
        setDoubleField(term10830, term10830.getClass(), "real", 0.0);
        setBooleanField(term10830, term10830.getClass(), "isNaN", false);
        setBooleanField(term10830, term10830.getClass(), "isInfinite", false);
        term10831 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term10831, term10831.getClass(), "imaginary", 0.0);
        setDoubleField(term10831, term10831.getClass(), "real", 4.503599627370497E15);
        setBooleanField(term10831, term10831.getClass(), "isNaN", false);
        setBooleanField(term10831, term10831.getClass(), "isInfinite", true);
        term10825 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term10825, term10825.getClass(), "imaginary", 0.0);
        setDoubleField(term10825, term10825.getClass(), "real", 0.0);
        setBooleanField(term10825, term10825.getClass(), "isNaN", false);
        setBooleanField(term10825, term10825.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term2459;
        Object retValue = callMethod(klass, "divide", argTypes, term2373, args);
        assertTrue(recursiveEquals(term2373, term10830));
        assertTrue(recursiveEquals(term2459, term10831));
        assertTrue(recursiveEquals(retValue, term10825));
    }

};


