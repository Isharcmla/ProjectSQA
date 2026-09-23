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

public class Fraction_reduce_335503525321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84394;
     Object term84496;
     Object term84493;

    public Fraction_reduce_335503525321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84394 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term84394, term84394.getClass(), "numerator", -1698914430);
        setIntField(term84394, term84394.getClass(), "denominator", 849194879);
        term84496 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term84496, term84496.getClass(), "numerator", -1698914430);
        setIntField(term84496, term84496.getClass(), "denominator", 849194879);
        setField(term84496, term84496.getClass(), "toString", null);
        setField(term84496, term84496.getClass(), "toProperString", null);
        term84493 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term84493, term84493.getClass(), "numerator", -1698914430);
        setIntField(term84493, term84493.getClass(), "denominator", 849194879);
        setField(term84493, term84493.getClass(), "toString", null);
        setField(term84493, term84493.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term84394, args);
        assertTrue(recursiveEquals(term84394, term84496));
        assertTrue(recursiveEquals(retValue, term84493));
    }

};


