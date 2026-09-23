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

public class Fraction_reduce_3355035251501 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term442549;
     Object term443063;
     Object term443060;

    public Fraction_reduce_3355035251501() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term442549 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term442549, term442549.getClass(), "numerator", 1341128658);
        setIntField(term442549, term442549.getClass(), "denominator", 1879572481);
        term443063 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term443063, term443063.getClass(), "numerator", 1341128658);
        setIntField(term443063, term443063.getClass(), "denominator", 1879572481);
        setField(term443063, term443063.getClass(), "toString", null);
        setField(term443063, term443063.getClass(), "toProperString", null);
        term443060 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term443060, term443060.getClass(), "numerator", 1341128658);
        setIntField(term443060, term443060.getClass(), "denominator", 1879572481);
        setField(term443060, term443060.getClass(), "toString", null);
        setField(term443060, term443060.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term442549, args);
        assertTrue(recursiveEquals(term442549, term443063));
        assertTrue(recursiveEquals(retValue, term443060));
    }

};


