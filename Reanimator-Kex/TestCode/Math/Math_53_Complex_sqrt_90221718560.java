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

public class Complex_sqrt_90221718560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153;
     Object term2745;
     Object term2740;

    public Complex_sqrt_90221718560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term153 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term153, term153.getClass(), "imaginary", 0.43337207054070237);
        setDoubleField(term153, term153.getClass(), "real", 0.13246999699526574);
        setBooleanField(term153, term153.getClass(), "isNaN", false);
        setBooleanField(term153, term153.getClass(), "isInfinite", false);
        term2745 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term2745, term2745.getClass(), "imaginary", 0.43337207054070237);
        setDoubleField(term2745, term2745.getClass(), "real", 0.13246999699526574);
        setBooleanField(term2745, term2745.getClass(), "isNaN", false);
        setBooleanField(term2745, term2745.getClass(), "isInfinite", false);
        term2740 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term2740, term2740.getClass(), "imaginary", 0.40043492270797243);
        setDoubleField(term2740, term2740.getClass(), "real", 0.5411267174326229);
        setBooleanField(term2740, term2740.getClass(), "isNaN", false);
        setBooleanField(term2740, term2740.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "sqrt", argTypes, term153, args);
        assertTrue(recursiveEquals(term153, term2745));
        assertTrue(recursiveEquals(retValue, term2740));
    }

};


