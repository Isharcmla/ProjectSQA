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

public class Fraction_reduce_3355035251787 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term522726;
     Object term522922;
     Object term522919;

    public Fraction_reduce_3355035251787() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term522726 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term522726, term522726.getClass(), "numerator", 17868802);
        setIntField(term522726, term522726.getClass(), "denominator", 92795705);
        term522922 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term522922, term522922.getClass(), "numerator", 17868802);
        setIntField(term522922, term522922.getClass(), "denominator", 92795705);
        setField(term522922, term522922.getClass(), "toString", null);
        setField(term522922, term522922.getClass(), "toProperString", null);
        term522919 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term522919, term522919.getClass(), "numerator", 17868802);
        setIntField(term522919, term522919.getClass(), "denominator", 92795705);
        setField(term522919, term522919.getClass(), "toString", null);
        setField(term522919, term522919.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term522726, args);
        assertTrue(recursiveEquals(term522726, term522922));
        assertTrue(recursiveEquals(retValue, term522919));
    }

};


