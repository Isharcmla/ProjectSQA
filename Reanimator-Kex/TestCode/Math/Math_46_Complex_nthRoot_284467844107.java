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

public class Complex_nthRoot_284467844107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6018;

    public Complex_nthRoot_284467844107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6018 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term6018, term6018.getClass(), "isNaN", false);
        setBooleanField(term6018, term6018.getClass(), "isInfinite", false);
        setDoubleField(term6018, term6018.getClass(), "real", 7.2057594037927936E16);
        setDoubleField(term6018, term6018.getClass(), "imaginary", -9.2188684361536635E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 1;
        callMethod(klass, "nthRoot", argTypes, term6018, args);
    }

};


