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

public class Fraction_reduce_3355035251093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term316405;
     Object term316615;
     Object term316612;

    public Fraction_reduce_3355035251093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term316405 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term316405, term316405.getClass(), "numerator", 847917074);
        setIntField(term316405, term316405.getClass(), "denominator", 1813045105);
        term316615 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term316615, term316615.getClass(), "numerator", 847917074);
        setIntField(term316615, term316615.getClass(), "denominator", 1813045105);
        setField(term316615, term316615.getClass(), "toString", null);
        setField(term316615, term316615.getClass(), "toProperString", null);
        term316612 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term316612, term316612.getClass(), "numerator", 847917074);
        setIntField(term316612, term316612.getClass(), "denominator", 1813045105);
        setField(term316612, term316612.getClass(), "toString", null);
        setField(term316612, term316612.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term316405, args);
        assertTrue(recursiveEquals(term316405, term316615));
        assertTrue(recursiveEquals(retValue, term316612));
    }

};


