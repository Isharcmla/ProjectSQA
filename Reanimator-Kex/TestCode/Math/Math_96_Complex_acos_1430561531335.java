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

public class Complex_acos_1430561531335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73346;
     Object term73994;
     Object term73991;

    public Complex_acos_1430561531335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73346 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term73346, term73346.getClass(), "real", -9.2143648375832576E18);
        setDoubleField(term73346, term73346.getClass(), "imaginary", 9.007199254749184E15);
        term73994 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term73994, term73994.getClass(), "imaginary", 9.007199254749184E15);
        setDoubleField(term73994, term73994.getClass(), "real", -9.2143648375832576E18);
        term73991 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term73991, term73991.getClass(), "imaginary", -44.36044299395647);
        setDoubleField(term73991, term73991.getClass(), "real", 3.1406151367945934);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term73346, args);
        assertTrue(recursiveEquals(term73346, term73994));
        assertTrue(recursiveEquals(retValue, term73991));
    }

};


