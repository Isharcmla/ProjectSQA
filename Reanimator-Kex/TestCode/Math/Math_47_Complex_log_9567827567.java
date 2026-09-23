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

public class Complex_log_9567827567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151;
     Object term2029;
     Object term2019;

    public Complex_log_9567827567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term151 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term151, term151.getClass(), "imaginary", 0.43337207054070237);
        setDoubleField(term151, term151.getClass(), "real", 0.13246999699526574);
        setBooleanField(term151, term151.getClass(), "isNaN", true);
        setBooleanField(term151, term151.getClass(), "isInfinite", false);
        term2029 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term2029, term2029.getClass(), "imaginary", 0.43337207054070237);
        setDoubleField(term2029, term2029.getClass(), "real", 0.13246999699526574);
        setBooleanField(term2029, term2029.getClass(), "isNaN", true);
        setBooleanField(term2029, term2029.getClass(), "isInfinite", false);
        term2019 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term2019, term2019.getClass(), "imaginary", Double.NaN);
        setDoubleField(term2019, term2019.getClass(), "real", Double.NaN);
        setBooleanField(term2019, term2019.getClass(), "isNaN", true);
        setBooleanField(term2019, term2019.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "log", argTypes, term151, args);
        assertTrue(recursiveEquals(term151, term2029));
        assertTrue(recursiveEquals(retValue, term2019));
    }

};


