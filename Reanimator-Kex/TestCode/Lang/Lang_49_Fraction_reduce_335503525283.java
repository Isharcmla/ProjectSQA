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

public class Fraction_reduce_335503525283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71282;
     Object term71862;
     Object term71859;

    public Fraction_reduce_335503525283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71282 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term71282, term71282.getClass(), "numerator", -1385069710);
        setIntField(term71282, term71282.getClass(), "denominator", 1275166767);
        term71862 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term71862, term71862.getClass(), "numerator", -1385069710);
        setIntField(term71862, term71862.getClass(), "denominator", 1275166767);
        setField(term71862, term71862.getClass(), "toString", null);
        setField(term71862, term71862.getClass(), "toProperString", null);
        term71859 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term71859, term71859.getClass(), "numerator", -1385069710);
        setIntField(term71859, term71859.getClass(), "denominator", 1275166767);
        setField(term71859, term71859.getClass(), "toString", null);
        setField(term71859, term71859.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term71282, args);
        assertTrue(recursiveEquals(term71282, term71862));
        assertTrue(recursiveEquals(retValue, term71859));
    }

};


