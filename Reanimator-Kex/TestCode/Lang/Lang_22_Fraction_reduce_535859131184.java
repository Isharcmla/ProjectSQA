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

public class Fraction_reduce_535859131184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44395;
     Object term45174;
     Object term45171;

    public Fraction_reduce_535859131184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44395 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term44395, term44395.getClass(), "numerator", -1474310334);
        setIntField(term44395, term44395.getClass(), "denominator", 1880622055);
        term45174 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term45174, term45174.getClass(), "numerator", -1474310334);
        setIntField(term45174, term45174.getClass(), "denominator", 1880622055);
        setField(term45174, term45174.getClass(), "toString", null);
        setField(term45174, term45174.getClass(), "toProperString", null);
        term45171 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term45171, term45171.getClass(), "numerator", -1474310334);
        setIntField(term45171, term45171.getClass(), "denominator", 1880622055);
        setField(term45171, term45171.getClass(), "toString", null);
        setField(term45171, term45171.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term44395, args);
        assertTrue(recursiveEquals(term44395, term45174));
        assertTrue(recursiveEquals(retValue, term45171));
    }

};


