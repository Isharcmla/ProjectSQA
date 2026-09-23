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

public class Fraction_reduce_5358591312624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term859097;
     Object term859528;
     Object term859525;

    public Fraction_reduce_5358591312624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term859097 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term859097, term859097.getClass(), "numerator", -754711610);
        setIntField(term859097, term859097.getClass(), "denominator", 1107821477);
        term859528 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term859528, term859528.getClass(), "numerator", -754711610);
        setIntField(term859528, term859528.getClass(), "denominator", 1107821477);
        setField(term859528, term859528.getClass(), "toString", null);
        setField(term859528, term859528.getClass(), "toProperString", null);
        term859525 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term859525, term859525.getClass(), "numerator", -754711610);
        setIntField(term859525, term859525.getClass(), "denominator", 1107821477);
        setField(term859525, term859525.getClass(), "toString", null);
        setField(term859525, term859525.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term859097, args);
        assertTrue(recursiveEquals(term859097, term859528));
        assertTrue(recursiveEquals(retValue, term859525));
    }

};


