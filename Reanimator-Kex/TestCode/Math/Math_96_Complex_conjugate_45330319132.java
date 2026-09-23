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

public class Complex_conjugate_45330319132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14;
     Object term169;
     Object term166;

    public Complex_conjugate_45330319132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term14, term14.getClass(), "imaginary", 0.6076495596892013);
        setDoubleField(term14, term14.getClass(), "real", 0.37773193782763337);
        term169 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term169, term169.getClass(), "imaginary", 0.6076495596892013);
        setDoubleField(term169, term169.getClass(), "real", 0.37773193782763337);
        term166 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term166, term166.getClass(), "imaginary", -0.6076495596892013);
        setDoubleField(term166, term166.getClass(), "real", 0.37773193782763337);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "conjugate", argTypes, term14, args);
        assertTrue(recursiveEquals(term14, term169));
        assertTrue(recursiveEquals(retValue, term166));
    }

};


