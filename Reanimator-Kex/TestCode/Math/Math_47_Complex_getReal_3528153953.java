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
     Object term67;
     Object term489;

    public Complex_getReal_3528153953() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term67, term67.getClass(), "imaginary", 0.7559240768573477);
        setDoubleField(term67, term67.getClass(), "real", 0.10667076642995188);
        setBooleanField(term67, term67.getClass(), "isNaN", true);
        setBooleanField(term67, term67.getClass(), "isInfinite", true);
        term489 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term489, term489.getClass(), "imaginary", 0.7559240768573477);
        setDoubleField(term489, term489.getClass(), "real", 0.10667076642995188);
        setBooleanField(term489, term489.getClass(), "isNaN", true);
        setBooleanField(term489, term489.getClass(), "isInfinite", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getReal", argTypes, term67, args);
        assertTrue(recursiveEquals(term67, term489));
        assertTrue(recursiveEquals(retValue, 0.10667076642995188));
    }

};


