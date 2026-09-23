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

public class Fraction_reduce_3355035251892 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term555500;
     Object term556026;
     Object term556020;

    public Fraction_reduce_3355035251892() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term555500 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term555500, term555500.getClass(), "numerator", -512211438);
        setIntField(term555500, term555500.getClass(), "denominator", 329823807);
        term556026 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term556026, term556026.getClass(), "numerator", -512211438);
        setIntField(term556026, term556026.getClass(), "denominator", 329823807);
        setField(term556026, term556026.getClass(), "toString", null);
        setField(term556026, term556026.getClass(), "toProperString", null);
        term556020 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term556020, term556020.getClass(), "numerator", -170737146);
        setIntField(term556020, term556020.getClass(), "denominator", 109941269);
        setField(term556020, term556020.getClass(), "toString", null);
        setField(term556020, term556020.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term555500, args);
        assertTrue(recursiveEquals(term555500, term556026));
        assertTrue(recursiveEquals(retValue, term556020));
    }

};


