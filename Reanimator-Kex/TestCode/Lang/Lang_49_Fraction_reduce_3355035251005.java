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

public class Fraction_reduce_3355035251005 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289436;
     Object term289967;
     Object term289964;

    public Fraction_reduce_3355035251005() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289436 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term289436, term289436.getClass(), "numerator", -2147155945);
        setIntField(term289436, term289436.getClass(), "denominator", 1073741824);
        term289967 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term289967, term289967.getClass(), "numerator", -2147155945);
        setIntField(term289967, term289967.getClass(), "denominator", 1073741824);
        setField(term289967, term289967.getClass(), "toString", null);
        setField(term289967, term289967.getClass(), "toProperString", null);
        term289964 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term289964, term289964.getClass(), "numerator", -2147155945);
        setIntField(term289964, term289964.getClass(), "denominator", 1073741824);
        setField(term289964, term289964.getClass(), "toString", null);
        setField(term289964, term289964.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term289436, args);
        assertTrue(recursiveEquals(term289436, term289967));
        assertTrue(recursiveEquals(retValue, term289964));
    }

};


