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

public class Fraction_reduce_3355035252452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term729455;
     Object term730433;
     Object term730430;

    public Fraction_reduce_3355035252452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term729455 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term729455, term729455.getClass(), "numerator", 472008714);
        setIntField(term729455, term729455.getClass(), "denominator", 1182802685);
        term730433 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term730433, term730433.getClass(), "numerator", 472008714);
        setIntField(term730433, term730433.getClass(), "denominator", 1182802685);
        setField(term730433, term730433.getClass(), "toString", null);
        setField(term730433, term730433.getClass(), "toProperString", null);
        term730430 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term730430, term730430.getClass(), "numerator", 472008714);
        setIntField(term730430, term730430.getClass(), "denominator", 1182802685);
        setField(term730430, term730430.getClass(), "toString", null);
        setField(term730430, term730430.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term729455, args);
        assertTrue(recursiveEquals(term729455, term730433));
        assertTrue(recursiveEquals(retValue, term730430));
    }

};


