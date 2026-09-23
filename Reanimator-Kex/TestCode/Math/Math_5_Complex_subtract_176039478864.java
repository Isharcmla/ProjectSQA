package org.apache.commons.math3.complex;

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
import static org.apache.commons.math3.complex.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.complex.EqualityUtils.*;
import java.lang.Double;

public class Complex_subtract_176039478864 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126;
     Object term131;
     Object term890;
     Object term884;

    public Complex_subtract_176039478864() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term126, term126.getClass(), "imaginary", 0.6862221294683138);
        setDoubleField(term126, term126.getClass(), "real", 0.15917839663695388);
        setBooleanField(term126, term126.getClass(), "isNaN", false);
        setBooleanField(term126, term126.getClass(), "isInfinite", true);
        term131 = new Double(0.9374115574082594);
        term890 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term890, term890.getClass(), "imaginary", 0.6862221294683138);
        setDoubleField(term890, term890.getClass(), "real", 0.15917839663695388);
        setBooleanField(term890, term890.getClass(), "isNaN", false);
        setBooleanField(term890, term890.getClass(), "isInfinite", true);
        term884 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term884, term884.getClass(), "imaginary", 0.6862221294683138);
        setDoubleField(term884, term884.getClass(), "real", -0.7782331607713056);
        setBooleanField(term884, term884.getClass(), "isNaN", false);
        setBooleanField(term884, term884.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term131;
        Object retValue = callMethod(klass, "subtract", argTypes, term126, args);
        assertTrue(recursiveEquals(term126, term890));
        assertTrue(recursiveEquals(term131, 0.9374115574082594));
        assertTrue(recursiveEquals(retValue, term884));
    }

};


