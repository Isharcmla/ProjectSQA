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

public class Fraction_reduce_5358591311453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term472777;
     Object term473275;
     Object term473272;

    public Fraction_reduce_5358591311453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term472777 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term472777, term472777.getClass(), "numerator", -1135264606);
        setIntField(term472777, term472777.getClass(), "denominator", 1357539399);
        term473275 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term473275, term473275.getClass(), "numerator", -1135264606);
        setIntField(term473275, term473275.getClass(), "denominator", 1357539399);
        setField(term473275, term473275.getClass(), "toString", null);
        setField(term473275, term473275.getClass(), "toProperString", null);
        term473272 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term473272, term473272.getClass(), "numerator", -1135264606);
        setIntField(term473272, term473272.getClass(), "denominator", 1357539399);
        setField(term473272, term473272.getClass(), "toString", null);
        setField(term473272, term473272.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term472777, args);
        assertTrue(recursiveEquals(term472777, term473275));
        assertTrue(recursiveEquals(retValue, term473272));
    }

};


