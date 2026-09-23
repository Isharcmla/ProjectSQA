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

public class Fraction_multiplyBy_16360464551922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term564334;
     Object term564414;
     Object term565506;
     Object term565507;
     Object term565497;

    public Fraction_multiplyBy_16360464551922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term564334 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term564334, term564334.getClass(), "numerator", 536870902);
        setIntField(term564334, term564334.getClass(), "denominator", -536870912);
        term564414 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term564414, term564414.getClass(), "numerator", -536870912);
        setIntField(term564414, term564414.getClass(), "denominator", 1073741823);
        term565506 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term565506, term565506.getClass(), "numerator", 536870902);
        setIntField(term565506, term565506.getClass(), "denominator", -536870912);
        setField(term565506, term565506.getClass(), "toString", null);
        setField(term565506, term565506.getClass(), "toProperString", null);
        term565507 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term565507, term565507.getClass(), "numerator", -536870912);
        setIntField(term565507, term565507.getClass(), "denominator", 1073741823);
        setField(term565507, term565507.getClass(), "toString", null);
        setField(term565507, term565507.getClass(), "toProperString", null);
        term565497 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term565497, term565497.getClass(), "numerator", 536870902);
        setIntField(term565497, term565497.getClass(), "denominator", 1073741823);
        setField(term565497, term565497.getClass(), "toString", null);
        setField(term565497, term565497.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term564414;
        Object retValue = callMethod(klass, "multiplyBy", argTypes, term564334, args);
        assertTrue(recursiveEquals(term564334, term565506));
        assertTrue(recursiveEquals(term564414, term565507));
        assertTrue(recursiveEquals(retValue, term565497));
    }

};


