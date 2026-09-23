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

public class Fraction_reduce_3355035252763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term825412;
     Object term825612;
     Object term825606;

    public Fraction_reduce_3355035252763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term825412 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term825412, term825412.getClass(), "numerator", -262962030);
        setIntField(term825412, term825412.getClass(), "denominator", 1877656719);
        term825612 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term825612, term825612.getClass(), "numerator", -262962030);
        setIntField(term825612, term825612.getClass(), "denominator", 1877656719);
        setField(term825612, term825612.getClass(), "toString", null);
        setField(term825612, term825612.getClass(), "toProperString", null);
        term825606 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term825606, term825606.getClass(), "numerator", -87654010);
        setIntField(term825606, term825606.getClass(), "denominator", 625885573);
        setField(term825606, term825606.getClass(), "toString", null);
        setField(term825606, term825606.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term825412, args);
        assertTrue(recursiveEquals(term825412, term825612));
        assertTrue(recursiveEquals(retValue, term825606));
    }

};


