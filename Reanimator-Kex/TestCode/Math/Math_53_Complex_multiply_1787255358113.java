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

public class Complex_multiply_1787255358113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9882;
     Object term9912;
     Object term9913;
     Object term9907;

    public Complex_multiply_1787255358113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9882 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term9882, term9882.getClass(), "isNaN", false);
        setDoubleField(term9882, term9882.getClass(), "real", 0.0);
        setDoubleField(term9882, term9882.getClass(), "imaginary", 9.2188684372274053E18);
        term9912 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term9912, term9912.getClass(), "imaginary", 9.2188684372274053E18);
        setDoubleField(term9912, term9912.getClass(), "real", 0.0);
        setBooleanField(term9912, term9912.getClass(), "isNaN", false);
        setBooleanField(term9912, term9912.getClass(), "isInfinite", false);
        term9913 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term9913, term9913.getClass(), "imaginary", 9.2188684372274053E18);
        setDoubleField(term9913, term9913.getClass(), "real", 0.0);
        setBooleanField(term9913, term9913.getClass(), "isNaN", false);
        setBooleanField(term9913, term9913.getClass(), "isInfinite", false);
        term9907 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term9907, term9907.getClass(), "imaginary", 0.0);
        setDoubleField(term9907, term9907.getClass(), "real", -8.498753526290766E37);
        setBooleanField(term9907, term9907.getClass(), "isNaN", false);
        setBooleanField(term9907, term9907.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term9882;
        Object retValue = callMethod(klass, "multiply", argTypes, term9882, args);
        assertTrue(recursiveEquals(term9882, term9912));
        assertTrue(recursiveEquals(term9882, term9913));
        assertTrue(recursiveEquals(retValue, term9907));
    }

};


