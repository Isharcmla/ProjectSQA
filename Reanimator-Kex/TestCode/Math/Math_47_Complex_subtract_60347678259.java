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

public class Complex_subtract_60347678259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104;
     Object term109;
     Object term571;
     Object term572;
     Object term561;

    public Complex_subtract_60347678259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term104, term104.getClass(), "imaginary", 0.6588948704887806);
        setDoubleField(term104, term104.getClass(), "real", 0.6397214730945112);
        setBooleanField(term104, term104.getClass(), "isNaN", true);
        setBooleanField(term104, term104.getClass(), "isInfinite", true);
        term109 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term109, term109.getClass(), "imaginary", 0.25937345430928016);
        setDoubleField(term109, term109.getClass(), "real", 0.5873228247510078);
        setBooleanField(term109, term109.getClass(), "isNaN", true);
        setBooleanField(term109, term109.getClass(), "isInfinite", false);
        term571 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term571, term571.getClass(), "imaginary", 0.6588948704887806);
        setDoubleField(term571, term571.getClass(), "real", 0.6397214730945112);
        setBooleanField(term571, term571.getClass(), "isNaN", true);
        setBooleanField(term571, term571.getClass(), "isInfinite", true);
        term572 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term572, term572.getClass(), "imaginary", 0.25937345430928016);
        setDoubleField(term572, term572.getClass(), "real", 0.5873228247510078);
        setBooleanField(term572, term572.getClass(), "isNaN", true);
        setBooleanField(term572, term572.getClass(), "isInfinite", false);
        term561 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term561, term561.getClass(), "imaginary", Double.NaN);
        setDoubleField(term561, term561.getClass(), "real", Double.NaN);
        setBooleanField(term561, term561.getClass(), "isNaN", true);
        setBooleanField(term561, term561.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term109;
        Object retValue = callMethod(klass, "subtract", argTypes, term104, args);
        assertTrue(recursiveEquals(term104, term571));
        assertTrue(recursiveEquals(term109, term572));
        assertTrue(recursiveEquals(retValue, term561));
    }

};


