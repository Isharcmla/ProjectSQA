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

public class Fraction_reduce_535859131664 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209381;
     Object term209811;
     Object term209805;

    public Fraction_reduce_535859131664() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term209381 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term209381, term209381.getClass(), "numerator", -66);
        setIntField(term209381, term209381.getClass(), "denominator", 2147483433);
        term209811 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term209811, term209811.getClass(), "numerator", -66);
        setIntField(term209811, term209811.getClass(), "denominator", 2147483433);
        setField(term209811, term209811.getClass(), "toString", null);
        setField(term209811, term209811.getClass(), "toProperString", null);
        term209805 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term209805, term209805.getClass(), "numerator", -22);
        setIntField(term209805, term209805.getClass(), "denominator", 715827811);
        setField(term209805, term209805.getClass(), "toString", null);
        setField(term209805, term209805.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term209381, args);
        assertTrue(recursiveEquals(term209381, term209811));
        assertTrue(recursiveEquals(retValue, term209805));
    }

};


