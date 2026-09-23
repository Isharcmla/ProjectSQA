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

public class Fraction_reduce_3355035251977 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term581294;
     Object term581379;
     Object term581376;

    public Fraction_reduce_3355035251977() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term581294 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term581294, term581294.getClass(), "numerator", 132302);
        setIntField(term581294, term581294.getClass(), "denominator", 2146434687);
        term581379 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term581379, term581379.getClass(), "numerator", 132302);
        setIntField(term581379, term581379.getClass(), "denominator", 2146434687);
        setField(term581379, term581379.getClass(), "toString", null);
        setField(term581379, term581379.getClass(), "toProperString", null);
        term581376 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term581376, term581376.getClass(), "numerator", 132302);
        setIntField(term581376, term581376.getClass(), "denominator", 2146434687);
        setField(term581376, term581376.getClass(), "toString", null);
        setField(term581376, term581376.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term581294, args);
        assertTrue(recursiveEquals(term581294, term581379));
        assertTrue(recursiveEquals(retValue, term581376));
    }

};


