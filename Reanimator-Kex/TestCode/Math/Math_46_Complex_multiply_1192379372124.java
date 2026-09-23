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

public class Complex_multiply_1192379372124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7515;
     Object term7549;
     Object term7542;

    public Complex_multiply_1192379372124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7515 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term7515, term7515.getClass(), "isNaN", false);
        setDoubleField(term7515, term7515.getClass(), "real", 9.2188684372274053E18);
        term7549 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term7549, term7549.getClass(), "imaginary", 0.0);
        setDoubleField(term7549, term7549.getClass(), "real", 9.2188684372274053E18);
        setBooleanField(term7549, term7549.getClass(), "isNaN", false);
        setBooleanField(term7549, term7549.getClass(), "isInfinite", false);
        setBooleanField(term7549, term7549.getClass(), "isZero", false);
        term7542 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term7542, term7542.getClass(), "imaginary", -0.0);
        setDoubleField(term7542, term7542.getClass(), "real", -2.051266316469184E-289);
        setBooleanField(term7542, term7542.getClass(), "isNaN", false);
        setBooleanField(term7542, term7542.getClass(), "isInfinite", false);
        setBooleanField(term7542, term7542.getClass(), "isZero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = -2.225073858507202E-308;
        Object retValue = callMethod(klass, "multiply", argTypes, term7515, args);
        assertTrue(recursiveEquals(term7515, term7549));
        assertTrue(recursiveEquals(retValue, term7542));
    }

};


