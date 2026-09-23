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

public class Fraction_reduce_5358591311230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term398457;
     Object term398840;
     Object term398837;

    public Fraction_reduce_5358591311230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term398457 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term398457, term398457.getClass(), "numerator", -64749502);
        setIntField(term398457, term398457.getClass(), "denominator", 2048364807);
        term398840 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term398840, term398840.getClass(), "numerator", -64749502);
        setIntField(term398840, term398840.getClass(), "denominator", 2048364807);
        setField(term398840, term398840.getClass(), "toString", null);
        setField(term398840, term398840.getClass(), "toProperString", null);
        term398837 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term398837, term398837.getClass(), "numerator", -64749502);
        setIntField(term398837, term398837.getClass(), "denominator", 2048364807);
        setField(term398837, term398837.getClass(), "toString", null);
        setField(term398837, term398837.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term398457, args);
        assertTrue(recursiveEquals(term398457, term398840));
        assertTrue(recursiveEquals(retValue, term398837));
    }

};


