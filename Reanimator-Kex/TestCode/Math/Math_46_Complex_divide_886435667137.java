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

public class Complex_divide_886435667137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10396;
     Object term10411;
     Object term10412;
     Object term10405;

    public Complex_divide_886435667137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10396 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term10396, term10396.getClass(), "isNaN", true);
        term10411 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term10411, term10411.getClass(), "imaginary", 0.0);
        setDoubleField(term10411, term10411.getClass(), "real", 0.0);
        setBooleanField(term10411, term10411.getClass(), "isNaN", true);
        setBooleanField(term10411, term10411.getClass(), "isInfinite", false);
        setBooleanField(term10411, term10411.getClass(), "isZero", false);
        term10412 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term10412, term10412.getClass(), "imaginary", 0.0);
        setDoubleField(term10412, term10412.getClass(), "real", 0.0);
        setBooleanField(term10412, term10412.getClass(), "isNaN", true);
        setBooleanField(term10412, term10412.getClass(), "isInfinite", false);
        setBooleanField(term10412, term10412.getClass(), "isZero", false);
        term10405 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term10405, term10405.getClass(), "imaginary", Double.NaN);
        setDoubleField(term10405, term10405.getClass(), "real", Double.NaN);
        setBooleanField(term10405, term10405.getClass(), "isNaN", true);
        setBooleanField(term10405, term10405.getClass(), "isInfinite", false);
        setBooleanField(term10405, term10405.getClass(), "isZero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term10396;
        Object retValue = callMethod(klass, "divide", argTypes, term10396, args);
        assertTrue(recursiveEquals(term10396, term10411));
        assertTrue(recursiveEquals(term10396, term10412));
        assertTrue(recursiveEquals(retValue, term10405));
    }

};


