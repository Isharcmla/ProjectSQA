package org.apache.commons.math3.fraction;

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
import static org.apache.commons.math3.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.fraction.EqualityUtils.*;
import java.lang.Integer;

public class Fraction_multiply_187700057155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103;
     Object term106;
     Object term5378;
     Object term5369;

    public Fraction_multiply_187700057155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term103, term103.getClass(), "denominator", 292681826);
        setIntField(term103, term103.getClass(), "numerator", 458147407);
        term106 = new Integer(-184153539);
        term5378 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term5378, term5378.getClass(), "denominator", 292681826);
        setIntField(term5378, term5378.getClass(), "numerator", 458147407);
        term5369 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term5369, term5369.getClass(), "denominator", 292681826);
        setIntField(term5369, term5369.getClass(), "numerator", -698460461);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term106;
        Object retValue = callMethod(klass, "multiply", argTypes, term103, args);
        assertTrue(recursiveEquals(term103, term5378));
        assertTrue(recursiveEquals(term106, -184153539));
        assertTrue(recursiveEquals(retValue, term5369));
    }

};
