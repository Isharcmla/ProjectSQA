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

public class Complex_acos_1430561531181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28732;
     Object term28948;
     Object term28945;

    public Complex_acos_1430561531181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28732 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term28732, term28732.getClass(), "real", 1.15320297958355763E18);
        setDoubleField(term28732, term28732.getClass(), "imaginary", 7.206199208443904E16);
        term28948 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term28948, term28948.getClass(), "imaginary", 7.206199208443904E16);
        setDoubleField(term28948, term28948.getClass(), "real", 1.15320297958355763E18);
        term28945 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term28945, term28945.getClass(), "imaginary", -42.28417073295797);
        setDoubleField(term28945, term28945.getClass(), "real", 0.06240741320800007);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term28732, args);
        assertTrue(recursiveEquals(term28732, term28948));
        assertTrue(recursiveEquals(retValue, term28945));
    }

};


