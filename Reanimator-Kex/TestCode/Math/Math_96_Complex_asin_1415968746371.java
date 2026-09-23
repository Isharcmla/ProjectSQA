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

public class Complex_asin_1415968746371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86674;
     Object term87085;
     Object term87082;

    public Complex_asin_1415968746371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86674 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term86674, term86674.getClass(), "real", 1.44115188075855872E17);
        setDoubleField(term86674, term86674.getClass(), "imaginary", 1.8014398509483008E16);
        term87085 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term87085, term87085.getClass(), "imaginary", 1.8014398509483008E16);
        setDoubleField(term87085, term87085.getClass(), "real", 1.44115188075855872E17);
        term87082 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term87082, term87082.getClass(), "imaginary", Double.POSITIVE_INFINITY);
        setDoubleField(term87082, term87082.getClass(), "real", Double.POSITIVE_INFINITY);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term86674, args);
        assertTrue(recursiveEquals(term86674, term87085));
        assertTrue(recursiveEquals(retValue, term87082));
    }

};


