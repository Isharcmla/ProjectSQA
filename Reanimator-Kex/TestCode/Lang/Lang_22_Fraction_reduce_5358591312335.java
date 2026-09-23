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

public class Fraction_reduce_5358591312335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term762594;
     Object term763322;
     Object term763319;

    public Fraction_reduce_5358591312335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term762594 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term762594, term762594.getClass(), "numerator", -170412154);
        setIntField(term762594, term762594.getClass(), "denominator", 2059377637);
        term763322 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term763322, term763322.getClass(), "numerator", -170412154);
        setIntField(term763322, term763322.getClass(), "denominator", 2059377637);
        setField(term763322, term763322.getClass(), "toString", null);
        setField(term763322, term763322.getClass(), "toProperString", null);
        term763319 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term763319, term763319.getClass(), "numerator", -170412154);
        setIntField(term763319, term763319.getClass(), "denominator", 2059377637);
        setField(term763319, term763319.getClass(), "toString", null);
        setField(term763319, term763319.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term762594, args);
        assertTrue(recursiveEquals(term762594, term763322));
        assertTrue(recursiveEquals(retValue, term763319));
    }

};


