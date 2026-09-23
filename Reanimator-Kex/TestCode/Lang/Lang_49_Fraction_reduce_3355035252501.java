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

public class Fraction_reduce_3355035252501 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term745305;
     Object term745490;
     Object term745487;

    public Fraction_reduce_3355035252501() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term745305 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term745305, term745305.getClass(), "numerator", 557842433);
        setIntField(term745305, term745305.getClass(), "denominator", 1073741824);
        term745490 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term745490, term745490.getClass(), "numerator", 557842433);
        setIntField(term745490, term745490.getClass(), "denominator", 1073741824);
        setField(term745490, term745490.getClass(), "toString", null);
        setField(term745490, term745490.getClass(), "toProperString", null);
        term745487 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term745487, term745487.getClass(), "numerator", 557842433);
        setIntField(term745487, term745487.getClass(), "denominator", 1073741824);
        setField(term745487, term745487.getClass(), "toString", null);
        setField(term745487, term745487.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term745305, args);
        assertTrue(recursiveEquals(term745305, term745490));
        assertTrue(recursiveEquals(retValue, term745487));
    }

};


