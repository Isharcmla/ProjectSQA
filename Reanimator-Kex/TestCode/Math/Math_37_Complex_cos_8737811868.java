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

public class Complex_cos_8737811868 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148;
     Object term1838;
     Object term1828;

    public Complex_cos_8737811868() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term148, term148.getClass(), "imaginary", 0.2109867221632754);
        setDoubleField(term148, term148.getClass(), "real", 0.3227335400819148);
        setBooleanField(term148, term148.getClass(), "isNaN", true);
        setBooleanField(term148, term148.getClass(), "isInfinite", false);
        term1838 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term1838, term1838.getClass(), "imaginary", 0.2109867221632754);
        setDoubleField(term1838, term1838.getClass(), "real", 0.3227335400819148);
        setBooleanField(term1838, term1838.getClass(), "isNaN", true);
        setBooleanField(term1838, term1838.getClass(), "isInfinite", false);
        term1828 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term1828, term1828.getClass(), "imaginary", Double.NaN);
        setDoubleField(term1828, term1828.getClass(), "real", Double.NaN);
        setBooleanField(term1828, term1828.getClass(), "isNaN", true);
        setBooleanField(term1828, term1828.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "cos", argTypes, term148, args);
        assertTrue(recursiveEquals(term148, term1838));
        assertTrue(recursiveEquals(retValue, term1828));
    }

};


