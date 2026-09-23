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

public class Fraction_reduce_335503525359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95232;
     Object term95436;
     Object term95433;

    public Fraction_reduce_335503525359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95232 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term95232, term95232.getClass(), "numerator", -997898574);
        setIntField(term95232, term95232.getClass(), "denominator", 650572543);
        term95436 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term95436, term95436.getClass(), "numerator", -997898574);
        setIntField(term95436, term95436.getClass(), "denominator", 650572543);
        setField(term95436, term95436.getClass(), "toString", null);
        setField(term95436, term95436.getClass(), "toProperString", null);
        term95433 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term95433, term95433.getClass(), "numerator", -997898574);
        setIntField(term95433, term95433.getClass(), "denominator", 650572543);
        setField(term95433, term95433.getClass(), "toString", null);
        setField(term95433, term95433.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term95232, args);
        assertTrue(recursiveEquals(term95232, term95436));
        assertTrue(recursiveEquals(retValue, term95433));
    }

};


