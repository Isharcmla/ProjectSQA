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

public class Complex_acos_1430561531393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94674;
     Object term95306;
     Object term95303;

    public Complex_acos_1430561531393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94674 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term94674, term94674.getClass(), "real", -9.0792568487789117E18);
        setDoubleField(term94674, term94674.getClass(), "imaginary", -6.9175290276410819E18);
        term95306 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term95306, term95306.getClass(), "imaginary", -6.9175290276410819E18);
        setDoubleField(term95306, term95306.getClass(), "real", -9.0792568487789117E18);
        term95303 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term95303, term95303.getClass(), "imaginary", Double.POSITIVE_INFINITY);
        setDoubleField(term95303, term95303.getClass(), "real", Double.POSITIVE_INFINITY);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term94674, args);
        assertTrue(recursiveEquals(term94674, term95306));
        assertTrue(recursiveEquals(retValue, term95303));
    }

};


