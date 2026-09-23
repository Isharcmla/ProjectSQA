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
     Object term59;
     Object term65;
     Object term472;
     Object term473;

    public Complex_equals_118089943050() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term59, term59.getClass(), "imaginary", 0.8598297828918529);
        setDoubleField(term59, term59.getClass(), "real", 0.43692187681405226);
        setBooleanField(term59, term59.getClass(), "isNaN", true);
        setBooleanField(term59, term59.getClass(), "isInfinite", false);
        setBooleanField(term59, term59.getClass(), "isZero", false);
        term65 = newInstance(Class.forName("java.lang.Object"));
        term472 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term472, term472.getClass(), "imaginary", 0.8598297828918529);
        setDoubleField(term472, term472.getClass(), "real", 0.43692187681405226);
        setBooleanField(term472, term472.getClass(), "isNaN", true);
        setBooleanField(term472, term472.getClass(), "isInfinite", false);
        setBooleanField(term472, term472.getClass(), "isZero", false);
        term473 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term65;
        Object retValue = callMethod(klass, "equals", argTypes, term59, args);
        assertTrue(recursiveEquals(term59, term472));
        assertTrue(recursiveEquals(term65, term473));
        assertTrue(recursiveEquals(retValue, false));
    }

};


