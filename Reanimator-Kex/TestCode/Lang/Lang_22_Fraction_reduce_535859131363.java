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

public class Fraction_reduce_535859131363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104086;
     Object term104192;
     Object term104189;

    public Fraction_reduce_535859131363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104086 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term104086, term104086.getClass(), "numerator", 1337982946);
        setIntField(term104086, term104086.getClass(), "denominator", 1879048201);
        term104192 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term104192, term104192.getClass(), "numerator", 1337982946);
        setIntField(term104192, term104192.getClass(), "denominator", 1879048201);
        setField(term104192, term104192.getClass(), "toString", null);
        setField(term104192, term104192.getClass(), "toProperString", null);
        term104189 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term104189, term104189.getClass(), "numerator", 1337982946);
        setIntField(term104189, term104189.getClass(), "denominator", 1879048201);
        setField(term104189, term104189.getClass(), "toString", null);
        setField(term104189, term104189.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term104086, args);
        assertTrue(recursiveEquals(term104086, term104192));
        assertTrue(recursiveEquals(retValue, term104189));
    }

};


