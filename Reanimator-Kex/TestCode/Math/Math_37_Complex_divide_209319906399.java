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

public class Complex_divide_209319906399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10974;
     Object term10987;
     Object term10976;

    public Complex_divide_209319906399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10974 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term10974, term10974.getClass(), "isNaN", true);
        term10987 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term10987, term10987.getClass(), "imaginary", 0.0);
        setDoubleField(term10987, term10987.getClass(), "real", 0.0);
        setBooleanField(term10987, term10987.getClass(), "isNaN", true);
        setBooleanField(term10987, term10987.getClass(), "isInfinite", false);
        term10976 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term10976, term10976.getClass(), "imaginary", Double.NaN);
        setDoubleField(term10976, term10976.getClass(), "real", Double.NaN);
        setBooleanField(term10976, term10976.getClass(), "isNaN", true);
        setBooleanField(term10976, term10976.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 0.0;
        Object retValue = callMethod(klass, "divide", argTypes, term10974, args);
        assertTrue(recursiveEquals(term10974, term10987));
        assertTrue(recursiveEquals(retValue, term10976));
    }

};


