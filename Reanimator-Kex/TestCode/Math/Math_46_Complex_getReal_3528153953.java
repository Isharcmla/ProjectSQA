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

public class Complex_getReal_3528153953 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78;
     Object term503;

    public Complex_getReal_3528153953() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term78, term78.getClass(), "imaginary", 0.7559240768573477);
        setDoubleField(term78, term78.getClass(), "real", 0.10667076642995188);
        setBooleanField(term78, term78.getClass(), "isNaN", true);
        setBooleanField(term78, term78.getClass(), "isInfinite", false);
        setBooleanField(term78, term78.getClass(), "isZero", true);
        term503 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term503, term503.getClass(), "imaginary", 0.7559240768573477);
        setDoubleField(term503, term503.getClass(), "real", 0.10667076642995188);
        setBooleanField(term503, term503.getClass(), "isNaN", true);
        setBooleanField(term503, term503.getClass(), "isInfinite", false);
        setBooleanField(term503, term503.getClass(), "isZero", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getReal", argTypes, term78, args);
        assertTrue(recursiveEquals(term78, term503));
        assertTrue(recursiveEquals(retValue, 0.10667076642995188));
    }

};


