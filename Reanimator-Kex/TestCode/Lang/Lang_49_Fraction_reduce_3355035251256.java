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

public class Fraction_reduce_3355035251256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term367948;
     Object term368380;
     Object term368377;

    public Fraction_reduce_3355035251256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term367948 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term367948, term367948.getClass(), "numerator", -159346354);
        setIntField(term367948, term367948.getClass(), "denominator", 1826621969);
        term368380 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term368380, term368380.getClass(), "numerator", -159346354);
        setIntField(term368380, term368380.getClass(), "denominator", 1826621969);
        setField(term368380, term368380.getClass(), "toString", null);
        setField(term368380, term368380.getClass(), "toProperString", null);
        term368377 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term368377, term368377.getClass(), "numerator", -159346354);
        setIntField(term368377, term368377.getClass(), "denominator", 1826621969);
        setField(term368377, term368377.getClass(), "toString", null);
        setField(term368377, term368377.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term367948, args);
        assertTrue(recursiveEquals(term367948, term368380));
        assertTrue(recursiveEquals(retValue, term368377));
    }

};


