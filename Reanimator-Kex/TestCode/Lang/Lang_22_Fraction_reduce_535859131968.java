package org.apache.commons.lang3.math;

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
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.math.EqualityUtils.*;

public class Fraction_reduce_535859131968 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term310421;
     Object term311294;
     Object term311291;

    public Fraction_reduce_535859131968() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term310421 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term310421, term310421.getClass(), "numerator", -2046846414);
        setIntField(term310421, term310421.getClass(), "denominator", 1653099439);
        term311294 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term311294, term311294.getClass(), "numerator", -2046846414);
        setIntField(term311294, term311294.getClass(), "denominator", 1653099439);
        setField(term311294, term311294.getClass(), "toString", null);
        setField(term311294, term311294.getClass(), "toProperString", null);
        term311291 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term311291, term311291.getClass(), "numerator", -2046846414);
        setIntField(term311291, term311291.getClass(), "denominator", 1653099439);
        setField(term311291, term311291.getClass(), "toString", null);
        setField(term311291, term311291.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term310421, args);
        assertTrue(recursiveEquals(term310421, term311294));
        assertTrue(recursiveEquals(retValue, term311291));
    }

};


