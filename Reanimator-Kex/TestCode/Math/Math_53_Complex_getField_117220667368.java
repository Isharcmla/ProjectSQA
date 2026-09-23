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

public class Complex_getField_117220667368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199;
     Object term3720;
     Object term3714;

    public Complex_getField_117220667368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term199 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term199, term199.getClass(), "imaginary", 0.0027299293098262956);
        setDoubleField(term199, term199.getClass(), "real", 0.29874017652881824);
        setBooleanField(term199, term199.getClass(), "isNaN", false);
        setBooleanField(term199, term199.getClass(), "isInfinite", false);
        term3720 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term3720, term3720.getClass(), "imaginary", 0.0027299293098262956);
        setDoubleField(term3720, term3720.getClass(), "real", 0.29874017652881824);
        setBooleanField(term3720, term3720.getClass(), "isNaN", false);
        setBooleanField(term3720, term3720.getClass(), "isInfinite", false);
        term3714 = newInstance(Class.forName("org.apache.commons.math.complex.ComplexField"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getField", argTypes, term199, args);
        assertTrue(recursiveEquals(term199, term3720));
        assertTrue(recursiveEquals(retValue, term3714));
    }

};


