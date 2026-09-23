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

public class Complex_negate_913636225119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7821;
     Object term7845;
     Object term7840;

    public Complex_negate_913636225119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7821 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term7821, term7821.getClass(), "isNaN", false);
        setDoubleField(term7821, term7821.getClass(), "real", -9.223372036854776E18);
        setDoubleField(term7821, term7821.getClass(), "imaginary", -4.503599627370496E15);
        term7845 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term7845, term7845.getClass(), "imaginary", -4.503599627370496E15);
        setDoubleField(term7845, term7845.getClass(), "real", -9.223372036854776E18);
        setBooleanField(term7845, term7845.getClass(), "isNaN", false);
        setBooleanField(term7845, term7845.getClass(), "isInfinite", false);
        term7840 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term7840, term7840.getClass(), "imaginary", 4.503599627370496E15);
        setDoubleField(term7840, term7840.getClass(), "real", 9.223372036854776E18);
        setBooleanField(term7840, term7840.getClass(), "isNaN", false);
        setBooleanField(term7840, term7840.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "negate", argTypes, term7821, args);
        assertTrue(recursiveEquals(term7821, term7845));
        assertTrue(recursiveEquals(retValue, term7840));
    }

};


