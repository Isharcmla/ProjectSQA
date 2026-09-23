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

public class Fraction_reduce_3355035251164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term338135;
     Object term339398;
     Object term339395;

    public Fraction_reduce_3355035251164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term338135 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term338135, term338135.getClass(), "numerator", 498876938);
        setIntField(term338135, term338135.getClass(), "denominator", 1951171373);
        term339398 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term339398, term339398.getClass(), "numerator", 498876938);
        setIntField(term339398, term339398.getClass(), "denominator", 1951171373);
        setField(term339398, term339398.getClass(), "toString", null);
        setField(term339398, term339398.getClass(), "toProperString", null);
        term339395 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term339395, term339395.getClass(), "numerator", 498876938);
        setIntField(term339395, term339395.getClass(), "denominator", 1951171373);
        setField(term339395, term339395.getClass(), "toString", null);
        setField(term339395, term339395.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term338135, args);
        assertTrue(recursiveEquals(term338135, term339398));
        assertTrue(recursiveEquals(retValue, term339395));
    }

};


