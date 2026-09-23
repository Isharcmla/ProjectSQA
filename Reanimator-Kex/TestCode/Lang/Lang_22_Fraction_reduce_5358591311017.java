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

public class Fraction_reduce_5358591311017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term325920;
     Object term327215;
     Object term327212;

    public Fraction_reduce_5358591311017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term325920 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term325920, term325920.getClass(), "numerator", -1070300158);
        setIntField(term325920, term325920.getClass(), "denominator", 1679950487);
        term327215 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term327215, term327215.getClass(), "numerator", -1070300158);
        setIntField(term327215, term327215.getClass(), "denominator", 1679950487);
        setField(term327215, term327215.getClass(), "toString", null);
        setField(term327215, term327215.getClass(), "toProperString", null);
        term327212 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term327212, term327212.getClass(), "numerator", -1070300158);
        setIntField(term327212, term327212.getClass(), "denominator", 1679950487);
        setField(term327212, term327212.getClass(), "toString", null);
        setField(term327212, term327212.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term325920, args);
        assertTrue(recursiveEquals(term325920, term327215));
        assertTrue(recursiveEquals(retValue, term327212));
    }

};


