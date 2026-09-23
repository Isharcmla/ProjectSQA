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

public class Fraction_reduce_335503525761 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term212311;
     Object term212528;
     Object term212525;

    public Fraction_reduce_335503525761() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term212311 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term212311, term212311.getClass(), "numerator", -1476395054);
        setIntField(term212311, term212311.getClass(), "denominator", 1073741871);
        term212528 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term212528, term212528.getClass(), "numerator", -1476395054);
        setIntField(term212528, term212528.getClass(), "denominator", 1073741871);
        setField(term212528, term212528.getClass(), "toString", null);
        setField(term212528, term212528.getClass(), "toProperString", null);
        term212525 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term212525, term212525.getClass(), "numerator", -1476395054);
        setIntField(term212525, term212525.getClass(), "denominator", 1073741871);
        setField(term212525, term212525.getClass(), "toString", null);
        setField(term212525, term212525.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term212311, args);
        assertTrue(recursiveEquals(term212311, term212528));
        assertTrue(recursiveEquals(retValue, term212525));
    }

};


