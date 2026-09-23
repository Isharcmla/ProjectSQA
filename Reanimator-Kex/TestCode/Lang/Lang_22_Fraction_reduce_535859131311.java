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

public class Fraction_reduce_535859131311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87548;
     Object term87761;
     Object term87758;

    public Fraction_reduce_535859131311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87548 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term87548, term87548.getClass(), "numerator", -1903819238);
        setIntField(term87548, term87548.getClass(), "denominator", 1740047371);
        term87761 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term87761, term87761.getClass(), "numerator", -1903819238);
        setIntField(term87761, term87761.getClass(), "denominator", 1740047371);
        setField(term87761, term87761.getClass(), "toString", null);
        setField(term87761, term87761.getClass(), "toProperString", null);
        term87758 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term87758, term87758.getClass(), "numerator", -1903819238);
        setIntField(term87758, term87758.getClass(), "denominator", 1740047371);
        setField(term87758, term87758.getClass(), "toString", null);
        setField(term87758, term87758.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term87548, args);
        assertTrue(recursiveEquals(term87548, term87761));
        assertTrue(recursiveEquals(retValue, term87758));
    }

};


