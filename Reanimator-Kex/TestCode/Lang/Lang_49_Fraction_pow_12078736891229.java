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

public class Fraction_pow_12078736891229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term358984;
     Object term359415;
     Object term359411;

    public Fraction_pow_12078736891229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term358984 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term358984, term358984.getClass(), "numerator", -2);
        setIntField(term358984, term358984.getClass(), "denominator", -9);
        term359415 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term359415, term359415.getClass(), "numerator", -2);
        setIntField(term359415, term359415.getClass(), "denominator", -9);
        setField(term359415, term359415.getClass(), "toString", null);
        setField(term359415, term359415.getClass(), "toProperString", null);
        term359411 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term359411, term359411.getClass(), "numerator", 256);
        setIntField(term359411, term359411.getClass(), "denominator", 43046721);
        setField(term359411, term359411.getClass(), "toString", null);
        setField(term359411, term359411.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 8;
        Object retValue = callMethod(klass, "pow", argTypes, term358984, args);
        assertTrue(recursiveEquals(term358984, term359415));
        assertTrue(recursiveEquals(retValue, term359411));
    }

};


