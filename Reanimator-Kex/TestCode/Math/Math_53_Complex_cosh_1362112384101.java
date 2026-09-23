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

public class Complex_cosh_1362112384101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8423;
     Object term8435;
     Object term8425;

    public Complex_cosh_1362112384101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8423 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term8423, term8423.getClass(), "isNaN", true);
        term8435 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term8435, term8435.getClass(), "imaginary", 0.0);
        setDoubleField(term8435, term8435.getClass(), "real", 0.0);
        setBooleanField(term8435, term8435.getClass(), "isNaN", true);
        setBooleanField(term8435, term8435.getClass(), "isInfinite", false);
        term8425 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term8425, term8425.getClass(), "imaginary", Double.NaN);
        setDoubleField(term8425, term8425.getClass(), "real", Double.NaN);
        setBooleanField(term8425, term8425.getClass(), "isNaN", true);
        setBooleanField(term8425, term8425.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "cosh", argTypes, term8423, args);
        assertTrue(recursiveEquals(term8423, term8435));
        assertTrue(recursiveEquals(retValue, term8425));
    }

};


