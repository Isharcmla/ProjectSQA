package org.apache.commons.math.complex;

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
import static org.apache.commons.math.complex.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.complex.EqualityUtils.*;

public class Complex_add_1930158929116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6925;
     Object term6958;
     Object term6951;

    public Complex_add_1930158929116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6925 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term6925, term6925.getClass(), "isNaN", false);
        term6958 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term6958, term6958.getClass(), "imaginary", 0.0);
        setDoubleField(term6958, term6958.getClass(), "real", 0.0);
        setBooleanField(term6958, term6958.getClass(), "isNaN", false);
        setBooleanField(term6958, term6958.getClass(), "isInfinite", false);
        setBooleanField(term6958, term6958.getClass(), "isZero", false);
        term6951 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term6951, term6951.getClass(), "imaginary", 0.0);
        setDoubleField(term6951, term6951.getClass(), "real", 0.0);
        setBooleanField(term6951, term6951.getClass(), "isNaN", false);
        setBooleanField(term6951, term6951.getClass(), "isInfinite", false);
        setBooleanField(term6951, term6951.getClass(), "isZero", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 0.0;
        Object retValue = callMethod(klass, "add", argTypes, term6925, args);
        assertTrue(recursiveEquals(term6925, term6958));
        assertTrue(recursiveEquals(retValue, term6951));
    }

};


