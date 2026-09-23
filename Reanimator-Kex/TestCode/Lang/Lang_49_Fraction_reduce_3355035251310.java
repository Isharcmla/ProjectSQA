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

public class Fraction_reduce_3355035251310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term384160;
     Object term384496;
     Object term384493;

    public Fraction_reduce_3355035251310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term384160 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term384160, term384160.getClass(), "numerator", 1880367774);
        setIntField(term384160, term384160.getClass(), "denominator", 1239570295);
        term384496 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term384496, term384496.getClass(), "numerator", 1880367774);
        setIntField(term384496, term384496.getClass(), "denominator", 1239570295);
        setField(term384496, term384496.getClass(), "toString", null);
        setField(term384496, term384496.getClass(), "toProperString", null);
        term384493 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term384493, term384493.getClass(), "numerator", 1880367774);
        setIntField(term384493, term384493.getClass(), "denominator", 1239570295);
        setField(term384493, term384493.getClass(), "toString", null);
        setField(term384493, term384493.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term384160, args);
        assertTrue(recursiveEquals(term384160, term384496));
        assertTrue(recursiveEquals(retValue, term384493));
    }

};


