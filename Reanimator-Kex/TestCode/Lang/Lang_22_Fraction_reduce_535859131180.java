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

public class Fraction_reduce_535859131180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43056;
     Object term44125;
     Object term44122;

    public Fraction_reduce_535859131180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43056 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term43056, term43056.getClass(), "numerator", -952549358);
        setIntField(term43056, term43056.getClass(), "denominator", 1821411343);
        term44125 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term44125, term44125.getClass(), "numerator", -952549358);
        setIntField(term44125, term44125.getClass(), "denominator", 1821411343);
        setField(term44125, term44125.getClass(), "toString", null);
        setField(term44125, term44125.getClass(), "toProperString", null);
        term44122 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term44122, term44122.getClass(), "numerator", -952549358);
        setIntField(term44122, term44122.getClass(), "denominator", 1821411343);
        setField(term44122, term44122.getClass(), "toString", null);
        setField(term44122, term44122.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term43056, args);
        assertTrue(recursiveEquals(term43056, term44125));
        assertTrue(recursiveEquals(retValue, term44122));
    }

};


