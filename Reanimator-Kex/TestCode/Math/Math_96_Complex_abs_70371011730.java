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

public class Complex_abs_70371011730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5;
     Object term135;

    public Complex_abs_70371011730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term5, term5.getClass(), "imaginary", 0.5523635872663106);
        setDoubleField(term5, term5.getClass(), "real", 0.544608645520025);
        term135 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term135, term135.getClass(), "imaginary", 0.5523635872663106);
        setDoubleField(term135, term135.getClass(), "real", 0.544608645520025);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "abs", argTypes, term5, args);
        assertTrue(recursiveEquals(term5, term135));
        assertTrue(recursiveEquals(retValue, 0.7756958871315893));
    }

};


