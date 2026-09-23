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

public class Fraction_reduce_5358591312532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term829760;
     Object term830478;
     Object term830472;

    public Fraction_reduce_5358591312532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term829760 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term829760, term829760.getClass(), "numerator", -536870910);
        setIntField(term829760, term829760.getClass(), "denominator", 1407078295);
        term830478 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term830478, term830478.getClass(), "numerator", -536870910);
        setIntField(term830478, term830478.getClass(), "denominator", 1407078295);
        setField(term830478, term830478.getClass(), "toString", null);
        setField(term830478, term830478.getClass(), "toProperString", null);
        term830472 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term830472, term830472.getClass(), "numerator", -107374182);
        setIntField(term830472, term830472.getClass(), "denominator", 281415659);
        setField(term830472, term830472.getClass(), "toString", null);
        setField(term830472, term830472.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term829760, args);
        assertTrue(recursiveEquals(term829760, term830478));
        assertTrue(recursiveEquals(retValue, term830472));
    }

};


