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

public class Complex_sqrt_902217185469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117009;
     Object term117048;
     Object term117045;

    public Complex_sqrt_902217185469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117009 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term117009, term117009.getClass(), "real", 0.0);
        setDoubleField(term117009, term117009.getClass(), "imaginary", -9.223372036854776E18);
        term117048 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term117048, term117048.getClass(), "imaginary", -9.223372036854776E18);
        setDoubleField(term117048, term117048.getClass(), "real", 0.0);
        term117045 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term117045, term117045.getClass(), "imaginary", -2.147483648E9);
        setDoubleField(term117045, term117045.getClass(), "real", 2.147483648E9);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "sqrt", argTypes, term117009, args);
        assertTrue(recursiveEquals(term117009, term117048));
        assertTrue(recursiveEquals(retValue, term117045));
    }

};


