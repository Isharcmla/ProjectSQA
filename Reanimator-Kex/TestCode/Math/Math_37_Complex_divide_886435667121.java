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

public class Complex_divide_886435667121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19794;
     Object term19878;
     Object term20552;
     Object term20553;
     Object term20547;

    public Complex_divide_886435667121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19794 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term19794, term19794.getClass(), "isNaN", false);
        setBooleanField(term19794, term19794.getClass(), "isInfinite", false);
        term19878 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term19878, term19878.getClass(), "isNaN", false);
        setDoubleField(term19878, term19878.getClass(), "real", 4.503599627370497E15);
        setDoubleField(term19878, term19878.getClass(), "imaginary", 0.0);
        setBooleanField(term19878, term19878.getClass(), "isInfinite", true);
        term20552 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term20552, term20552.getClass(), "imaginary", 0.0);
        setDoubleField(term20552, term20552.getClass(), "real", 0.0);
        setBooleanField(term20552, term20552.getClass(), "isNaN", false);
        setBooleanField(term20552, term20552.getClass(), "isInfinite", false);
        term20553 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term20553, term20553.getClass(), "imaginary", 0.0);
        setDoubleField(term20553, term20553.getClass(), "real", 4.503599627370497E15);
        setBooleanField(term20553, term20553.getClass(), "isNaN", false);
        setBooleanField(term20553, term20553.getClass(), "isInfinite", true);
        term20547 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term20547, term20547.getClass(), "imaginary", 0.0);
        setDoubleField(term20547, term20547.getClass(), "real", 0.0);
        setBooleanField(term20547, term20547.getClass(), "isNaN", false);
        setBooleanField(term20547, term20547.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term19878;
        Object retValue = callMethod(klass, "divide", argTypes, term19794, args);
        assertTrue(recursiveEquals(term19794, term20552));
        assertTrue(recursiveEquals(term19878, term20553));
        assertTrue(recursiveEquals(retValue, term20547));
    }

};


