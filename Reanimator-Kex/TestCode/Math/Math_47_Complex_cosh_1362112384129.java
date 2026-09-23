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

public class Complex_cosh_1362112384129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9909;
     Object term9921;
     Object term9911;

    public Complex_cosh_1362112384129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9909 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term9909, term9909.getClass(), "isNaN", true);
        term9921 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term9921, term9921.getClass(), "imaginary", 0.0);
        setDoubleField(term9921, term9921.getClass(), "real", 0.0);
        setBooleanField(term9921, term9921.getClass(), "isNaN", true);
        setBooleanField(term9921, term9921.getClass(), "isInfinite", false);
        term9911 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term9911, term9911.getClass(), "imaginary", Double.NaN);
        setDoubleField(term9911, term9911.getClass(), "real", Double.NaN);
        setBooleanField(term9911, term9911.getClass(), "isNaN", true);
        setBooleanField(term9911, term9911.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "cosh", argTypes, term9909, args);
        assertTrue(recursiveEquals(term9909, term9921));
        assertTrue(recursiveEquals(retValue, term9911));
    }

};


