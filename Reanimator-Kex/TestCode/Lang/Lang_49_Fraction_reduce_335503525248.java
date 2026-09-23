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

public class Fraction_reduce_335503525248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61828;
     Object term62104;
     Object term62101;

    public Fraction_reduce_335503525248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61828 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term61828, term61828.getClass(), "numerator", 14);
        setIntField(term61828, term61828.getClass(), "denominator", 1840994543);
        term62104 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term62104, term62104.getClass(), "numerator", 14);
        setIntField(term62104, term62104.getClass(), "denominator", 1840994543);
        setField(term62104, term62104.getClass(), "toString", null);
        setField(term62104, term62104.getClass(), "toProperString", null);
        term62101 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term62101, term62101.getClass(), "numerator", 14);
        setIntField(term62101, term62101.getClass(), "denominator", 1840994543);
        setField(term62101, term62101.getClass(), "toString", null);
        setField(term62101, term62101.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term61828, args);
        assertTrue(recursiveEquals(term61828, term62104));
        assertTrue(recursiveEquals(retValue, term62101));
    }

};


