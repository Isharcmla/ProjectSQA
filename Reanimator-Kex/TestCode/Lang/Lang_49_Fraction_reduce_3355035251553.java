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

public class Fraction_reduce_3355035251553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term456282;
     Object term457144;
     Object term457141;

    public Fraction_reduce_3355035251553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term456282 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term456282, term456282.getClass(), "numerator", -1331615726);
        setIntField(term456282, term456282.getClass(), "denominator", 1181900879);
        term457144 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term457144, term457144.getClass(), "numerator", -1331615726);
        setIntField(term457144, term457144.getClass(), "denominator", 1181900879);
        setField(term457144, term457144.getClass(), "toString", null);
        setField(term457144, term457144.getClass(), "toProperString", null);
        term457141 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term457141, term457141.getClass(), "numerator", -1331615726);
        setIntField(term457141, term457141.getClass(), "denominator", 1181900879);
        setField(term457141, term457141.getClass(), "toString", null);
        setField(term457141, term457141.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term456282, args);
        assertTrue(recursiveEquals(term456282, term457144));
        assertTrue(recursiveEquals(retValue, term457141));
    }

};


