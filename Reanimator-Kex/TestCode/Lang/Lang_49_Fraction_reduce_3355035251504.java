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

public class Fraction_reduce_3355035251504 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term443298;
     Object term443639;
     Object term443636;

    public Fraction_reduce_3355035251504() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term443298 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term443298, term443298.getClass(), "numerator", 1036962);
        setIntField(term443298, term443298.getClass(), "denominator", 535815289);
        term443639 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term443639, term443639.getClass(), "numerator", 1036962);
        setIntField(term443639, term443639.getClass(), "denominator", 535815289);
        setField(term443639, term443639.getClass(), "toString", null);
        setField(term443639, term443639.getClass(), "toProperString", null);
        term443636 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term443636, term443636.getClass(), "numerator", 1036962);
        setIntField(term443636, term443636.getClass(), "denominator", 535815289);
        setField(term443636, term443636.getClass(), "toString", null);
        setField(term443636, term443636.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term443298, args);
        assertTrue(recursiveEquals(term443298, term443639));
        assertTrue(recursiveEquals(retValue, term443636));
    }

};


