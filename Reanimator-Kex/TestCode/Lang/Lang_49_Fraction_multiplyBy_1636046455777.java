package org.apache.commons.lang.math;

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
import java.lang.ArithmeticException;
import static org.apache.commons.lang.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_multiplyBy_1636046455777 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216870;
     Object term216950;

    public Fraction_multiplyBy_1636046455777() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term216870 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term216870, term216870.getClass(), "numerator", 706543098);
        setIntField(term216870, term216870.getClass(), "denominator", 586650369);
        term216950 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term216950, term216950.getClass(), "numerator", 491807238);
        setIntField(term216950, term216950.getClass(), "denominator", 2081456233);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term216950;
        try {
            callMethod(klass, "multiplyBy", argTypes, term216870, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


