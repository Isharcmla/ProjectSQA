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

public class Complex_divide_204335367351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44;
     Object term49;
     Object term713;
     Object term707;

    public Complex_divide_204335367351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term44, term44.getClass(), "imaginary", 0.6436713023569729);
        setDoubleField(term44, term44.getClass(), "real", 0.7332741045694002);
        setBooleanField(term44, term44.getClass(), "isNaN", false);
        setBooleanField(term44, term44.getClass(), "isInfinite", false);
        term49 = new Double(0.4569171842750229);
        term713 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term713, term713.getClass(), "imaginary", 0.6436713023569729);
        setDoubleField(term713, term713.getClass(), "real", 0.7332741045694002);
        setBooleanField(term713, term713.getClass(), "isNaN", false);
        setBooleanField(term713, term713.getClass(), "isInfinite", false);
        term707 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term707, term707.getClass(), "imaginary", 1.408726404935431);
        setDoubleField(term707, term707.getClass(), "real", 1.6048293428334606);
        setBooleanField(term707, term707.getClass(), "isNaN", false);
        setBooleanField(term707, term707.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term49;
        Object retValue = callMethod(klass, "divide", argTypes, term44, args);
        assertTrue(recursiveEquals(term44, term713));
        assertTrue(recursiveEquals(term49, 0.4569171842750229));
        assertTrue(recursiveEquals(retValue, term707));
    }

};


