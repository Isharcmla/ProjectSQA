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

public class Fraction_reduce_3355035252842 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term850125;
     Object term850613;
     Object term850610;

    public Fraction_reduce_3355035252842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term850125 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term850125, term850125.getClass(), "numerator", 395063298);
        setIntField(term850125, term850125.getClass(), "denominator", 2066747369);
        term850613 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term850613, term850613.getClass(), "numerator", 395063298);
        setIntField(term850613, term850613.getClass(), "denominator", 2066747369);
        setField(term850613, term850613.getClass(), "toString", null);
        setField(term850613, term850613.getClass(), "toProperString", null);
        term850610 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term850610, term850610.getClass(), "numerator", 395063298);
        setIntField(term850610, term850610.getClass(), "denominator", 2066747369);
        setField(term850610, term850610.getClass(), "toString", null);
        setField(term850610, term850610.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term850125, args);
        assertTrue(recursiveEquals(term850125, term850613));
        assertTrue(recursiveEquals(retValue, term850610));
    }

};


