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

public class Fraction_reduce_5358591312467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term808244;
     Object term808762;
     Object term808756;

    public Fraction_reduce_5358591312467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term808244 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term808244, term808244.getClass(), "numerator", -1475847402);
        setIntField(term808244, term808244.getClass(), "denominator", 1823216061);
        term808762 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term808762, term808762.getClass(), "numerator", -1475847402);
        setIntField(term808762, term808762.getClass(), "denominator", 1823216061);
        setField(term808762, term808762.getClass(), "toString", null);
        setField(term808762, term808762.getClass(), "toProperString", null);
        term808756 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term808756, term808756.getClass(), "numerator", -491949134);
        setIntField(term808756, term808756.getClass(), "denominator", 607738687);
        setField(term808756, term808756.getClass(), "toString", null);
        setField(term808756, term808756.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term808244, args);
        assertTrue(recursiveEquals(term808244, term808762));
        assertTrue(recursiveEquals(retValue, term808756));
    }

};


