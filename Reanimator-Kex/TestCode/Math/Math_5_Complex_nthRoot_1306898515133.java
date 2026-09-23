package org.apache.commons.math3.complex;

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
import static org.apache.commons.math3.complex.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.complex.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Double;

public class Complex_nthRoot_1306898515133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19134;
     Object term19154;
     Object term19144;

    public Complex_nthRoot_1306898515133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19134 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setBooleanField(term19134, term19134.getClass(), "isNaN", false);
        setBooleanField(term19134, term19134.getClass(), "isInfinite", true);
        term19154 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term19154, term19154.getClass(), "imaginary", 0.0);
        setDoubleField(term19154, term19154.getClass(), "real", 0.0);
        setBooleanField(term19154, term19154.getClass(), "isNaN", false);
        setBooleanField(term19154, term19154.getClass(), "isInfinite", true);
        Object term19146 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term19146, term19146.getClass(), "imaginary", Double.POSITIVE_INFINITY);
        setDoubleField(term19146, term19146.getClass(), "real", Double.POSITIVE_INFINITY);
        setBooleanField(term19146, term19146.getClass(), "isNaN", false);
        setBooleanField(term19146, term19146.getClass(), "isInfinite", true);
        term19144 = new ArrayList();
        ((ArrayList) term19144).add(term19146);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 1;
        Object retValue = callMethod(klass, "nthRoot", argTypes, term19134, args);
        assertTrue(recursiveEquals(term19134, term19154));
        assertTrue(recursiveEquals(retValue, term19144));
    }

};


