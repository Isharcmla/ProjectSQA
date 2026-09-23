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

public class Fraction_reduce_3355035252838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term849308;
     Object term849795;
     Object term849792;

    public Fraction_reduce_3355035252838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term849308 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term849308, term849308.getClass(), "numerator", 1073823802);
        setIntField(term849308, term849308.getClass(), "denominator", 268434781);
        term849795 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term849795, term849795.getClass(), "numerator", 1073823802);
        setIntField(term849795, term849795.getClass(), "denominator", 268434781);
        setField(term849795, term849795.getClass(), "toString", null);
        setField(term849795, term849795.getClass(), "toProperString", null);
        term849792 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term849792, term849792.getClass(), "numerator", 1073823802);
        setIntField(term849792, term849792.getClass(), "denominator", 268434781);
        setField(term849792, term849792.getClass(), "toString", null);
        setField(term849792, term849792.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term849308, args);
        assertTrue(recursiveEquals(term849308, term849795));
        assertTrue(recursiveEquals(retValue, term849792));
    }

};


