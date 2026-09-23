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

public class Complex_divide_88643566771 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4017;
     Object term4101;
     Object term4128;
     Object term4129;
     Object term4123;

    public Complex_divide_88643566771() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4017 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term4017, term4017.getClass(), "isNaN", false);
        setBooleanField(term4017, term4017.getClass(), "isInfinite", false);
        term4101 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term4101, term4101.getClass(), "isNaN", false);
        setDoubleField(term4101, term4101.getClass(), "real", 4.503599627370497E15);
        setDoubleField(term4101, term4101.getClass(), "imaginary", 0.0);
        setBooleanField(term4101, term4101.getClass(), "isInfinite", true);
        term4128 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term4128, term4128.getClass(), "imaginary", 0.0);
        setDoubleField(term4128, term4128.getClass(), "real", 0.0);
        setBooleanField(term4128, term4128.getClass(), "isNaN", false);
        setBooleanField(term4128, term4128.getClass(), "isInfinite", false);
        term4129 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term4129, term4129.getClass(), "imaginary", 0.0);
        setDoubleField(term4129, term4129.getClass(), "real", 4.503599627370497E15);
        setBooleanField(term4129, term4129.getClass(), "isNaN", false);
        setBooleanField(term4129, term4129.getClass(), "isInfinite", true);
        term4123 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term4123, term4123.getClass(), "imaginary", 0.0);
        setDoubleField(term4123, term4123.getClass(), "real", 0.0);
        setBooleanField(term4123, term4123.getClass(), "isNaN", false);
        setBooleanField(term4123, term4123.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term4101;
        Object retValue = callMethod(klass, "divide", argTypes, term4017, args);
        assertTrue(recursiveEquals(term4017, term4128));
        assertTrue(recursiveEquals(term4101, term4129));
        assertTrue(recursiveEquals(retValue, term4123));
    }

};


