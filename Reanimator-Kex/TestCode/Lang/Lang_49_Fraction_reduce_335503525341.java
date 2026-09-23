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

public class Fraction_reduce_335503525341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90371;
     Object term90578;
     Object term90575;

    public Fraction_reduce_335503525341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90371 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term90371, term90371.getClass(), "numerator", -2051741182);
        setIntField(term90371, term90371.getClass(), "denominator", 1082645559);
        term90578 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term90578, term90578.getClass(), "numerator", -2051741182);
        setIntField(term90578, term90578.getClass(), "denominator", 1082645559);
        setField(term90578, term90578.getClass(), "toString", null);
        setField(term90578, term90578.getClass(), "toProperString", null);
        term90575 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term90575, term90575.getClass(), "numerator", -2051741182);
        setIntField(term90575, term90575.getClass(), "denominator", 1082645559);
        setField(term90575, term90575.getClass(), "toString", null);
        setField(term90575, term90575.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term90371, args);
        assertTrue(recursiveEquals(term90371, term90578));
        assertTrue(recursiveEquals(retValue, term90575));
    }

};


