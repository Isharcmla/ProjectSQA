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

public class Complex_cos_7103644268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148;
     Object term2095;
     Object term2085;

    public Complex_cos_7103644268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term148, term148.getClass(), "imaginary", 0.2109867221632754);
        setDoubleField(term148, term148.getClass(), "real", 0.3227335400819148);
        setBooleanField(term148, term148.getClass(), "isNaN", true);
        setBooleanField(term148, term148.getClass(), "isInfinite", false);
        term2095 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term2095, term2095.getClass(), "imaginary", 0.2109867221632754);
        setDoubleField(term2095, term2095.getClass(), "real", 0.3227335400819148);
        setBooleanField(term2095, term2095.getClass(), "isNaN", true);
        setBooleanField(term2095, term2095.getClass(), "isInfinite", false);
        term2085 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term2085, term2085.getClass(), "imaginary", Double.NaN);
        setDoubleField(term2085, term2085.getClass(), "real", Double.NaN);
        setBooleanField(term2085, term2085.getClass(), "isNaN", true);
        setBooleanField(term2085, term2085.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "cos", argTypes, term148, args);
        assertTrue(recursiveEquals(term148, term2095));
        assertTrue(recursiveEquals(retValue, term2085));
    }

};


