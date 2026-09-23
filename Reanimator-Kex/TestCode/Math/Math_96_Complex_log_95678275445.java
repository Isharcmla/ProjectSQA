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

public class Complex_log_95678275445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110321;
     Object term111191;
     Object term111188;

    public Complex_log_95678275445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110321 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term110321, term110321.getClass(), "real", 0.0);
        setDoubleField(term110321, term110321.getClass(), "imaginary", 0.0);
        term111191 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term111191, term111191.getClass(), "imaginary", 0.0);
        setDoubleField(term111191, term111191.getClass(), "real", 0.0);
        term111188 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term111188, term111188.getClass(), "imaginary", 0.0);
        setDoubleField(term111188, term111188.getClass(), "real", Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "log", argTypes, term110321, args);
        assertTrue(recursiveEquals(term110321, term111191));
        assertTrue(recursiveEquals(retValue, term111188));
    }

};


