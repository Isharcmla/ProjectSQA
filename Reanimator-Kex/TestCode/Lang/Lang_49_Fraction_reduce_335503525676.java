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

public class Fraction_reduce_335503525676 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187305;
     Object term187624;
     Object term187621;

    public Fraction_reduce_335503525676() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term187305 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term187305, term187305.getClass(), "numerator", -1744834582);
        setIntField(term187305, term187305.getClass(), "denominator", 1409271779);
        term187624 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term187624, term187624.getClass(), "numerator", -1744834582);
        setIntField(term187624, term187624.getClass(), "denominator", 1409271779);
        setField(term187624, term187624.getClass(), "toString", null);
        setField(term187624, term187624.getClass(), "toProperString", null);
        term187621 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term187621, term187621.getClass(), "numerator", -1744834582);
        setIntField(term187621, term187621.getClass(), "denominator", 1409271779);
        setField(term187621, term187621.getClass(), "toString", null);
        setField(term187621, term187621.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term187305, args);
        assertTrue(recursiveEquals(term187305, term187624));
        assertTrue(recursiveEquals(retValue, term187621));
    }

};


