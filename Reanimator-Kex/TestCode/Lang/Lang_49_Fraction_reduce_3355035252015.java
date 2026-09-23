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

public class Fraction_reduce_3355035252015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term591239;
     Object term591471;
     Object term591465;

    public Fraction_reduce_3355035252015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term591239 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term591239, term591239.getClass(), "numerator", -696252342);
        setIntField(term591239, term591239.getClass(), "denominator", 1073741824);
        term591471 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term591471, term591471.getClass(), "numerator", -696252342);
        setIntField(term591471, term591471.getClass(), "denominator", 1073741824);
        setField(term591471, term591471.getClass(), "toString", null);
        setField(term591471, term591471.getClass(), "toProperString", null);
        term591465 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term591465, term591465.getClass(), "numerator", -348126171);
        setIntField(term591465, term591465.getClass(), "denominator", 536870912);
        setField(term591465, term591465.getClass(), "toString", null);
        setField(term591465, term591465.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term591239, args);
        assertTrue(recursiveEquals(term591239, term591471));
        assertTrue(recursiveEquals(retValue, term591465));
    }

};


