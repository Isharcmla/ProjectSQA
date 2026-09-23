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

public class Fraction_subtract_2650031232292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term749192;
     Object term749274;
     Object term750233;
     Object term750234;
     Object term750230;

    public Fraction_subtract_2650031232292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term749192 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term749192, term749192.getClass(), "numerator", 1024);
        setIntField(term749192, term749192.getClass(), "denominator", -1181736);
        term749274 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term749274, term749274.getClass(), "numerator", 256);
        setIntField(term749274, term749274.getClass(), "denominator", 817228);
        term750233 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term750233, term750233.getClass(), "numerator", 1024);
        setIntField(term750233, term750233.getClass(), "denominator", -1181736);
        setField(term750233, term750233.getClass(), "toString", null);
        setField(term750233, term750233.getClass(), "toProperString", null);
        term750234 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term750234, term750234.getClass(), "numerator", 256);
        setIntField(term750234, term750234.getClass(), "denominator", 817228);
        setField(term750234, term750234.getClass(), "toString", null);
        setField(term750234, term750234.getClass(), "toProperString", null);
        term750230 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term750230, term750230.getClass(), "numerator", 71210368);
        setIntField(term750230, term750230.getClass(), "denominator", -229692094);
        setField(term750230, term750230.getClass(), "toString", null);
        setField(term750230, term750230.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term749274;
        Object retValue = callMethod(klass, "subtract", argTypes, term749192, args);
        assertTrue(recursiveEquals(term749192, term750233));
        assertTrue(recursiveEquals(term749274, term750234));
        assertTrue(recursiveEquals(retValue, term750230));
    }

};


