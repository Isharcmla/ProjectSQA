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

public class Fraction_reduce_3355035251116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term323071;
     Object term323697;
     Object term323694;

    public Fraction_reduce_3355035251116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term323071 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term323071, term323071.getClass(), "numerator", -56549074);
        setIntField(term323071, term323071.getClass(), "denominator", 2113943185);
        term323697 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term323697, term323697.getClass(), "numerator", -56549074);
        setIntField(term323697, term323697.getClass(), "denominator", 2113943185);
        setField(term323697, term323697.getClass(), "toString", null);
        setField(term323697, term323697.getClass(), "toProperString", null);
        term323694 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term323694, term323694.getClass(), "numerator", -56549074);
        setIntField(term323694, term323694.getClass(), "denominator", 2113943185);
        setField(term323694, term323694.getClass(), "toString", null);
        setField(term323694, term323694.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term323071, args);
        assertTrue(recursiveEquals(term323071, term323697));
        assertTrue(recursiveEquals(retValue, term323694));
    }

};


