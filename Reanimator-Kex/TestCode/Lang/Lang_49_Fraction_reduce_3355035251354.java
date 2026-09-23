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

public class Fraction_reduce_3355035251354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term395737;
     Object term396187;
     Object term396184;

    public Fraction_reduce_3355035251354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term395737 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term395737, term395737.getClass(), "numerator", 87232582);
        setIntField(term395737, term395737.getClass(), "denominator", 1078954061);
        term396187 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term396187, term396187.getClass(), "numerator", 87232582);
        setIntField(term396187, term396187.getClass(), "denominator", 1078954061);
        setField(term396187, term396187.getClass(), "toString", null);
        setField(term396187, term396187.getClass(), "toProperString", null);
        term396184 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term396184, term396184.getClass(), "numerator", 87232582);
        setIntField(term396184, term396184.getClass(), "denominator", 1078954061);
        setField(term396184, term396184.getClass(), "toString", null);
        setField(term396184, term396184.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term395737, args);
        assertTrue(recursiveEquals(term395737, term396187));
        assertTrue(recursiveEquals(retValue, term396184));
    }

};


