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

public class Fraction_reduce_5358591312120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term690798;
     Object term691222;
     Object term691219;

    public Fraction_reduce_5358591312120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term690798 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term690798, term690798.getClass(), "numerator", -1882980222);
        setIntField(term690798, term690798.getClass(), "denominator", 941523031);
        term691222 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term691222, term691222.getClass(), "numerator", -1882980222);
        setIntField(term691222, term691222.getClass(), "denominator", 941523031);
        setField(term691222, term691222.getClass(), "toString", null);
        setField(term691222, term691222.getClass(), "toProperString", null);
        term691219 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term691219, term691219.getClass(), "numerator", -1882980222);
        setIntField(term691219, term691219.getClass(), "denominator", 941523031);
        setField(term691219, term691219.getClass(), "toString", null);
        setField(term691219, term691219.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term690798, args);
        assertTrue(recursiveEquals(term690798, term691222));
        assertTrue(recursiveEquals(retValue, term691219));
    }

};


