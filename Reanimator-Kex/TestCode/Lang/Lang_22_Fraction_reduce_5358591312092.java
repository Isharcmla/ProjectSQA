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

public class Fraction_reduce_5358591312092 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term681746;
     Object term682189;
     Object term682186;

    public Fraction_reduce_5358591312092() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term681746 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term681746, term681746.getClass(), "numerator", -2110709730);
        setIntField(term681746, term681746.getClass(), "denominator", 1060147817);
        term682189 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term682189, term682189.getClass(), "numerator", -2110709730);
        setIntField(term682189, term682189.getClass(), "denominator", 1060147817);
        setField(term682189, term682189.getClass(), "toString", null);
        setField(term682189, term682189.getClass(), "toProperString", null);
        term682186 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term682186, term682186.getClass(), "numerator", -2110709730);
        setIntField(term682186, term682186.getClass(), "denominator", 1060147817);
        setField(term682186, term682186.getClass(), "toString", null);
        setField(term682186, term682186.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term681746, args);
        assertTrue(recursiveEquals(term681746, term682189));
        assertTrue(recursiveEquals(retValue, term682186));
    }

};


