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

public class Fraction_reduce_5358591311655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term539109;
     Object term539312;
     Object term539309;

    public Fraction_reduce_5358591311655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term539109 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term539109, term539109.getClass(), "numerator", -2147352318);
        setIntField(term539109, term539109.getClass(), "denominator", 1258226135);
        term539312 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term539312, term539312.getClass(), "numerator", -2147352318);
        setIntField(term539312, term539312.getClass(), "denominator", 1258226135);
        setField(term539312, term539312.getClass(), "toString", null);
        setField(term539312, term539312.getClass(), "toProperString", null);
        term539309 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term539309, term539309.getClass(), "numerator", -2147352318);
        setIntField(term539309, term539309.getClass(), "denominator", 1258226135);
        setField(term539309, term539309.getClass(), "toString", null);
        setField(term539309, term539309.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term539109, args);
        assertTrue(recursiveEquals(term539109, term539312));
        assertTrue(recursiveEquals(retValue, term539309));
    }

};


