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

public class Fraction_reduce_3355035251489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term438098;
     Object term438658;
     Object term438655;

    public Fraction_reduce_3355035251489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term438098 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term438098, term438098.getClass(), "numerator", -62128094);
        setIntField(term438098, term438098.getClass(), "denominator", 1417739271);
        term438658 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term438658, term438658.getClass(), "numerator", -62128094);
        setIntField(term438658, term438658.getClass(), "denominator", 1417739271);
        setField(term438658, term438658.getClass(), "toString", null);
        setField(term438658, term438658.getClass(), "toProperString", null);
        term438655 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term438655, term438655.getClass(), "numerator", -62128094);
        setIntField(term438655, term438655.getClass(), "denominator", 1417739271);
        setField(term438655, term438655.getClass(), "toString", null);
        setField(term438655, term438655.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term438098, args);
        assertTrue(recursiveEquals(term438098, term438658));
        assertTrue(recursiveEquals(retValue, term438655));
    }

};


