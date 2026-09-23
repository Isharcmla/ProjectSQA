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

public class Complex_acos_1430561531299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60880;
     Object term61096;
     Object term61093;

    public Complex_acos_1430561531299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60880 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term60880, term60880.getClass(), "real", -9.2031058385316086E18);
        setDoubleField(term60880, term60880.getClass(), "imaginary", 1.15292150460710912E18);
        term61096 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term61096, term61096.getClass(), "imaginary", 1.15292150460710912E18);
        setDoubleField(term61096, term61096.getClass(), "real", -9.2031058385316086E18);
        term61093 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term61093, term61093.getClass(), "imaginary", -44.36700588062787);
        setDoubleField(term61093, term61093.getClass(), "real", 3.016966640018081);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term60880, args);
        assertTrue(recursiveEquals(term60880, term61096));
        assertTrue(recursiveEquals(retValue, term61093));
    }

};


