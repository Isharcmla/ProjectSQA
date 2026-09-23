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

public class Complex_pow_194435770469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196;
     Object term202;
     Object term2858;
     Object term2852;

    public Complex_pow_194435770469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term196 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term196, term196.getClass(), "imaginary", 0.025133051616627267);
        setDoubleField(term196, term196.getClass(), "real", 0.016575281023182953);
        setBooleanField(term196, term196.getClass(), "isNaN", true);
        setBooleanField(term196, term196.getClass(), "isInfinite", true);
        setBooleanField(term196, term196.getClass(), "isZero", true);
        term202 = new Double(0.5308350402051779);
        term2858 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term2858, term2858.getClass(), "imaginary", 0.025133051616627267);
        setDoubleField(term2858, term2858.getClass(), "real", 0.016575281023182953);
        setBooleanField(term2858, term2858.getClass(), "isNaN", true);
        setBooleanField(term2858, term2858.getClass(), "isInfinite", true);
        setBooleanField(term2858, term2858.getClass(), "isZero", true);
        term2852 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term2852, term2852.getClass(), "imaginary", Double.NaN);
        setDoubleField(term2852, term2852.getClass(), "real", Double.NaN);
        setBooleanField(term2852, term2852.getClass(), "isNaN", true);
        setBooleanField(term2852, term2852.getClass(), "isInfinite", false);
        setBooleanField(term2852, term2852.getClass(), "isZero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term202;
        Object retValue = callMethod(klass, "pow", argTypes, term196, args);
        assertTrue(recursiveEquals(term196, term2858));
        assertTrue(recursiveEquals(term202, 0.5308350402051779));
        assertTrue(recursiveEquals(retValue, term2852));
    }

};


