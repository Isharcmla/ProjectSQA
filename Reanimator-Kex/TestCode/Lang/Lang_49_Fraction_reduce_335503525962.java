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

public class Fraction_reduce_335503525962 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term276168;
     Object term276616;
     Object term276613;

    public Fraction_reduce_335503525962() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term276168 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term276168, term276168.getClass(), "numerator", 948680726);
        setIntField(term276168, term276168.getClass(), "denominator", 1644176067);
        term276616 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term276616, term276616.getClass(), "numerator", 948680726);
        setIntField(term276616, term276616.getClass(), "denominator", 1644176067);
        setField(term276616, term276616.getClass(), "toString", null);
        setField(term276616, term276616.getClass(), "toProperString", null);
        term276613 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term276613, term276613.getClass(), "numerator", 948680726);
        setIntField(term276613, term276613.getClass(), "denominator", 1644176067);
        setField(term276613, term276613.getClass(), "toString", null);
        setField(term276613, term276613.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term276168, args);
        assertTrue(recursiveEquals(term276168, term276616));
        assertTrue(recursiveEquals(retValue, term276613));
    }

};


