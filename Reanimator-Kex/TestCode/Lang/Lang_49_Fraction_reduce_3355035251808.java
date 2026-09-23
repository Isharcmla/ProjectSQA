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

public class Fraction_reduce_3355035251808 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term529171;
     Object term530068;
     Object term530065;

    public Fraction_reduce_3355035251808() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term529171 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term529171, term529171.getClass(), "numerator", 201184258);
        setIntField(term529171, term529171.getClass(), "denominator", 539201865);
        term530068 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term530068, term530068.getClass(), "numerator", 201184258);
        setIntField(term530068, term530068.getClass(), "denominator", 539201865);
        setField(term530068, term530068.getClass(), "toString", null);
        setField(term530068, term530068.getClass(), "toProperString", null);
        term530065 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term530065, term530065.getClass(), "numerator", 201184258);
        setIntField(term530065, term530065.getClass(), "denominator", 539201865);
        setField(term530065, term530065.getClass(), "toString", null);
        setField(term530065, term530065.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term529171, args);
        assertTrue(recursiveEquals(term529171, term530068));
        assertTrue(recursiveEquals(retValue, term530065));
    }

};


