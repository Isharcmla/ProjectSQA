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

public class Complex_acos_1430561531308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63710;
     Object term64500;
     Object term64497;

    public Complex_acos_1430561531308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63710 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term63710, term63710.getClass(), "real", 5.7653112104760115E17);
        setDoubleField(term63710, term63710.getClass(), "imaginary", -4.6116860183938335E18);
        term64500 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term64500, term64500.getClass(), "imaginary", -4.6116860183938335E18);
        setDoubleField(term64500, term64500.getClass(), "real", 5.7653112104760115E17);
        term64497 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term64497, term64497.getClass(), "imaginary", Double.POSITIVE_INFINITY);
        setDoubleField(term64497, term64497.getClass(), "real", Double.POSITIVE_INFINITY);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term63710, args);
        assertTrue(recursiveEquals(term63710, term64500));
        assertTrue(recursiveEquals(retValue, term64497));
    }

};


