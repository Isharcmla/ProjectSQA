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

public class Fraction_reduce_5358591312330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term761440;
     Object term762289;
     Object term762286;

    public Fraction_reduce_5358591312330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term761440 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term761440, term761440.getClass(), "numerator", -215023566);
        setIntField(term761440, term761440.getClass(), "denominator", 538210319);
        term762289 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term762289, term762289.getClass(), "numerator", -215023566);
        setIntField(term762289, term762289.getClass(), "denominator", 538210319);
        setField(term762289, term762289.getClass(), "toString", null);
        setField(term762289, term762289.getClass(), "toProperString", null);
        term762286 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term762286, term762286.getClass(), "numerator", -215023566);
        setIntField(term762286, term762286.getClass(), "denominator", 538210319);
        setField(term762286, term762286.getClass(), "toString", null);
        setField(term762286, term762286.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term761440, args);
        assertTrue(recursiveEquals(term761440, term762289));
        assertTrue(recursiveEquals(retValue, term762286));
    }

};


