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

public class Complex_isInfinite_108690603558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82;
     Object term773;

    public Complex_isInfinite_108690603558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term82, term82.getClass(), "imaginary", 0.6300849762307866);
        setDoubleField(term82, term82.getClass(), "real", 0.9737083944266686);
        setBooleanField(term82, term82.getClass(), "isNaN", true);
        setBooleanField(term82, term82.getClass(), "isInfinite", true);
        term773 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term773, term773.getClass(), "imaginary", 0.6300849762307866);
        setDoubleField(term773, term773.getClass(), "real", 0.9737083944266686);
        setBooleanField(term773, term773.getClass(), "isNaN", true);
        setBooleanField(term773, term773.getClass(), "isInfinite", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isInfinite", argTypes, term82, args);
        assertTrue(recursiveEquals(term82, term773));
    }

};


