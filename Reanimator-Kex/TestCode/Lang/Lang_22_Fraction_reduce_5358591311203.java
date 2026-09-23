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

public class Fraction_reduce_5358591311203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term390270;
     Object term390373;
     Object term390370;

    public Fraction_reduce_5358591311203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term390270 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term390270, term390270.getClass(), "numerator", 671285282);
        setIntField(term390270, term390270.getClass(), "denominator", 402794745);
        term390373 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term390373, term390373.getClass(), "numerator", 671285282);
        setIntField(term390373, term390373.getClass(), "denominator", 402794745);
        setField(term390373, term390373.getClass(), "toString", null);
        setField(term390373, term390373.getClass(), "toProperString", null);
        term390370 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term390370, term390370.getClass(), "numerator", 671285282);
        setIntField(term390370, term390370.getClass(), "denominator", 402794745);
        setField(term390370, term390370.getClass(), "toString", null);
        setField(term390370, term390370.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term390270, args);
        assertTrue(recursiveEquals(term390270, term390373));
        assertTrue(recursiveEquals(retValue, term390370));
    }

};


