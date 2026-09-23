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

public class Complex_acos_143056153169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3515;
     Object term3731;
     Object term3728;

    public Complex_acos_143056153169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3515 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term3515, term3515.getClass(), "real", 1.8014398511579136E16);
        setDoubleField(term3515, term3515.getClass(), "imaginary", 2.147483648E9);
        term3731 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term3731, term3731.getClass(), "imaginary", 2.147483648E9);
        setDoubleField(term3731, term3731.getClass(), "real", 1.8014398511579136E16);
        term3728 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term3728, term3728.getClass(), "imaginary", -38.12309493091342);
        setDoubleField(term3728, term3728.getClass(), "real", 1.1920928953690289E-7);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term3515, args);
        assertTrue(recursiveEquals(term3515, term3731));
        assertTrue(recursiveEquals(retValue, term3728));
    }

};


