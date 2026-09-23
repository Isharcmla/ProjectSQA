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

public class Fraction_reduce_335503525504 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138385;
     Object term138828;
     Object term138825;

    public Fraction_reduce_335503525504() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138385 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term138385, term138385.getClass(), "numerator", 50529778);
        setIntField(term138385, term138385.getClass(), "denominator", 2122417441);
        term138828 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term138828, term138828.getClass(), "numerator", 50529778);
        setIntField(term138828, term138828.getClass(), "denominator", 2122417441);
        setField(term138828, term138828.getClass(), "toString", null);
        setField(term138828, term138828.getClass(), "toProperString", null);
        term138825 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term138825, term138825.getClass(), "numerator", 50529778);
        setIntField(term138825, term138825.getClass(), "denominator", 2122417441);
        setField(term138825, term138825.getClass(), "toString", null);
        setField(term138825, term138825.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term138385, args);
        assertTrue(recursiveEquals(term138385, term138828));
        assertTrue(recursiveEquals(retValue, term138825));
    }

};


