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

public class Fraction_reduce_5358591311456 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term473461;
     Object term473940;
     Object term473937;

    public Fraction_reduce_5358591311456() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term473461 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term473461, term473461.getClass(), "numerator", -1656412926);
        setIntField(term473461, term473461.getClass(), "denominator", 2092977751);
        term473940 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term473940, term473940.getClass(), "numerator", -1656412926);
        setIntField(term473940, term473940.getClass(), "denominator", 2092977751);
        setField(term473940, term473940.getClass(), "toString", null);
        setField(term473940, term473940.getClass(), "toProperString", null);
        term473937 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term473937, term473937.getClass(), "numerator", -1656412926);
        setIntField(term473937, term473937.getClass(), "denominator", 2092977751);
        setField(term473937, term473937.getClass(), "toString", null);
        setField(term473937, term473937.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term473461, args);
        assertTrue(recursiveEquals(term473461, term473940));
        assertTrue(recursiveEquals(retValue, term473937));
    }

};


