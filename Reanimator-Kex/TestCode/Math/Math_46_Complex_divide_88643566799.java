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

public class Complex_divide_88643566799 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5357;
     Object term5441;
     Object term5484;
     Object term5485;
     Object term5472;

    public Complex_divide_88643566799() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5357 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term5357, term5357.getClass(), "isNaN", false);
        setBooleanField(term5357, term5357.getClass(), "isZero", false);
        term5441 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term5441, term5441.getClass(), "isNaN", false);
        setBooleanField(term5441, term5441.getClass(), "isZero", true);
        term5484 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term5484, term5484.getClass(), "imaginary", 0.0);
        setDoubleField(term5484, term5484.getClass(), "real", 0.0);
        setBooleanField(term5484, term5484.getClass(), "isNaN", false);
        setBooleanField(term5484, term5484.getClass(), "isInfinite", false);
        setBooleanField(term5484, term5484.getClass(), "isZero", false);
        term5485 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term5485, term5485.getClass(), "imaginary", 0.0);
        setDoubleField(term5485, term5485.getClass(), "real", 0.0);
        setBooleanField(term5485, term5485.getClass(), "isNaN", false);
        setBooleanField(term5485, term5485.getClass(), "isInfinite", false);
        setBooleanField(term5485, term5485.getClass(), "isZero", true);
        term5472 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term5472, term5472.getClass(), "imaginary", Double.POSITIVE_INFINITY);
        setDoubleField(term5472, term5472.getClass(), "real", Double.POSITIVE_INFINITY);
        setBooleanField(term5472, term5472.getClass(), "isNaN", false);
        setBooleanField(term5472, term5472.getClass(), "isInfinite", true);
        setBooleanField(term5472, term5472.getClass(), "isZero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term5441;
        Object retValue = callMethod(klass, "divide", argTypes, term5357, args);
        assertTrue(recursiveEquals(term5357, term5484));
        assertTrue(recursiveEquals(term5441, term5485));
        assertTrue(recursiveEquals(retValue, term5472));
    }

};


