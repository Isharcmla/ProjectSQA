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

public class Complex_add_193015892946 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25;
     Object term31;
     Object term392;
     Object term379;

    public Complex_add_193015892946() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term25, term25.getClass(), "imaginary", 0.37773193782763337);
        setDoubleField(term25, term25.getClass(), "real", 0.8474802076607362);
        setBooleanField(term25, term25.getClass(), "isNaN", true);
        setBooleanField(term25, term25.getClass(), "isInfinite", false);
        setBooleanField(term25, term25.getClass(), "isZero", true);
        term31 = new Double(0.5183269973490326);
        term392 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term392, term392.getClass(), "imaginary", 0.37773193782763337);
        setDoubleField(term392, term392.getClass(), "real", 0.8474802076607362);
        setBooleanField(term392, term392.getClass(), "isNaN", true);
        setBooleanField(term392, term392.getClass(), "isInfinite", false);
        setBooleanField(term392, term392.getClass(), "isZero", true);
        term379 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term379, term379.getClass(), "imaginary", Double.NaN);
        setDoubleField(term379, term379.getClass(), "real", Double.NaN);
        setBooleanField(term379, term379.getClass(), "isNaN", true);
        setBooleanField(term379, term379.getClass(), "isInfinite", false);
        setBooleanField(term379, term379.getClass(), "isZero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term31;
        Object retValue = callMethod(klass, "add", argTypes, term25, args);
        assertTrue(recursiveEquals(term25, term392));
        assertTrue(recursiveEquals(term31, 0.5183269973490326));
        assertTrue(recursiveEquals(retValue, term379));
    }

};


