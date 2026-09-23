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

public class Fraction_reduce_3355035251401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term409598;
     Object term409808;
     Object term409805;

    public Fraction_reduce_3355035251401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term409598 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term409598, term409598.getClass(), "numerator", 725161370);
        setIntField(term409598, term409598.getClass(), "denominator", 396584133);
        term409808 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term409808, term409808.getClass(), "numerator", 725161370);
        setIntField(term409808, term409808.getClass(), "denominator", 396584133);
        setField(term409808, term409808.getClass(), "toString", null);
        setField(term409808, term409808.getClass(), "toProperString", null);
        term409805 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term409805, term409805.getClass(), "numerator", 725161370);
        setIntField(term409805, term409805.getClass(), "denominator", 396584133);
        setField(term409805, term409805.getClass(), "toString", null);
        setField(term409805, term409805.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term409598, args);
        assertTrue(recursiveEquals(term409598, term409808));
        assertTrue(recursiveEquals(retValue, term409805));
    }

};


