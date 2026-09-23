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
import static org.apache.commons.lang.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.math.EqualityUtils.*;

public class Fraction_reduce_3355035251862 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term546125;
     Object term546503;
     Object term546500;

    public Fraction_reduce_3355035251862() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term546125 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term546125, term546125.getClass(), "numerator", -536870911);
        setIntField(term546125, term546125.getClass(), "denominator", 1073741824);
        term546503 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term546503, term546503.getClass(), "numerator", -536870911);
        setIntField(term546503, term546503.getClass(), "denominator", 1073741824);
        setField(term546503, term546503.getClass(), "toString", null);
        setField(term546503, term546503.getClass(), "toProperString", null);
        term546500 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term546500, term546500.getClass(), "numerator", -536870911);
        setIntField(term546500, term546500.getClass(), "denominator", 1073741824);
        setField(term546500, term546500.getClass(), "toString", null);
        setField(term546500, term546500.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term546125, args);
        assertTrue(recursiveEquals(term546125, term546503));
        assertTrue(recursiveEquals(retValue, term546500));
    }

};


