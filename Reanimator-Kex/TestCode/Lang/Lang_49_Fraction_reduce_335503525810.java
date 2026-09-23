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

public class Fraction_reduce_335503525810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227568;
     Object term228339;
     Object term228336;

    public Fraction_reduce_335503525810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term227568 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term227568, term227568.getClass(), "numerator", -814126274);
        setIntField(term227568, term227568.getClass(), "denominator", 1076625977);
        term228339 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term228339, term228339.getClass(), "numerator", -814126274);
        setIntField(term228339, term228339.getClass(), "denominator", 1076625977);
        setField(term228339, term228339.getClass(), "toString", null);
        setField(term228339, term228339.getClass(), "toProperString", null);
        term228336 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term228336, term228336.getClass(), "numerator", -814126274);
        setIntField(term228336, term228336.getClass(), "denominator", 1076625977);
        setField(term228336, term228336.getClass(), "toString", null);
        setField(term228336, term228336.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term227568, args);
        assertTrue(recursiveEquals(term227568, term228339));
        assertTrue(recursiveEquals(retValue, term228336));
    }

};


