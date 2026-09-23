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

public class Complex_acos_1430561531286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56164;
     Object term56972;
     Object term56969;

    public Complex_acos_1430561531286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56164 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term56164, term56164.getClass(), "real", -8.9351240685170196E18);
        setDoubleField(term56164, term56164.getClass(), "imaginary", 1.6777216E7);
        term56972 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term56972, term56972.getClass(), "imaginary", 1.6777216E7);
        setDoubleField(term56972, term56972.getClass(), "real", -8.9351240685170196E18);
        term56969 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term56969, term56969.getClass(), "imaginary", -44.32966888864397);
        setDoubleField(term56969, term56969.getClass(), "real", 3.1415926535879155);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term56164, args);
        assertTrue(recursiveEquals(term56164, term56972));
        assertTrue(recursiveEquals(retValue, term56969));
    }

};


