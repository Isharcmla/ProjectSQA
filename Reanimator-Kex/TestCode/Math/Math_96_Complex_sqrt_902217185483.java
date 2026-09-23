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

public class Complex_sqrt_902217185483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120881;
     Object term121179;
     Object term121176;

    public Complex_sqrt_902217185483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120881 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term120881, term120881.getClass(), "real", -4.6116375690487885E18);
        setDoubleField(term120881, term120881.getClass(), "imaginary", -4.607133969421418E18);
        term121179 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term121179, term121179.getClass(), "imaginary", -4.607133969421418E18);
        setDoubleField(term121179, term121179.getClass(), "real", -4.6116375690487885E18);
        term121176 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term121176, term121176.getClass(), "imaginary", -2.3590564020356402E9);
        setDoubleField(term121176, term121176.getClass(), "real", 9.764781302909718E8);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "sqrt", argTypes, term120881, args);
        assertTrue(recursiveEquals(term120881, term121179));
        assertTrue(recursiveEquals(retValue, term121176));
    }

};


