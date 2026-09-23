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

public class Fraction_reduce_3355035251034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term297258;
     Object term297631;
     Object term297625;

    public Fraction_reduce_3355035251034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term297258 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term297258, term297258.getClass(), "numerator", 289320458);
        setIntField(term297258, term297258.getClass(), "denominator", 1930154877);
        term297631 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term297631, term297631.getClass(), "numerator", 289320458);
        setIntField(term297631, term297631.getClass(), "denominator", 1930154877);
        setField(term297631, term297631.getClass(), "toString", null);
        setField(term297631, term297631.getClass(), "toProperString", null);
        term297625 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term297625, term297625.getClass(), "numerator", 41331494);
        setIntField(term297625, term297625.getClass(), "denominator", 275736411);
        setField(term297625, term297625.getClass(), "toString", null);
        setField(term297625, term297625.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term297258, args);
        assertTrue(recursiveEquals(term297258, term297631));
        assertTrue(recursiveEquals(retValue, term297625));
    }

};


