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
import java.lang.Integer;

public class Complex_nthRoot_28446784435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term246;
     Object term252;

    public Complex_nthRoot_28446784435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term246 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term246, term246.getClass(), "imaginary", 0.53094494792755);
        setDoubleField(term246, term246.getClass(), "real", 0.146431486357265);
        setBooleanField(term246, term246.getClass(), "isNaN", false);
        setBooleanField(term246, term246.getClass(), "isInfinite", false);
        setBooleanField(term246, term246.getClass(), "isZero", true);
        term252 = new Integer(568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term252;
        callMethod(klass, "nthRoot", argTypes, term246, args);
    }

};


