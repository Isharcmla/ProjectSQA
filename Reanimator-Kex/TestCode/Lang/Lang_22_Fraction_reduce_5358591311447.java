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

public class Fraction_reduce_5358591311447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term471584;
     Object term471792;
     Object term471789;

    public Fraction_reduce_5358591311447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term471584 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term471584, term471584.getClass(), "numerator", -66545662);
        setIntField(term471584, term471584.getClass(), "denominator", 2110287543);
        term471792 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term471792, term471792.getClass(), "numerator", -66545662);
        setIntField(term471792, term471792.getClass(), "denominator", 2110287543);
        setField(term471792, term471792.getClass(), "toString", null);
        setField(term471792, term471792.getClass(), "toProperString", null);
        term471789 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term471789, term471789.getClass(), "numerator", -66545662);
        setIntField(term471789, term471789.getClass(), "denominator", 2110287543);
        setField(term471789, term471789.getClass(), "toString", null);
        setField(term471789, term471789.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term471584, args);
        assertTrue(recursiveEquals(term471584, term471792));
        assertTrue(recursiveEquals(retValue, term471789));
    }

};


