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

public class Fraction_reduce_5358591311497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term487327;
     Object term487840;
     Object term487837;

    public Fraction_reduce_5358591311497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term487327 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term487327, term487327.getClass(), "numerator", -603835382);
        setIntField(term487327, term487327.getClass(), "denominator", 1392540227);
        term487840 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term487840, term487840.getClass(), "numerator", -603835382);
        setIntField(term487840, term487840.getClass(), "denominator", 1392540227);
        setField(term487840, term487840.getClass(), "toString", null);
        setField(term487840, term487840.getClass(), "toProperString", null);
        term487837 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term487837, term487837.getClass(), "numerator", -603835382);
        setIntField(term487837, term487837.getClass(), "denominator", 1392540227);
        setField(term487837, term487837.getClass(), "toString", null);
        setField(term487837, term487837.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term487327, args);
        assertTrue(recursiveEquals(term487327, term487840));
        assertTrue(recursiveEquals(retValue, term487837));
    }

};


