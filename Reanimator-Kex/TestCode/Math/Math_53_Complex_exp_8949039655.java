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

public class Complex_exp_8949039655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123;
     Object term1432;
     Object term1422;

    public Complex_exp_8949039655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term123, term123.getClass(), "imaginary", 0.791695029600875);
        setDoubleField(term123, term123.getClass(), "real", 0.6862221294683138);
        setBooleanField(term123, term123.getClass(), "isNaN", true);
        setBooleanField(term123, term123.getClass(), "isInfinite", true);
        term1432 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term1432, term1432.getClass(), "imaginary", 0.791695029600875);
        setDoubleField(term1432, term1432.getClass(), "real", 0.6862221294683138);
        setBooleanField(term1432, term1432.getClass(), "isNaN", true);
        setBooleanField(term1432, term1432.getClass(), "isInfinite", true);
        term1422 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term1422, term1422.getClass(), "imaginary", Double.NaN);
        setDoubleField(term1422, term1422.getClass(), "real", Double.NaN);
        setBooleanField(term1422, term1422.getClass(), "isNaN", true);
        setBooleanField(term1422, term1422.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "exp", argTypes, term123, args);
        assertTrue(recursiveEquals(term123, term1432));
        assertTrue(recursiveEquals(retValue, term1422));
    }

};


