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

public class Fraction_reduce_5358591312594 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term849713;
     Object term850975;
     Object term850969;

    public Fraction_reduce_5358591312594() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term849713 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term849713, term849713.getClass(), "numerator", -2002252638);
        setIntField(term849713, term849713.getClass(), "denominator", 1644313095);
        term850975 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term850975, term850975.getClass(), "numerator", -2002252638);
        setIntField(term850975, term850975.getClass(), "denominator", 1644313095);
        setField(term850975, term850975.getClass(), "toString", null);
        setField(term850975, term850975.getClass(), "toProperString", null);
        term850969 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term850969, term850969.getClass(), "numerator", -667417546);
        setIntField(term850969, term850969.getClass(), "denominator", 548104365);
        setField(term850969, term850969.getClass(), "toString", null);
        setField(term850969, term850969.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term849713, args);
        assertTrue(recursiveEquals(term849713, term850975));
        assertTrue(recursiveEquals(retValue, term850969));
    }

};


