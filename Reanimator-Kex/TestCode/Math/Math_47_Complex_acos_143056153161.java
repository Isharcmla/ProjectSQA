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

public class Complex_acos_143056153161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121;
     Object term610;
     Object term600;

    public Complex_acos_143056153161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term121, term121.getClass(), "imaginary", 0.791695029600875);
        setDoubleField(term121, term121.getClass(), "real", 0.6862221294683138);
        setBooleanField(term121, term121.getClass(), "isNaN", true);
        setBooleanField(term121, term121.getClass(), "isInfinite", true);
        term610 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term610, term610.getClass(), "imaginary", 0.791695029600875);
        setDoubleField(term610, term610.getClass(), "real", 0.6862221294683138);
        setBooleanField(term610, term610.getClass(), "isNaN", true);
        setBooleanField(term610, term610.getClass(), "isInfinite", true);
        term600 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term600, term600.getClass(), "imaginary", Double.NaN);
        setDoubleField(term600, term600.getClass(), "real", Double.NaN);
        setBooleanField(term600, term600.getClass(), "isNaN", true);
        setBooleanField(term600, term600.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term121, args);
        assertTrue(recursiveEquals(term121, term610));
        assertTrue(recursiveEquals(retValue, term600));
    }

};


