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

public class Fraction_reduce_3355035251345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term393697;
     Object term393909;
     Object term393906;

    public Fraction_reduce_3355035251345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term393697 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term393697, term393697.getClass(), "numerator", 1997472098);
        setIntField(term393697, term393697.getClass(), "denominator", 1273724745);
        term393909 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term393909, term393909.getClass(), "numerator", 1997472098);
        setIntField(term393909, term393909.getClass(), "denominator", 1273724745);
        setField(term393909, term393909.getClass(), "toString", null);
        setField(term393909, term393909.getClass(), "toProperString", null);
        term393906 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term393906, term393906.getClass(), "numerator", 1997472098);
        setIntField(term393906, term393906.getClass(), "denominator", 1273724745);
        setField(term393906, term393906.getClass(), "toString", null);
        setField(term393906, term393906.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term393697, args);
        assertTrue(recursiveEquals(term393697, term393909));
        assertTrue(recursiveEquals(retValue, term393906));
    }

};


