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

public class Complex_equals_118089943083 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5718;
     Object term5802;
     Object term5833;
     Object term5834;

    public Complex_equals_118089943083() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5718 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        term5802 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        term5833 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term5833, term5833.getClass(), "imaginary", 0.0);
        setDoubleField(term5833, term5833.getClass(), "real", 0.0);
        term5834 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term5834, term5834.getClass(), "imaginary", 0.0);
        setDoubleField(term5834, term5834.getClass(), "real", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term5802;
        Object retValue = callMethod(klass, "equals", argTypes, term5718, args);
        assertTrue(recursiveEquals(term5718, term5833));
        assertTrue(recursiveEquals(term5802, term5834));
        assertTrue(recursiveEquals(retValue, true));
    }

};


