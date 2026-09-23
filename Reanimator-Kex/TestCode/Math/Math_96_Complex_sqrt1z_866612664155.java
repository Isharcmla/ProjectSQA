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

public class Complex_sqrt1z_866612664155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22124;
     Object term22216;
     Object term22213;

    public Complex_sqrt1z_866612664155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22124 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term22124, term22124.getClass(), "real", 1.6777216E7);
        setDoubleField(term22124, term22124.getClass(), "imaginary", -4.6116860184273715E18);
        term22216 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term22216, term22216.getClass(), "imaginary", -4.6116860184273715E18);
        setDoubleField(term22216, term22216.getClass(), "real", 1.6777216E7);
        term22213 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term22213, term22213.getClass(), "imaginary", 1.6777216E7);
        setDoubleField(term22213, term22213.getClass(), "real", 4.6116860184273715E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "sqrt1z", argTypes, term22124, args);
        assertTrue(recursiveEquals(term22124, term22216));
        assertTrue(recursiveEquals(retValue, term22213));
    }

};


