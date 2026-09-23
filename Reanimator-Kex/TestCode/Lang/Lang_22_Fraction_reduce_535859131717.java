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

public class Fraction_reduce_535859131717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term226696;
     Object term227357;
     Object term227354;

    public Fraction_reduce_535859131717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term226696 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term226696, term226696.getClass(), "numerator", -1052704626);
        setIntField(term226696, term226696.getClass(), "denominator", 2028699713);
        term227357 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term227357, term227357.getClass(), "numerator", -1052704626);
        setIntField(term227357, term227357.getClass(), "denominator", 2028699713);
        setField(term227357, term227357.getClass(), "toString", null);
        setField(term227357, term227357.getClass(), "toProperString", null);
        term227354 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term227354, term227354.getClass(), "numerator", -1052704626);
        setIntField(term227354, term227354.getClass(), "denominator", 2028699713);
        setField(term227354, term227354.getClass(), "toString", null);
        setField(term227354, term227354.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term226696, args);
        assertTrue(recursiveEquals(term226696, term227357));
        assertTrue(recursiveEquals(retValue, term227354));
    }

};


