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

public class Fraction_reduce_5358591312014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term655999;
     Object term656418;
     Object term656415;

    public Fraction_reduce_5358591312014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term655999 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term655999, term655999.getClass(), "numerator", -2137718526);
        setIntField(term655999, term655999.getClass(), "denominator", 1614467815);
        term656418 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term656418, term656418.getClass(), "numerator", -2137718526);
        setIntField(term656418, term656418.getClass(), "denominator", 1614467815);
        setField(term656418, term656418.getClass(), "toString", null);
        setField(term656418, term656418.getClass(), "toProperString", null);
        term656415 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term656415, term656415.getClass(), "numerator", -2137718526);
        setIntField(term656415, term656415.getClass(), "denominator", 1614467815);
        setField(term656415, term656415.getClass(), "toString", null);
        setField(term656415, term656415.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term655999, args);
        assertTrue(recursiveEquals(term655999, term656418));
        assertTrue(recursiveEquals(retValue, term656415));
    }

};


