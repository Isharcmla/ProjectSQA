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

public class Fraction_reduce_5358591312196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term715217;
     Object term715630;
     Object term715624;

    public Fraction_reduce_5358591312196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term715217 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term715217, term715217.getClass(), "numerator", -1879047102);
        setIntField(term715217, term715217.getClass(), "denominator", 1091049207);
        term715630 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term715630, term715630.getClass(), "numerator", -1879047102);
        setIntField(term715630, term715630.getClass(), "denominator", 1091049207);
        setField(term715630, term715630.getClass(), "toString", null);
        setField(term715630, term715630.getClass(), "toProperString", null);
        term715624 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term715624, term715624.getClass(), "numerator", -626349034);
        setIntField(term715624, term715624.getClass(), "denominator", 363683069);
        setField(term715624, term715624.getClass(), "toString", null);
        setField(term715624, term715624.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term715217, args);
        assertTrue(recursiveEquals(term715217, term715630));
        assertTrue(recursiveEquals(retValue, term715624));
    }

};


