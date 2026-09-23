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

public class Complex_isNaN_169937311154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84;
     Object term511;

    public Complex_isNaN_169937311154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term84, term84.getClass(), "imaginary", 0.11493000848982304);
        setDoubleField(term84, term84.getClass(), "real", 0.37161417339133307);
        setBooleanField(term84, term84.getClass(), "isNaN", true);
        setBooleanField(term84, term84.getClass(), "isInfinite", true);
        setBooleanField(term84, term84.getClass(), "isZero", true);
        term511 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term511, term511.getClass(), "imaginary", 0.11493000848982304);
        setDoubleField(term511, term511.getClass(), "real", 0.37161417339133307);
        setBooleanField(term511, term511.getClass(), "isNaN", true);
        setBooleanField(term511, term511.getClass(), "isInfinite", true);
        setBooleanField(term511, term511.getClass(), "isZero", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isNaN", argTypes, term84, args);
        assertTrue(recursiveEquals(term84, term511));
    }

};


