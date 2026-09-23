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

public class Complex_atan_1415283553217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36982;
     Object term37166;
     Object term37163;

    public Complex_atan_1415283553217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36982 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term36982, term36982.getClass(), "real", 9.024791440785408E15);
        setDoubleField(term36982, term36982.getClass(), "imaginary", -4.6116860181589524E18);
        term37166 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term37166, term37166.getClass(), "imaginary", -4.6116860181589524E18);
        setDoubleField(term37166, term37166.getClass(), "real", 9.024791440785408E15);
        term37163 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term37163, term37163.getClass(), "imaginary", 0.0);
        setDoubleField(term37163, term37163.getClass(), "real", -1.5707963267948966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "atan", argTypes, term36982, args);
        assertTrue(recursiveEquals(term36982, term37166));
        assertTrue(recursiveEquals(retValue, term37163));
    }

};


