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

public class Complex_atan_1415283553415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103008;
     Object term103403;
     Object term103400;

    public Complex_atan_1415283553415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103008 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term103008, term103008.getClass(), "real", -8.9351416263433257E18);
        setDoubleField(term103008, term103008.getClass(), "imaginary", 1.801439850948224E16);
        term103403 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term103403, term103403.getClass(), "imaginary", 1.801439850948224E16);
        setDoubleField(term103403, term103403.getClass(), "real", -8.9351416263433257E18);
        term103400 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term103400, term103400.getClass(), "imaginary", 0.0);
        setDoubleField(term103400, term103400.getClass(), "real", -1.5707963267948966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "atan", argTypes, term103008, args);
        assertTrue(recursiveEquals(term103008, term103403));
        assertTrue(recursiveEquals(retValue, term103400));
    }

};


