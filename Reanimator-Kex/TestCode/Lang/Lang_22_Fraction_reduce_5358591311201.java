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

public class Fraction_reduce_5358591311201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term389253;
     Object term389859;
     Object term389856;

    public Fraction_reduce_5358591311201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term389253 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term389253, term389253.getClass(), "numerator", 187439682);
        setIntField(term389253, term389253.getClass(), "denominator", 684557833);
        term389859 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term389859, term389859.getClass(), "numerator", 187439682);
        setIntField(term389859, term389859.getClass(), "denominator", 684557833);
        setField(term389859, term389859.getClass(), "toString", null);
        setField(term389859, term389859.getClass(), "toProperString", null);
        term389856 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term389856, term389856.getClass(), "numerator", 187439682);
        setIntField(term389856, term389856.getClass(), "denominator", 684557833);
        setField(term389856, term389856.getClass(), "toString", null);
        setField(term389856, term389856.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term389253, args);
        assertTrue(recursiveEquals(term389253, term389859));
        assertTrue(recursiveEquals(retValue, term389856));
    }

};


