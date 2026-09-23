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

public class Complex_acos_1430561531370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86076;
     Object term86877;
     Object term86874;

    public Complex_acos_1430561531370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86076 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term86076, term86076.getClass(), "real", -9.2053576383452938E18);
        setDoubleField(term86076, term86076.getClass(), "imaginary", -9.2188684372274053E18);
        term86877 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term86877, term86877.getClass(), "imaginary", -9.2188684372274053E18);
        setDoubleField(term86877, term86877.getClass(), "real", -9.2053576383452938E18);
        term86874 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term86874, term86874.getClass(), "imaginary", Double.POSITIVE_INFINITY);
        setDoubleField(term86874, term86874.getClass(), "real", Double.POSITIVE_INFINITY);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term86076, args);
        assertTrue(recursiveEquals(term86076, term86877));
        assertTrue(recursiveEquals(retValue, term86874));
    }

};


