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

public class Complex_asin_1415968746294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58906;
     Object term59455;
     Object term59452;

    public Complex_asin_1415968746294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58906 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term58906, term58906.getClass(), "real", 16.0);
        setDoubleField(term58906, term58906.getClass(), "imaginary", 4.503599627501568E15);
        term59455 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term59455, term59455.getClass(), "imaginary", 4.503599627501568E15);
        setDoubleField(term59455, term59455.getClass(), "real", 16.0);
        term59452 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term59452, term59452.getClass(), "imaginary", Double.POSITIVE_INFINITY);
        setDoubleField(term59452, term59452.getClass(), "real", Double.POSITIVE_INFINITY);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term58906, args);
        assertTrue(recursiveEquals(term58906, term59455));
        assertTrue(recursiveEquals(retValue, term59452));
    }

};


