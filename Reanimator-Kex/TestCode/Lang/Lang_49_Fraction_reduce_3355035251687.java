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

public class Fraction_reduce_3355035251687 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term495591;
     Object term496110;
     Object term496107;

    public Fraction_reduce_3355035251687() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term495591 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term495591, term495591.getClass(), "numerator", -2058358618);
        setIntField(term495591, term495591.getClass(), "denominator", 2027947829);
        term496110 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term496110, term496110.getClass(), "numerator", -2058358618);
        setIntField(term496110, term496110.getClass(), "denominator", 2027947829);
        setField(term496110, term496110.getClass(), "toString", null);
        setField(term496110, term496110.getClass(), "toProperString", null);
        term496107 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term496107, term496107.getClass(), "numerator", -2058358618);
        setIntField(term496107, term496107.getClass(), "denominator", 2027947829);
        setField(term496107, term496107.getClass(), "toString", null);
        setField(term496107, term496107.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term495591, args);
        assertTrue(recursiveEquals(term495591, term496110));
        assertTrue(recursiveEquals(retValue, term496107));
    }

};


