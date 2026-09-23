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

public class Fraction_reduce_335503525882 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term250279;
     Object term250751;
     Object term250748;

    public Fraction_reduce_335503525882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term250279 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term250279, term250279.getClass(), "numerator", -1520368930);
        setIntField(term250279, term250279.getClass(), "denominator", 325107821);
        term250751 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term250751, term250751.getClass(), "numerator", -1520368930);
        setIntField(term250751, term250751.getClass(), "denominator", 325107821);
        setField(term250751, term250751.getClass(), "toString", null);
        setField(term250751, term250751.getClass(), "toProperString", null);
        term250748 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term250748, term250748.getClass(), "numerator", -1520368930);
        setIntField(term250748, term250748.getClass(), "denominator", 325107821);
        setField(term250748, term250748.getClass(), "toString", null);
        setField(term250748, term250748.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term250279, args);
        assertTrue(recursiveEquals(term250279, term250751));
        assertTrue(recursiveEquals(retValue, term250748));
    }

};


