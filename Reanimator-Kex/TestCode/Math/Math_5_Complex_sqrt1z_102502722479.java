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
import static org.apache.commons.math3.complex.EqualityUtils.*;

public class Complex_sqrt1z_102502722479 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200;
     Object term9434;
     Object term9429;

    public Complex_sqrt1z_102502722479() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term200 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term200, term200.getClass(), "imaginary", 0.29874017652881824);
        setDoubleField(term200, term200.getClass(), "real", 0.32554480512985284);
        setBooleanField(term200, term200.getClass(), "isNaN", false);
        setBooleanField(term200, term200.getClass(), "isInfinite", false);
        term9434 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term9434, term9434.getClass(), "imaginary", 0.29874017652881824);
        setDoubleField(term9434, term9434.getClass(), "real", 0.32554480512985284);
        setBooleanField(term9434, term9434.getClass(), "isNaN", false);
        setBooleanField(term9434, term9434.getClass(), "isInfinite", false);
        term9429 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term9429, term9429.getClass(), "imaginary", -0.09760566378596723);
        setDoubleField(term9429, term9429.getClass(), "real", 0.9963900534070655);
        setBooleanField(term9429, term9429.getClass(), "isNaN", false);
        setBooleanField(term9429, term9429.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "sqrt1z", argTypes, term200, args);
        assertTrue(recursiveEquals(term200, term9434));
        assertTrue(recursiveEquals(retValue, term9429));
    }

};


