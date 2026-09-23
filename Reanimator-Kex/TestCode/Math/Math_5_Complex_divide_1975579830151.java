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

public class Complex_divide_1975579830151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21612;
     Object term21698;
     Object term22390;
     Object term22391;
     Object term22385;

    public Complex_divide_1975579830151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21612 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setBooleanField(term21612, term21612.getClass(), "isNaN", false);
        term21698 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setBooleanField(term21698, term21698.getClass(), "isNaN", false);
        setDoubleField(term21698, term21698.getClass(), "real", 4.503599627370497E15);
        setDoubleField(term21698, term21698.getClass(), "imaginary", 0.0);
        setBooleanField(term21698, term21698.getClass(), "isInfinite", false);
        term22390 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term22390, term22390.getClass(), "imaginary", 0.0);
        setDoubleField(term22390, term22390.getClass(), "real", 0.0);
        setBooleanField(term22390, term22390.getClass(), "isNaN", false);
        setBooleanField(term22390, term22390.getClass(), "isInfinite", false);
        term22391 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term22391, term22391.getClass(), "imaginary", 0.0);
        setDoubleField(term22391, term22391.getClass(), "real", 4.503599627370497E15);
        setBooleanField(term22391, term22391.getClass(), "isNaN", false);
        setBooleanField(term22391, term22391.getClass(), "isInfinite", false);
        term22385 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term22385, term22385.getClass(), "imaginary", 0.0);
        setDoubleField(term22385, term22385.getClass(), "real", 0.0);
        setBooleanField(term22385, term22385.getClass(), "isNaN", false);
        setBooleanField(term22385, term22385.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term21698;
        Object retValue = callMethod(klass, "divide", argTypes, term21612, args);
        assertTrue(recursiveEquals(term21612, term22390));
        assertTrue(recursiveEquals(term21698, term22391));
        assertTrue(recursiveEquals(retValue, term22385));
    }

};


