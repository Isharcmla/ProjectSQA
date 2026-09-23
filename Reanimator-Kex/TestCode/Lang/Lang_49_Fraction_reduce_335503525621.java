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

public class Fraction_reduce_335503525621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173370;
     Object term173473;
     Object term173467;

    public Fraction_reduce_335503525621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173370 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term173370, term173370.getClass(), "numerator", -426278358);
        setIntField(term173370, term173370.getClass(), "denominator", 513739827);
        term173473 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term173473, term173473.getClass(), "numerator", -426278358);
        setIntField(term173473, term173473.getClass(), "denominator", 513739827);
        setField(term173473, term173473.getClass(), "toString", null);
        setField(term173473, term173473.getClass(), "toProperString", null);
        term173467 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term173467, term173467.getClass(), "numerator", -47364262);
        setIntField(term173467, term173467.getClass(), "denominator", 57082203);
        setField(term173467, term173467.getClass(), "toString", null);
        setField(term173467, term173467.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term173370, args);
        assertTrue(recursiveEquals(term173370, term173473));
        assertTrue(recursiveEquals(retValue, term173467));
    }

};


