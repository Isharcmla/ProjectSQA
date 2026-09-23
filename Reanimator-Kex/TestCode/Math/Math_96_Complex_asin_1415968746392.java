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

public class Complex_asin_1415968746392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94156;
     Object term95098;
     Object term95095;

    public Complex_asin_1415968746392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94156 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term94156, term94156.getClass(), "real", -9.2143648376000348E18);
        setDoubleField(term94156, term94156.getClass(), "imaginary", 4.50361680723968E15);
        term95098 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term95098, term95098.getClass(), "imaginary", 4.50361680723968E15);
        setDoubleField(term95098, term95098.getClass(), "real", -9.2143648376000348E18);
        term95095 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term95095, term95095.getClass(), "imaginary", Double.POSITIVE_INFINITY);
        setDoubleField(term95095, term95095.getClass(), "real", Double.POSITIVE_INFINITY);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term94156, args);
        assertTrue(recursiveEquals(term94156, term95098));
        assertTrue(recursiveEquals(retValue, term95095));
    }

};


