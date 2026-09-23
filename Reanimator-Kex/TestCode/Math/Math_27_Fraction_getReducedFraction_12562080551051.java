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

public class Fraction_getReducedFraction_12562080551051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term439598;

    public Fraction_getReducedFraction_12562080551051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term439598 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term439598, term439598.getClass(), "denominator", 2059404341);
        setIntField(term439598, term439598.getClass(), "numerator", 981384383);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = -981384383;
        args[1] = -2059404341;
        Object retValue = callMethod(klass, "getReducedFraction", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term439598));
    }

};


