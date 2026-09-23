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

public class Complex_subtract_60347678242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51;
     Object term54;
     Object term688;
     Object term689;
     Object term685;

    public Complex_subtract_60347678242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term51, term51.getClass(), "imaginary", 0.2852810965221698);
        setDoubleField(term51, term51.getClass(), "real", 0.6300849762307866);
        term54 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term54, term54.getClass(), "imaginary", 0.9737083944266686);
        setDoubleField(term54, term54.getClass(), "real", 0.0668892744806211);
        term688 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term688, term688.getClass(), "imaginary", 0.2852810965221698);
        setDoubleField(term688, term688.getClass(), "real", 0.6300849762307866);
        term689 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term689, term689.getClass(), "imaginary", 0.9737083944266686);
        setDoubleField(term689, term689.getClass(), "real", 0.0668892744806211);
        term685 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term685, term685.getClass(), "imaginary", -0.6884272979044987);
        setDoubleField(term685, term685.getClass(), "real", 0.5631957017501655);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term54;
        Object retValue = callMethod(klass, "subtract", argTypes, term51, args);
        assertTrue(recursiveEquals(term51, term688));
        assertTrue(recursiveEquals(term54, term689));
        assertTrue(recursiveEquals(retValue, term685));
    }

};


