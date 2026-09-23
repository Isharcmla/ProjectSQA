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

public class Fraction_reduce_3355035251274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term372880;
     Object term373354;
     Object term373351;

    public Fraction_reduce_3355035251274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term372880 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term372880, term372880.getClass(), "numerator", -100337534);
        setIntField(term372880, term372880.getClass(), "denominator", 1194048071);
        term373354 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term373354, term373354.getClass(), "numerator", -100337534);
        setIntField(term373354, term373354.getClass(), "denominator", 1194048071);
        setField(term373354, term373354.getClass(), "toString", null);
        setField(term373354, term373354.getClass(), "toProperString", null);
        term373351 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term373351, term373351.getClass(), "numerator", -100337534);
        setIntField(term373351, term373351.getClass(), "denominator", 1194048071);
        setField(term373351, term373351.getClass(), "toString", null);
        setField(term373351, term373351.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term372880, args);
        assertTrue(recursiveEquals(term372880, term373354));
        assertTrue(recursiveEquals(retValue, term373351));
    }

};


