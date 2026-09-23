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

public class Complex_equals_118089943053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56;
     Object term61;
     Object term478;
     Object term479;

    public Complex_equals_118089943053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term56, term56.getClass(), "imaginary", 0.7633268466829064);
        setDoubleField(term56, term56.getClass(), "real", 0.13481025392611334);
        setBooleanField(term56, term56.getClass(), "isNaN", false);
        setBooleanField(term56, term56.getClass(), "isInfinite", false);
        term61 = newInstance(Class.forName("java.lang.Object"));
        term478 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term478, term478.getClass(), "imaginary", 0.7633268466829064);
        setDoubleField(term478, term478.getClass(), "real", 0.13481025392611334);
        setBooleanField(term478, term478.getClass(), "isNaN", false);
        setBooleanField(term478, term478.getClass(), "isInfinite", false);
        term479 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term61;
        Object retValue = callMethod(klass, "equals", argTypes, term56, args);
        assertTrue(recursiveEquals(term56, term478));
        assertTrue(recursiveEquals(term61, term479));
        assertTrue(recursiveEquals(retValue, false));
    }

};


