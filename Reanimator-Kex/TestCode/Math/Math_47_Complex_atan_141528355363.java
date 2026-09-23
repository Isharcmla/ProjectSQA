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
import java.lang.Double;

public class Complex_atan_141528355363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131;
     Object term1259;
     Object term1249;

    public Complex_atan_141528355363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term131, term131.getClass(), "imaginary", 0.8454723071922143);
        setDoubleField(term131, term131.getClass(), "real", 0.8566567697571895);
        setBooleanField(term131, term131.getClass(), "isNaN", true);
        setBooleanField(term131, term131.getClass(), "isInfinite", true);
        term1259 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term1259, term1259.getClass(), "imaginary", 0.8454723071922143);
        setDoubleField(term1259, term1259.getClass(), "real", 0.8566567697571895);
        setBooleanField(term1259, term1259.getClass(), "isNaN", true);
        setBooleanField(term1259, term1259.getClass(), "isInfinite", true);
        term1249 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term1249, term1249.getClass(), "imaginary", Double.NaN);
        setDoubleField(term1249, term1249.getClass(), "real", Double.NaN);
        setBooleanField(term1249, term1249.getClass(), "isNaN", true);
        setBooleanField(term1249, term1249.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "atan", argTypes, term131, args);
        assertTrue(recursiveEquals(term131, term1259));
        assertTrue(recursiveEquals(retValue, term1249));
    }

};


