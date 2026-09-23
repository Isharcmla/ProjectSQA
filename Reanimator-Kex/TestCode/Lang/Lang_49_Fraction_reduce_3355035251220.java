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

public class Fraction_reduce_3355035251220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term355630;
     Object term356493;
     Object term356490;

    public Fraction_reduce_3355035251220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term355630 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term355630, term355630.getClass(), "numerator", 1468758274);
        setIntField(term355630, term355630.getClass(), "denominator", 507512681);
        term356493 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term356493, term356493.getClass(), "numerator", 1468758274);
        setIntField(term356493, term356493.getClass(), "denominator", 507512681);
        setField(term356493, term356493.getClass(), "toString", null);
        setField(term356493, term356493.getClass(), "toProperString", null);
        term356490 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term356490, term356490.getClass(), "numerator", 1468758274);
        setIntField(term356490, term356490.getClass(), "denominator", 507512681);
        setField(term356490, term356490.getClass(), "toString", null);
        setField(term356490, term356490.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term355630, args);
        assertTrue(recursiveEquals(term355630, term356493));
        assertTrue(recursiveEquals(retValue, term356490));
    }

};


