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

public class Fraction_reduce_3355035251537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term452173;
     Object term452757;
     Object term452754;

    public Fraction_reduce_3355035251537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term452173 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term452173, term452173.getClass(), "numerator", -144638194);
        setIntField(term452173, term452173.getClass(), "denominator", 2119138241);
        term452757 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term452757, term452757.getClass(), "numerator", -144638194);
        setIntField(term452757, term452757.getClass(), "denominator", 2119138241);
        setField(term452757, term452757.getClass(), "toString", null);
        setField(term452757, term452757.getClass(), "toProperString", null);
        term452754 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term452754, term452754.getClass(), "numerator", -144638194);
        setIntField(term452754, term452754.getClass(), "denominator", 2119138241);
        setField(term452754, term452754.getClass(), "toString", null);
        setField(term452754, term452754.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term452173, args);
        assertTrue(recursiveEquals(term452173, term452757));
        assertTrue(recursiveEquals(retValue, term452754));
    }

};


