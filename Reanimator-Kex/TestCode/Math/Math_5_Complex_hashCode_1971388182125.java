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

public class Complex_hashCode_1971388182125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17268;
     Object term17280;

    public Complex_hashCode_1971388182125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17268 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setBooleanField(term17268, term17268.getClass(), "isNaN", false);
        term17280 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term17280, term17280.getClass(), "imaginary", 0.0);
        setDoubleField(term17280, term17280.getClass(), "real", 0.0);
        setBooleanField(term17280, term17280.getClass(), "isNaN", false);
        setBooleanField(term17280, term17280.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term17268, args);
        assertTrue(recursiveEquals(term17268, term17280));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


