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

public class Fraction_reduce_335503525639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177938;
     Object term178458;
     Object term178455;

    public Fraction_reduce_335503525639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177938 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term177938, term177938.getClass(), "numerator", 831504158);
        setIntField(term177938, term177938.getClass(), "denominator", 1218453623);
        term178458 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term178458, term178458.getClass(), "numerator", 831504158);
        setIntField(term178458, term178458.getClass(), "denominator", 1218453623);
        setField(term178458, term178458.getClass(), "toString", null);
        setField(term178458, term178458.getClass(), "toProperString", null);
        term178455 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term178455, term178455.getClass(), "numerator", 831504158);
        setIntField(term178455, term178455.getClass(), "denominator", 1218453623);
        setField(term178455, term178455.getClass(), "toString", null);
        setField(term178455, term178455.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term177938, args);
        assertTrue(recursiveEquals(term177938, term178458));
        assertTrue(recursiveEquals(retValue, term178455));
    }

};


