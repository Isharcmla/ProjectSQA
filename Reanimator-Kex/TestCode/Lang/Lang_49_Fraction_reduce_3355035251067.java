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

public class Fraction_reduce_3355035251067 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term308639;
     Object term309215;
     Object term309212;

    public Fraction_reduce_3355035251067() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term308639 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term308639, term308639.getClass(), "numerator", 1610211326);
        setIntField(term308639, term308639.getClass(), "denominator", 805306375);
        term309215 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term309215, term309215.getClass(), "numerator", 1610211326);
        setIntField(term309215, term309215.getClass(), "denominator", 805306375);
        setField(term309215, term309215.getClass(), "toString", null);
        setField(term309215, term309215.getClass(), "toProperString", null);
        term309212 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term309212, term309212.getClass(), "numerator", 1610211326);
        setIntField(term309212, term309212.getClass(), "denominator", 805306375);
        setField(term309212, term309212.getClass(), "toString", null);
        setField(term309212, term309212.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term308639, args);
        assertTrue(recursiveEquals(term308639, term309215));
        assertTrue(recursiveEquals(retValue, term309212));
    }

};


