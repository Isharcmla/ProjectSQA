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
import java.lang.Double;

public class Complex_reciprocal_771751097111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13924;
     Object term13940;
     Object term13930;

    public Complex_reciprocal_771751097111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13924 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setBooleanField(term13924, term13924.getClass(), "isNaN", false);
        term13940 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term13940, term13940.getClass(), "imaginary", 0.0);
        setDoubleField(term13940, term13940.getClass(), "real", 0.0);
        setBooleanField(term13940, term13940.getClass(), "isNaN", false);
        setBooleanField(term13940, term13940.getClass(), "isInfinite", false);
        term13930 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term13930, term13930.getClass(), "imaginary", Double.NaN);
        setDoubleField(term13930, term13930.getClass(), "real", Double.NaN);
        setBooleanField(term13930, term13930.getClass(), "isNaN", true);
        setBooleanField(term13930, term13930.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reciprocal", argTypes, term13924, args);
        assertTrue(recursiveEquals(term13924, term13940));
        assertTrue(recursiveEquals(retValue, term13930));
    }

};


