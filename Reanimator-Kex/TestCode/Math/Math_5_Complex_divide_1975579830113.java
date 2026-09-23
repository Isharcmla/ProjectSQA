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

public class Complex_divide_1975579830113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14067;
     Object term14153;
     Object term14206;
     Object term14207;
     Object term14201;

    public Complex_divide_1975579830113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14067 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setBooleanField(term14067, term14067.getClass(), "isNaN", false);
        setBooleanField(term14067, term14067.getClass(), "isInfinite", true);
        term14153 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setBooleanField(term14153, term14153.getClass(), "isNaN", false);
        setDoubleField(term14153, term14153.getClass(), "real", 3.6028797018963968E16);
        setDoubleField(term14153, term14153.getClass(), "imaginary", 3.6028797018963968E16);
        setBooleanField(term14153, term14153.getClass(), "isInfinite", true);
        term14206 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term14206, term14206.getClass(), "imaginary", 0.0);
        setDoubleField(term14206, term14206.getClass(), "real", 0.0);
        setBooleanField(term14206, term14206.getClass(), "isNaN", false);
        setBooleanField(term14206, term14206.getClass(), "isInfinite", true);
        term14207 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term14207, term14207.getClass(), "imaginary", 3.6028797018963968E16);
        setDoubleField(term14207, term14207.getClass(), "real", 3.6028797018963968E16);
        setBooleanField(term14207, term14207.getClass(), "isNaN", false);
        setBooleanField(term14207, term14207.getClass(), "isInfinite", true);
        term14201 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term14201, term14201.getClass(), "imaginary", 0.0);
        setDoubleField(term14201, term14201.getClass(), "real", 0.0);
        setBooleanField(term14201, term14201.getClass(), "isNaN", false);
        setBooleanField(term14201, term14201.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term14153;
        Object retValue = callMethod(klass, "divide", argTypes, term14067, args);
        assertTrue(recursiveEquals(term14067, term14206));
        assertTrue(recursiveEquals(term14153, term14207));
        assertTrue(recursiveEquals(retValue, term14201));
    }

};


