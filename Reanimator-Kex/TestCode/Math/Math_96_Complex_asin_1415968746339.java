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

public class Complex_asin_1415968746339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75189;
     Object term75613;
     Object term75610;

    public Complex_asin_1415968746339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75189 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term75189, term75189.getClass(), "real", 3.602880560889856E16);
        setDoubleField(term75189, term75189.getClass(), "imaginary", 4.50387450527744E15);
        term75613 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term75613, term75613.getClass(), "imaginary", 4.50387450527744E15);
        setDoubleField(term75613, term75613.getClass(), "real", 3.602880560889856E16);
        term75610 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term75610, term75610.getClass(), "imaginary", Double.POSITIVE_INFINITY);
        setDoubleField(term75610, term75610.getClass(), "real", Double.POSITIVE_INFINITY);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term75189, args);
        assertTrue(recursiveEquals(term75189, term75613));
        assertTrue(recursiveEquals(retValue, term75610));
    }

};


