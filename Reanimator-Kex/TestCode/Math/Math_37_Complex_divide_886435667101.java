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

public class Complex_divide_886435667101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11098;
     Object term11182;
     Object term11233;
     Object term11234;
     Object term11228;

    public Complex_divide_886435667101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11098 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term11098, term11098.getClass(), "isNaN", false);
        term11182 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term11182, term11182.getClass(), "isNaN", false);
        setDoubleField(term11182, term11182.getClass(), "real", 4.503599627370497E15);
        setDoubleField(term11182, term11182.getClass(), "imaginary", 0.0);
        setBooleanField(term11182, term11182.getClass(), "isInfinite", false);
        term11233 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term11233, term11233.getClass(), "imaginary", 0.0);
        setDoubleField(term11233, term11233.getClass(), "real", 0.0);
        setBooleanField(term11233, term11233.getClass(), "isNaN", false);
        setBooleanField(term11233, term11233.getClass(), "isInfinite", false);
        term11234 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term11234, term11234.getClass(), "imaginary", 0.0);
        setDoubleField(term11234, term11234.getClass(), "real", 4.503599627370497E15);
        setBooleanField(term11234, term11234.getClass(), "isNaN", false);
        setBooleanField(term11234, term11234.getClass(), "isInfinite", false);
        term11228 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term11228, term11228.getClass(), "imaginary", 0.0);
        setDoubleField(term11228, term11228.getClass(), "real", 0.0);
        setBooleanField(term11228, term11228.getClass(), "isNaN", false);
        setBooleanField(term11228, term11228.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term11182;
        Object retValue = callMethod(klass, "divide", argTypes, term11098, args);
        assertTrue(recursiveEquals(term11098, term11233));
        assertTrue(recursiveEquals(term11182, term11234));
        assertTrue(recursiveEquals(retValue, term11228));
    }

};


