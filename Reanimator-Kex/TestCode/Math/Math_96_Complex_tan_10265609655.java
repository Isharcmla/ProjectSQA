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

public class Complex_tan_10265609655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96;
     Object term1670;
     Object term1648;

    public Complex_tan_10265609655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term96, term96.getClass(), "imaginary", 0.13246999699526574);
        setDoubleField(term96, term96.getClass(), "real", 0.9126850255993704);
        term1670 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term1670, term1670.getClass(), "imaginary", 0.13246999699526574);
        setDoubleField(term1670, term1670.getClass(), "real", 0.9126850255993704);
        term1648 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term1648, term1648.getClass(), "imaginary", 0.34213251983339504);
        setDoubleField(term1648, term1648.getClass(), "real", 1.2352373081398502);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "tan", argTypes, term96, args);
        assertTrue(recursiveEquals(term96, term1670));
        assertTrue(recursiveEquals(retValue, term1648));
    }

};


