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

public class Complex_asin_1415968746472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117529;
     Object term118319;
     Object term118316;

    public Complex_asin_1415968746472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117529 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term117529, term117529.getClass(), "real", -8.0698875822945075E18);
        setDoubleField(term117529, term117529.getClass(), "imaginary", 4.503599895805952E15);
        term118319 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term118319, term118319.getClass(), "imaginary", 4.503599895805952E15);
        setDoubleField(term118319, term118319.getClass(), "real", -8.0698875822945075E18);
        term118316 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term118316, term118316.getClass(), "imaginary", Double.POSITIVE_INFINITY);
        setDoubleField(term118316, term118316.getClass(), "real", Double.POSITIVE_INFINITY);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term117529, args);
        assertTrue(recursiveEquals(term117529, term118319));
        assertTrue(recursiveEquals(retValue, term118316));
    }

};


