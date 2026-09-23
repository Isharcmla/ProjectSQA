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

public class Fraction_reduce_3355035251865 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term546791;
     Object term547374;
     Object term547371;

    public Fraction_reduce_3355035251865() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term546791 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term546791, term546791.getClass(), "numerator", -2040526702);
        setIntField(term546791, term546791.getClass(), "denominator", 1174406495);
        term547374 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term547374, term547374.getClass(), "numerator", -2040526702);
        setIntField(term547374, term547374.getClass(), "denominator", 1174406495);
        setField(term547374, term547374.getClass(), "toString", null);
        setField(term547374, term547374.getClass(), "toProperString", null);
        term547371 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term547371, term547371.getClass(), "numerator", -2040526702);
        setIntField(term547371, term547371.getClass(), "denominator", 1174406495);
        setField(term547371, term547371.getClass(), "toString", null);
        setField(term547371, term547371.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term546791, args);
        assertTrue(recursiveEquals(term546791, term547374));
        assertTrue(recursiveEquals(retValue, term547371));
    }

};


