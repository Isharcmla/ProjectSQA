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

public class Complex_multiply_1192379372110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6545;
     Object term6581;
     Object term6574;

    public Complex_multiply_1192379372110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6545 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term6545, term6545.getClass(), "isNaN", false);
        setDoubleField(term6545, term6545.getClass(), "real", 0.0);
        setDoubleField(term6545, term6545.getClass(), "imaginary", 9.2188684372274053E18);
        term6581 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term6581, term6581.getClass(), "imaginary", 9.2188684372274053E18);
        setDoubleField(term6581, term6581.getClass(), "real", 0.0);
        setBooleanField(term6581, term6581.getClass(), "isNaN", false);
        setBooleanField(term6581, term6581.getClass(), "isInfinite", false);
        setBooleanField(term6581, term6581.getClass(), "isZero", false);
        term6574 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term6574, term6574.getClass(), "imaginary", -2.051266316469184E-289);
        setDoubleField(term6574, term6574.getClass(), "real", -0.0);
        setBooleanField(term6574, term6574.getClass(), "isNaN", false);
        setBooleanField(term6574, term6574.getClass(), "isInfinite", false);
        setBooleanField(term6574, term6574.getClass(), "isZero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = -2.225073858507202E-308;
        Object retValue = callMethod(klass, "multiply", argTypes, term6545, args);
        assertTrue(recursiveEquals(term6545, term6581));
        assertTrue(recursiveEquals(retValue, term6574));
    }

};


