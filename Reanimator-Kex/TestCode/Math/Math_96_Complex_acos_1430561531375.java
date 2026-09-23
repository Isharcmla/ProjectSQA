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

public class Complex_acos_1430561531375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87697;
     Object term89100;
     Object term89097;

    public Complex_acos_1430561531375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87697 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term87697, term87697.getClass(), "real", -9.2233720367876669E18);
        setDoubleField(term87697, term87697.getClass(), "imaginary", -9.223372036854776E18);
        term89100 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term89100, term89100.getClass(), "imaginary", -9.223372036854776E18);
        setDoubleField(term89100, term89100.getClass(), "real", -9.2233720367876669E18);
        term89097 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term89097, term89097.getClass(), "imaginary", Double.POSITIVE_INFINITY);
        setDoubleField(term89097, term89097.getClass(), "real", Double.POSITIVE_INFINITY);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term87697, args);
        assertTrue(recursiveEquals(term87697, term89100));
        assertTrue(recursiveEquals(retValue, term89097));
    }

};


