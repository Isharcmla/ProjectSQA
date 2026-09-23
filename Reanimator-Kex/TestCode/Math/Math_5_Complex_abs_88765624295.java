package org.apache.commons.math3.complex;

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
import static org.apache.commons.math3.complex.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.complex.EqualityUtils.*;

public class Complex_abs_88765624295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11699;
     Object term11729;

    public Complex_abs_88765624295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11699 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setBooleanField(term11699, term11699.getClass(), "isNaN", false);
        setBooleanField(term11699, term11699.getClass(), "isInfinite", false);
        setDoubleField(term11699, term11699.getClass(), "real", -9.2053576383452938E18);
        term11729 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term11729, term11729.getClass(), "imaginary", 0.0);
        setDoubleField(term11729, term11729.getClass(), "real", -9.2053576383452938E18);
        setBooleanField(term11729, term11729.getClass(), "isNaN", false);
        setBooleanField(term11729, term11729.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "abs", argTypes, term11699, args);
        assertTrue(recursiveEquals(term11699, term11729));
        assertTrue(recursiveEquals(retValue, 9.2053576383452938E18));
    }

};


