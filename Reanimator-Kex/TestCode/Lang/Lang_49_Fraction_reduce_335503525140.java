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

public class Fraction_reduce_335503525140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28898;
     Object term29715;
     Object term29712;

    public Fraction_reduce_335503525140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28898 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term28898, term28898.getClass(), "numerator", 39888070);
        setIntField(term28898, term28898.getClass(), "denominator", 10559899);
        term29715 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term29715, term29715.getClass(), "numerator", 39888070);
        setIntField(term29715, term29715.getClass(), "denominator", 10559899);
        setField(term29715, term29715.getClass(), "toString", null);
        setField(term29715, term29715.getClass(), "toProperString", null);
        term29712 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term29712, term29712.getClass(), "numerator", 39888070);
        setIntField(term29712, term29712.getClass(), "denominator", 10559899);
        setField(term29712, term29712.getClass(), "toString", null);
        setField(term29712, term29712.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term28898, args);
        assertTrue(recursiveEquals(term28898, term29715));
        assertTrue(recursiveEquals(retValue, term29712));
    }

};


