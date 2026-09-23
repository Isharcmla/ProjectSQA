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

public class Complex_subtract_603476782122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7370;
     Object term7405;
     Object term7406;
     Object term7399;

    public Complex_subtract_603476782122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7370 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term7370, term7370.getClass(), "isNaN", false);
        term7405 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term7405, term7405.getClass(), "imaginary", 0.0);
        setDoubleField(term7405, term7405.getClass(), "real", 0.0);
        setBooleanField(term7405, term7405.getClass(), "isNaN", false);
        setBooleanField(term7405, term7405.getClass(), "isInfinite", false);
        setBooleanField(term7405, term7405.getClass(), "isZero", false);
        term7406 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term7406, term7406.getClass(), "imaginary", 0.0);
        setDoubleField(term7406, term7406.getClass(), "real", 0.0);
        setBooleanField(term7406, term7406.getClass(), "isNaN", false);
        setBooleanField(term7406, term7406.getClass(), "isInfinite", false);
        setBooleanField(term7406, term7406.getClass(), "isZero", false);
        term7399 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term7399, term7399.getClass(), "imaginary", 0.0);
        setDoubleField(term7399, term7399.getClass(), "real", 0.0);
        setBooleanField(term7399, term7399.getClass(), "isNaN", false);
        setBooleanField(term7399, term7399.getClass(), "isInfinite", false);
        setBooleanField(term7399, term7399.getClass(), "isZero", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term7370;
        Object retValue = callMethod(klass, "subtract", argTypes, term7370, args);
        assertTrue(recursiveEquals(term7370, term7405));
        assertTrue(recursiveEquals(term7370, term7406));
        assertTrue(recursiveEquals(retValue, term7399));
    }

};


