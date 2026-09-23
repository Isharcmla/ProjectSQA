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

public class Complex_divide_886435667157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14047;
     Object term14131;
     Object term14189;
     Object term14190;
     Object term14183;

    public Complex_divide_886435667157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14047 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term14047, term14047.getClass(), "isNaN", false);
        term14131 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term14131, term14131.getClass(), "isNaN", false);
        setBooleanField(term14131, term14131.getClass(), "isZero", false);
        setBooleanField(term14131, term14131.getClass(), "isInfinite", false);
        setDoubleField(term14131, term14131.getClass(), "real", 0.0);
        setDoubleField(term14131, term14131.getClass(), "imaginary", 4.503599627370497E15);
        term14189 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term14189, term14189.getClass(), "imaginary", 0.0);
        setDoubleField(term14189, term14189.getClass(), "real", 0.0);
        setBooleanField(term14189, term14189.getClass(), "isNaN", false);
        setBooleanField(term14189, term14189.getClass(), "isInfinite", false);
        setBooleanField(term14189, term14189.getClass(), "isZero", false);
        term14190 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term14190, term14190.getClass(), "imaginary", 4.503599627370497E15);
        setDoubleField(term14190, term14190.getClass(), "real", 0.0);
        setBooleanField(term14190, term14190.getClass(), "isNaN", false);
        setBooleanField(term14190, term14190.getClass(), "isInfinite", false);
        setBooleanField(term14190, term14190.getClass(), "isZero", false);
        term14183 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term14183, term14183.getClass(), "imaginary", 0.0);
        setDoubleField(term14183, term14183.getClass(), "real", 0.0);
        setBooleanField(term14183, term14183.getClass(), "isNaN", false);
        setBooleanField(term14183, term14183.getClass(), "isInfinite", false);
        setBooleanField(term14183, term14183.getClass(), "isZero", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term14131;
        Object retValue = callMethod(klass, "divide", argTypes, term14047, args);
        assertTrue(recursiveEquals(term14047, term14189));
        assertTrue(recursiveEquals(term14131, term14190));
        assertTrue(recursiveEquals(retValue, term14183));
    }

};


