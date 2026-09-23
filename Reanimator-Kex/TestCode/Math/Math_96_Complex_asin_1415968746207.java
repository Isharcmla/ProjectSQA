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

public class Complex_asin_1415968746207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34254;
     Object term34465;
     Object term34462;

    public Complex_asin_1415968746207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34254 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term34254, term34254.getClass(), "real", 6.7108864E7);
        setDoubleField(term34254, term34254.getClass(), "imaginary", -4.6116860184273224E18);
        term34465 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term34465, term34465.getClass(), "imaginary", -4.6116860184273224E18);
        setDoubleField(term34465, term34465.getClass(), "real", 6.7108864E7);
        term34462 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term34462, term34462.getClass(), "imaginary", -43.66827237527654);
        setDoubleField(term34462, term34462.getClass(), "real", 1.455191522836706E-11);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term34254, args);
        assertTrue(recursiveEquals(term34254, term34465));
        assertTrue(recursiveEquals(retValue, term34462));
    }

};


