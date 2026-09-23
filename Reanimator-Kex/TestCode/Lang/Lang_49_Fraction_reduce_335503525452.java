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

public class Fraction_reduce_335503525452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123494;
     Object term123926;
     Object term123920;

    public Fraction_reduce_335503525452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123494 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term123494, term123494.getClass(), "numerator", -266300622);
        setIntField(term123494, term123494.getClass(), "denominator", 821692863);
        term123926 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term123926, term123926.getClass(), "numerator", -266300622);
        setIntField(term123926, term123926.getClass(), "denominator", 821692863);
        setField(term123926, term123926.getClass(), "toString", null);
        setField(term123926, term123926.getClass(), "toProperString", null);
        term123920 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term123920, term123920.getClass(), "numerator", -9862986);
        setIntField(term123920, term123920.getClass(), "denominator", 30433069);
        setField(term123920, term123920.getClass(), "toString", null);
        setField(term123920, term123920.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term123494, args);
        assertTrue(recursiveEquals(term123494, term123926));
        assertTrue(recursiveEquals(retValue, term123920));
    }

};


