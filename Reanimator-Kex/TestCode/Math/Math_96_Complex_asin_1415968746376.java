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

public class Complex_asin_1415968746376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88296;
     Object term89308;
     Object term89305;

    public Complex_asin_1415968746376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88296 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term88296, term88296.getClass(), "real", 4.6116860184273889E18);
        setDoubleField(term88296, term88296.getClass(), "imaginary", 16.0);
        term89308 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term89308, term89308.getClass(), "imaginary", 16.0);
        setDoubleField(term89308, term89308.getClass(), "real", 4.6116860184273889E18);
        term89305 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term89305, term89305.getClass(), "imaginary", Double.POSITIVE_INFINITY);
        setDoubleField(term89305, term89305.getClass(), "real", Double.POSITIVE_INFINITY);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term88296, args);
        assertTrue(recursiveEquals(term88296, term89308));
        assertTrue(recursiveEquals(retValue, term89305));
    }

};


