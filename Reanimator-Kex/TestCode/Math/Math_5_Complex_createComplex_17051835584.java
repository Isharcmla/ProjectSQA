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
import java.lang.Double;

public class Complex_createComplex_17051835584 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227;
     Object term232;
     Object term234;
     Object term10633;
     Object term10621;

    public Complex_createComplex_17051835584() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term227 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term227, term227.getClass(), "imaginary", 0.3626177854778667);
        setDoubleField(term227, term227.getClass(), "real", 0.3163771663728089);
        setBooleanField(term227, term227.getClass(), "isNaN", true);
        setBooleanField(term227, term227.getClass(), "isInfinite", false);
        term232 = new Double(0.8819646072665548);
        term234 = new Double(0.5412182593116958);
        term10633 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term10633, term10633.getClass(), "imaginary", 0.3626177854778667);
        setDoubleField(term10633, term10633.getClass(), "real", 0.3163771663728089);
        setBooleanField(term10633, term10633.getClass(), "isNaN", true);
        setBooleanField(term10633, term10633.getClass(), "isInfinite", false);
        term10621 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term10621, term10621.getClass(), "imaginary", 0.5412182593116958);
        setDoubleField(term10621, term10621.getClass(), "real", 0.8819646072665548);
        setBooleanField(term10621, term10621.getClass(), "isNaN", false);
        setBooleanField(term10621, term10621.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.complex.Complex");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term232;
        args[1] = term234;
        Object retValue = callMethod(klass, "createComplex", argTypes, term227, args);
        assertTrue(recursiveEquals(term227, term10633));
        assertTrue(recursiveEquals(term232, 0.8819646072665548));
        assertTrue(recursiveEquals(term234, 0.5412182593116958));
        assertTrue(recursiveEquals(retValue, term10621));
    }

};


