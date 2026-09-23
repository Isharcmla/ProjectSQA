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

public class Fraction_reduce_3355035252795 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term834950;
     Object term835833;
     Object term835830;

    public Fraction_reduce_3355035252795() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term834950 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term834950, term834950.getClass(), "numerator", 566364742);
        setIntField(term834950, term834950.getClass(), "denominator", 1434055707);
        term835833 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term835833, term835833.getClass(), "numerator", 566364742);
        setIntField(term835833, term835833.getClass(), "denominator", 1434055707);
        setField(term835833, term835833.getClass(), "toString", null);
        setField(term835833, term835833.getClass(), "toProperString", null);
        term835830 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term835830, term835830.getClass(), "numerator", 566364742);
        setIntField(term835830, term835830.getClass(), "denominator", 1434055707);
        setField(term835830, term835830.getClass(), "toString", null);
        setField(term835830, term835830.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term834950, args);
        assertTrue(recursiveEquals(term834950, term835833));
        assertTrue(recursiveEquals(retValue, term835830));
    }

};


