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

public class Fraction_reduce_335503525583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160775;
     Object term161029;
     Object term161023;

    public Fraction_reduce_335503525583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term160775 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term160775, term160775.getClass(), "numerator", 204623490);
        setIntField(term160775, term160775.getClass(), "denominator", 1104226089);
        term161029 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term161029, term161029.getClass(), "numerator", 204623490);
        setIntField(term161029, term161029.getClass(), "denominator", 1104226089);
        setField(term161029, term161029.getClass(), "toString", null);
        setField(term161029, term161029.getClass(), "toProperString", null);
        term161023 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term161023, term161023.getClass(), "numerator", 68207830);
        setIntField(term161023, term161023.getClass(), "denominator", 368075363);
        setField(term161023, term161023.getClass(), "toString", null);
        setField(term161023, term161023.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term160775, args);
        assertTrue(recursiveEquals(term160775, term161029));
        assertTrue(recursiveEquals(retValue, term161023));
    }

};


