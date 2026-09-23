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

public class Fraction_reduce_5358591312416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term789674;
     Object term790280;
     Object term790277;

    public Fraction_reduce_5358591312416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term789674 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term789674, term789674.getClass(), "numerator", 1799397698);
        setIntField(term789674, term789674.getClass(), "denominator", 1075234697);
        term790280 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term790280, term790280.getClass(), "numerator", 1799397698);
        setIntField(term790280, term790280.getClass(), "denominator", 1075234697);
        setField(term790280, term790280.getClass(), "toString", null);
        setField(term790280, term790280.getClass(), "toProperString", null);
        term790277 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term790277, term790277.getClass(), "numerator", 1799397698);
        setIntField(term790277, term790277.getClass(), "denominator", 1075234697);
        setField(term790277, term790277.getClass(), "toString", null);
        setField(term790277, term790277.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term789674, args);
        assertTrue(recursiveEquals(term789674, term790280));
        assertTrue(recursiveEquals(retValue, term790277));
    }

};


