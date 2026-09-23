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

public class Complex_acos_1430561531402 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97694;
     Object term98614;
     Object term98611;

    public Complex_acos_1430561531402() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97694 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term97694, term97694.getClass(), "real", 1.4411518808424448E17);
        setDoubleField(term97694, term97694.getClass(), "imaginary", -9.2188684350799217E18);
        term98614 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term98614, term98614.getClass(), "imaginary", -9.2188684350799217E18);
        setDoubleField(term98614, term98614.getClass(), "real", 1.4411518808424448E17);
        term98611 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term98611, term98611.getClass(), "imaginary", Double.POSITIVE_INFINITY);
        setDoubleField(term98611, term98611.getClass(), "real", Double.POSITIVE_INFINITY);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term97694, args);
        assertTrue(recursiveEquals(term97694, term98614));
        assertTrue(recursiveEquals(retValue, term98611));
    }

};


