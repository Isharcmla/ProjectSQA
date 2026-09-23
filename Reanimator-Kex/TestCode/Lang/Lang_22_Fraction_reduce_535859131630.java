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

public class Fraction_reduce_535859131630 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197152;
     Object term197639;
     Object term197636;

    public Fraction_reduce_535859131630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term197152 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term197152, term197152.getClass(), "numerator", 484617414);
        setIntField(term197152, term197152.getClass(), "denominator", 1619372219);
        term197639 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term197639, term197639.getClass(), "numerator", 484617414);
        setIntField(term197639, term197639.getClass(), "denominator", 1619372219);
        setField(term197639, term197639.getClass(), "toString", null);
        setField(term197639, term197639.getClass(), "toProperString", null);
        term197636 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term197636, term197636.getClass(), "numerator", 484617414);
        setIntField(term197636, term197636.getClass(), "denominator", 1619372219);
        setField(term197636, term197636.getClass(), "toString", null);
        setField(term197636, term197636.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term197152, args);
        assertTrue(recursiveEquals(term197152, term197639));
        assertTrue(recursiveEquals(retValue, term197636));
    }

};


