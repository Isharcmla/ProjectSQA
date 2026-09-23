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

public class Complex_pow_62902513850 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78;
     Object term81;
     Object term1462;
     Object term1463;
     Object term1459;

    public Complex_pow_62902513850() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term78, term78.getClass(), "imaginary", 0.6862221294683138);
        setDoubleField(term78, term78.getClass(), "real", 0.15917839663695388);
        term81 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term81, term81.getClass(), "imaginary", 0.9374115574082594);
        setDoubleField(term81, term81.getClass(), "real", 0.8454723071922143);
        term1462 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term1462, term1462.getClass(), "imaginary", 0.6862221294683138);
        setDoubleField(term1462, term1462.getClass(), "real", 0.15917839663695388);
        term1463 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term1463, term1463.getClass(), "imaginary", 0.9374115574082594);
        setDoubleField(term1463, term1463.getClass(), "real", 0.8454723071922143);
        term1459 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term1459, term1459.getClass(), "imaginary", 0.15251033813069628);
        setDoubleField(term1459, term1459.getClass(), "real", 0.146079290840496);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term81;
        Object retValue = callMethod(klass, "pow", argTypes, term78, args);
        assertTrue(recursiveEquals(term78, term1462));
        assertTrue(recursiveEquals(term81, term1463));
        assertTrue(recursiveEquals(retValue, term1459));
    }

};


