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

public class Fraction_reduce_3355035252835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term848837;
     Object term848941;
     Object term848938;

    public Fraction_reduce_3355035252835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term848837 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term848837, term848837.getClass(), "numerator", -1241360898);
        setIntField(term848837, term848837.getClass(), "denominator", 772495529);
        term848941 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term848941, term848941.getClass(), "numerator", -1241360898);
        setIntField(term848941, term848941.getClass(), "denominator", 772495529);
        setField(term848941, term848941.getClass(), "toString", null);
        setField(term848941, term848941.getClass(), "toProperString", null);
        term848938 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term848938, term848938.getClass(), "numerator", -1241360898);
        setIntField(term848938, term848938.getClass(), "denominator", 772495529);
        setField(term848938, term848938.getClass(), "toString", null);
        setField(term848938, term848938.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term848837, args);
        assertTrue(recursiveEquals(term848837, term848941));
        assertTrue(recursiveEquals(retValue, term848938));
    }

};


