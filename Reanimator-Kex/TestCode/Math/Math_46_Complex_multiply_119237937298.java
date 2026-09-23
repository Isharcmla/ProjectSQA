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

public class Complex_multiply_119237937298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5251;
     Object term5460;
     Object term5447;

    public Complex_multiply_119237937298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5251 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term5251, term5251.getClass(), "isNaN", false);
        setDoubleField(term5251, term5251.getClass(), "real", 0.0);
        setDoubleField(term5251, term5251.getClass(), "imaginary", 0.0);
        term5460 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term5460, term5460.getClass(), "imaginary", 0.0);
        setDoubleField(term5460, term5460.getClass(), "real", 0.0);
        setBooleanField(term5460, term5460.getClass(), "isNaN", false);
        setBooleanField(term5460, term5460.getClass(), "isInfinite", false);
        setBooleanField(term5460, term5460.getClass(), "isZero", false);
        term5447 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term5447, term5447.getClass(), "imaginary", Double.POSITIVE_INFINITY);
        setDoubleField(term5447, term5447.getClass(), "real", Double.POSITIVE_INFINITY);
        setBooleanField(term5447, term5447.getClass(), "isNaN", false);
        setBooleanField(term5447, term5447.getClass(), "isInfinite", true);
        setBooleanField(term5447, term5447.getClass(), "isZero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = Double.POSITIVE_INFINITY;
        Object retValue = callMethod(klass, "multiply", argTypes, term5251, args);
        assertTrue(recursiveEquals(term5251, term5460));
        assertTrue(recursiveEquals(retValue, term5447));
    }

};


