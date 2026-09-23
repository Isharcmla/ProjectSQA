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

public class Complex_conjugate_45330319138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20;
     Object term299;
     Object term289;

    public Complex_conjugate_45330319138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term20, term20.getClass(), "imaginary", 0.6076495596892013);
        setDoubleField(term20, term20.getClass(), "real", 0.37773193782763337);
        setBooleanField(term20, term20.getClass(), "isNaN", true);
        setBooleanField(term20, term20.getClass(), "isInfinite", true);
        term299 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term299, term299.getClass(), "imaginary", 0.6076495596892013);
        setDoubleField(term299, term299.getClass(), "real", 0.37773193782763337);
        setBooleanField(term299, term299.getClass(), "isNaN", true);
        setBooleanField(term299, term299.getClass(), "isInfinite", true);
        term289 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term289, term289.getClass(), "imaginary", Double.NaN);
        setDoubleField(term289, term289.getClass(), "real", Double.NaN);
        setBooleanField(term289, term289.getClass(), "isNaN", true);
        setBooleanField(term289, term289.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "conjugate", argTypes, term20, args);
        assertTrue(recursiveEquals(term20, term299));
        assertTrue(recursiveEquals(retValue, term289));
    }

};


