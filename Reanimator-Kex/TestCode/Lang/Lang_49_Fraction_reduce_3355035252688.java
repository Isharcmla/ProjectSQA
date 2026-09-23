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

public class Fraction_reduce_3355035252688 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term801979;
     Object term802809;
     Object term802806;

    public Fraction_reduce_3355035252688() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term801979 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term801979, term801979.getClass(), "numerator", -1660586378);
        setIntField(term801979, term801979.getClass(), "denominator", 1050794509);
        term802809 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term802809, term802809.getClass(), "numerator", -1660586378);
        setIntField(term802809, term802809.getClass(), "denominator", 1050794509);
        setField(term802809, term802809.getClass(), "toString", null);
        setField(term802809, term802809.getClass(), "toProperString", null);
        term802806 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term802806, term802806.getClass(), "numerator", -1660586378);
        setIntField(term802806, term802806.getClass(), "denominator", 1050794509);
        setField(term802806, term802806.getClass(), "toString", null);
        setField(term802806, term802806.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term801979, args);
        assertTrue(recursiveEquals(term801979, term802809));
        assertTrue(recursiveEquals(retValue, term802806));
    }

};


