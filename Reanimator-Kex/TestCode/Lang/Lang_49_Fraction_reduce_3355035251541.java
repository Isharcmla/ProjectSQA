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

public class Fraction_reduce_3355035251541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term452994;
     Object term453848;
     Object term453845;

    public Fraction_reduce_3355035251541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term452994 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term452994, term452994.getClass(), "numerator", -1838445474);
        setIntField(term452994, term452994.getClass(), "denominator", 719023661);
        term453848 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term453848, term453848.getClass(), "numerator", -1838445474);
        setIntField(term453848, term453848.getClass(), "denominator", 719023661);
        setField(term453848, term453848.getClass(), "toString", null);
        setField(term453848, term453848.getClass(), "toProperString", null);
        term453845 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term453845, term453845.getClass(), "numerator", -1838445474);
        setIntField(term453845, term453845.getClass(), "denominator", 719023661);
        setField(term453845, term453845.getClass(), "toString", null);
        setField(term453845, term453845.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term452994, args);
        assertTrue(recursiveEquals(term452994, term453848));
        assertTrue(recursiveEquals(retValue, term453845));
    }

};


