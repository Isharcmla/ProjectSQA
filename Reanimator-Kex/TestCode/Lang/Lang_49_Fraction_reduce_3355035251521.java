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

public class Fraction_reduce_3355035251521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term447635;
     Object term449016;
     Object term449013;

    public Fraction_reduce_3355035251521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term447635 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term447635, term447635.getClass(), "numerator", 1870425086);
        setIntField(term447635, term447635.getClass(), "denominator", 596678167);
        term449016 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term449016, term449016.getClass(), "numerator", 1870425086);
        setIntField(term449016, term449016.getClass(), "denominator", 596678167);
        setField(term449016, term449016.getClass(), "toString", null);
        setField(term449016, term449016.getClass(), "toProperString", null);
        term449013 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term449013, term449013.getClass(), "numerator", 1870425086);
        setIntField(term449013, term449013.getClass(), "denominator", 596678167);
        setField(term449013, term449013.getClass(), "toString", null);
        setField(term449013, term449013.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term447635, args);
        assertTrue(recursiveEquals(term447635, term449016));
        assertTrue(recursiveEquals(retValue, term449013));
    }

};


