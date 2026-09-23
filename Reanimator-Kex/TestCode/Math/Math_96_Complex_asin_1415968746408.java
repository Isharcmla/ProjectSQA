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

public class Complex_asin_1415968746408 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100218;
     Object term100926;
     Object term100923;

    public Complex_asin_1415968746408() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100218 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term100218, term100218.getClass(), "real", 3.6029896530591744E16);
        setDoubleField(term100218, term100218.getClass(), "imaginary", 7.2057594037993472E16);
        term100926 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term100926, term100926.getClass(), "imaginary", 7.2057594037993472E16);
        setDoubleField(term100926, term100926.getClass(), "real", 3.6029896530591744E16);
        term100923 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term100923, term100923.getClass(), "imaginary", Double.POSITIVE_INFINITY);
        setDoubleField(term100923, term100923.getClass(), "real", Double.POSITIVE_INFINITY);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term100218, args);
        assertTrue(recursiveEquals(term100218, term100926));
        assertTrue(recursiveEquals(retValue, term100923));
    }

};


