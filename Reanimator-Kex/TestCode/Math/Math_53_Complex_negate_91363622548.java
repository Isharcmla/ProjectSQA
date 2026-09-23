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

public class Complex_negate_91363622548 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83;
     Object term449;
     Object term439;

    public Complex_negate_91363622548() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term83, term83.getClass(), "imaginary", 0.6300849762307866);
        setDoubleField(term83, term83.getClass(), "real", 0.9737083944266686);
        setBooleanField(term83, term83.getClass(), "isNaN", true);
        setBooleanField(term83, term83.getClass(), "isInfinite", true);
        term449 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term449, term449.getClass(), "imaginary", 0.6300849762307866);
        setDoubleField(term449, term449.getClass(), "real", 0.9737083944266686);
        setBooleanField(term449, term449.getClass(), "isNaN", true);
        setBooleanField(term449, term449.getClass(), "isInfinite", true);
        term439 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term439, term439.getClass(), "imaginary", Double.NaN);
        setDoubleField(term439, term439.getClass(), "real", Double.NaN);
        setBooleanField(term439, term439.getClass(), "isNaN", true);
        setBooleanField(term439, term439.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "negate", argTypes, term83, args);
        assertTrue(recursiveEquals(term83, term449));
        assertTrue(recursiveEquals(retValue, term439));
    }

};


