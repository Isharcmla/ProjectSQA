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

public class Complex_multiply_1787255358424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105895;
     Object term105979;
     Object term106491;
     Object term106492;
     Object term106488;

    public Complex_multiply_1787255358424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105895 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term105895, term105895.getClass(), "real", -9.2188682997884518E18);
        setDoubleField(term105895, term105895.getClass(), "imaginary", 9.2188684372274053E18);
        term105979 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term105979, term105979.getClass(), "real", -9.2166166374137201E18);
        setDoubleField(term105979, term105979.getClass(), "imaginary", -9.2166166374137201E18);
        term106491 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term106491, term106491.getClass(), "imaginary", 9.2188684372274053E18);
        setDoubleField(term106491, term106491.getClass(), "real", -9.2188682997884518E18);
        term106492 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term106492, term106492.getClass(), "imaginary", -9.2166166374137201E18);
        setDoubleField(term106492, term106492.getClass(), "real", -9.2166166374137201E18);
        term106488 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term106488, term106488.getClass(), "imaginary", -1.2667221451987654E30);
        setDoubleField(term106488, term106488.getClass(), "real", 1.699335511666345E38);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term105979;
        Object retValue = callMethod(klass, "multiply", argTypes, term105895, args);
        assertTrue(recursiveEquals(term105895, term106491));
        assertTrue(recursiveEquals(term105979, term106492));
        assertTrue(recursiveEquals(retValue, term106488));
    }

};


