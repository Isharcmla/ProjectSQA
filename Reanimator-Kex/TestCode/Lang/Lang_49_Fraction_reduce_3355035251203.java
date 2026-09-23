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

public class Fraction_reduce_3355035251203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term351024;
     Object term351494;
     Object term351491;

    public Fraction_reduce_3355035251203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term351024 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term351024, term351024.getClass(), "numerator", 972433970);
        setIntField(term351024, term351024.getClass(), "denominator", 486541441);
        term351494 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term351494, term351494.getClass(), "numerator", 972433970);
        setIntField(term351494, term351494.getClass(), "denominator", 486541441);
        setField(term351494, term351494.getClass(), "toString", null);
        setField(term351494, term351494.getClass(), "toProperString", null);
        term351491 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term351491, term351491.getClass(), "numerator", 972433970);
        setIntField(term351491, term351491.getClass(), "denominator", 486541441);
        setField(term351491, term351491.getClass(), "toString", null);
        setField(term351491, term351491.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term351024, args);
        assertTrue(recursiveEquals(term351024, term351494));
        assertTrue(recursiveEquals(retValue, term351491));
    }

};


