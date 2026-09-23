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

public class Fraction_reduce_3355035251271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term372477;
     Object term372690;
     Object term372687;

    public Fraction_reduce_3355035251271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term372477 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term372477, term372477.getClass(), "numerator", 2099747814);
        setIntField(term372477, term372477.getClass(), "denominator", 1747715003);
        term372690 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term372690, term372690.getClass(), "numerator", 2099747814);
        setIntField(term372690, term372690.getClass(), "denominator", 1747715003);
        setField(term372690, term372690.getClass(), "toString", null);
        setField(term372690, term372690.getClass(), "toProperString", null);
        term372687 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term372687, term372687.getClass(), "numerator", 2099747814);
        setIntField(term372687, term372687.getClass(), "denominator", 1747715003);
        setField(term372687, term372687.getClass(), "toString", null);
        setField(term372687, term372687.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term372477, args);
        assertTrue(recursiveEquals(term372477, term372690));
        assertTrue(recursiveEquals(retValue, term372687));
    }

};


