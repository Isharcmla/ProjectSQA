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

public class Fraction_reduce_3355035251443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term422073;
     Object term422547;
     Object term422544;

    public Fraction_reduce_3355035251443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term422073 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term422073, term422073.getClass(), "numerator", -906264326);
        setIntField(term422073, term422073.getClass(), "denominator", 1075144859);
        term422547 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term422547, term422547.getClass(), "numerator", -906264326);
        setIntField(term422547, term422547.getClass(), "denominator", 1075144859);
        setField(term422547, term422547.getClass(), "toString", null);
        setField(term422547, term422547.getClass(), "toProperString", null);
        term422544 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term422544, term422544.getClass(), "numerator", -906264326);
        setIntField(term422544, term422544.getClass(), "denominator", 1075144859);
        setField(term422544, term422544.getClass(), "toString", null);
        setField(term422544, term422544.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term422073, args);
        assertTrue(recursiveEquals(term422073, term422547));
        assertTrue(recursiveEquals(retValue, term422544));
    }

};


