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

public class Complex_multiply_178725535895 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5823;
     Object term5988;
     Object term5989;
     Object term5983;

    public Complex_multiply_178725535895() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5823 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term5823, term5823.getClass(), "isNaN", false);
        term5988 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term5988, term5988.getClass(), "imaginary", 0.0);
        setDoubleField(term5988, term5988.getClass(), "real", 0.0);
        setBooleanField(term5988, term5988.getClass(), "isNaN", false);
        setBooleanField(term5988, term5988.getClass(), "isInfinite", false);
        term5989 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term5989, term5989.getClass(), "imaginary", 0.0);
        setDoubleField(term5989, term5989.getClass(), "real", 0.0);
        setBooleanField(term5989, term5989.getClass(), "isNaN", false);
        setBooleanField(term5989, term5989.getClass(), "isInfinite", false);
        term5983 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term5983, term5983.getClass(), "imaginary", 0.0);
        setDoubleField(term5983, term5983.getClass(), "real", 0.0);
        setBooleanField(term5983, term5983.getClass(), "isNaN", false);
        setBooleanField(term5983, term5983.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term5823;
        Object retValue = callMethod(klass, "multiply", argTypes, term5823, args);
        assertTrue(recursiveEquals(term5823, term5988));
        assertTrue(recursiveEquals(term5823, term5989));
        assertTrue(recursiveEquals(retValue, term5983));
    }

};


