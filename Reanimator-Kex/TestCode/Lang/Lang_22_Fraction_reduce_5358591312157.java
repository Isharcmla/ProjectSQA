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

public class Fraction_reduce_5358591312157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term703295;
     Object term703515;
     Object term703512;

    public Fraction_reduce_5358591312157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term703295 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term703295, term703295.getClass(), "numerator", 536866770);
        setIntField(term703295, term703295.getClass(), "denominator", 1610612737);
        term703515 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term703515, term703515.getClass(), "numerator", 536866770);
        setIntField(term703515, term703515.getClass(), "denominator", 1610612737);
        setField(term703515, term703515.getClass(), "toString", null);
        setField(term703515, term703515.getClass(), "toProperString", null);
        term703512 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term703512, term703512.getClass(), "numerator", 536866770);
        setIntField(term703512, term703512.getClass(), "denominator", 1610612737);
        setField(term703512, term703512.getClass(), "toString", null);
        setField(term703512, term703512.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term703295, args);
        assertTrue(recursiveEquals(term703295, term703515));
        assertTrue(recursiveEquals(retValue, term703512));
    }

};


