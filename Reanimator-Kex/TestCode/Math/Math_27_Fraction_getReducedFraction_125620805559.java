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
import java.lang.Integer;

public class Fraction_getReducedFraction_125620805559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122;
     Object term124;
     Object term7598;

    public Fraction_getReducedFraction_125620805559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122 = new Integer(-93135961);
        term124 = new Integer(-112921587);
        term7598 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term7598, term7598.getClass(), "denominator", 112921587);
        setIntField(term7598, term7598.getClass(), "numerator", 93135961);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term122;
        args[1] = term124;
        Object retValue = callMethod(klass, "getReducedFraction", argTypes, null, args);
        assertTrue(recursiveEquals(term122, -93135961));
        assertTrue(recursiveEquals(term124, -112921587));
        assertTrue(recursiveEquals(retValue, term7598));
    }

};


