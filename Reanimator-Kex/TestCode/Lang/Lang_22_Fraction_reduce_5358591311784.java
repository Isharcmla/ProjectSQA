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

public class Fraction_reduce_5358591311784 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term580523;
     Object term581048;
     Object term581045;

    public Fraction_reduce_5358591311784() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term580523 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term580523, term580523.getClass(), "numerator", -132302990);
        setIntField(term580523, term580523.getClass(), "denominator", 1344220191);
        term581048 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term581048, term581048.getClass(), "numerator", -132302990);
        setIntField(term581048, term581048.getClass(), "denominator", 1344220191);
        setField(term581048, term581048.getClass(), "toString", null);
        setField(term581048, term581048.getClass(), "toProperString", null);
        term581045 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term581045, term581045.getClass(), "numerator", -132302990);
        setIntField(term581045, term581045.getClass(), "denominator", 1344220191);
        setField(term581045, term581045.getClass(), "toString", null);
        setField(term581045, term581045.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term580523, args);
        assertTrue(recursiveEquals(term580523, term581048));
        assertTrue(recursiveEquals(retValue, term581045));
    }

};


