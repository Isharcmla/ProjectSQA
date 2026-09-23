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

public class Fraction_reduce_5358591312620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term857897;
     Object term858493;
     Object term858490;

    public Fraction_reduce_5358591312620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term857897 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term857897, term857897.getClass(), "numerator", -212958718);
        setIntField(term857897, term857897.getClass(), "denominator", 721617943);
        term858493 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term858493, term858493.getClass(), "numerator", -212958718);
        setIntField(term858493, term858493.getClass(), "denominator", 721617943);
        setField(term858493, term858493.getClass(), "toString", null);
        setField(term858493, term858493.getClass(), "toProperString", null);
        term858490 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term858490, term858490.getClass(), "numerator", -212958718);
        setIntField(term858490, term858490.getClass(), "denominator", 721617943);
        setField(term858490, term858490.getClass(), "toString", null);
        setField(term858490, term858490.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term857897, args);
        assertTrue(recursiveEquals(term857897, term858493));
        assertTrue(recursiveEquals(retValue, term858490));
    }

};


