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

public class Complex_acos_1430561531279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54221;
     Object term54424;
     Object term54421;

    public Complex_acos_1430561531279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54221 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term54221, term54221.getClass(), "real", 3.6028797086072832E16);
        setDoubleField(term54221, term54221.getClass(), "imaginary", -8.0704505322479288E18);
        term54424 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term54424, term54424.getClass(), "imaginary", -8.0704505322479288E18);
        setDoubleField(term54424, term54424.getClass(), "real", 3.6028797086072832E16);
        term54421 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term54421, term54421.getClass(), "imaginary", Double.POSITIVE_INFINITY);
        setDoubleField(term54421, term54421.getClass(), "real", Double.POSITIVE_INFINITY);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term54221, args);
        assertTrue(recursiveEquals(term54221, term54424));
        assertTrue(recursiveEquals(retValue, term54421));
    }

};


