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

public class Complex_cos_8737811822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160;

    public Complex_cos_8737811822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term160 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term160, term160.getClass(), "imaginary", 0.9203805380592256);
        setDoubleField(term160, term160.getClass(), "real", 0.5804948995371725);
        setBooleanField(term160, term160.getClass(), "isNaN", false);
        setBooleanField(term160, term160.getClass(), "isInfinite", false);
        setBooleanField(term160, term160.getClass(), "isZero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "cos", argTypes, term160, args);
    }

};


