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

public class Complex_acos_1430561531391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93442;
     Object term94890;
     Object term94887;

    public Complex_acos_1430561531391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93442 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term93442, term93442.getClass(), "real", 5.7674222728013414E17);
        setDoubleField(term93442, term93442.getClass(), "imaginary", 5.7653112104760115E17);
        term94890 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term94890, term94890.getClass(), "imaginary", 5.7653112104760115E17);
        setDoubleField(term94890, term94890.getClass(), "real", 5.7674222728013414E17);
        term94887 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term94887, term94887.getClass(), "imaginary", -41.935709569854865);
        setDoubleField(term94887, term94887.getClass(), "real", 0.7852151137930494);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term93442, args);
        assertTrue(recursiveEquals(term93442, term94890));
        assertTrue(recursiveEquals(retValue, term94887));
    }

};


