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

public class Complex_getReal_3528153956 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72;
     Object term502;

    public Complex_getReal_3528153956() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term72, term72.getClass(), "imaginary", 0.11493000848982304);
        setDoubleField(term72, term72.getClass(), "real", 0.37161417339133307);
        setBooleanField(term72, term72.getClass(), "isNaN", true);
        setBooleanField(term72, term72.getClass(), "isInfinite", false);
        term502 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term502, term502.getClass(), "imaginary", 0.11493000848982304);
        setDoubleField(term502, term502.getClass(), "real", 0.37161417339133307);
        setBooleanField(term502, term502.getClass(), "isNaN", true);
        setBooleanField(term502, term502.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getReal", argTypes, term72, args);
        assertTrue(recursiveEquals(term72, term502));
        assertTrue(recursiveEquals(retValue, 0.37161417339133307));
    }

};


