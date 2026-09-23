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

public class Fraction_reduce_5358591311997 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term650949;
     Object term651892;
     Object term651889;

    public Fraction_reduce_5358591311997() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term650949 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term650949, term650949.getClass(), "numerator", -477109454);
        setIntField(term650949, term650949.getClass(), "denominator", 1886392127);
        term651892 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term651892, term651892.getClass(), "numerator", -477109454);
        setIntField(term651892, term651892.getClass(), "denominator", 1886392127);
        setField(term651892, term651892.getClass(), "toString", null);
        setField(term651892, term651892.getClass(), "toProperString", null);
        term651889 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term651889, term651889.getClass(), "numerator", -477109454);
        setIntField(term651889, term651889.getClass(), "denominator", 1886392127);
        setField(term651889, term651889.getClass(), "toString", null);
        setField(term651889, term651889.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term650949, args);
        assertTrue(recursiveEquals(term650949, term651892));
        assertTrue(recursiveEquals(retValue, term651889));
    }

};


