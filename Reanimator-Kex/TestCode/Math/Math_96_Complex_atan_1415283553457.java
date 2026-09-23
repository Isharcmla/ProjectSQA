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

public class Complex_atan_1415283553457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114208;
     Object term114392;
     Object term114389;

    public Complex_atan_1415283553457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114208 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term114208, term114208.getClass(), "real", 4.61168601842739E18);
        setDoubleField(term114208, term114208.getClass(), "imaginary", 9.007200328482816E15);
        term114392 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term114392, term114392.getClass(), "imaginary", 9.007200328482816E15);
        setDoubleField(term114392, term114392.getClass(), "real", 4.61168601842739E18);
        term114389 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term114389, term114389.getClass(), "imaginary", 0.0);
        setDoubleField(term114389, term114389.getClass(), "real", 1.5707963267948966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "atan", argTypes, term114208, args);
        assertTrue(recursiveEquals(term114208, term114392));
        assertTrue(recursiveEquals(retValue, term114389));
    }

};


