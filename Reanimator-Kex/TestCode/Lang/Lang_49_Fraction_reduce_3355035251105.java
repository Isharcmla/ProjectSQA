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

public class Fraction_reduce_3355035251105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term319474;
     Object term320033;
     Object term320030;

    public Fraction_reduce_3355035251105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term319474 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term319474, term319474.getClass(), "numerator", -2013266302);
        setIntField(term319474, term319474.getClass(), "denominator", 2147482759);
        term320033 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term320033, term320033.getClass(), "numerator", -2013266302);
        setIntField(term320033, term320033.getClass(), "denominator", 2147482759);
        setField(term320033, term320033.getClass(), "toString", null);
        setField(term320033, term320033.getClass(), "toProperString", null);
        term320030 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term320030, term320030.getClass(), "numerator", -2013266302);
        setIntField(term320030, term320030.getClass(), "denominator", 2147482759);
        setField(term320030, term320030.getClass(), "toString", null);
        setField(term320030, term320030.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term319474, args);
        assertTrue(recursiveEquals(term319474, term320033));
        assertTrue(recursiveEquals(retValue, term320030));
    }

};


