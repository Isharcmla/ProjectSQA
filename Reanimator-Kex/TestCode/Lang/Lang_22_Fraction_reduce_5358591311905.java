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

public class Fraction_reduce_5358591311905 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term621666;
     Object term622362;
     Object term622359;

    public Fraction_reduce_5358591311905() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term621666 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term621666, term621666.getClass(), "numerator", -487242);
        setIntField(term621666, term621666.getClass(), "denominator", 2122039565);
        term622362 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term622362, term622362.getClass(), "numerator", -487242);
        setIntField(term622362, term622362.getClass(), "denominator", 2122039565);
        setField(term622362, term622362.getClass(), "toString", null);
        setField(term622362, term622362.getClass(), "toProperString", null);
        term622359 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term622359, term622359.getClass(), "numerator", -487242);
        setIntField(term622359, term622359.getClass(), "denominator", 2122039565);
        setField(term622359, term622359.getClass(), "toString", null);
        setField(term622359, term622359.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term621666, args);
        assertTrue(recursiveEquals(term621666, term622362));
        assertTrue(recursiveEquals(retValue, term622359));
    }

};


