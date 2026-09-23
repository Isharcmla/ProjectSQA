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

public class Fraction_reduce_3355035252097 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term617521;
     Object term617716;
     Object term617713;

    public Fraction_reduce_3355035252097() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term617521 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term617521, term617521.getClass(), "numerator", 570519730);
        setIntField(term617521, term617521.getClass(), "denominator", 1890092801);
        term617716 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term617716, term617716.getClass(), "numerator", 570519730);
        setIntField(term617716, term617716.getClass(), "denominator", 1890092801);
        setField(term617716, term617716.getClass(), "toString", null);
        setField(term617716, term617716.getClass(), "toProperString", null);
        term617713 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term617713, term617713.getClass(), "numerator", 570519730);
        setIntField(term617713, term617713.getClass(), "denominator", 1890092801);
        setField(term617713, term617713.getClass(), "toString", null);
        setField(term617713, term617713.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term617521, args);
        assertTrue(recursiveEquals(term617521, term617716));
        assertTrue(recursiveEquals(retValue, term617713));
    }

};


