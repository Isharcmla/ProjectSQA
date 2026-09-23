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

public class Complex_asin_1415968746169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25487;
     Object term25695;
     Object term25692;

    public Complex_asin_1415968746169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25487 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term25487, term25487.getClass(), "real", -9.0792524507324088E18);
        setDoubleField(term25487, term25487.getClass(), "imaginary", 2.8823037615171277E17);
        term25695 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term25695, term25695.getClass(), "imaginary", 2.8823037615171277E17);
        setDoubleField(term25695, term25695.getClass(), "real", -9.0792524507324088E18);
        term25692 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term25692, term25692.getClass(), "imaginary", Double.POSITIVE_INFINITY);
        setDoubleField(term25692, term25692.getClass(), "real", Double.POSITIVE_INFINITY);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term25487, args);
        assertTrue(recursiveEquals(term25487, term25695));
        assertTrue(recursiveEquals(retValue, term25692));
    }

};


