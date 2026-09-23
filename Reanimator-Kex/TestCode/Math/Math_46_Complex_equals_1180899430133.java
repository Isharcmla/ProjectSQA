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

public class Complex_equals_1180899430133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9610;
     Object term9694;
     Object term9715;
     Object term9716;

    public Complex_equals_1180899430133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9610 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        term9694 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        term9715 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term9715, term9715.getClass(), "imaginary", 0.0);
        setDoubleField(term9715, term9715.getClass(), "real", 0.0);
        setBooleanField(term9715, term9715.getClass(), "isNaN", false);
        setBooleanField(term9715, term9715.getClass(), "isInfinite", false);
        setBooleanField(term9715, term9715.getClass(), "isZero", false);
        term9716 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term9716, term9716.getClass(), "imaginary", 0.0);
        setDoubleField(term9716, term9716.getClass(), "real", 0.0);
        setBooleanField(term9716, term9716.getClass(), "isNaN", false);
        setBooleanField(term9716, term9716.getClass(), "isInfinite", false);
        setBooleanField(term9716, term9716.getClass(), "isZero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term9694;
        Object retValue = callMethod(klass, "equals", argTypes, term9610, args);
        assertTrue(recursiveEquals(term9610, term9715));
        assertTrue(recursiveEquals(term9694, term9716));
        assertTrue(recursiveEquals(retValue, true));
    }

};


