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

public class Complex_abs_703710117160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14907;
     Object term14940;

    public Complex_abs_703710117160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14907 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term14907, term14907.getClass(), "isNaN", false);
        setBooleanField(term14907, term14907.getClass(), "isInfinite", false);
        setDoubleField(term14907, term14907.getClass(), "real", 0.0);
        term14940 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term14940, term14940.getClass(), "imaginary", 0.0);
        setDoubleField(term14940, term14940.getClass(), "real", 0.0);
        setBooleanField(term14940, term14940.getClass(), "isNaN", false);
        setBooleanField(term14940, term14940.getClass(), "isInfinite", false);
        setBooleanField(term14940, term14940.getClass(), "isZero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "abs", argTypes, term14907, args);
        assertTrue(recursiveEquals(term14907, term14940));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


