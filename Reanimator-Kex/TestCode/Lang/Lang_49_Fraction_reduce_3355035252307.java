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

public class Fraction_reduce_3355035252307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term683511;
     Object term683694;
     Object term683691;

    public Fraction_reduce_3355035252307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term683511 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term683511, term683511.getClass(), "numerator", 1979722606);
        setIntField(term683511, term683511.getClass(), "denominator", 50337279);
        term683694 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term683694, term683694.getClass(), "numerator", 1979722606);
        setIntField(term683694, term683694.getClass(), "denominator", 50337279);
        setField(term683694, term683694.getClass(), "toString", null);
        setField(term683694, term683694.getClass(), "toProperString", null);
        term683691 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term683691, term683691.getClass(), "numerator", 1979722606);
        setIntField(term683691, term683691.getClass(), "denominator", 50337279);
        setField(term683691, term683691.getClass(), "toString", null);
        setField(term683691, term683691.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term683511, args);
        assertTrue(recursiveEquals(term683511, term683694));
        assertTrue(recursiveEquals(retValue, term683691));
    }

};


