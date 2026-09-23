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

public class Complex_tanh_88849506697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8192;
     Object term8204;
     Object term8194;

    public Complex_tanh_88849506697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8192 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term8192, term8192.getClass(), "isNaN", true);
        term8204 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term8204, term8204.getClass(), "imaginary", 0.0);
        setDoubleField(term8204, term8204.getClass(), "real", 0.0);
        setBooleanField(term8204, term8204.getClass(), "isNaN", true);
        setBooleanField(term8204, term8204.getClass(), "isInfinite", false);
        term8194 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term8194, term8194.getClass(), "imaginary", Double.NaN);
        setDoubleField(term8194, term8194.getClass(), "real", Double.NaN);
        setBooleanField(term8194, term8194.getClass(), "isNaN", true);
        setBooleanField(term8194, term8194.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "tanh", argTypes, term8192, args);
        assertTrue(recursiveEquals(term8192, term8204));
        assertTrue(recursiveEquals(retValue, term8194));
    }

};


