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

public class Fraction_reduce_535859131713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225834;
     Object term226429;
     Object term226423;

    public Fraction_reduce_535859131713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term225834 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term225834, term225834.getClass(), "numerator", -475228158);
        setIntField(term225834, term225834.getClass(), "denominator", 309369879);
        term226429 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term226429, term226429.getClass(), "numerator", -475228158);
        setIntField(term226429, term226429.getClass(), "denominator", 309369879);
        setField(term226429, term226429.getClass(), "toString", null);
        setField(term226429, term226429.getClass(), "toProperString", null);
        term226423 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term226423, term226423.getClass(), "numerator", -158409386);
        setIntField(term226423, term226423.getClass(), "denominator", 103123293);
        setField(term226423, term226423.getClass(), "toString", null);
        setField(term226423, term226423.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term225834, args);
        assertTrue(recursiveEquals(term225834, term226429));
        assertTrue(recursiveEquals(retValue, term226423));
    }

};


