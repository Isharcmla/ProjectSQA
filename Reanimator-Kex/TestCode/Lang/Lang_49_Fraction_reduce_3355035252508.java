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

public class Fraction_reduce_3355035252508 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term746594;
     Object term747564;
     Object term747558;

    public Fraction_reduce_3355035252508() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term746594 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term746594, term746594.getClass(), "numerator", 644366418);
        setIntField(term746594, term746594.getClass(), "denominator", 1907105793);
        term747564 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term747564, term747564.getClass(), "numerator", 644366418);
        setIntField(term747564, term747564.getClass(), "denominator", 1907105793);
        setField(term747564, term747564.getClass(), "toString", null);
        setField(term747564, term747564.getClass(), "toProperString", null);
        term747558 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term747558, term747558.getClass(), "numerator", 214788806);
        setIntField(term747558, term747558.getClass(), "denominator", 635701931);
        setField(term747558, term747558.getClass(), "toString", null);
        setField(term747558, term747558.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term746594, args);
        assertTrue(recursiveEquals(term746594, term747564));
        assertTrue(recursiveEquals(retValue, term747558));
    }

};


