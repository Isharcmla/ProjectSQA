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

public class Fraction_reduce_5358591312684 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term879803;
     Object term880343;
     Object term880340;

    public Fraction_reduce_5358591312684() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term879803 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term879803, term879803.getClass(), "numerator", -2130583166);
        setIntField(term879803, term879803.getClass(), "denominator", 1370617127);
        term880343 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term880343, term880343.getClass(), "numerator", -2130583166);
        setIntField(term880343, term880343.getClass(), "denominator", 1370617127);
        setField(term880343, term880343.getClass(), "toString", null);
        setField(term880343, term880343.getClass(), "toProperString", null);
        term880340 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term880340, term880340.getClass(), "numerator", -2130583166);
        setIntField(term880340, term880340.getClass(), "denominator", 1370617127);
        setField(term880340, term880340.getClass(), "toString", null);
        setField(term880340, term880340.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term879803, args);
        assertTrue(recursiveEquals(term879803, term880343));
        assertTrue(recursiveEquals(retValue, term880340));
    }

};


