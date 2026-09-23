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

public class Complex_sqrt1z_86661266480 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200;
     Object term9202;
     Object term9197;

    public Complex_sqrt1z_86661266480() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term200 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term200, term200.getClass(), "imaginary", 0.29874017652881824);
        setDoubleField(term200, term200.getClass(), "real", 0.32554480512985284);
        setBooleanField(term200, term200.getClass(), "isNaN", false);
        setBooleanField(term200, term200.getClass(), "isInfinite", false);
        term9202 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term9202, term9202.getClass(), "imaginary", 0.29874017652881824);
        setDoubleField(term9202, term9202.getClass(), "real", 0.32554480512985284);
        setBooleanField(term9202, term9202.getClass(), "isNaN", false);
        setBooleanField(term9202, term9202.getClass(), "isInfinite", false);
        term9197 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term9197, term9197.getClass(), "imaginary", -0.09760566378596723);
        setDoubleField(term9197, term9197.getClass(), "real", 0.9963900534070655);
        setBooleanField(term9197, term9197.getClass(), "isNaN", false);
        setBooleanField(term9197, term9197.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "sqrt1z", argTypes, term200, args);
        assertTrue(recursiveEquals(term200, term9202));
        assertTrue(recursiveEquals(retValue, term9197));
    }

};


