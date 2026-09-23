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

public class Fraction_reduce_3355035252854 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term854412;
     Object term855305;
     Object term855302;

    public Fraction_reduce_3355035252854() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term854412 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term854412, term854412.getClass(), "numerator", 14);
        setIntField(term854412, term854412.getClass(), "denominator", 1241762527);
        term855305 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term855305, term855305.getClass(), "numerator", 14);
        setIntField(term855305, term855305.getClass(), "denominator", 1241762527);
        setField(term855305, term855305.getClass(), "toString", null);
        setField(term855305, term855305.getClass(), "toProperString", null);
        term855302 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term855302, term855302.getClass(), "numerator", 14);
        setIntField(term855302, term855302.getClass(), "denominator", 1241762527);
        setField(term855302, term855302.getClass(), "toString", null);
        setField(term855302, term855302.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term854412, args);
        assertTrue(recursiveEquals(term854412, term855305));
        assertTrue(recursiveEquals(retValue, term855302));
    }

};


