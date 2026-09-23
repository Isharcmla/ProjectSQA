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

public class Fraction_reduce_5358591312270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term740460;
     Object term741431;
     Object term741428;

    public Fraction_reduce_5358591312270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term740460 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term740460, term740460.getClass(), "numerator", -402356138);
        setIntField(term740460, term740460.getClass(), "denominator", 1428262477);
        term741431 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term741431, term741431.getClass(), "numerator", -402356138);
        setIntField(term741431, term741431.getClass(), "denominator", 1428262477);
        setField(term741431, term741431.getClass(), "toString", null);
        setField(term741431, term741431.getClass(), "toProperString", null);
        term741428 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term741428, term741428.getClass(), "numerator", -402356138);
        setIntField(term741428, term741428.getClass(), "denominator", 1428262477);
        setField(term741428, term741428.getClass(), "toString", null);
        setField(term741428, term741428.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term740460, args);
        assertTrue(recursiveEquals(term740460, term741431));
        assertTrue(recursiveEquals(retValue, term741428));
    }

};


