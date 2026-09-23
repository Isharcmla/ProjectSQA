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

public class Fraction_subtract_265003123386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111057;
     Object term111139;
     Object term111659;
     Object term111660;
     Object term111656;

    public Fraction_subtract_265003123386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111057 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term111057, term111057.getClass(), "numerator", 128);
        setIntField(term111057, term111057.getClass(), "denominator", -66062536);
        term111139 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term111139, term111139.getClass(), "numerator", 32);
        setIntField(term111139, term111139.getClass(), "denominator", 48759932);
        term111659 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term111659, term111659.getClass(), "numerator", 128);
        setIntField(term111659, term111659.getClass(), "denominator", -66062536);
        setField(term111659, term111659.getClass(), "toString", null);
        setField(term111659, term111659.getClass(), "toProperString", null);
        term111660 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term111660, term111660.getClass(), "numerator", 32);
        setIntField(term111660, term111660.getClass(), "denominator", 48759932);
        setField(term111660, term111660.getClass(), "toString", null);
        setField(term111660, term111660.getClass(), "toProperString", null);
        term111656 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term111656, term111656.getClass(), "numerator", 522204528);
        setIntField(term111656, term111656.getClass(), "denominator", 1294305778);
        setField(term111656, term111656.getClass(), "toString", null);
        setField(term111656, term111656.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term111139;
        Object retValue = callMethod(klass, "subtract", argTypes, term111057, args);
        assertTrue(recursiveEquals(term111057, term111659));
        assertTrue(recursiveEquals(term111139, term111660));
        assertTrue(recursiveEquals(retValue, term111656));
    }

};


