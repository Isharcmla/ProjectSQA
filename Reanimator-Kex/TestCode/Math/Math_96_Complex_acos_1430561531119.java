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

public class Complex_acos_1430561531119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14342;
     Object term14550;
     Object term14547;

    public Complex_acos_1430561531119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14342 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term14342, term14342.getClass(), "real", -9.2188684372274053E18);
        setDoubleField(term14342, term14342.getClass(), "imaginary", -9.218868437226881E18);
        term14550 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term14550, term14550.getClass(), "imaginary", -9.218868437226881E18);
        setDoubleField(term14550, term14550.getClass(), "real", -9.2188684372274053E18);
        term14547 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term14547, term14547.getClass(), "imaginary", Double.POSITIVE_INFINITY);
        setDoubleField(term14547, term14547.getClass(), "real", Double.POSITIVE_INFINITY);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term14342, args);
        assertTrue(recursiveEquals(term14342, term14550));
        assertTrue(recursiveEquals(retValue, term14547));
    }

};


