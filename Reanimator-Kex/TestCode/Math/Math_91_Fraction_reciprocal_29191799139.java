package org.apache.commons.math.fraction;

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
import static org.apache.commons.math.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.fraction.EqualityUtils.*;

public class Fraction_reciprocal_29191799139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62;
     Object term1559;
     Object term1551;

    public Fraction_reciprocal_29191799139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term62, term62.getClass(), "denominator", -203030934);
        setIntField(term62, term62.getClass(), "numerator", -1179120542);
        term1559 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term1559, term1559.getClass(), "denominator", -203030934);
        setIntField(term1559, term1559.getClass(), "numerator", -1179120542);
        term1551 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term1551, term1551.getClass(), "denominator", 589560271);
        setIntField(term1551, term1551.getClass(), "numerator", 101515467);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reciprocal", argTypes, term62, args);
        assertTrue(recursiveEquals(term62, term1559));
        assertTrue(recursiveEquals(retValue, term1551));
    }

};


