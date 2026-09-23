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

public class Complex_sqrt1z_86661266473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222;
     Object term3095;
     Object term3089;

    public Complex_sqrt1z_86661266473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term222 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term222, term222.getClass(), "imaginary", 0.6767213143579776);
        setDoubleField(term222, term222.getClass(), "real", 0.48862955528902696);
        setBooleanField(term222, term222.getClass(), "isNaN", false);
        setBooleanField(term222, term222.getClass(), "isInfinite", false);
        setBooleanField(term222, term222.getClass(), "isZero", true);
        term3095 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term3095, term3095.getClass(), "imaginary", 0.6767213143579776);
        setDoubleField(term3095, term3095.getClass(), "real", 0.48862955528902696);
        setBooleanField(term3095, term3095.getClass(), "isNaN", false);
        setBooleanField(term3095, term3095.getClass(), "isInfinite", false);
        setBooleanField(term3095, term3095.getClass(), "isZero", true);
        term3089 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term3089, term3089.getClass(), "imaginary", -0.28966807538421646);
        setDoubleField(term3089, term3089.getClass(), "real", 1.1415342697007536);
        setBooleanField(term3089, term3089.getClass(), "isNaN", false);
        setBooleanField(term3089, term3089.getClass(), "isInfinite", false);
        setBooleanField(term3089, term3089.getClass(), "isZero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "sqrt1z", argTypes, term222, args);
        assertTrue(recursiveEquals(term222, term3095));
        assertTrue(recursiveEquals(retValue, term3089));
    }

};


