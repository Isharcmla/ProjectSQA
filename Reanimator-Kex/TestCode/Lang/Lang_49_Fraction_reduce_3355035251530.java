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

public class Fraction_reduce_3355035251530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term450264;
     Object term450822;
     Object term450816;

    public Fraction_reduce_3355035251530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term450264 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term450264, term450264.getClass(), "numerator", 577405202);
        setIntField(term450264, term450264.getClass(), "denominator", 1893544785);
        term450822 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term450822, term450822.getClass(), "numerator", 577405202);
        setIntField(term450822, term450822.getClass(), "denominator", 1893544785);
        setField(term450822, term450822.getClass(), "toString", null);
        setField(term450822, term450822.getClass(), "toProperString", null);
        term450816 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term450816, term450816.getClass(), "numerator", 52491382);
        setIntField(term450816, term450816.getClass(), "denominator", 172140435);
        setField(term450816, term450816.getClass(), "toString", null);
        setField(term450816, term450816.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term450264, args);
        assertTrue(recursiveEquals(term450264, term450822));
        assertTrue(recursiveEquals(retValue, term450816));
    }

};


