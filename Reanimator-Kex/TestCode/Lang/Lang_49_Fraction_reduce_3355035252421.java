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

public class Fraction_reduce_3355035252421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term719295;
     Object term719869;
     Object term719866;

    public Fraction_reduce_3355035252421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term719295 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term719295, term719295.getClass(), "numerator", 643838434);
        setIntField(term719295, term719295.getClass(), "denominator", 1748863337);
        term719869 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term719869, term719869.getClass(), "numerator", 643838434);
        setIntField(term719869, term719869.getClass(), "denominator", 1748863337);
        setField(term719869, term719869.getClass(), "toString", null);
        setField(term719869, term719869.getClass(), "toProperString", null);
        term719866 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term719866, term719866.getClass(), "numerator", 643838434);
        setIntField(term719866, term719866.getClass(), "denominator", 1748863337);
        setField(term719866, term719866.getClass(), "toString", null);
        setField(term719866, term719866.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term719295, args);
        assertTrue(recursiveEquals(term719295, term719869));
        assertTrue(recursiveEquals(retValue, term719866));
    }

};


