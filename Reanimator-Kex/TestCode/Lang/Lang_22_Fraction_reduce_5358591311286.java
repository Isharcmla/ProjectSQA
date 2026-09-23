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

public class Fraction_reduce_5358591311286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term416668;
     Object term417523;
     Object term417520;

    public Fraction_reduce_5358591311286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term416668 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term416668, term416668.getClass(), "numerator", 493208114);
        setIntField(term416668, term416668.getClass(), "denominator", 1784770801);
        term417523 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term417523, term417523.getClass(), "numerator", 493208114);
        setIntField(term417523, term417523.getClass(), "denominator", 1784770801);
        setField(term417523, term417523.getClass(), "toString", null);
        setField(term417523, term417523.getClass(), "toProperString", null);
        term417520 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term417520, term417520.getClass(), "numerator", 493208114);
        setIntField(term417520, term417520.getClass(), "denominator", 1784770801);
        setField(term417520, term417520.getClass(), "toString", null);
        setField(term417520, term417520.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term416668, args);
        assertTrue(recursiveEquals(term416668, term417523));
        assertTrue(recursiveEquals(retValue, term417520));
    }

};


