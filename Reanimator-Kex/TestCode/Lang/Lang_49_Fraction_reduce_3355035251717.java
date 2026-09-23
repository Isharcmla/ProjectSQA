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

public class Fraction_reduce_3355035251717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term503685;
     Object term503892;
     Object term503889;

    public Fraction_reduce_3355035251717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term503685 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term503685, term503685.getClass(), "numerator", -1176436186);
        setIntField(term503685, term503685.getClass(), "denominator", 1326190021);
        term503892 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term503892, term503892.getClass(), "numerator", -1176436186);
        setIntField(term503892, term503892.getClass(), "denominator", 1326190021);
        setField(term503892, term503892.getClass(), "toString", null);
        setField(term503892, term503892.getClass(), "toProperString", null);
        term503889 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term503889, term503889.getClass(), "numerator", -1176436186);
        setIntField(term503889, term503889.getClass(), "denominator", 1326190021);
        setField(term503889, term503889.getClass(), "toString", null);
        setField(term503889, term503889.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term503685, args);
        assertTrue(recursiveEquals(term503685, term503892));
        assertTrue(recursiveEquals(retValue, term503889));
    }

};


