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

public class Complex_acos_1430561531329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71750;
     Object term72182;
     Object term72179;

    public Complex_acos_1430561531329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71750 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term71750, term71750.getClass(), "real", 2.3058430092157911E18);
        setDoubleField(term71750, term71750.getClass(), "imaginary", 1.9140298416324608E16);
        term72182 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term72182, term72182.getClass(), "imaginary", 1.9140298416324608E16);
        setDoubleField(term72182, term72182.getClass(), "real", 2.3058430092157911E18);
        term72179 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term72179, term72179.getClass(), "imaginary", -42.975159645015346);
        setDoubleField(term72179, term72179.getClass(), "real", 0.008300590608381807);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term71750, args);
        assertTrue(recursiveEquals(term71750, term72182));
        assertTrue(recursiveEquals(retValue, term72179));
    }

};


