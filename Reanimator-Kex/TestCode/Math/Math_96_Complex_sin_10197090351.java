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

public class Complex_sin_10197090351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84;
     Object term1483;
     Object term1480;

    public Complex_sin_10197090351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term84, term84.getClass(), "imaginary", 0.8566567697571895);
        setDoubleField(term84, term84.getClass(), "real", 0.9203805380592256);
        term1483 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term1483, term1483.getClass(), "imaginary", 0.8566567697571895);
        setDoubleField(term1483, term1483.getClass(), "real", 0.9203805380592256);
        term1480 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term1480, term1480.getClass(), "imaginary", 0.584534398674991);
        setDoubleField(term1480, term1480.getClass(), "real", 1.1061479159321455);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "sin", argTypes, term84, args);
        assertTrue(recursiveEquals(term84, term1483));
        assertTrue(recursiveEquals(retValue, term1480));
    }

};


