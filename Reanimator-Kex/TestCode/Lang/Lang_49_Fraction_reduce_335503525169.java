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

public class Fraction_reduce_335503525169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38610;
     Object term39036;
     Object term39033;

    public Fraction_reduce_335503525169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38610 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term38610, term38610.getClass(), "numerator", -102922);
        setIntField(term38610, term38610.getClass(), "denominator", 32709);
        term39036 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term39036, term39036.getClass(), "numerator", -102922);
        setIntField(term39036, term39036.getClass(), "denominator", 32709);
        setField(term39036, term39036.getClass(), "toString", null);
        setField(term39036, term39036.getClass(), "toProperString", null);
        term39033 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term39033, term39033.getClass(), "numerator", -102922);
        setIntField(term39033, term39033.getClass(), "denominator", 32709);
        setField(term39033, term39033.getClass(), "toString", null);
        setField(term39033, term39033.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term38610, args);
        assertTrue(recursiveEquals(term38610, term39036));
        assertTrue(recursiveEquals(retValue, term39033));
    }

};


