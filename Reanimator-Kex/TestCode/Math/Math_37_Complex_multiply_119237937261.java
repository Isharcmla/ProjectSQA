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

public class Complex_multiply_119237937261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104;
     Object term109;
     Object term575;
     Object term564;

    public Complex_multiply_119237937261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term104, term104.getClass(), "imaginary", 0.8878841294187743);
        setDoubleField(term104, term104.getClass(), "real", 0.6588948704887806);
        setBooleanField(term104, term104.getClass(), "isNaN", true);
        setBooleanField(term104, term104.getClass(), "isInfinite", true);
        term109 = new Double(0.6397214730945112);
        term575 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term575, term575.getClass(), "imaginary", 0.8878841294187743);
        setDoubleField(term575, term575.getClass(), "real", 0.6588948704887806);
        setBooleanField(term575, term575.getClass(), "isNaN", true);
        setBooleanField(term575, term575.getClass(), "isInfinite", true);
        term564 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term564, term564.getClass(), "imaginary", Double.NaN);
        setDoubleField(term564, term564.getClass(), "real", Double.NaN);
        setBooleanField(term564, term564.getClass(), "isNaN", true);
        setBooleanField(term564, term564.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term109;
        Object retValue = callMethod(klass, "multiply", argTypes, term104, args);
        assertTrue(recursiveEquals(term104, term575));
        assertTrue(recursiveEquals(term109, 0.6397214730945112));
        assertTrue(recursiveEquals(retValue, term564));
    }

};


