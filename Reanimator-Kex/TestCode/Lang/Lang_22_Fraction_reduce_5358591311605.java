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

public class Fraction_reduce_5358591311605 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term521887;
     Object term522388;
     Object term522385;

    public Fraction_reduce_5358591311605() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term521887 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term521887, term521887.getClass(), "numerator", -33553390);
        setIntField(term521887, term521887.getClass(), "denominator", 1658339503);
        term522388 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term522388, term522388.getClass(), "numerator", -33553390);
        setIntField(term522388, term522388.getClass(), "denominator", 1658339503);
        setField(term522388, term522388.getClass(), "toString", null);
        setField(term522388, term522388.getClass(), "toProperString", null);
        term522385 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term522385, term522385.getClass(), "numerator", -33553390);
        setIntField(term522385, term522385.getClass(), "denominator", 1658339503);
        setField(term522385, term522385.getClass(), "toString", null);
        setField(term522385, term522385.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term521887, args);
        assertTrue(recursiveEquals(term521887, term522388));
        assertTrue(recursiveEquals(retValue, term522385));
    }

};


