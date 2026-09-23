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

public class Fraction_reduce_3355035251031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term296587;
     Object term297066;
     Object term297063;

    public Fraction_reduce_3355035251031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term296587 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term296587, term296587.getClass(), "numerator", 1114280242);
        setIntField(term296587, term296587.getClass(), "denominator", 2008182849);
        term297066 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term297066, term297066.getClass(), "numerator", 1114280242);
        setIntField(term297066, term297066.getClass(), "denominator", 2008182849);
        setField(term297066, term297066.getClass(), "toString", null);
        setField(term297066, term297066.getClass(), "toProperString", null);
        term297063 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term297063, term297063.getClass(), "numerator", 1114280242);
        setIntField(term297063, term297063.getClass(), "denominator", 2008182849);
        setField(term297063, term297063.getClass(), "toString", null);
        setField(term297063, term297063.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term296587, args);
        assertTrue(recursiveEquals(term296587, term297066));
        assertTrue(recursiveEquals(retValue, term297063));
    }

};


