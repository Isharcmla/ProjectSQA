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

public class Fraction_reduce_335503525847 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239746;
     Object term240660;
     Object term240657;

    public Fraction_reduce_335503525847() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term239746 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term239746, term239746.getClass(), "numerator", 99484802);
        setIntField(term239746, term239746.getClass(), "denominator", 32702849);
        term240660 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term240660, term240660.getClass(), "numerator", 99484802);
        setIntField(term240660, term240660.getClass(), "denominator", 32702849);
        setField(term240660, term240660.getClass(), "toString", null);
        setField(term240660, term240660.getClass(), "toProperString", null);
        term240657 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term240657, term240657.getClass(), "numerator", 99484802);
        setIntField(term240657, term240657.getClass(), "denominator", 32702849);
        setField(term240657, term240657.getClass(), "toString", null);
        setField(term240657, term240657.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term239746, args);
        assertTrue(recursiveEquals(term239746, term240660));
        assertTrue(recursiveEquals(retValue, term240657));
    }

};


