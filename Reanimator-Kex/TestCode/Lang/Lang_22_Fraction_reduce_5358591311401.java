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

public class Fraction_reduce_5358591311401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term456466;
     Object term457059;
     Object term457053;

    public Fraction_reduce_5358591311401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term456466 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term456466, term456466.getClass(), "numerator", -905842518);
        setIntField(term456466, term456466.getClass(), "denominator", 970716531);
        term457059 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term457059, term457059.getClass(), "numerator", -905842518);
        setIntField(term457059, term457059.getClass(), "denominator", 970716531);
        setField(term457059, term457059.getClass(), "toString", null);
        setField(term457059, term457059.getClass(), "toProperString", null);
        term457053 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term457053, term457053.getClass(), "numerator", -301947506);
        setIntField(term457053, term457053.getClass(), "denominator", 323572177);
        setField(term457053, term457053.getClass(), "toString", null);
        setField(term457053, term457053.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term456466, args);
        assertTrue(recursiveEquals(term456466, term457059));
        assertTrue(recursiveEquals(retValue, term457053));
    }

};


