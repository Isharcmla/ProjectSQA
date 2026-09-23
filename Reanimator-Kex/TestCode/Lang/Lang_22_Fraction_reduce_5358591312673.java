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

public class Fraction_reduce_5358591312673 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term876115;
     Object term877506;
     Object term877503;

    public Fraction_reduce_5358591312673() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term876115 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term876115, term876115.getClass(), "numerator", 86001922);
        setIntField(term876115, term876115.getClass(), "denominator", 1830344281);
        term877506 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term877506, term877506.getClass(), "numerator", 86001922);
        setIntField(term877506, term877506.getClass(), "denominator", 1830344281);
        setField(term877506, term877506.getClass(), "toString", null);
        setField(term877506, term877506.getClass(), "toProperString", null);
        term877503 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term877503, term877503.getClass(), "numerator", 86001922);
        setIntField(term877503, term877503.getClass(), "denominator", 1830344281);
        setField(term877503, term877503.getClass(), "toString", null);
        setField(term877503, term877503.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term876115, args);
        assertTrue(recursiveEquals(term876115, term877506));
        assertTrue(recursiveEquals(retValue, term877503));
    }

};


