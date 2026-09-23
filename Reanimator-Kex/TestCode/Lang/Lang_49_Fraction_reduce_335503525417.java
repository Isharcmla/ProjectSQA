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

public class Fraction_reduce_335503525417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114179;
     Object term114354;
     Object term114351;

    public Fraction_reduce_335503525417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114179 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term114179, term114179.getClass(), "numerator", 635973426);
        setIntField(term114179, term114179.getClass(), "denominator", 386043521);
        term114354 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term114354, term114354.getClass(), "numerator", 635973426);
        setIntField(term114354, term114354.getClass(), "denominator", 386043521);
        setField(term114354, term114354.getClass(), "toString", null);
        setField(term114354, term114354.getClass(), "toProperString", null);
        term114351 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term114351, term114351.getClass(), "numerator", 635973426);
        setIntField(term114351, term114351.getClass(), "denominator", 386043521);
        setField(term114351, term114351.getClass(), "toString", null);
        setField(term114351, term114351.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term114179, args);
        assertTrue(recursiveEquals(term114179, term114354));
        assertTrue(recursiveEquals(retValue, term114351));
    }

};


