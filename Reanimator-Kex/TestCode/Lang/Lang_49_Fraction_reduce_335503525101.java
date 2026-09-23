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

public class Fraction_reduce_335503525101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16749;
     Object term16843;
     Object term16840;

    public Fraction_reduce_335503525101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16749 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term16749, term16749.getClass(), "numerator", 1576811562);
        setIntField(term16749, term16749.getClass(), "denominator", 289466257);
        term16843 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term16843, term16843.getClass(), "numerator", 1576811562);
        setIntField(term16843, term16843.getClass(), "denominator", 289466257);
        setField(term16843, term16843.getClass(), "toString", null);
        setField(term16843, term16843.getClass(), "toProperString", null);
        term16840 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term16840, term16840.getClass(), "numerator", 1576811562);
        setIntField(term16840, term16840.getClass(), "denominator", 289466257);
        setField(term16840, term16840.getClass(), "toString", null);
        setField(term16840, term16840.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term16749, args);
        assertTrue(recursiveEquals(term16749, term16843));
        assertTrue(recursiveEquals(retValue, term16840));
    }

};


