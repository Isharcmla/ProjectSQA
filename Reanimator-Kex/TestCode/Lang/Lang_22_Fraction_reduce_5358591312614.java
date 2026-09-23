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

public class Fraction_reduce_5358591312614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term856371;
     Object term856926;
     Object term856923;

    public Fraction_reduce_5358591312614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term856371 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term856371, term856371.getClass(), "numerator", -969134078);
        setIntField(term856371, term856371.getClass(), "denominator", 1075320087);
        term856926 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term856926, term856926.getClass(), "numerator", -969134078);
        setIntField(term856926, term856926.getClass(), "denominator", 1075320087);
        setField(term856926, term856926.getClass(), "toString", null);
        setField(term856926, term856926.getClass(), "toProperString", null);
        term856923 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term856923, term856923.getClass(), "numerator", -969134078);
        setIntField(term856923, term856923.getClass(), "denominator", 1075320087);
        setField(term856923, term856923.getClass(), "toString", null);
        setField(term856923, term856923.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term856371, args);
        assertTrue(recursiveEquals(term856371, term856926));
        assertTrue(recursiveEquals(retValue, term856923));
    }

};


