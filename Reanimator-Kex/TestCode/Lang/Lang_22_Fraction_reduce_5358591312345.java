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

public class Fraction_reduce_5358591312345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term765878;
     Object term766702;
     Object term766699;

    public Fraction_reduce_5358591312345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term765878 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term765878, term765878.getClass(), "numerator", 2099151170);
        setIntField(term765878, term765878.getClass(), "denominator", 1092051977);
        term766702 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term766702, term766702.getClass(), "numerator", 2099151170);
        setIntField(term766702, term766702.getClass(), "denominator", 1092051977);
        setField(term766702, term766702.getClass(), "toString", null);
        setField(term766702, term766702.getClass(), "toProperString", null);
        term766699 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term766699, term766699.getClass(), "numerator", 2099151170);
        setIntField(term766699, term766699.getClass(), "denominator", 1092051977);
        setField(term766699, term766699.getClass(), "toString", null);
        setField(term766699, term766699.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term765878, args);
        assertTrue(recursiveEquals(term765878, term766702));
        assertTrue(recursiveEquals(retValue, term766699));
    }

};


