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

public class Fraction_reduce_3355035252367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term700649;
     Object term701572;
     Object term701569;

    public Fraction_reduce_3355035252367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term700649 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term700649, term700649.getClass(), "numerator", -2079702654);
        setIntField(term700649, term700649.getClass(), "denominator", 1040646359);
        term701572 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term701572, term701572.getClass(), "numerator", -2079702654);
        setIntField(term701572, term701572.getClass(), "denominator", 1040646359);
        setField(term701572, term701572.getClass(), "toString", null);
        setField(term701572, term701572.getClass(), "toProperString", null);
        term701569 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term701569, term701569.getClass(), "numerator", -2079702654);
        setIntField(term701569, term701569.getClass(), "denominator", 1040646359);
        setField(term701569, term701569.getClass(), "toString", null);
        setField(term701569, term701569.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term700649, args);
        assertTrue(recursiveEquals(term700649, term701572));
        assertTrue(recursiveEquals(retValue, term701569));
    }

};


