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

public class Fraction_reduce_3355035251224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term356687;
     Object term357542;
     Object term357539;

    public Fraction_reduce_3355035251224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term356687 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term356687, term356687.getClass(), "numerator", 1104609842);
        setIntField(term356687, term356687.getClass(), "denominator", 1970338065);
        term357542 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term357542, term357542.getClass(), "numerator", 1104609842);
        setIntField(term357542, term357542.getClass(), "denominator", 1970338065);
        setField(term357542, term357542.getClass(), "toString", null);
        setField(term357542, term357542.getClass(), "toProperString", null);
        term357539 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term357539, term357539.getClass(), "numerator", 1104609842);
        setIntField(term357539, term357539.getClass(), "denominator", 1970338065);
        setField(term357539, term357539.getClass(), "toString", null);
        setField(term357539, term357539.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term356687, args);
        assertTrue(recursiveEquals(term356687, term357542));
        assertTrue(recursiveEquals(retValue, term357539));
    }

};


