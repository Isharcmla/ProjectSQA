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

public class Complex_atan_1415283553171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26122;
     Object term26306;
     Object term26303;

    public Complex_atan_1415283553171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26122 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term26122, term26122.getClass(), "real", -8.6457853846445097E18);
        setDoubleField(term26122, term26122.getClass(), "imaginary", -6.9174586588969042E18);
        term26306 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term26306, term26306.getClass(), "imaginary", -6.9174586588969042E18);
        setDoubleField(term26306, term26306.getClass(), "real", -8.6457853846445097E18);
        term26303 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term26303, term26303.getClass(), "imaginary", 0.0);
        setDoubleField(term26303, term26303.getClass(), "real", -1.5707963267948966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "atan", argTypes, term26122, args);
        assertTrue(recursiveEquals(term26122, term26306));
        assertTrue(recursiveEquals(retValue, term26303));
    }

};


