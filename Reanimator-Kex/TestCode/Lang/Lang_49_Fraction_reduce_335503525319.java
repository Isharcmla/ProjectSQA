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

public class Fraction_reduce_335503525319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84077;
     Object term84179;
     Object term84173;

    public Fraction_reduce_335503525319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84077 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term84077, term84077.getClass(), "numerator", -776617090);
        setIntField(term84077, term84077.getClass(), "denominator", 1889428825);
        term84179 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term84179, term84179.getClass(), "numerator", -776617090);
        setIntField(term84179, term84179.getClass(), "denominator", 1889428825);
        setField(term84179, term84179.getClass(), "toString", null);
        setField(term84179, term84179.getClass(), "toProperString", null);
        term84173 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term84173, term84173.getClass(), "numerator", -155323418);
        setIntField(term84173, term84173.getClass(), "denominator", 377885765);
        setField(term84173, term84173.getClass(), "toString", null);
        setField(term84173, term84173.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term84077, args);
        assertTrue(recursiveEquals(term84077, term84179));
        assertTrue(recursiveEquals(retValue, term84173));
    }

};


