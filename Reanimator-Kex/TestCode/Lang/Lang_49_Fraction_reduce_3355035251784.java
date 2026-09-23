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

public class Fraction_reduce_3355035251784 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term521913;
     Object term522365;
     Object term522362;

    public Fraction_reduce_3355035251784() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term521913 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term521913, term521913.getClass(), "numerator", -80881670);
        setIntField(term521913, term521913.getClass(), "denominator", 2121063403);
        term522365 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term522365, term522365.getClass(), "numerator", -80881670);
        setIntField(term522365, term522365.getClass(), "denominator", 2121063403);
        setField(term522365, term522365.getClass(), "toString", null);
        setField(term522365, term522365.getClass(), "toProperString", null);
        term522362 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term522362, term522362.getClass(), "numerator", -80881670);
        setIntField(term522362, term522362.getClass(), "denominator", 2121063403);
        setField(term522362, term522362.getClass(), "toString", null);
        setField(term522362, term522362.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term521913, args);
        assertTrue(recursiveEquals(term521913, term522365));
        assertTrue(recursiveEquals(retValue, term522362));
    }

};


