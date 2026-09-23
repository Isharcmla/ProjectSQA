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

public class Fraction_reduce_3355035252805 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term838812;
     Object term839054;
     Object term839051;

    public Fraction_reduce_3355035252805() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term838812 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term838812, term838812.getClass(), "numerator", -2147483647);
        setIntField(term838812, term838812.getClass(), "denominator", 1073741824);
        term839054 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term839054, term839054.getClass(), "numerator", -2147483647);
        setIntField(term839054, term839054.getClass(), "denominator", 1073741824);
        setField(term839054, term839054.getClass(), "toString", null);
        setField(term839054, term839054.getClass(), "toProperString", null);
        term839051 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term839051, term839051.getClass(), "numerator", -2147483647);
        setIntField(term839051, term839051.getClass(), "denominator", 1073741824);
        setField(term839051, term839051.getClass(), "toString", null);
        setField(term839051, term839051.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term838812, args);
        assertTrue(recursiveEquals(term838812, term839054));
        assertTrue(recursiveEquals(retValue, term839051));
    }

};


