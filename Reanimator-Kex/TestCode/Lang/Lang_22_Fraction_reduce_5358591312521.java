package org.apache.commons.lang3.math;

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
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.math.EqualityUtils.*;

public class Fraction_reduce_5358591312521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term826809;
     Object term826921;
     Object term826918;

    public Fraction_reduce_5358591312521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term826809 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term826809, term826809.getClass(), "numerator", 1308622546);
        setIntField(term826809, term826809.getClass(), "denominator", 1879048321);
        term826921 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term826921, term826921.getClass(), "numerator", 1308622546);
        setIntField(term826921, term826921.getClass(), "denominator", 1879048321);
        setField(term826921, term826921.getClass(), "toString", null);
        setField(term826921, term826921.getClass(), "toProperString", null);
        term826918 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term826918, term826918.getClass(), "numerator", 1308622546);
        setIntField(term826918, term826918.getClass(), "denominator", 1879048321);
        setField(term826918, term826918.getClass(), "toString", null);
        setField(term826918, term826918.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term826809, args);
        assertTrue(recursiveEquals(term826809, term826921));
        assertTrue(recursiveEquals(retValue, term826918));
    }

};


