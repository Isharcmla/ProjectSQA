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

public class Fraction_reduce_3355035251214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term354347;
     Object term355010;
     Object term355007;

    public Fraction_reduce_3355035251214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term354347 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term354347, term354347.getClass(), "numerator", 354419490);
        setIntField(term354347, term354347.getClass(), "denominator", 1031870473);
        term355010 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term355010, term355010.getClass(), "numerator", 354419490);
        setIntField(term355010, term355010.getClass(), "denominator", 1031870473);
        setField(term355010, term355010.getClass(), "toString", null);
        setField(term355010, term355010.getClass(), "toProperString", null);
        term355007 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term355007, term355007.getClass(), "numerator", 354419490);
        setIntField(term355007, term355007.getClass(), "denominator", 1031870473);
        setField(term355007, term355007.getClass(), "toString", null);
        setField(term355007, term355007.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term354347, args);
        assertTrue(recursiveEquals(term354347, term355010));
        assertTrue(recursiveEquals(retValue, term355007));
    }

};


