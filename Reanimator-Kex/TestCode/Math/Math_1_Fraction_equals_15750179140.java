package org.apache.commons.math3.fraction;

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
import static org.apache.commons.math3.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.fraction.EqualityUtils.*;

public class Fraction_equals_15750179140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39;
     Object term42;
     Object term1704;
     Object term1705;

    public Fraction_equals_15750179140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term39, term39.getClass(), "denominator", 597278769);
        setIntField(term39, term39.getClass(), "numerator", -1685132342);
        term42 = newInstance(Class.forName("java.lang.Object"));
        term1704 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term1704, term1704.getClass(), "denominator", 597278769);
        setIntField(term1704, term1704.getClass(), "numerator", -1685132342);
        term1705 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term42;
        Object retValue = callMethod(klass, "equals", argTypes, term39, args);
        assertTrue(recursiveEquals(term39, term1704));
        assertTrue(recursiveEquals(term42, term1705));
        assertTrue(recursiveEquals(retValue, false));
    }

};
