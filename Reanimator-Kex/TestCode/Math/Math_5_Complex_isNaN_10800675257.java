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

public class Complex_isNaN_10800675257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77;
     Object term766;

    public Complex_isNaN_10800675257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term77, term77.getClass(), "imaginary", 0.6805867182029153);
        setDoubleField(term77, term77.getClass(), "real", 0.2852810965221698);
        setBooleanField(term77, term77.getClass(), "isNaN", false);
        setBooleanField(term77, term77.getClass(), "isInfinite", false);
        term766 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term766, term766.getClass(), "imaginary", 0.6805867182029153);
        setDoubleField(term766, term766.getClass(), "real", 0.2852810965221698);
        setBooleanField(term766, term766.getClass(), "isNaN", false);
        setBooleanField(term766, term766.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isNaN", argTypes, term77, args);
        assertTrue(recursiveEquals(term77, term766));
    }

};


