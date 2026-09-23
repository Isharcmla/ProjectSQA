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

public class Complex_asin_1415968746381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90449;
     Object term90868;
     Object term90865;

    public Complex_asin_1415968746381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90449 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term90449, term90449.getClass(), "real", 128.0);
        setDoubleField(term90449, term90449.getClass(), "imaginary", 2.3080948090273792E18);
        term90868 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term90868, term90868.getClass(), "imaginary", 2.3080948090273792E18);
        setDoubleField(term90868, term90868.getClass(), "real", 128.0);
        term90865 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term90865, term90865.getClass(), "imaginary", Double.POSITIVE_INFINITY);
        setDoubleField(term90865, term90865.getClass(), "real", Double.POSITIVE_INFINITY);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term90449, args);
        assertTrue(recursiveEquals(term90449, term90868));
        assertTrue(recursiveEquals(retValue, term90865));
    }

};


