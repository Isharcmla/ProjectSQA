package org.apache.commons.lang3.math;

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
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.math.EqualityUtils.*;

public class Fraction_reduce_5358591311658 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term539566;
     Object term539976;
     Object term539973;

    public Fraction_reduce_5358591311658() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term539566 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term539566, term539566.getClass(), "numerator", -1291689966);
        setIntField(term539566, term539566.getClass(), "denominator", 1988137343);
        term539976 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term539976, term539976.getClass(), "numerator", -1291689966);
        setIntField(term539976, term539976.getClass(), "denominator", 1988137343);
        setField(term539976, term539976.getClass(), "toString", null);
        setField(term539976, term539976.getClass(), "toProperString", null);
        term539973 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term539973, term539973.getClass(), "numerator", -1291689966);
        setIntField(term539973, term539973.getClass(), "denominator", 1988137343);
        setField(term539973, term539973.getClass(), "toString", null);
        setField(term539973, term539973.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term539566, args);
        assertTrue(recursiveEquals(term539566, term539976));
        assertTrue(recursiveEquals(retValue, term539973));
    }

};


