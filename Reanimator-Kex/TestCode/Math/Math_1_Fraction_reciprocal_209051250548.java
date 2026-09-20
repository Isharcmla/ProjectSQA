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

public class Fraction_reciprocal_209051250548 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64;
     Object term1841;
     Object term1833;

    public Fraction_reciprocal_209051250548() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term64, term64.getClass(), "denominator", -1179120542);
        setIntField(term64, term64.getClass(), "numerator", -73683645);
        term1841 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term1841, term1841.getClass(), "denominator", -1179120542);
        setIntField(term1841, term1841.getClass(), "numerator", -73683645);
        term1833 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term1833, term1833.getClass(), "denominator", 73683645);
        setIntField(term1833, term1833.getClass(), "numerator", 1179120542);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reciprocal", argTypes, term64, args);
        assertTrue(recursiveEquals(term64, term1841));
        assertTrue(recursiveEquals(retValue, term1833));
    }

};
