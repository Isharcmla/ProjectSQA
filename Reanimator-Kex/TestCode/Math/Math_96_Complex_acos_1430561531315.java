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

public class Complex_acos_1430561531315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66506;
     Object term66928;
     Object term66925;

    public Complex_acos_1430561531315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66506 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term66506, term66506.getClass(), "real", 7.20575941050368E16);
        setDoubleField(term66506, term66506.getClass(), "imaginary", 7.4309393851613184E16);
        term66928 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term66928, term66928.getClass(), "imaginary", 7.4309393851613184E16);
        setDoubleField(term66928, term66928.getClass(), "real", 7.20575941050368E16);
        term66925 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term66925, term66925.getClass(), "imaginary", -39.871585398376524);
        setDoubleField(term66925, term66925.getClass(), "real", 0.8007815647126025);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term66506, args);
        assertTrue(recursiveEquals(term66506, term66928));
        assertTrue(recursiveEquals(retValue, term66925));
    }

};


