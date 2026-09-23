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

public class Fraction_reduce_5358591311913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term623811;
     Object term624427;
     Object term624424;

    public Fraction_reduce_5358591311913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term623811 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term623811, term623811.getClass(), "numerator", 1333788642);
        setIntField(term623811, term623811.getClass(), "denominator", 1879048201);
        term624427 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term624427, term624427.getClass(), "numerator", 1333788642);
        setIntField(term624427, term624427.getClass(), "denominator", 1879048201);
        setField(term624427, term624427.getClass(), "toString", null);
        setField(term624427, term624427.getClass(), "toProperString", null);
        term624424 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term624424, term624424.getClass(), "numerator", 1333788642);
        setIntField(term624424, term624424.getClass(), "denominator", 1879048201);
        setField(term624424, term624424.getClass(), "toString", null);
        setField(term624424, term624424.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term623811, args);
        assertTrue(recursiveEquals(term623811, term624427));
        assertTrue(recursiveEquals(retValue, term624424));
    }

};


