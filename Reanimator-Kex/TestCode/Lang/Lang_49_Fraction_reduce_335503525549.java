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

public class Fraction_reduce_335503525549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151256;
     Object term151744;
     Object term151741;

    public Fraction_reduce_335503525549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term151256 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term151256, term151256.getClass(), "numerator", -704502246);
        setIntField(term151256, term151256.getClass(), "denominator", 2071920139);
        term151744 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term151744, term151744.getClass(), "numerator", -704502246);
        setIntField(term151744, term151744.getClass(), "denominator", 2071920139);
        setField(term151744, term151744.getClass(), "toString", null);
        setField(term151744, term151744.getClass(), "toProperString", null);
        term151741 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term151741, term151741.getClass(), "numerator", -704502246);
        setIntField(term151741, term151741.getClass(), "denominator", 2071920139);
        setField(term151741, term151741.getClass(), "toString", null);
        setField(term151741, term151741.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term151256, args);
        assertTrue(recursiveEquals(term151256, term151744));
        assertTrue(recursiveEquals(retValue, term151741));
    }

};


