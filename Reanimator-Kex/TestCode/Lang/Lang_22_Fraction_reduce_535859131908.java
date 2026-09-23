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

public class Fraction_reduce_535859131908 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289484;
     Object term290396;
     Object term290393;

    public Fraction_reduce_535859131908() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289484 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term289484, term289484.getClass(), "numerator", -534447794);
        setIntField(term289484, term289484.getClass(), "denominator", 611400929);
        term290396 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term290396, term290396.getClass(), "numerator", -534447794);
        setIntField(term290396, term290396.getClass(), "denominator", 611400929);
        setField(term290396, term290396.getClass(), "toString", null);
        setField(term290396, term290396.getClass(), "toProperString", null);
        term290393 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term290393, term290393.getClass(), "numerator", -534447794);
        setIntField(term290393, term290393.getClass(), "denominator", 611400929);
        setField(term290393, term290393.getClass(), "toString", null);
        setField(term290393, term290393.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term289484, args);
        assertTrue(recursiveEquals(term289484, term290396));
        assertTrue(recursiveEquals(retValue, term290393));
    }

};


