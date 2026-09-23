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
import java.lang.Double;

public class Complex_add_177174436948 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22;
     Object term27;
     Object term606;
     Object term595;

    public Complex_add_177174436948() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term22, term22.getClass(), "imaginary", 0.37773193782763337);
        setDoubleField(term22, term22.getClass(), "real", 0.8474802076607362);
        setBooleanField(term22, term22.getClass(), "isNaN", true);
        setBooleanField(term22, term22.getClass(), "isInfinite", true);
        term27 = new Double(0.5183269973490326);
        term606 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term606, term606.getClass(), "imaginary", 0.37773193782763337);
        setDoubleField(term606, term606.getClass(), "real", 0.8474802076607362);
        setBooleanField(term606, term606.getClass(), "isNaN", true);
        setBooleanField(term606, term606.getClass(), "isInfinite", true);
        term595 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term595, term595.getClass(), "imaginary", Double.NaN);
        setDoubleField(term595, term595.getClass(), "real", Double.NaN);
        setBooleanField(term595, term595.getClass(), "isNaN", true);
        setBooleanField(term595, term595.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term27;
        Object retValue = callMethod(klass, "add", argTypes, term22, args);
        assertTrue(recursiveEquals(term22, term606));
        assertTrue(recursiveEquals(term27, 0.5183269973490326));
        assertTrue(recursiveEquals(retValue, term595));
    }

};


