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

public class Fraction_reduce_3355035251600 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term469846;
     Object term470746;
     Object term470743;

    public Fraction_reduce_3355035251600() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term469846 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term469846, term469846.getClass(), "numerator", 2);
        setIntField(term469846, term469846.getClass(), "denominator", 2147483641);
        term470746 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term470746, term470746.getClass(), "numerator", 2);
        setIntField(term470746, term470746.getClass(), "denominator", 2147483641);
        setField(term470746, term470746.getClass(), "toString", null);
        setField(term470746, term470746.getClass(), "toProperString", null);
        term470743 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term470743, term470743.getClass(), "numerator", 2);
        setIntField(term470743, term470743.getClass(), "denominator", 2147483641);
        setField(term470743, term470743.getClass(), "toString", null);
        setField(term470743, term470743.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term469846, args);
        assertTrue(recursiveEquals(term469846, term470746));
        assertTrue(recursiveEquals(retValue, term470743));
    }

};


