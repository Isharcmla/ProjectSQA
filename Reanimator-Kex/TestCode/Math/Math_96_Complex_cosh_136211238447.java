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

public class Complex_cosh_136211238447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69;
     Object term1335;
     Object term1332;

    public Complex_cosh_136211238447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term69, term69.getClass(), "imaginary", 0.25937345430928016);
        setDoubleField(term69, term69.getClass(), "real", 0.5873228247510078);
        term1335 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term1335, term1335.getClass(), "imaginary", 0.25937345430928016);
        setDoubleField(term1335, term1335.getClass(), "real", 0.5873228247510078);
        term1332 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term1332, term1332.getClass(), "imaginary", 0.15944435785519426);
        setDoubleField(term1332, term1332.getClass(), "real", 1.1381032899698558);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "cosh", argTypes, term69, args);
        assertTrue(recursiveEquals(term69, term1335));
        assertTrue(recursiveEquals(retValue, term1332));
    }

};


