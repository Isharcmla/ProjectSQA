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

public class Fraction_subtract_2650031232156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term702421;
     Object term702503;
     Object term703407;
     Object term703408;
     Object term703404;

    public Fraction_subtract_2650031232156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term702421 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term702421, term702421.getClass(), "numerator", 8);
        setIntField(term702421, term702421.getClass(), "denominator", -57178360);
        term702503 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term702503, term702503.getClass(), "numerator", 512);
        setIntField(term702503, term702503.getClass(), "denominator", 37407908);
        term703407 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term703407, term703407.getClass(), "numerator", 8);
        setIntField(term703407, term703407.getClass(), "denominator", -57178360);
        setField(term703407, term703407.getClass(), "toString", null);
        setField(term703407, term703407.getClass(), "toProperString", null);
        term703408 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term703408, term703408.getClass(), "numerator", 512);
        setIntField(term703408, term703408.getClass(), "denominator", 37407908);
        setField(term703408, term703408.getClass(), "toString", null);
        setField(term703408, term703408.getClass(), "toProperString", null);
        term703404 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term703404, term703404.getClass(), "numerator", 1848411474);
        setIntField(term703404, term703404.getClass(), "denominator", -1819816430);
        setField(term703404, term703404.getClass(), "toString", null);
        setField(term703404, term703404.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term702503;
        Object retValue = callMethod(klass, "subtract", argTypes, term702421, args);
        assertTrue(recursiveEquals(term702421, term703407));
        assertTrue(recursiveEquals(term702503, term703408));
        assertTrue(recursiveEquals(retValue, term703404));
    }

};


