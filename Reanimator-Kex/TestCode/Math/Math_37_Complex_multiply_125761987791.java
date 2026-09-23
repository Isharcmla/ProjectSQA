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

public class Complex_multiply_125761987791 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1979;
     Object term10580;
     Object term10574;

    public Complex_multiply_125761987791() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1979 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term1979, term1979.getClass(), "isNaN", false);
        setDoubleField(term1979, term1979.getClass(), "real", 9.2188684372274053E18);
        term10580 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term10580, term10580.getClass(), "imaginary", 0.0);
        setDoubleField(term10580, term10580.getClass(), "real", 9.2188684372274053E18);
        setBooleanField(term10580, term10580.getClass(), "isNaN", false);
        setBooleanField(term10580, term10580.getClass(), "isInfinite", false);
        term10574 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term10574, term10574.getClass(), "imaginary", 0.0);
        setDoubleField(term10574, term10574.getClass(), "real", 0.0);
        setBooleanField(term10574, term10574.getClass(), "isNaN", false);
        setBooleanField(term10574, term10574.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "multiply", argTypes, term1979, args);
        assertTrue(recursiveEquals(term1979, term10580));
        assertTrue(recursiveEquals(retValue, term10574));
    }

};


