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

public class Fraction_reduce_335503525634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176286;
     Object term177088;
     Object term177085;

    public Fraction_reduce_335503525634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176286 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term176286, term176286.getClass(), "numerator", -1324070922);
        setIntField(term176286, term176286.getClass(), "denominator", 1404066941);
        term177088 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term177088, term177088.getClass(), "numerator", -1324070922);
        setIntField(term177088, term177088.getClass(), "denominator", 1404066941);
        setField(term177088, term177088.getClass(), "toString", null);
        setField(term177088, term177088.getClass(), "toProperString", null);
        term177085 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term177085, term177085.getClass(), "numerator", -1324070922);
        setIntField(term177085, term177085.getClass(), "denominator", 1404066941);
        setField(term177085, term177085.getClass(), "toString", null);
        setField(term177085, term177085.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term176286, args);
        assertTrue(recursiveEquals(term176286, term177088));
        assertTrue(recursiveEquals(retValue, term177085));
    }

};


