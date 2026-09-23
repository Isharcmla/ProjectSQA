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

public class Fraction_reduce_335503525760 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term212028;
     Object term212420;
     Object term212414;

    public Fraction_reduce_335503525760() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term212028 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term212028, term212028.getClass(), "numerator", 78892722);
        setIntField(term212028, term212028.getClass(), "denominator", 2108954433);
        term212420 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term212420, term212420.getClass(), "numerator", 78892722);
        setIntField(term212420, term212420.getClass(), "denominator", 2108954433);
        setField(term212420, term212420.getClass(), "toString", null);
        setField(term212420, term212420.getClass(), "toProperString", null);
        term212414 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term212414, term212414.getClass(), "numerator", 26297574);
        setIntField(term212414, term212414.getClass(), "denominator", 702984811);
        setField(term212414, term212414.getClass(), "toString", null);
        setField(term212414, term212414.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term212028, args);
        assertTrue(recursiveEquals(term212028, term212420));
        assertTrue(recursiveEquals(retValue, term212414));
    }

};


