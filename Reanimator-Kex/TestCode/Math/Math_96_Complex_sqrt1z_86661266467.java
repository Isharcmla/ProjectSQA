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

public class Complex_sqrt1z_86661266467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2600;
     Object term2913;
     Object term2910;

    public Complex_sqrt1z_86661266467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2600 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term2600, term2600.getClass(), "real", 1.34217728E8);
        setDoubleField(term2600, term2600.getClass(), "imaginary", 131072.0);
        term2913 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term2913, term2913.getClass(), "imaginary", 131072.0);
        setDoubleField(term2913, term2913.getClass(), "real", 1.34217728E8);
        term2910 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term2910, term2910.getClass(), "imaginary", -1.34217728E8);
        setDoubleField(term2910, term2910.getClass(), "real", 131072.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "sqrt1z", argTypes, term2600, args);
        assertTrue(recursiveEquals(term2600, term2913));
        assertTrue(recursiveEquals(retValue, term2910));
    }

};


