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

public class Complex_sqrt_902217185138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23880;
     Object term23944;
     Object term23939;

    public Complex_sqrt_902217185138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23880 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term23880, term23880.getClass(), "isNaN", false);
        setDoubleField(term23880, term23880.getClass(), "real", 9.007199254741504E15);
        setBooleanField(term23880, term23880.getClass(), "isInfinite", false);
        setDoubleField(term23880, term23880.getClass(), "imaginary", 0.0);
        term23944 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term23944, term23944.getClass(), "imaginary", 0.0);
        setDoubleField(term23944, term23944.getClass(), "real", 9.007199254741504E15);
        setBooleanField(term23944, term23944.getClass(), "isNaN", false);
        setBooleanField(term23944, term23944.getClass(), "isInfinite", false);
        term23939 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term23939, term23939.getClass(), "imaginary", 0.0);
        setDoubleField(term23939, term23939.getClass(), "real", 9.490626562425426E7);
        setBooleanField(term23939, term23939.getClass(), "isNaN", false);
        setBooleanField(term23939, term23939.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "sqrt", argTypes, term23880, args);
        assertTrue(recursiveEquals(term23880, term23944));
        assertTrue(recursiveEquals(retValue, term23939));
    }

};


