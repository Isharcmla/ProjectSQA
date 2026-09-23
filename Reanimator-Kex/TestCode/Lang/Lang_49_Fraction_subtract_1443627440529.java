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

public class Fraction_subtract_1443627440529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145939;
     Object term146019;
     Object term146073;
     Object term146074;
     Object term146070;

    public Fraction_subtract_1443627440529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145939 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term145939, term145939.getClass(), "numerator", 1073741824);
        setIntField(term145939, term145939.getClass(), "denominator", -8);
        term146019 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term146019, term146019.getClass(), "numerator", -2147483648);
        setIntField(term146019, term146019.getClass(), "denominator", 12);
        term146073 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term146073, term146073.getClass(), "numerator", 1073741824);
        setIntField(term146073, term146073.getClass(), "denominator", -8);
        setField(term146073, term146073.getClass(), "toString", null);
        setField(term146073, term146073.getClass(), "toProperString", null);
        term146074 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term146074, term146074.getClass(), "numerator", -2147483648);
        setIntField(term146074, term146074.getClass(), "denominator", 12);
        setField(term146074, term146074.getClass(), "toString", null);
        setField(term146074, term146074.getClass(), "toProperString", null);
        term146070 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term146070, term146070.getClass(), "numerator", -268435456);
        setIntField(term146070, term146070.getClass(), "denominator", -6);
        setField(term146070, term146070.getClass(), "toString", null);
        setField(term146070, term146070.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term146019;
        Object retValue = callMethod(klass, "subtract", argTypes, term145939, args);
        assertTrue(recursiveEquals(term145939, term146073));
        assertTrue(recursiveEquals(term146019, term146074));
        assertTrue(recursiveEquals(retValue, term146070));
    }

};


