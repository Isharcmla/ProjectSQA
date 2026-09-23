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

public class Fraction_reduce_5358591311599 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term520253;
     Object term520764;
     Object term520758;

    public Fraction_reduce_5358591311599() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term520253 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term520253, term520253.getClass(), "numerator", 2081036634);
        setIntField(term520253, term520253.getClass(), "denominator", 1076489925);
        term520764 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term520764, term520764.getClass(), "numerator", 2081036634);
        setIntField(term520764, term520764.getClass(), "denominator", 1076489925);
        setField(term520764, term520764.getClass(), "toString", null);
        setField(term520764, term520764.getClass(), "toProperString", null);
        term520758 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term520758, term520758.getClass(), "numerator", 693678878);
        setIntField(term520758, term520758.getClass(), "denominator", 358829975);
        setField(term520758, term520758.getClass(), "toString", null);
        setField(term520758, term520758.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term520253, args);
        assertTrue(recursiveEquals(term520253, term520764));
        assertTrue(recursiveEquals(retValue, term520758));
    }

};


