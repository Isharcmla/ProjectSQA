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

public class Complex_acos_143056153150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98;
     Object term480;
     Object term470;

    public Complex_acos_143056153150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term98, term98.getClass(), "imaginary", 0.3202192021706908);
        setDoubleField(term98, term98.getClass(), "real", 0.22651340641904605);
        setBooleanField(term98, term98.getClass(), "isNaN", true);
        setBooleanField(term98, term98.getClass(), "isInfinite", true);
        term480 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term480, term480.getClass(), "imaginary", 0.3202192021706908);
        setDoubleField(term480, term480.getClass(), "real", 0.22651340641904605);
        setBooleanField(term480, term480.getClass(), "isNaN", true);
        setBooleanField(term480, term480.getClass(), "isInfinite", true);
        term470 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term470, term470.getClass(), "imaginary", Double.NaN);
        setDoubleField(term470, term470.getClass(), "real", Double.NaN);
        setBooleanField(term470, term470.getClass(), "isNaN", true);
        setBooleanField(term470, term470.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term98, args);
        assertTrue(recursiveEquals(term98, term480));
        assertTrue(recursiveEquals(retValue, term470));
    }

};


