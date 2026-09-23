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

public class Fraction_reduce_535859131644 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201993;
     Object term202570;
     Object term202567;

    public Fraction_reduce_535859131644() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term201993 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term201993, term201993.getClass(), "numerator", -1073676286);
        setIntField(term201993, term201993.getClass(), "denominator", 2143191031);
        term202570 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term202570, term202570.getClass(), "numerator", -1073676286);
        setIntField(term202570, term202570.getClass(), "denominator", 2143191031);
        setField(term202570, term202570.getClass(), "toString", null);
        setField(term202570, term202570.getClass(), "toProperString", null);
        term202567 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term202567, term202567.getClass(), "numerator", -1073676286);
        setIntField(term202567, term202567.getClass(), "denominator", 2143191031);
        setField(term202567, term202567.getClass(), "toString", null);
        setField(term202567, term202567.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term201993, args);
        assertTrue(recursiveEquals(term201993, term202570));
        assertTrue(recursiveEquals(retValue, term202567));
    }

};


