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

public class Fraction_reduce_5358591311073 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term344594;
     Object term345716;
     Object term345710;

    public Fraction_reduce_5358591311073() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term344594 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term344594, term344594.getClass(), "numerator", -1855946230);
        setIntField(term344594, term344594.getClass(), "denominator", 1611763475);
        term345716 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term345716, term345716.getClass(), "numerator", -1855946230);
        setIntField(term345716, term345716.getClass(), "denominator", 1611763475);
        setField(term345716, term345716.getClass(), "toString", null);
        setField(term345716, term345716.getClass(), "toProperString", null);
        term345710 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term345710, term345710.getClass(), "numerator", -371189246);
        setIntField(term345710, term345710.getClass(), "denominator", 322352695);
        setField(term345710, term345710.getClass(), "toString", null);
        setField(term345710, term345710.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term344594, args);
        assertTrue(recursiveEquals(term344594, term345716));
        assertTrue(recursiveEquals(retValue, term345710));
    }

};


