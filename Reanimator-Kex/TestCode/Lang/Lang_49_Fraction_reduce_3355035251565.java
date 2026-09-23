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

public class Fraction_reduce_3355035251565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term459602;
     Object term459812;
     Object term459809;

    public Fraction_reduce_3355035251565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term459602 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term459602, term459602.getClass(), "numerator", -274841470);
        setIntField(term459602, term459602.getClass(), "denominator", 921520631);
        term459812 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term459812, term459812.getClass(), "numerator", -274841470);
        setIntField(term459812, term459812.getClass(), "denominator", 921520631);
        setField(term459812, term459812.getClass(), "toString", null);
        setField(term459812, term459812.getClass(), "toProperString", null);
        term459809 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term459809, term459809.getClass(), "numerator", -274841470);
        setIntField(term459809, term459809.getClass(), "denominator", 921520631);
        setField(term459809, term459809.getClass(), "toString", null);
        setField(term459809, term459809.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term459602, args);
        assertTrue(recursiveEquals(term459602, term459812));
        assertTrue(recursiveEquals(retValue, term459809));
    }

};


