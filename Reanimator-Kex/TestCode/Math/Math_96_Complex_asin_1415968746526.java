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

public class Complex_asin_1415968746526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134858;
     Object term135371;
     Object term135368;

    public Complex_asin_1415968746526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134858 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term134858, term134858.getClass(), "real", -9.2053576383431967E18);
        setDoubleField(term134858, term134858.getClass(), "imaginary", -9.2188332528553165E18);
        term135371 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term135371, term135371.getClass(), "imaginary", -9.2188332528553165E18);
        setDoubleField(term135371, term135371.getClass(), "real", -9.2053576383431967E18);
        term135368 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term135368, term135368.getClass(), "imaginary", -44.70677005512412);
        setDoubleField(term135368, term135368.getClass(), "real", -0.7846667547733881);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term134858, args);
        assertTrue(recursiveEquals(term134858, term135371));
        assertTrue(recursiveEquals(retValue, term135368));
    }

};


