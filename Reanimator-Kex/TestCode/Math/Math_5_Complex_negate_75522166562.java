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

public class Complex_negate_75522166562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111;
     Object term844;
     Object term834;

    public Complex_negate_75522166562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term111, term111.getClass(), "imaginary", 0.25937345430928016);
        setDoubleField(term111, term111.getClass(), "real", 0.5873228247510078);
        setBooleanField(term111, term111.getClass(), "isNaN", true);
        setBooleanField(term111, term111.getClass(), "isInfinite", false);
        term844 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term844, term844.getClass(), "imaginary", 0.25937345430928016);
        setDoubleField(term844, term844.getClass(), "real", 0.5873228247510078);
        setBooleanField(term844, term844.getClass(), "isNaN", true);
        setBooleanField(term844, term844.getClass(), "isInfinite", false);
        term834 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term834, term834.getClass(), "imaginary", Double.NaN);
        setDoubleField(term834, term834.getClass(), "real", Double.NaN);
        setBooleanField(term834, term834.getClass(), "isNaN", true);
        setBooleanField(term834, term834.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "negate", argTypes, term111, args);
        assertTrue(recursiveEquals(term111, term844));
        assertTrue(recursiveEquals(retValue, term834));
    }

};


