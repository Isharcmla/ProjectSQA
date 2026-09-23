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

public class Fraction_reduce_5358591311750 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term568505;
     Object term569051;
     Object term569048;

    public Fraction_reduce_5358591311750() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term568505 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term568505, term568505.getClass(), "numerator", -1080672162);
        setIntField(term568505, term568505.getClass(), "denominator", 540336089);
        term569051 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term569051, term569051.getClass(), "numerator", -1080672162);
        setIntField(term569051, term569051.getClass(), "denominator", 540336089);
        setField(term569051, term569051.getClass(), "toString", null);
        setField(term569051, term569051.getClass(), "toProperString", null);
        term569048 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term569048, term569048.getClass(), "numerator", -1080672162);
        setIntField(term569048, term569048.getClass(), "denominator", 540336089);
        setField(term569048, term569048.getClass(), "toString", null);
        setField(term569048, term569048.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term568505, args);
        assertTrue(recursiveEquals(term568505, term569051));
        assertTrue(recursiveEquals(retValue, term569048));
    }

};


