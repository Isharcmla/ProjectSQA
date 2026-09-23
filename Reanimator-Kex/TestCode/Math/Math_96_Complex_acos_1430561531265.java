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

public class Complex_acos_1430561531265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49594;
     Object term50026;
     Object term50023;

    public Complex_acos_1430561531265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49594 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term49594, term49594.getClass(), "real", 2.3069689091205366E18);
        setDoubleField(term49594, term49594.getClass(), "imaginary", 1.8014673387388928E16);
        term50026 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term50026, term50026.getClass(), "imaginary", 1.8014673387388928E16);
        setDoubleField(term50026, term50026.getClass(), "real", 2.3069689091205366E18);
        term50023 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term50023, term50023.getClass(), "imaginary", -42.97564384459462);
        setDoubleField(term50023, term50023.getClass(), "real", 0.00780864760100617);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term49594, args);
        assertTrue(recursiveEquals(term49594, term50026));
        assertTrue(recursiveEquals(retValue, term50023));
    }

};


