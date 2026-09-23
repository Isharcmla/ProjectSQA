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

public class Complex_multiply_119237937247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76;
     Object term81;
     Object term437;
     Object term426;

    public Complex_multiply_119237937247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term76, term76.getClass(), "imaginary", 0.37161417339133307);
        setDoubleField(term76, term76.getClass(), "real", 0.6805867182029153);
        setBooleanField(term76, term76.getClass(), "isNaN", true);
        setBooleanField(term76, term76.getClass(), "isInfinite", true);
        term81 = new Double(0.2852810965221698);
        term437 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term437, term437.getClass(), "imaginary", 0.37161417339133307);
        setDoubleField(term437, term437.getClass(), "real", 0.6805867182029153);
        setBooleanField(term437, term437.getClass(), "isNaN", true);
        setBooleanField(term437, term437.getClass(), "isInfinite", true);
        term426 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term426, term426.getClass(), "imaginary", Double.NaN);
        setDoubleField(term426, term426.getClass(), "real", Double.NaN);
        setBooleanField(term426, term426.getClass(), "isNaN", true);
        setBooleanField(term426, term426.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term81;
        Object retValue = callMethod(klass, "multiply", argTypes, term76, args);
        assertTrue(recursiveEquals(term76, term437));
        assertTrue(recursiveEquals(term81, 0.2852810965221698));
        assertTrue(recursiveEquals(retValue, term426));
    }

};


