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

public class Fraction_reduce_3355035251409 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term411742;
     Object term411836;
     Object term411833;

    public Fraction_reduce_3355035251409() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term411742 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term411742, term411742.getClass(), "numerator", 378745082);
        setIntField(term411742, term411742.getClass(), "denominator", 186657285);
        term411836 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term411836, term411836.getClass(), "numerator", 378745082);
        setIntField(term411836, term411836.getClass(), "denominator", 186657285);
        setField(term411836, term411836.getClass(), "toString", null);
        setField(term411836, term411836.getClass(), "toProperString", null);
        term411833 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term411833, term411833.getClass(), "numerator", 378745082);
        setIntField(term411833, term411833.getClass(), "denominator", 186657285);
        setField(term411833, term411833.getClass(), "toString", null);
        setField(term411833, term411833.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term411742, args);
        assertTrue(recursiveEquals(term411742, term411836));
        assertTrue(recursiveEquals(retValue, term411833));
    }

};


