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

public class Fraction_reduce_3355035251122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term324702;
     Object term325528;
     Object term325525;

    public Fraction_reduce_3355035251122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term324702 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term324702, term324702.getClass(), "numerator", 30);
        setIntField(term324702, term324702.getClass(), "denominator", 7);
        term325528 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term325528, term325528.getClass(), "numerator", 30);
        setIntField(term325528, term325528.getClass(), "denominator", 7);
        setField(term325528, term325528.getClass(), "toString", null);
        setField(term325528, term325528.getClass(), "toProperString", null);
        term325525 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term325525, term325525.getClass(), "numerator", 30);
        setIntField(term325525, term325525.getClass(), "denominator", 7);
        setField(term325525, term325525.getClass(), "toString", null);
        setField(term325525, term325525.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term324702, args);
        assertTrue(recursiveEquals(term324702, term325528));
        assertTrue(recursiveEquals(retValue, term325525));
    }

};


