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

public class Complex_acos_1430561531269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50837;
     Object term51053;
     Object term51050;

    public Complex_acos_1430561531269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50837 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term50837, term50837.getClass(), "real", -8.6469112845513523E18);
        setDoubleField(term50837, term50837.getClass(), "imaginary", 7.2057594037927968E16);
        term51053 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term51053, term51053.getClass(), "imaginary", 7.2057594037927968E16);
        setDoubleField(term51053, term51053.getClass(), "real", -8.6469112845513523E18);
        term51050 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term51050, term51050.getClass(), "imaginary", -44.296915755715574);
        setDoubleField(term51050, term51050.getClass(), "real", 3.1332595131496572);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term50837, args);
        assertTrue(recursiveEquals(term50837, term51053));
        assertTrue(recursiveEquals(retValue, term51050));
    }

};


