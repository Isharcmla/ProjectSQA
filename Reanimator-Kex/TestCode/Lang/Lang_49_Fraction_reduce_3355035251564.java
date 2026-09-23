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

public class Fraction_reduce_3355035251564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term459292;
     Object term459713;
     Object term459707;

    public Fraction_reduce_3355035251564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term459292 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term459292, term459292.getClass(), "numerator", -1601070078);
        setIntField(term459292, term459292.getClass(), "denominator", 1014435591);
        term459713 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term459713, term459713.getClass(), "numerator", -1601070078);
        setIntField(term459713, term459713.getClass(), "denominator", 1014435591);
        setField(term459713, term459713.getClass(), "toString", null);
        setField(term459713, term459713.getClass(), "toProperString", null);
        term459707 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term459707, term459707.getClass(), "numerator", -533690026);
        setIntField(term459707, term459707.getClass(), "denominator", 338145197);
        setField(term459707, term459707.getClass(), "toString", null);
        setField(term459707, term459707.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term459292, args);
        assertTrue(recursiveEquals(term459292, term459713));
        assertTrue(recursiveEquals(retValue, term459707));
    }

};


