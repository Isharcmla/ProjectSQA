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

public class Complex_isInfinite_161669490255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90;
     Object term519;

    public Complex_isInfinite_161669490255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term90, term90.getClass(), "imaginary", 0.6805867182029153);
        setDoubleField(term90, term90.getClass(), "real", 0.2852810965221698);
        setBooleanField(term90, term90.getClass(), "isNaN", false);
        setBooleanField(term90, term90.getClass(), "isInfinite", false);
        setBooleanField(term90, term90.getClass(), "isZero", false);
        term519 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term519, term519.getClass(), "imaginary", 0.6805867182029153);
        setDoubleField(term519, term519.getClass(), "real", 0.2852810965221698);
        setBooleanField(term519, term519.getClass(), "isNaN", false);
        setBooleanField(term519, term519.getClass(), "isInfinite", false);
        setBooleanField(term519, term519.getClass(), "isZero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isInfinite", argTypes, term90, args);
        assertTrue(recursiveEquals(term90, term519));
    }

};


