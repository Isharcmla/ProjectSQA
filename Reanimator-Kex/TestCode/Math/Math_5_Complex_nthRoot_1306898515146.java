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

public class Complex_nthRoot_1306898515146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20823;

    public Complex_nthRoot_1306898515146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20823 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setBooleanField(term20823, term20823.getClass(), "isNaN", false);
        setBooleanField(term20823, term20823.getClass(), "isInfinite", false);
        setDoubleField(term20823, term20823.getClass(), "real", 3.6649690468975952E16);
        setDoubleField(term20823, term20823.getClass(), "imaginary", 4.814052790897318E15);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 1;
        callMethod(klass, "nthRoot", argTypes, term20823, args);
    }

};


