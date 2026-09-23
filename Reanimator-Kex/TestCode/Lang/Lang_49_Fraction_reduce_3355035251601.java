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

public class Fraction_reduce_3355035251601 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term470641;
     Object term470850;
     Object term470847;

    public Fraction_reduce_3355035251601() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term470641 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term470641, term470641.getClass(), "numerator", 37295714);
        setIntField(term470641, term470641.getClass(), "denominator", 1745886249);
        term470850 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term470850, term470850.getClass(), "numerator", 37295714);
        setIntField(term470850, term470850.getClass(), "denominator", 1745886249);
        setField(term470850, term470850.getClass(), "toString", null);
        setField(term470850, term470850.getClass(), "toProperString", null);
        term470847 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term470847, term470847.getClass(), "numerator", 37295714);
        setIntField(term470847, term470847.getClass(), "denominator", 1745886249);
        setField(term470847, term470847.getClass(), "toString", null);
        setField(term470847, term470847.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term470641, args);
        assertTrue(recursiveEquals(term470641, term470850));
        assertTrue(recursiveEquals(retValue, term470847));
    }

};


