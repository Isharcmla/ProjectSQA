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

public class Complex_sqrt_902217185113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19068;
     Object term19080;
     Object term19070;

    public Complex_sqrt_902217185113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19068 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term19068, term19068.getClass(), "isNaN", true);
        term19080 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term19080, term19080.getClass(), "imaginary", 0.0);
        setDoubleField(term19080, term19080.getClass(), "real", 0.0);
        setBooleanField(term19080, term19080.getClass(), "isNaN", true);
        setBooleanField(term19080, term19080.getClass(), "isInfinite", false);
        term19070 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term19070, term19070.getClass(), "imaginary", Double.NaN);
        setDoubleField(term19070, term19070.getClass(), "real", Double.NaN);
        setBooleanField(term19070, term19070.getClass(), "isNaN", true);
        setBooleanField(term19070, term19070.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "sqrt", argTypes, term19068, args);
        assertTrue(recursiveEquals(term19068, term19080));
        assertTrue(recursiveEquals(retValue, term19070));
    }

};


