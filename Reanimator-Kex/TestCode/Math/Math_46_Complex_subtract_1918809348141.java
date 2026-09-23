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

public class Complex_subtract_1918809348141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10639;
     Object term10654;
     Object term10641;

    public Complex_subtract_1918809348141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10639 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term10639, term10639.getClass(), "isNaN", true);
        term10654 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term10654, term10654.getClass(), "imaginary", 0.0);
        setDoubleField(term10654, term10654.getClass(), "real", 0.0);
        setBooleanField(term10654, term10654.getClass(), "isNaN", true);
        setBooleanField(term10654, term10654.getClass(), "isInfinite", false);
        setBooleanField(term10654, term10654.getClass(), "isZero", false);
        term10641 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term10641, term10641.getClass(), "imaginary", Double.NaN);
        setDoubleField(term10641, term10641.getClass(), "real", Double.NaN);
        setBooleanField(term10641, term10641.getClass(), "isNaN", true);
        setBooleanField(term10641, term10641.getClass(), "isInfinite", false);
        setBooleanField(term10641, term10641.getClass(), "isZero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 0.0;
        Object retValue = callMethod(klass, "subtract", argTypes, term10639, args);
        assertTrue(recursiveEquals(term10639, term10654));
        assertTrue(recursiveEquals(retValue, term10641));
    }

};


