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

public class Fraction_reduce_5358591311187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term383609;
     Object term384497;
     Object term384494;

    public Fraction_reduce_5358591311187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term383609 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term383609, term383609.getClass(), "numerator", 536870850);
        setIntField(term383609, term383609.getClass(), "denominator", 1610612761);
        term384497 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term384497, term384497.getClass(), "numerator", 536870850);
        setIntField(term384497, term384497.getClass(), "denominator", 1610612761);
        setField(term384497, term384497.getClass(), "toString", null);
        setField(term384497, term384497.getClass(), "toProperString", null);
        term384494 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term384494, term384494.getClass(), "numerator", 536870850);
        setIntField(term384494, term384494.getClass(), "denominator", 1610612761);
        setField(term384494, term384494.getClass(), "toString", null);
        setField(term384494, term384494.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term383609, args);
        assertTrue(recursiveEquals(term383609, term384497));
        assertTrue(recursiveEquals(retValue, term384494));
    }

};


