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

public class Complex_divide_2093199063121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7953;
     Object term7972;
     Object term7966;

    public Complex_divide_2093199063121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7953 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term7953, term7953.getClass(), "isNaN", false);
        term7972 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term7972, term7972.getClass(), "imaginary", 0.0);
        setDoubleField(term7972, term7972.getClass(), "real", 0.0);
        setBooleanField(term7972, term7972.getClass(), "isNaN", false);
        setBooleanField(term7972, term7972.getClass(), "isInfinite", false);
        term7966 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term7966, term7966.getClass(), "imaginary", 0.0);
        setDoubleField(term7966, term7966.getClass(), "real", 0.0);
        setBooleanField(term7966, term7966.getClass(), "isNaN", false);
        setBooleanField(term7966, term7966.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = Double.POSITIVE_INFINITY;
        Object retValue = callMethod(klass, "divide", argTypes, term7953, args);
        assertTrue(recursiveEquals(term7953, term7972));
        assertTrue(recursiveEquals(retValue, term7966));
    }

};


