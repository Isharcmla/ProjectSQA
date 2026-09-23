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

public class Fraction_reduce_3355035252539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term757459;
     Object term757964;
     Object term757961;

    public Fraction_reduce_3355035252539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term757459 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term757459, term757459.getClass(), "numerator", 30);
        setIntField(term757459, term757459.getClass(), "denominator", 1707160663);
        term757964 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term757964, term757964.getClass(), "numerator", 30);
        setIntField(term757964, term757964.getClass(), "denominator", 1707160663);
        setField(term757964, term757964.getClass(), "toString", null);
        setField(term757964, term757964.getClass(), "toProperString", null);
        term757961 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term757961, term757961.getClass(), "numerator", 30);
        setIntField(term757961, term757961.getClass(), "denominator", 1707160663);
        setField(term757961, term757961.getClass(), "toString", null);
        setField(term757961, term757961.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term757459, args);
        assertTrue(recursiveEquals(term757459, term757964));
        assertTrue(recursiveEquals(retValue, term757961));
    }

};


