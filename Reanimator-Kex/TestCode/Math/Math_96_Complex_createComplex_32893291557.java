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

public class Complex_createComplex_32893291557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102;
     Object term105;
     Object term107;
     Object term1679;
     Object term1671;

    public Complex_createComplex_32893291557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term102, term102.getClass(), "imaginary", 0.022483645678509023);
        setDoubleField(term102, term102.getClass(), "real", 0.025133051616627267);
        term105 = new Double(0.016575281023182953);
        term107 = new Double(0.5308350402051779);
        term1679 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term1679, term1679.getClass(), "imaginary", 0.022483645678509023);
        setDoubleField(term1679, term1679.getClass(), "real", 0.025133051616627267);
        term1671 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term1671, term1671.getClass(), "imaginary", 0.5308350402051779);
        setDoubleField(term1671, term1671.getClass(), "real", 0.016575281023182953);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term105;
        args[1] = term107;
        Object retValue = callMethod(klass, "createComplex", argTypes, term102, args);
        assertTrue(recursiveEquals(term102, term1679));
        assertTrue(recursiveEquals(term105, 0.016575281023182953));
        assertTrue(recursiveEquals(term107, 0.5308350402051779));
        assertTrue(recursiveEquals(retValue, term1671));
    }

};


