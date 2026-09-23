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

public class Fraction_reduce_5358591311697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term550363;
     Object term550869;
     Object term550863;

    public Fraction_reduce_5358591311697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term550363 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term550363, term550363.getClass(), "numerator", -638205550);
        setIntField(term550363, term550363.getClass(), "denominator", 1159300175);
        term550869 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term550869, term550869.getClass(), "numerator", -638205550);
        setIntField(term550869, term550869.getClass(), "denominator", 1159300175);
        setField(term550869, term550869.getClass(), "toString", null);
        setField(term550869, term550869.getClass(), "toProperString", null);
        term550863 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term550863, term550863.getClass(), "numerator", -25528222);
        setIntField(term550863, term550863.getClass(), "denominator", 46372007);
        setField(term550863, term550863.getClass(), "toString", null);
        setField(term550863, term550863.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term550363, args);
        assertTrue(recursiveEquals(term550363, term550869));
        assertTrue(recursiveEquals(retValue, term550863));
    }

};


