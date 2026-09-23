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

public class Complex_tanh_88849506675 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234;
     Object term3123;
     Object term3111;

    public Complex_tanh_88849506675() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term234 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term234, term234.getClass(), "imaginary", 0.29874017652881824);
        setDoubleField(term234, term234.getClass(), "real", 0.32554480512985284);
        setBooleanField(term234, term234.getClass(), "isNaN", true);
        setBooleanField(term234, term234.getClass(), "isInfinite", true);
        setBooleanField(term234, term234.getClass(), "isZero", true);
        term3123 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term3123, term3123.getClass(), "imaginary", 0.29874017652881824);
        setDoubleField(term3123, term3123.getClass(), "real", 0.32554480512985284);
        setBooleanField(term3123, term3123.getClass(), "isNaN", true);
        setBooleanField(term3123, term3123.getClass(), "isInfinite", true);
        setBooleanField(term3123, term3123.getClass(), "isZero", true);
        term3111 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term3111, term3111.getClass(), "imaginary", Double.NaN);
        setDoubleField(term3111, term3111.getClass(), "real", Double.NaN);
        setBooleanField(term3111, term3111.getClass(), "isNaN", true);
        setBooleanField(term3111, term3111.getClass(), "isInfinite", false);
        setBooleanField(term3111, term3111.getClass(), "isZero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "tanh", argTypes, term234, args);
        assertTrue(recursiveEquals(term234, term3123));
        assertTrue(recursiveEquals(retValue, term3111));
    }

};


