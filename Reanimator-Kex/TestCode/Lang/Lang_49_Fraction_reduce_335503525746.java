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

public class Fraction_reduce_335503525746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207728;
     Object term208248;
     Object term208245;

    public Fraction_reduce_335503525746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term207728 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term207728, term207728.getClass(), "numerator", 1287609442);
        setIntField(term207728, term207728.getClass(), "denominator", 819998265);
        term208248 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term208248, term208248.getClass(), "numerator", 1287609442);
        setIntField(term208248, term208248.getClass(), "denominator", 819998265);
        setField(term208248, term208248.getClass(), "toString", null);
        setField(term208248, term208248.getClass(), "toProperString", null);
        term208245 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term208245, term208245.getClass(), "numerator", 1287609442);
        setIntField(term208245, term208245.getClass(), "denominator", 819998265);
        setField(term208245, term208245.getClass(), "toString", null);
        setField(term208245, term208245.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term207728, args);
        assertTrue(recursiveEquals(term207728, term208248));
        assertTrue(recursiveEquals(retValue, term208245));
    }

};


