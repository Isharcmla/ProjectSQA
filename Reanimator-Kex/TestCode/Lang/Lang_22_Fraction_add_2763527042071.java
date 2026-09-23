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

public class Fraction_add_2763527042071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term674794;
     Object term674876;
     Object term675493;
     Object term675494;
     Object term675490;

    public Fraction_add_2763527042071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term674794 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term674794, term674794.getClass(), "numerator", 4194304);
        setIntField(term674794, term674794.getClass(), "denominator", 1811939220);
        term674876 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term674876, term674876.getClass(), "numerator", 128);
        setIntField(term674876, term674876.getClass(), "denominator", -54);
        term675493 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term675493, term675493.getClass(), "numerator", 4194304);
        setIntField(term675493, term675493.getClass(), "denominator", 1811939220);
        setField(term675493, term675493.getClass(), "toString", null);
        setField(term675493, term675493.getClass(), "toProperString", null);
        term675494 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term675494, term675494.getClass(), "numerator", 128);
        setIntField(term675494, term675494.getClass(), "denominator", -54);
        setField(term675494, term675494.getClass(), "toString", null);
        setField(term675494, term675494.getClass(), "toProperString", null);
        term675490 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term675490, term675490.getClass(), "numerator", 2145386368);
        setIntField(term675490, term675490.getClass(), "denominator", -905969610);
        setField(term675490, term675490.getClass(), "toString", null);
        setField(term675490, term675490.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term674876;
        Object retValue = callMethod(klass, "add", argTypes, term674794, args);
        assertTrue(recursiveEquals(term674794, term675493));
        assertTrue(recursiveEquals(term674876, term675494));
        assertTrue(recursiveEquals(retValue, term675490));
    }

};


