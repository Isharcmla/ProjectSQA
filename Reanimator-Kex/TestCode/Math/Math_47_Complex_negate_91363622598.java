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

public class Complex_negate_91363622598 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6116;
     Object term6154;
     Object term6149;

    public Complex_negate_91363622598() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6116 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term6116, term6116.getClass(), "isNaN", false);
        setDoubleField(term6116, term6116.getClass(), "real", -4.503599627370496E15);
        setDoubleField(term6116, term6116.getClass(), "imaginary", -9.223372036854776E18);
        term6154 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term6154, term6154.getClass(), "imaginary", -9.223372036854776E18);
        setDoubleField(term6154, term6154.getClass(), "real", -4.503599627370496E15);
        setBooleanField(term6154, term6154.getClass(), "isNaN", false);
        setBooleanField(term6154, term6154.getClass(), "isInfinite", false);
        term6149 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term6149, term6149.getClass(), "imaginary", 9.223372036854776E18);
        setDoubleField(term6149, term6149.getClass(), "real", 4.503599627370496E15);
        setBooleanField(term6149, term6149.getClass(), "isNaN", false);
        setBooleanField(term6149, term6149.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "negate", argTypes, term6116, args);
        assertTrue(recursiveEquals(term6116, term6154));
        assertTrue(recursiveEquals(retValue, term6149));
    }

};


