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

public class Complex_sqrt1z_866612664117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19397;
     Object term19539;
     Object term19534;

    public Complex_sqrt1z_866612664117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19397 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term19397, term19397.getClass(), "isNaN", false);
        setDoubleField(term19397, term19397.getClass(), "real", 0.0);
        setDoubleField(term19397, term19397.getClass(), "imaginary", 9.2188684372274053E18);
        term19539 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term19539, term19539.getClass(), "imaginary", 9.2188684372274053E18);
        setDoubleField(term19539, term19539.getClass(), "real", 0.0);
        setBooleanField(term19539, term19539.getClass(), "isNaN", false);
        setBooleanField(term19539, term19539.getClass(), "isInfinite", false);
        term19534 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term19534, term19534.getClass(), "imaginary", 0.0);
        setDoubleField(term19534, term19534.getClass(), "real", 9.2188684372274053E18);
        setBooleanField(term19534, term19534.getClass(), "isNaN", false);
        setBooleanField(term19534, term19534.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "sqrt1z", argTypes, term19397, args);
        assertTrue(recursiveEquals(term19397, term19539));
        assertTrue(recursiveEquals(retValue, term19534));
    }

};


