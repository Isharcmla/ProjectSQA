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

public class Complex_abs_703710117111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9692;
     Object term9722;

    public Complex_abs_703710117111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9692 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term9692, term9692.getClass(), "isNaN", false);
        setBooleanField(term9692, term9692.getClass(), "isInfinite", false);
        setDoubleField(term9692, term9692.getClass(), "real", -9.2053576383452938E18);
        term9722 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term9722, term9722.getClass(), "imaginary", 0.0);
        setDoubleField(term9722, term9722.getClass(), "real", -9.2053576383452938E18);
        setBooleanField(term9722, term9722.getClass(), "isNaN", false);
        setBooleanField(term9722, term9722.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "abs", argTypes, term9692, args);
        assertTrue(recursiveEquals(term9692, term9722));
        assertTrue(recursiveEquals(retValue, 9.2053576383452938E18));
    }

};


