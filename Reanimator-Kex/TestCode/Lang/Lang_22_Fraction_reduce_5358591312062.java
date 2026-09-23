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

public class Fraction_reduce_5358591312062 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term671036;
     Object term672396;
     Object term672393;

    public Fraction_reduce_5358591312062() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term671036 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term671036, term671036.getClass(), "numerator", -730115134);
        setIntField(term671036, term671036.getClass(), "denominator", 940801495);
        term672396 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term672396, term672396.getClass(), "numerator", -730115134);
        setIntField(term672396, term672396.getClass(), "denominator", 940801495);
        setField(term672396, term672396.getClass(), "toString", null);
        setField(term672396, term672396.getClass(), "toProperString", null);
        term672393 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term672393, term672393.getClass(), "numerator", -730115134);
        setIntField(term672393, term672393.getClass(), "denominator", 940801495);
        setField(term672393, term672393.getClass(), "toString", null);
        setField(term672393, term672393.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term671036, args);
        assertTrue(recursiveEquals(term671036, term672396));
        assertTrue(recursiveEquals(retValue, term672393));
    }

};


