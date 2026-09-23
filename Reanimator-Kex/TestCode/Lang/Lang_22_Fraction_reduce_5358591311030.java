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

public class Fraction_reduce_5358591311030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term330826;
     Object term331722;
     Object term331719;

    public Fraction_reduce_5358591311030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term330826 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term330826, term330826.getClass(), "numerator", -1300380542);
        setIntField(term330826, term330826.getClass(), "denominator", 2036920391);
        term331722 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term331722, term331722.getClass(), "numerator", -1300380542);
        setIntField(term331722, term331722.getClass(), "denominator", 2036920391);
        setField(term331722, term331722.getClass(), "toString", null);
        setField(term331722, term331722.getClass(), "toProperString", null);
        term331719 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term331719, term331719.getClass(), "numerator", -1300380542);
        setIntField(term331719, term331719.getClass(), "denominator", 2036920391);
        setField(term331719, term331719.getClass(), "toString", null);
        setField(term331719, term331719.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term330826, args);
        assertTrue(recursiveEquals(term330826, term331722));
        assertTrue(recursiveEquals(retValue, term331719));
    }

};


