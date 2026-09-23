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

public class Fraction_reduce_5358591311812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term590660;
     Object term591495;
     Object term591489;

    public Fraction_reduce_5358591311812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term590660 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term590660, term590660.getClass(), "numerator", -1574621770);
        setIntField(term590660, term590660.getClass(), "denominator", 2143095165);
        term591495 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term591495, term591495.getClass(), "numerator", -1574621770);
        setIntField(term591495, term591495.getClass(), "denominator", 2143095165);
        setField(term591495, term591495.getClass(), "toString", null);
        setField(term591495, term591495.getClass(), "toProperString", null);
        term591489 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term591489, term591489.getClass(), "numerator", -314924354);
        setIntField(term591489, term591489.getClass(), "denominator", 428619033);
        setField(term591489, term591489.getClass(), "toString", null);
        setField(term591489, term591489.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term590660, args);
        assertTrue(recursiveEquals(term590660, term591495));
        assertTrue(recursiveEquals(retValue, term591489));
    }

};


