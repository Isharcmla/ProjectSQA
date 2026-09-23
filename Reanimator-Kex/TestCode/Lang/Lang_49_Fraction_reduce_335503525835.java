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

public class Fraction_reduce_335503525835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236269;
     Object term236838;
     Object term236835;

    public Fraction_reduce_335503525835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term236269 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term236269, term236269.getClass(), "numerator", 400722338);
        setIntField(term236269, term236269.getClass(), "denominator", 1912662361);
        term236838 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term236838, term236838.getClass(), "numerator", 400722338);
        setIntField(term236838, term236838.getClass(), "denominator", 1912662361);
        setField(term236838, term236838.getClass(), "toString", null);
        setField(term236838, term236838.getClass(), "toProperString", null);
        term236835 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term236835, term236835.getClass(), "numerator", 400722338);
        setIntField(term236835, term236835.getClass(), "denominator", 1912662361);
        setField(term236835, term236835.getClass(), "toString", null);
        setField(term236835, term236835.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term236269, args);
        assertTrue(recursiveEquals(term236269, term236838));
        assertTrue(recursiveEquals(retValue, term236835));
    }

};


