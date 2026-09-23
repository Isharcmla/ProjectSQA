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

public class Complex_acos_143056153161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142;
     Object term671;
     Object term659;

    public Complex_acos_143056153161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term142, term142.getClass(), "imaginary", 0.791695029600875);
        setDoubleField(term142, term142.getClass(), "real", 0.6862221294683138);
        setBooleanField(term142, term142.getClass(), "isNaN", true);
        setBooleanField(term142, term142.getClass(), "isInfinite", false);
        setBooleanField(term142, term142.getClass(), "isZero", false);
        term671 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term671, term671.getClass(), "imaginary", 0.791695029600875);
        setDoubleField(term671, term671.getClass(), "real", 0.6862221294683138);
        setBooleanField(term671, term671.getClass(), "isNaN", true);
        setBooleanField(term671, term671.getClass(), "isInfinite", false);
        setBooleanField(term671, term671.getClass(), "isZero", false);
        term659 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term659, term659.getClass(), "imaginary", Double.NaN);
        setDoubleField(term659, term659.getClass(), "real", Double.NaN);
        setBooleanField(term659, term659.getClass(), "isNaN", true);
        setBooleanField(term659, term659.getClass(), "isInfinite", false);
        setBooleanField(term659, term659.getClass(), "isZero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term142, args);
        assertTrue(recursiveEquals(term142, term671));
        assertTrue(recursiveEquals(retValue, term659));
    }

};


