package org.apache.commons.math3.complex;

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
import static org.apache.commons.math3.complex.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.complex.EqualityUtils.*;

public class Complex_multiply_1350793932107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13103;
     Object term13132;
     Object term13126;

    public Complex_multiply_1350793932107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13103 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setBooleanField(term13103, term13103.getClass(), "isNaN", false);
        term13132 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term13132, term13132.getClass(), "imaginary", 0.0);
        setDoubleField(term13132, term13132.getClass(), "real", 0.0);
        setBooleanField(term13132, term13132.getClass(), "isNaN", false);
        setBooleanField(term13132, term13132.getClass(), "isInfinite", false);
        term13126 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term13126, term13126.getClass(), "imaginary", 0.0);
        setDoubleField(term13126, term13126.getClass(), "real", 0.0);
        setBooleanField(term13126, term13126.getClass(), "isNaN", false);
        setBooleanField(term13126, term13126.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 0.0;
        Object retValue = callMethod(klass, "multiply", argTypes, term13103, args);
        assertTrue(recursiveEquals(term13103, term13132));
        assertTrue(recursiveEquals(retValue, term13126));
    }

};


