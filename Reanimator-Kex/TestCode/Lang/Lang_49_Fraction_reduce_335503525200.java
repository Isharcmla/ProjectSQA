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

public class Fraction_reduce_335503525200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47072;
     Object term47268;
     Object term47265;

    public Fraction_reduce_335503525200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47072 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term47072, term47072.getClass(), "numerator", -2030043134);
        setIntField(term47072, term47072.getClass(), "denominator", 2013265927);
        term47268 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term47268, term47268.getClass(), "numerator", -2030043134);
        setIntField(term47268, term47268.getClass(), "denominator", 2013265927);
        setField(term47268, term47268.getClass(), "toString", null);
        setField(term47268, term47268.getClass(), "toProperString", null);
        term47265 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term47265, term47265.getClass(), "numerator", -2030043134);
        setIntField(term47265, term47265.getClass(), "denominator", 2013265927);
        setField(term47265, term47265.getClass(), "toString", null);
        setField(term47265, term47265.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term47072, args);
        assertTrue(recursiveEquals(term47072, term47268));
        assertTrue(recursiveEquals(retValue, term47265));
    }

};


