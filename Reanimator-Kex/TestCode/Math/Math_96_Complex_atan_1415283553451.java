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

public class Complex_atan_1415283553451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112146;
     Object term112330;
     Object term112327;

    public Complex_atan_1415283553451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112146 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term112146, term112146.getClass(), "real", 7.2057594046316544E16);
        setDoubleField(term112146, term112146.getClass(), "imaginary", 4.50361680723968E15);
        term112330 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term112330, term112330.getClass(), "imaginary", 4.50361680723968E15);
        setDoubleField(term112330, term112330.getClass(), "real", 7.2057594046316544E16);
        term112327 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term112327, term112327.getClass(), "imaginary", 0.0);
        setDoubleField(term112327, term112327.getClass(), "real", 1.5707963267948966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "atan", argTypes, term112146, args);
        assertTrue(recursiveEquals(term112146, term112330));
        assertTrue(recursiveEquals(retValue, term112327));
    }

};


