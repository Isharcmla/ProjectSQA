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

public class Fraction_reduce_335503525576 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158350;
     Object term159211;
     Object term159208;

    public Fraction_reduce_335503525576() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term158350 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term158350, term158350.getClass(), "numerator", 4724290);
        setIntField(term158350, term158350.getClass(), "denominator", 2009184409);
        term159211 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term159211, term159211.getClass(), "numerator", 4724290);
        setIntField(term159211, term159211.getClass(), "denominator", 2009184409);
        setField(term159211, term159211.getClass(), "toString", null);
        setField(term159211, term159211.getClass(), "toProperString", null);
        term159208 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term159208, term159208.getClass(), "numerator", 4724290);
        setIntField(term159208, term159208.getClass(), "denominator", 2009184409);
        setField(term159208, term159208.getClass(), "toString", null);
        setField(term159208, term159208.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term158350, args);
        assertTrue(recursiveEquals(term158350, term159211));
        assertTrue(recursiveEquals(retValue, term159208));
    }

};


