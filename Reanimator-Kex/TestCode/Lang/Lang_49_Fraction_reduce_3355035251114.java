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

public class Fraction_reduce_3355035251114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term322860;
     Object term323172;
     Object term323169;

    public Fraction_reduce_3355035251114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term322860 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term322860, term322860.getClass(), "numerator", 576209162);
        setIntField(term322860, term322860.getClass(), "denominator", 1754781825);
        term323172 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term323172, term323172.getClass(), "numerator", 576209162);
        setIntField(term323172, term323172.getClass(), "denominator", 1754781825);
        setField(term323172, term323172.getClass(), "toString", null);
        setField(term323172, term323172.getClass(), "toProperString", null);
        term323169 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term323169, term323169.getClass(), "numerator", 576209162);
        setIntField(term323169, term323169.getClass(), "denominator", 1754781825);
        setField(term323169, term323169.getClass(), "toString", null);
        setField(term323169, term323169.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term322860, args);
        assertTrue(recursiveEquals(term322860, term323172));
        assertTrue(recursiveEquals(retValue, term323169));
    }

};


