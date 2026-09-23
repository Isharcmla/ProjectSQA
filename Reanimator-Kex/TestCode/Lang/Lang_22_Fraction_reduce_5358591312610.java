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

public class Fraction_reduce_5358591312610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term855095;
     Object term855958;
     Object term855955;

    public Fraction_reduce_5358591312610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term855095 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term855095, term855095.getClass(), "numerator", 533725154);
        setIntField(term855095, term855095.getClass(), "denominator", 1611137033);
        term855958 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term855958, term855958.getClass(), "numerator", 533725154);
        setIntField(term855958, term855958.getClass(), "denominator", 1611137033);
        setField(term855958, term855958.getClass(), "toString", null);
        setField(term855958, term855958.getClass(), "toProperString", null);
        term855955 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term855955, term855955.getClass(), "numerator", 533725154);
        setIntField(term855955, term855955.getClass(), "denominator", 1611137033);
        setField(term855955, term855955.getClass(), "toString", null);
        setField(term855955, term855955.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term855095, args);
        assertTrue(recursiveEquals(term855095, term855958));
        assertTrue(recursiveEquals(retValue, term855955));
    }

};


