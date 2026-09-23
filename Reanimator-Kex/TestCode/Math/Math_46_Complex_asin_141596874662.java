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
import java.lang.Double;

public class Complex_asin_141596874662 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148;
     Object term685;
     Object term673;

    public Complex_asin_141596874662() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term148, term148.getClass(), "imaginary", 0.15917839663695388);
        setDoubleField(term148, term148.getClass(), "real", 0.9374115574082594);
        setBooleanField(term148, term148.getClass(), "isNaN", true);
        setBooleanField(term148, term148.getClass(), "isInfinite", true);
        setBooleanField(term148, term148.getClass(), "isZero", true);
        term685 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term685, term685.getClass(), "imaginary", 0.15917839663695388);
        setDoubleField(term685, term685.getClass(), "real", 0.9374115574082594);
        setBooleanField(term685, term685.getClass(), "isNaN", true);
        setBooleanField(term685, term685.getClass(), "isInfinite", true);
        setBooleanField(term685, term685.getClass(), "isZero", true);
        term673 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term673, term673.getClass(), "imaginary", Double.NaN);
        setDoubleField(term673, term673.getClass(), "real", Double.NaN);
        setBooleanField(term673, term673.getClass(), "isNaN", true);
        setBooleanField(term673, term673.getClass(), "isInfinite", false);
        setBooleanField(term673, term673.getClass(), "isZero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term148, args);
        assertTrue(recursiveEquals(term148, term685));
        assertTrue(recursiveEquals(retValue, term673));
    }

};


