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

public class Fraction_reduce_3355035252220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term655417;
     Object term656086;
     Object term656080;

    public Fraction_reduce_3355035252220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term655417 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term655417, term655417.getClass(), "numerator", -191716434);
        setIntField(term655417, term655417.getClass(), "denominator", 1938211345);
        term656086 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term656086, term656086.getClass(), "numerator", -191716434);
        setIntField(term656086, term656086.getClass(), "denominator", 1938211345);
        setField(term656086, term656086.getClass(), "toString", null);
        setField(term656086, term656086.getClass(), "toProperString", null);
        term656080 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term656080, term656080.getClass(), "numerator", -27388062);
        setIntField(term656080, term656080.getClass(), "denominator", 276887335);
        setField(term656080, term656080.getClass(), "toString", null);
        setField(term656080, term656080.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term655417, args);
        assertTrue(recursiveEquals(term655417, term656086));
        assertTrue(recursiveEquals(retValue, term656080));
    }

};


