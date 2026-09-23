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

public class Complex_pow_2061976937118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15609;
     Object term15695;

    public Complex_pow_2061976937118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15609 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setBooleanField(term15609, term15609.getClass(), "isNaN", false);
        setBooleanField(term15609, term15609.getClass(), "isInfinite", false);
        setDoubleField(term15609, term15609.getClass(), "real", 9.2188863483147715E18);
        setDoubleField(term15609, term15609.getClass(), "imaginary", 9.2188690407374193E18);
        term15695 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term15695;
        callMethod(klass, "pow", argTypes, term15609, args);
    }

};


