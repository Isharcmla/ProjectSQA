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

public class Fraction_reduce_335503525673 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186894;
     Object term187092;
     Object term187089;

    public Fraction_reduce_335503525673() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term186894 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term186894, term186894.getClass(), "numerator", 1107378222);
        setIntField(term186894, term186894.getClass(), "denominator", 1727919103);
        term187092 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term187092, term187092.getClass(), "numerator", 1107378222);
        setIntField(term187092, term187092.getClass(), "denominator", 1727919103);
        setField(term187092, term187092.getClass(), "toString", null);
        setField(term187092, term187092.getClass(), "toProperString", null);
        term187089 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term187089, term187089.getClass(), "numerator", 1107378222);
        setIntField(term187089, term187089.getClass(), "denominator", 1727919103);
        setField(term187089, term187089.getClass(), "toString", null);
        setField(term187089, term187089.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term186894, args);
        assertTrue(recursiveEquals(term186894, term187092));
        assertTrue(recursiveEquals(retValue, term187089));
    }

};


