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

public class Fraction_reduce_335503525194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45433;
     Object term46292;
     Object term46289;

    public Fraction_reduce_335503525194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45433 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term45433, term45433.getClass(), "numerator", 2469922);
        setIntField(term45433, term45433.getClass(), "denominator", 2140067849);
        term46292 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term46292, term46292.getClass(), "numerator", 2469922);
        setIntField(term46292, term46292.getClass(), "denominator", 2140067849);
        setField(term46292, term46292.getClass(), "toString", null);
        setField(term46292, term46292.getClass(), "toProperString", null);
        term46289 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term46289, term46289.getClass(), "numerator", 2469922);
        setIntField(term46289, term46289.getClass(), "denominator", 2140067849);
        setField(term46289, term46289.getClass(), "toString", null);
        setField(term46289, term46289.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term45433, args);
        assertTrue(recursiveEquals(term45433, term46292));
        assertTrue(recursiveEquals(retValue, term46289));
    }

};


