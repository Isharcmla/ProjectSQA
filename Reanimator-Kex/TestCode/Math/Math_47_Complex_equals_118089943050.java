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

public class Complex_equals_118089943050 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51;
     Object term56;
     Object term455;
     Object term456;

    public Complex_equals_118089943050() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term51, term51.getClass(), "imaginary", 0.8598297828918529);
        setDoubleField(term51, term51.getClass(), "real", 0.43692187681405226);
        setBooleanField(term51, term51.getClass(), "isNaN", true);
        setBooleanField(term51, term51.getClass(), "isInfinite", true);
        term56 = newInstance(Class.forName("java.lang.Object"));
        term455 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term455, term455.getClass(), "imaginary", 0.8598297828918529);
        setDoubleField(term455, term455.getClass(), "real", 0.43692187681405226);
        setBooleanField(term455, term455.getClass(), "isNaN", true);
        setBooleanField(term455, term455.getClass(), "isInfinite", true);
        term456 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term56;
        Object retValue = callMethod(klass, "equals", argTypes, term51, args);
        assertTrue(recursiveEquals(term51, term455));
        assertTrue(recursiveEquals(term56, term456));
        assertTrue(recursiveEquals(retValue, false));
    }

};


