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

public class Fraction_reduce_5358591311916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term624625;
     Object term625135;
     Object term625132;

    public Fraction_reduce_5358591311916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term624625 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term624625, term624625.getClass(), "numerator", -2139090366);
        setIntField(term624625, term624625.getClass(), "denominator", 1998823607);
        term625135 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term625135, term625135.getClass(), "numerator", -2139090366);
        setIntField(term625135, term625135.getClass(), "denominator", 1998823607);
        setField(term625135, term625135.getClass(), "toString", null);
        setField(term625135, term625135.getClass(), "toProperString", null);
        term625132 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term625132, term625132.getClass(), "numerator", -2139090366);
        setIntField(term625132, term625132.getClass(), "denominator", 1998823607);
        setField(term625132, term625132.getClass(), "toString", null);
        setField(term625132, term625132.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term624625, args);
        assertTrue(recursiveEquals(term624625, term625135));
        assertTrue(recursiveEquals(retValue, term625132));
    }

};


