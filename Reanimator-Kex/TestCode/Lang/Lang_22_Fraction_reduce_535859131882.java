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

public class Fraction_reduce_535859131882 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term280892;
     Object term281369;
     Object term281366;

    public Fraction_reduce_535859131882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term280892 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term280892, term280892.getClass(), "numerator", -2013003770);
        setIntField(term280892, term280892.getClass(), "denominator", 1744532309);
        term281369 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term281369, term281369.getClass(), "numerator", -2013003770);
        setIntField(term281369, term281369.getClass(), "denominator", 1744532309);
        setField(term281369, term281369.getClass(), "toString", null);
        setField(term281369, term281369.getClass(), "toProperString", null);
        term281366 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term281366, term281366.getClass(), "numerator", -2013003770);
        setIntField(term281366, term281366.getClass(), "denominator", 1744532309);
        setField(term281366, term281366.getClass(), "toString", null);
        setField(term281366, term281366.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term280892, args);
        assertTrue(recursiveEquals(term280892, term281369));
        assertTrue(recursiveEquals(retValue, term281366));
    }

};


