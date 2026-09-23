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

public class Complex_divide_886435667147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11724;
     Object term11808;
     Object term11830;
     Object term11831;
     Object term11818;

    public Complex_divide_886435667147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11724 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term11724, term11724.getClass(), "isNaN", false);
        term11808 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term11808, term11808.getClass(), "isNaN", true);
        term11830 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term11830, term11830.getClass(), "imaginary", 0.0);
        setDoubleField(term11830, term11830.getClass(), "real", 0.0);
        setBooleanField(term11830, term11830.getClass(), "isNaN", false);
        setBooleanField(term11830, term11830.getClass(), "isInfinite", false);
        setBooleanField(term11830, term11830.getClass(), "isZero", false);
        term11831 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term11831, term11831.getClass(), "imaginary", 0.0);
        setDoubleField(term11831, term11831.getClass(), "real", 0.0);
        setBooleanField(term11831, term11831.getClass(), "isNaN", true);
        setBooleanField(term11831, term11831.getClass(), "isInfinite", false);
        setBooleanField(term11831, term11831.getClass(), "isZero", false);
        term11818 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term11818, term11818.getClass(), "imaginary", Double.NaN);
        setDoubleField(term11818, term11818.getClass(), "real", Double.NaN);
        setBooleanField(term11818, term11818.getClass(), "isNaN", true);
        setBooleanField(term11818, term11818.getClass(), "isInfinite", false);
        setBooleanField(term11818, term11818.getClass(), "isZero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term11808;
        Object retValue = callMethod(klass, "divide", argTypes, term11724, args);
        assertTrue(recursiveEquals(term11724, term11830));
        assertTrue(recursiveEquals(term11808, term11831));
        assertTrue(recursiveEquals(retValue, term11818));
    }

};


