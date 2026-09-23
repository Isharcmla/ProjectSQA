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

public class Fraction_reduce_33550352589 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13177;
     Object term13713;
     Object term13710;

    public Fraction_reduce_33550352589() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13177 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term13177, term13177.getClass(), "numerator", 1114498);
        setIntField(term13177, term13177.getClass(), "denominator", 2126913065);
        term13713 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term13713, term13713.getClass(), "numerator", 1114498);
        setIntField(term13713, term13713.getClass(), "denominator", 2126913065);
        setField(term13713, term13713.getClass(), "toString", null);
        setField(term13713, term13713.getClass(), "toProperString", null);
        term13710 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term13710, term13710.getClass(), "numerator", 1114498);
        setIntField(term13710, term13710.getClass(), "denominator", 2126913065);
        setField(term13710, term13710.getClass(), "toString", null);
        setField(term13710, term13710.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term13177, args);
        assertTrue(recursiveEquals(term13177, term13713));
        assertTrue(recursiveEquals(retValue, term13710));
    }

};


