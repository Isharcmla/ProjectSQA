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

public class Fraction_reduce_5358591312576 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term845275;
     Object term845908;
     Object term845905;

    public Fraction_reduce_5358591312576() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term845275 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term845275, term845275.getClass(), "numerator", 265439870);
        setIntField(term845275, term845275.getClass(), "denominator", 1680124039);
        term845908 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term845908, term845908.getClass(), "numerator", 265439870);
        setIntField(term845908, term845908.getClass(), "denominator", 1680124039);
        setField(term845908, term845908.getClass(), "toString", null);
        setField(term845908, term845908.getClass(), "toProperString", null);
        term845905 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term845905, term845905.getClass(), "numerator", 265439870);
        setIntField(term845905, term845905.getClass(), "denominator", 1680124039);
        setField(term845905, term845905.getClass(), "toString", null);
        setField(term845905, term845905.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term845275, args);
        assertTrue(recursiveEquals(term845275, term845908));
        assertTrue(recursiveEquals(retValue, term845905));
    }

};


