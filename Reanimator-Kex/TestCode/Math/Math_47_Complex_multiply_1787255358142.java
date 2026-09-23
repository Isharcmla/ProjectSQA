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

public class Complex_multiply_1787255358142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12407;
     Object term12437;
     Object term12438;
     Object term12432;

    public Complex_multiply_1787255358142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12407 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term12407, term12407.getClass(), "isNaN", false);
        setDoubleField(term12407, term12407.getClass(), "real", 9.2188684372274053E18);
        term12437 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term12437, term12437.getClass(), "imaginary", 0.0);
        setDoubleField(term12437, term12437.getClass(), "real", 9.2188684372274053E18);
        setBooleanField(term12437, term12437.getClass(), "isNaN", false);
        setBooleanField(term12437, term12437.getClass(), "isInfinite", false);
        term12438 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term12438, term12438.getClass(), "imaginary", 0.0);
        setDoubleField(term12438, term12438.getClass(), "real", 9.2188684372274053E18);
        setBooleanField(term12438, term12438.getClass(), "isNaN", false);
        setBooleanField(term12438, term12438.getClass(), "isInfinite", false);
        term12432 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term12432, term12432.getClass(), "imaginary", 0.0);
        setDoubleField(term12432, term12432.getClass(), "real", 8.498753526290766E37);
        setBooleanField(term12432, term12432.getClass(), "isNaN", false);
        setBooleanField(term12432, term12432.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term12407;
        Object retValue = callMethod(klass, "multiply", argTypes, term12407, args);
        assertTrue(recursiveEquals(term12407, term12437));
        assertTrue(recursiveEquals(term12407, term12438));
        assertTrue(recursiveEquals(retValue, term12432));
    }

};


