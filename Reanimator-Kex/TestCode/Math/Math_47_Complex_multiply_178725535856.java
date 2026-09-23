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

public class Complex_multiply_178725535856 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82;
     Object term87;
     Object term527;
     Object term528;
     Object term505;

    public Complex_multiply_178725535856() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term82, term82.getClass(), "imaginary", 0.6300849762307866);
        setDoubleField(term82, term82.getClass(), "real", 0.9737083944266686);
        setBooleanField(term82, term82.getClass(), "isNaN", true);
        setBooleanField(term82, term82.getClass(), "isInfinite", true);
        term87 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term87, term87.getClass(), "imaginary", 0.0668892744806211);
        setDoubleField(term87, term87.getClass(), "real", 0.3587267442738795);
        setBooleanField(term87, term87.getClass(), "isNaN", true);
        setBooleanField(term87, term87.getClass(), "isInfinite", true);
        term527 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term527, term527.getClass(), "imaginary", 0.6300849762307866);
        setDoubleField(term527, term527.getClass(), "real", 0.9737083944266686);
        setBooleanField(term527, term527.getClass(), "isNaN", true);
        setBooleanField(term527, term527.getClass(), "isInfinite", true);
        term528 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term528, term528.getClass(), "imaginary", 0.0668892744806211);
        setDoubleField(term528, term528.getClass(), "real", 0.3587267442738795);
        setBooleanField(term528, term528.getClass(), "isNaN", true);
        setBooleanField(term528, term528.getClass(), "isInfinite", true);
        term505 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term505, term505.getClass(), "imaginary", Double.NaN);
        setDoubleField(term505, term505.getClass(), "real", Double.NaN);
        setBooleanField(term505, term505.getClass(), "isNaN", true);
        setBooleanField(term505, term505.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term87;
        Object retValue = callMethod(klass, "multiply", argTypes, term82, args);
        assertTrue(recursiveEquals(term82, term527));
        assertTrue(recursiveEquals(term87, term528));
        assertTrue(recursiveEquals(retValue, term505));
    }

};


