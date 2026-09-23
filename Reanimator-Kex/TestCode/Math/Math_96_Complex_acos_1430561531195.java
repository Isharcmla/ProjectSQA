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

public class Complex_acos_1430561531195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31515;
     Object term31718;
     Object term31715;

    public Complex_acos_1430561531195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31515 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term31515, term31515.getClass(), "real", -9.2188684361536635E18);
        setDoubleField(term31515, term31515.getClass(), "imaginary", -9.2188684372274053E18);
        term31718 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term31718, term31718.getClass(), "imaginary", -9.2188684372274053E18);
        setDoubleField(term31718, term31718.getClass(), "real", -9.2188684361536635E18);
        term31715 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term31715, term31715.getClass(), "imaginary", Double.POSITIVE_INFINITY);
        setDoubleField(term31715, term31715.getClass(), "real", Double.POSITIVE_INFINITY);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term31515, args);
        assertTrue(recursiveEquals(term31515, term31718));
        assertTrue(recursiveEquals(retValue, term31715));
    }

};


