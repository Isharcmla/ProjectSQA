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

public class Complex_atan_1415283553215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36186;
     Object term36554;
     Object term36551;

    public Complex_atan_1415283553215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36186 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term36186, term36186.getClass(), "real", -9.1513144428167168E18);
        setDoubleField(term36186, term36186.getClass(), "imaginary", 1.8014673387388928E16);
        term36554 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term36554, term36554.getClass(), "imaginary", 1.8014673387388928E16);
        setDoubleField(term36554, term36554.getClass(), "real", -9.1513144428167168E18);
        term36551 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term36551, term36551.getClass(), "imaginary", 0.0);
        setDoubleField(term36551, term36551.getClass(), "real", -1.5707963267948966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "atan", argTypes, term36186, args);
        assertTrue(recursiveEquals(term36186, term36554));
        assertTrue(recursiveEquals(retValue, term36551));
    }

};


