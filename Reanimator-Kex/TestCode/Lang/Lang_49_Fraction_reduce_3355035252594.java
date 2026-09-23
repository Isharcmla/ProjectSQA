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

public class Fraction_reduce_3355035252594 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term773533;
     Object term773970;
     Object term773967;

    public Fraction_reduce_3355035252594() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term773533 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term773533, term773533.getClass(), "numerator", -151983470);
        setIntField(term773533, term773533.getClass(), "denominator", 75729399);
        term773970 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term773970, term773970.getClass(), "numerator", -151983470);
        setIntField(term773970, term773970.getClass(), "denominator", 75729399);
        setField(term773970, term773970.getClass(), "toString", null);
        setField(term773970, term773970.getClass(), "toProperString", null);
        term773967 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term773967, term773967.getClass(), "numerator", -151983470);
        setIntField(term773967, term773967.getClass(), "denominator", 75729399);
        setField(term773967, term773967.getClass(), "toString", null);
        setField(term773967, term773967.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term773533, args);
        assertTrue(recursiveEquals(term773533, term773970));
        assertTrue(recursiveEquals(retValue, term773967));
    }

};


