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

public class Fraction_reduce_33550352576 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8383;
     Object term8798;
     Object term8795;

    public Fraction_reduce_33550352576() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8383 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term8383, term8383.getClass(), "numerator", 24982);
        setIntField(term8383, term8383.getClass(), "denominator", 8003);
        term8798 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term8798, term8798.getClass(), "numerator", 24982);
        setIntField(term8798, term8798.getClass(), "denominator", 8003);
        setField(term8798, term8798.getClass(), "toString", null);
        setField(term8798, term8798.getClass(), "toProperString", null);
        term8795 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term8795, term8795.getClass(), "numerator", 24982);
        setIntField(term8795, term8795.getClass(), "denominator", 8003);
        setField(term8795, term8795.getClass(), "toString", null);
        setField(term8795, term8795.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term8383, args);
        assertTrue(recursiveEquals(term8383, term8798));
        assertTrue(recursiveEquals(retValue, term8795));
    }

};


