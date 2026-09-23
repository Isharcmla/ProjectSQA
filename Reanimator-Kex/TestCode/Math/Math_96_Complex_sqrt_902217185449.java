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

public class Complex_sqrt_902217185449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111765;
     Object term111807;
     Object term111804;

    public Complex_sqrt_902217185449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111765 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term111765, term111765.getClass(), "real", -9.0792568487789199E18);
        setDoubleField(term111765, term111765.getClass(), "imaginary", 9.2188684372274053E18);
        term111807 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term111807, term111807.getClass(), "imaginary", 9.2188684372274053E18);
        setDoubleField(term111807, term111807.getClass(), "real", -9.0792568487789199E18);
        term111804 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term111804, term111804.getClass(), "imaginary", 3.3180085838948336E9);
        setDoubleField(term111804, term111804.getClass(), "real", 1.3892170867149878E9);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "sqrt", argTypes, term111765, args);
        assertTrue(recursiveEquals(term111765, term111807));
        assertTrue(recursiveEquals(retValue, term111804));
    }

};


