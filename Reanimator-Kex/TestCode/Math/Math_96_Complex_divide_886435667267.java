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

public class Complex_divide_886435667267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50198;
     Object term50282;
     Object term50323;
     Object term50324;
     Object term50320;

    public Complex_divide_886435667267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50198 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term50198, term50198.getClass(), "real", 4.503599627372544E15);
        setDoubleField(term50198, term50198.getClass(), "imaginary", -9.2053576211654246E18);
        term50282 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term50282, term50282.getClass(), "real", 0.0);
        setDoubleField(term50282, term50282.getClass(), "imaginary", 9.2188684372274053E18);
        term50323 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term50323, term50323.getClass(), "imaginary", -9.2053576211654246E18);
        setDoubleField(term50323, term50323.getClass(), "real", 4.503599627372544E15);
        term50324 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term50324, term50324.getClass(), "imaginary", 9.2188684372274053E18);
        setDoubleField(term50324, term50324.getClass(), "real", 0.0);
        term50320 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term50320, term50320.getClass(), "imaginary", -4.885197850515167E-4);
        setDoubleField(term50320, term50320.getClass(), "real", -0.998534438781291);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term50282;
        Object retValue = callMethod(klass, "divide", argTypes, term50198, args);
        assertTrue(recursiveEquals(term50198, term50323));
        assertTrue(recursiveEquals(term50282, term50324));
        assertTrue(recursiveEquals(retValue, term50320));
    }

};


