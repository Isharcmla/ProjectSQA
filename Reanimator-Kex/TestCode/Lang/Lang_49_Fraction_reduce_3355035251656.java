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

public class Fraction_reduce_3355035251656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term487552;
     Object term488021;
     Object term488018;

    public Fraction_reduce_3355035251656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term487552 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term487552, term487552.getClass(), "numerator", -1905672206);
        setIntField(term487552, term487552.getClass(), "denominator", 225124351);
        term488021 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term488021, term488021.getClass(), "numerator", -1905672206);
        setIntField(term488021, term488021.getClass(), "denominator", 225124351);
        setField(term488021, term488021.getClass(), "toString", null);
        setField(term488021, term488021.getClass(), "toProperString", null);
        term488018 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term488018, term488018.getClass(), "numerator", -1905672206);
        setIntField(term488018, term488018.getClass(), "denominator", 225124351);
        setField(term488018, term488018.getClass(), "toString", null);
        setField(term488018, term488018.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term487552, args);
        assertTrue(recursiveEquals(term487552, term488021));
        assertTrue(recursiveEquals(retValue, term488018));
    }

};


