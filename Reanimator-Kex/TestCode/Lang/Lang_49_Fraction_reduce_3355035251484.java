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

public class Fraction_reduce_3355035251484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term435448;
     Object term436482;
     Object term436479;

    public Fraction_reduce_3355035251484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term435448 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term435448, term435448.getClass(), "numerator", 905644914);
        setIntField(term435448, term435448.getClass(), "denominator", 453346481);
        term436482 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term436482, term436482.getClass(), "numerator", 905644914);
        setIntField(term436482, term436482.getClass(), "denominator", 453346481);
        setField(term436482, term436482.getClass(), "toString", null);
        setField(term436482, term436482.getClass(), "toProperString", null);
        term436479 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term436479, term436479.getClass(), "numerator", 905644914);
        setIntField(term436479, term436479.getClass(), "denominator", 453346481);
        setField(term436479, term436479.getClass(), "toString", null);
        setField(term436479, term436479.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term435448, args);
        assertTrue(recursiveEquals(term435448, term436482));
        assertTrue(recursiveEquals(retValue, term436479));
    }

};


