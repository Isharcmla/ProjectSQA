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

public class Complex_getReal_3528153943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51;
     Object term391;

    public Complex_getReal_3528153943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term51, term51.getClass(), "imaginary", 0.4569171842750229);
        setDoubleField(term51, term51.getClass(), "real", 0.8598297828918529);
        setBooleanField(term51, term51.getClass(), "isNaN", false);
        setBooleanField(term51, term51.getClass(), "isInfinite", false);
        term391 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term391, term391.getClass(), "imaginary", 0.4569171842750229);
        setDoubleField(term391, term391.getClass(), "real", 0.8598297828918529);
        setBooleanField(term391, term391.getClass(), "isNaN", false);
        setBooleanField(term391, term391.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getReal", argTypes, term51, args);
        assertTrue(recursiveEquals(term51, term391));
        assertTrue(recursiveEquals(retValue, 0.8598297828918529));
    }

};


