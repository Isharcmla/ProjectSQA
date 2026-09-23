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

public class Complex_multiply_178725535846 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66;
     Object term71;
     Object term423;
     Object term424;
     Object term413;

    public Complex_multiply_178725535846() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term66, term66.getClass(), "imaginary", 0.5840714198152577);
        setDoubleField(term66, term66.getClass(), "real", 0.7559240768573477);
        setBooleanField(term66, term66.getClass(), "isNaN", true);
        setBooleanField(term66, term66.getClass(), "isInfinite", false);
        term71 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term71, term71.getClass(), "imaginary", 0.10667076642995188);
        setDoubleField(term71, term71.getClass(), "real", 0.11493000848982304);
        setBooleanField(term71, term71.getClass(), "isNaN", false);
        setBooleanField(term71, term71.getClass(), "isInfinite", false);
        term423 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term423, term423.getClass(), "imaginary", 0.5840714198152577);
        setDoubleField(term423, term423.getClass(), "real", 0.7559240768573477);
        setBooleanField(term423, term423.getClass(), "isNaN", true);
        setBooleanField(term423, term423.getClass(), "isInfinite", false);
        term424 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term424, term424.getClass(), "imaginary", 0.10667076642995188);
        setDoubleField(term424, term424.getClass(), "real", 0.11493000848982304);
        setBooleanField(term424, term424.getClass(), "isNaN", false);
        setBooleanField(term424, term424.getClass(), "isInfinite", false);
        term413 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term413, term413.getClass(), "imaginary", Double.NaN);
        setDoubleField(term413, term413.getClass(), "real", Double.NaN);
        setBooleanField(term413, term413.getClass(), "isNaN", true);
        setBooleanField(term413, term413.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term71;
        Object retValue = callMethod(klass, "multiply", argTypes, term66, args);
        assertTrue(recursiveEquals(term66, term423));
        assertTrue(recursiveEquals(term71, term424));
        assertTrue(recursiveEquals(retValue, term413));
    }

};


