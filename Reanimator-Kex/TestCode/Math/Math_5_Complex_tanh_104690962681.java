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

public class Complex_tanh_104690962681 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210;
     Object term9823;
     Object term9813;

    public Complex_tanh_104690962681() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term210 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term210, term210.getClass(), "imaginary", 0.53094494792755);
        setDoubleField(term210, term210.getClass(), "real", 0.146431486357265);
        setBooleanField(term210, term210.getClass(), "isNaN", true);
        setBooleanField(term210, term210.getClass(), "isInfinite", false);
        term9823 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term9823, term9823.getClass(), "imaginary", 0.53094494792755);
        setDoubleField(term9823, term9823.getClass(), "real", 0.146431486357265);
        setBooleanField(term9823, term9823.getClass(), "isNaN", true);
        setBooleanField(term9823, term9823.getClass(), "isInfinite", false);
        term9813 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term9813, term9813.getClass(), "imaginary", Double.NaN);
        setDoubleField(term9813, term9813.getClass(), "real", Double.NaN);
        setBooleanField(term9813, term9813.getClass(), "isNaN", true);
        setBooleanField(term9813, term9813.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "tanh", argTypes, term210, args);
        assertTrue(recursiveEquals(term210, term9823));
        assertTrue(recursiveEquals(retValue, term9813));
    }

};


