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

public class Fraction_reduce_3355035251336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term390948;
     Object term391503;
     Object term391497;

    public Fraction_reduce_3355035251336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term390948 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term390948, term390948.getClass(), "numerator", 114394350);
        setIntField(term390948, term390948.getClass(), "denominator", 207757839);
        term391503 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term391503, term391503.getClass(), "numerator", 114394350);
        setIntField(term391503, term391503.getClass(), "denominator", 207757839);
        setField(term391503, term391503.getClass(), "toString", null);
        setField(term391503, term391503.getClass(), "toProperString", null);
        term391497 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term391497, term391497.getClass(), "numerator", 38131450);
        setIntField(term391497, term391497.getClass(), "denominator", 69252613);
        setField(term391497, term391497.getClass(), "toString", null);
        setField(term391497, term391497.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term390948, args);
        assertTrue(recursiveEquals(term390948, term391503));
        assertTrue(recursiveEquals(retValue, term391497));
    }

};


