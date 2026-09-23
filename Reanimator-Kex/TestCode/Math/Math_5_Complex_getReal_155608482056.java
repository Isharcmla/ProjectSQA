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

public class Complex_getReal_155608482056 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72;
     Object term759;

    public Complex_getReal_155608482056() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term72, term72.getClass(), "imaginary", 0.11493000848982304);
        setDoubleField(term72, term72.getClass(), "real", 0.37161417339133307);
        setBooleanField(term72, term72.getClass(), "isNaN", true);
        setBooleanField(term72, term72.getClass(), "isInfinite", false);
        term759 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term759, term759.getClass(), "imaginary", 0.11493000848982304);
        setDoubleField(term759, term759.getClass(), "real", 0.37161417339133307);
        setBooleanField(term759, term759.getClass(), "isNaN", true);
        setBooleanField(term759, term759.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getReal", argTypes, term72, args);
        assertTrue(recursiveEquals(term72, term759));
        assertTrue(recursiveEquals(retValue, 0.37161417339133307));
    }

};


