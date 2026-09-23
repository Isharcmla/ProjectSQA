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

public class Complex_log_95678275129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16346;
     Object term16421;
     Object term16418;

    public Complex_log_95678275129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16346 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term16346, term16346.getClass(), "real", 9.2188684372274053E18);
        setDoubleField(term16346, term16346.getClass(), "imaginary", -9.2188684372274053E18);
        term16421 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term16421, term16421.getClass(), "imaginary", -9.2188684372274053E18);
        setDoubleField(term16421, term16421.getClass(), "real", 9.2188684372274053E18);
        term16418 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term16418, term16418.getClass(), "imaginary", -0.7853981633974483);
        setDoubleField(term16418, term16418.getClass(), "real", 44.01435756505842);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "log", argTypes, term16346, args);
        assertTrue(recursiveEquals(term16346, term16421));
        assertTrue(recursiveEquals(retValue, term16418));
    }

};


