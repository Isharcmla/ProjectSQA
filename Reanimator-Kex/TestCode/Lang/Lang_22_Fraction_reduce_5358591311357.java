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

public class Fraction_reduce_5358591311357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term442880;
     Object term443846;
     Object term443843;

    public Fraction_reduce_5358591311357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term442880 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term442880, term442880.getClass(), "numerator", 118521506);
        setIntField(term442880, term442880.getClass(), "denominator", 2043217353);
        term443846 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term443846, term443846.getClass(), "numerator", 118521506);
        setIntField(term443846, term443846.getClass(), "denominator", 2043217353);
        setField(term443846, term443846.getClass(), "toString", null);
        setField(term443846, term443846.getClass(), "toProperString", null);
        term443843 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term443843, term443843.getClass(), "numerator", 118521506);
        setIntField(term443843, term443843.getClass(), "denominator", 2043217353);
        setField(term443843, term443843.getClass(), "toString", null);
        setField(term443843, term443843.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term442880, args);
        assertTrue(recursiveEquals(term442880, term443846));
        assertTrue(recursiveEquals(retValue, term443843));
    }

};


