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

public class Complex_equals_118089943082 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5622;
     Object term5808;
     Object term5809;

    public Complex_equals_118089943082() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5622 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        term5808 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term5808, term5808.getClass(), "imaginary", 0.0);
        setDoubleField(term5808, term5808.getClass(), "real", 0.0);
        term5809 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term5809, term5809.getClass(), "imaginary", 0.0);
        setDoubleField(term5809, term5809.getClass(), "real", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term5622;
        Object retValue = callMethod(klass, "equals", argTypes, term5622, args);
        assertTrue(recursiveEquals(term5622, term5808));
        assertTrue(recursiveEquals(term5622, term5809));
        assertTrue(recursiveEquals(retValue, true));
    }

};


