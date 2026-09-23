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

public class Complex_sqrt1z_866612664149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13752;
     Object term13894;
     Object term13889;

    public Complex_sqrt1z_866612664149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13752 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term13752, term13752.getClass(), "isNaN", false);
        term13894 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term13894, term13894.getClass(), "imaginary", 0.0);
        setDoubleField(term13894, term13894.getClass(), "real", 0.0);
        setBooleanField(term13894, term13894.getClass(), "isNaN", false);
        setBooleanField(term13894, term13894.getClass(), "isInfinite", false);
        term13889 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term13889, term13889.getClass(), "imaginary", 0.0);
        setDoubleField(term13889, term13889.getClass(), "real", 1.0);
        setBooleanField(term13889, term13889.getClass(), "isNaN", false);
        setBooleanField(term13889, term13889.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "sqrt1z", argTypes, term13752, args);
        assertTrue(recursiveEquals(term13752, term13894));
        assertTrue(recursiveEquals(retValue, term13889));
    }

};


