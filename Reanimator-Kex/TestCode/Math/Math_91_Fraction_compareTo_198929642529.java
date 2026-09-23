package org.apache.commons.math.fraction;

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
import static org.apache.commons.math.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.fraction.EqualityUtils.*;

public class Fraction_compareTo_198929642529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28;
     Object term31;
     Object term918;
     Object term919;

    public Fraction_compareTo_198929642529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term28, term28.getClass(), "denominator", 1227103734);
        setIntField(term28, term28.getClass(), "numerator", -1339778481);
        term31 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term31, term31.getClass(), "denominator", 1725571209);
        setIntField(term31, term31.getClass(), "numerator", -522618178);
        term918 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term918, term918.getClass(), "denominator", 1227103734);
        setIntField(term918, term918.getClass(), "numerator", -1339778481);
        term919 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term919, term919.getClass(), "denominator", 1725571209);
        setIntField(term919, term919.getClass(), "numerator", -522618178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term31;
        Object retValue = callMethod(klass, "compareTo", argTypes, term28, args);
        assertTrue(recursiveEquals(term28, term918));
        assertTrue(recursiveEquals(term31, term919));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


