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

public class Fraction_reduce_3355035251140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term330025;
     Object term330416;
     Object term330413;

    public Fraction_reduce_3355035251140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term330025 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term330025, term330025.getClass(), "numerator", 1096568366);
        setIntField(term330025, term330025.getClass(), "denominator", 1510883791);
        term330416 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term330416, term330416.getClass(), "numerator", 1096568366);
        setIntField(term330416, term330416.getClass(), "denominator", 1510883791);
        setField(term330416, term330416.getClass(), "toString", null);
        setField(term330416, term330416.getClass(), "toProperString", null);
        term330413 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term330413, term330413.getClass(), "numerator", 1096568366);
        setIntField(term330413, term330413.getClass(), "denominator", 1510883791);
        setField(term330413, term330413.getClass(), "toString", null);
        setField(term330413, term330413.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term330025, args);
        assertTrue(recursiveEquals(term330025, term330416));
        assertTrue(recursiveEquals(retValue, term330413));
    }

};


