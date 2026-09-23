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
import java.lang.Double;

public class Complex_acos_1430561531342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76109;
     Object term76913;
     Object term76910;

    public Complex_acos_1430561531342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76109 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term76109, term76109.getClass(), "real", 5.7646075659839078E17);
        setDoubleField(term76109, term76109.getClass(), "imaginary", -6.9175290276410808E18);
        term76913 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term76913, term76913.getClass(), "imaginary", -6.9175290276410808E18);
        setDoubleField(term76913, term76913.getClass(), "real", 5.7646075659839078E17);
        term76910 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term76910, term76910.getClass(), "imaginary", Double.POSITIVE_INFINITY);
        setDoubleField(term76910, term76910.getClass(), "real", Double.POSITIVE_INFINITY);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term76109, args);
        assertTrue(recursiveEquals(term76109, term76913));
        assertTrue(recursiveEquals(retValue, term76910));
    }

};


