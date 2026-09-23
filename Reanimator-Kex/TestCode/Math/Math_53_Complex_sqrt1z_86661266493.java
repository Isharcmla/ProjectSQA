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

public class Complex_sqrt1z_86661266493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7811;
     Object term7953;
     Object term7948;

    public Complex_sqrt1z_86661266493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7811 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term7811, term7811.getClass(), "isNaN", false);
        setDoubleField(term7811, term7811.getClass(), "real", 0.0);
        setDoubleField(term7811, term7811.getClass(), "imaginary", 9.2188684372274053E18);
        term7953 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term7953, term7953.getClass(), "imaginary", 9.2188684372274053E18);
        setDoubleField(term7953, term7953.getClass(), "real", 0.0);
        setBooleanField(term7953, term7953.getClass(), "isNaN", false);
        setBooleanField(term7953, term7953.getClass(), "isInfinite", false);
        term7948 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term7948, term7948.getClass(), "imaginary", 0.0);
        setDoubleField(term7948, term7948.getClass(), "real", 9.2188684372274053E18);
        setBooleanField(term7948, term7948.getClass(), "isNaN", false);
        setBooleanField(term7948, term7948.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "sqrt1z", argTypes, term7811, args);
        assertTrue(recursiveEquals(term7811, term7953));
        assertTrue(recursiveEquals(retValue, term7948));
    }

};


