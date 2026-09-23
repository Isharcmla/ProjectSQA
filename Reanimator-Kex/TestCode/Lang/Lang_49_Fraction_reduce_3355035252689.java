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

public class Fraction_reduce_3355035252689 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term802330;
     Object term802910;
     Object term802907;

    public Fraction_reduce_3355035252689() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term802330 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term802330, term802330.getClass(), "numerator", 538968078);
        setIntField(term802330, term802330.getClass(), "denominator", 1576007135);
        term802910 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term802910, term802910.getClass(), "numerator", 538968078);
        setIntField(term802910, term802910.getClass(), "denominator", 1576007135);
        setField(term802910, term802910.getClass(), "toString", null);
        setField(term802910, term802910.getClass(), "toProperString", null);
        term802907 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term802907, term802907.getClass(), "numerator", 538968078);
        setIntField(term802907, term802907.getClass(), "denominator", 1576007135);
        setField(term802907, term802907.getClass(), "toString", null);
        setField(term802907, term802907.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term802330, args);
        assertTrue(recursiveEquals(term802330, term802910));
        assertTrue(recursiveEquals(retValue, term802907));
    }

};


