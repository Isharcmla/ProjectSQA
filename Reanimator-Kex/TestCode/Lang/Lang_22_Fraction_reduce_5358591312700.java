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

public class Fraction_reduce_5358591312700 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term884467;
     Object term885269;
     Object term885263;

    public Fraction_reduce_5358591312700() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term884467 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term884467, term884467.getClass(), "numerator", -2147483646);
        setIntField(term884467, term884467.getClass(), "denominator", 2147483639);
        term885269 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term885269, term885269.getClass(), "numerator", -2147483646);
        setIntField(term885269, term885269.getClass(), "denominator", 2147483639);
        setField(term885269, term885269.getClass(), "toString", null);
        setField(term885269, term885269.getClass(), "toProperString", null);
        term885263 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term885263, term885263.getClass(), "numerator", -306783378);
        setIntField(term885263, term885263.getClass(), "denominator", 306783377);
        setField(term885263, term885263.getClass(), "toString", null);
        setField(term885263, term885263.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term884467, args);
        assertTrue(recursiveEquals(term884467, term885269));
        assertTrue(recursiveEquals(retValue, term885263));
    }

};


