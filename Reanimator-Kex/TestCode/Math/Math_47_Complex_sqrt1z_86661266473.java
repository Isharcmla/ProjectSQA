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

public class Complex_sqrt1z_86661266473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188;
     Object term3338;
     Object term3333;

    public Complex_sqrt1z_86661266473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term188, term188.getClass(), "imaginary", 0.6767213143579776);
        setDoubleField(term188, term188.getClass(), "real", 0.48862955528902696);
        setBooleanField(term188, term188.getClass(), "isNaN", true);
        setBooleanField(term188, term188.getClass(), "isInfinite", false);
        term3338 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term3338, term3338.getClass(), "imaginary", 0.6767213143579776);
        setDoubleField(term3338, term3338.getClass(), "real", 0.48862955528902696);
        setBooleanField(term3338, term3338.getClass(), "isNaN", true);
        setBooleanField(term3338, term3338.getClass(), "isInfinite", false);
        term3333 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term3333, term3333.getClass(), "imaginary", Double.NaN);
        setDoubleField(term3333, term3333.getClass(), "real", Double.NaN);
        setBooleanField(term3333, term3333.getClass(), "isNaN", true);
        setBooleanField(term3333, term3333.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "sqrt1z", argTypes, term188, args);
        assertTrue(recursiveEquals(term188, term3338));
        assertTrue(recursiveEquals(retValue, term3333));
    }

};


