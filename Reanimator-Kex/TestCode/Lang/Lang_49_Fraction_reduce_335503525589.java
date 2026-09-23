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

public class Fraction_reduce_335503525589 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162555;
     Object term162757;
     Object term162754;

    public Fraction_reduce_335503525589() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term162555 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term162555, term162555.getClass(), "numerator", 390701154);
        setIntField(term162555, term162555.getClass(), "denominator", 872345369);
        term162757 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term162757, term162757.getClass(), "numerator", 390701154);
        setIntField(term162757, term162757.getClass(), "denominator", 872345369);
        setField(term162757, term162757.getClass(), "toString", null);
        setField(term162757, term162757.getClass(), "toProperString", null);
        term162754 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term162754, term162754.getClass(), "numerator", 390701154);
        setIntField(term162754, term162754.getClass(), "denominator", 872345369);
        setField(term162754, term162754.getClass(), "toString", null);
        setField(term162754, term162754.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term162555, args);
        assertTrue(recursiveEquals(term162555, term162757));
        assertTrue(recursiveEquals(retValue, term162754));
    }

};


