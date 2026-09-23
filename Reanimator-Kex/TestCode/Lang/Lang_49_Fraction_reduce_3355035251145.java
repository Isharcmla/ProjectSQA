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

public class Fraction_reduce_3355035251145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term331614;
     Object term332124;
     Object term332121;

    public Fraction_reduce_3355035251145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term331614 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term331614, term331614.getClass(), "numerator", 1629850946);
        setIntField(term331614, term331614.getClass(), "denominator", 326765153);
        term332124 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term332124, term332124.getClass(), "numerator", 1629850946);
        setIntField(term332124, term332124.getClass(), "denominator", 326765153);
        setField(term332124, term332124.getClass(), "toString", null);
        setField(term332124, term332124.getClass(), "toProperString", null);
        term332121 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term332121, term332121.getClass(), "numerator", 1629850946);
        setIntField(term332121, term332121.getClass(), "denominator", 326765153);
        setField(term332121, term332121.getClass(), "toString", null);
        setField(term332121, term332121.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term331614, args);
        assertTrue(recursiveEquals(term331614, term332124));
        assertTrue(recursiveEquals(retValue, term332121));
    }

};


