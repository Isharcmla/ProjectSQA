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

public class Fraction_reduce_5358591312008 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term653977;
     Object term654496;
     Object term654493;

    public Fraction_reduce_5358591312008() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term653977 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term653977, term653977.getClass(), "numerator", 1342537490);
        setIntField(term653977, term653977.getClass(), "denominator", 1194132769);
        term654496 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term654496, term654496.getClass(), "numerator", 1342537490);
        setIntField(term654496, term654496.getClass(), "denominator", 1194132769);
        setField(term654496, term654496.getClass(), "toString", null);
        setField(term654496, term654496.getClass(), "toProperString", null);
        term654493 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term654493, term654493.getClass(), "numerator", 1342537490);
        setIntField(term654493, term654493.getClass(), "denominator", 1194132769);
        setField(term654493, term654493.getClass(), "toString", null);
        setField(term654493, term654493.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term653977, args);
        assertTrue(recursiveEquals(term653977, term654496));
        assertTrue(recursiveEquals(retValue, term654493));
    }

};


